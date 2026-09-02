package com.studyrecord;

import java.util.Scanner;

/**
 * 修改记录命令
 */
public class ModifyCommand implements Command {

    private Scanner scanner;

    public ModifyCommand(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        RecordManager manager = RecordManager.getInstance();
        if (manager.size() == 0) {
            System.out.println("⚠️ 暂无记录可修改，请先录入！");
            return;
        }

        System.out.println("\n========== 修改记录 ==========");
     
        System.out.println("当前记录列表：");
        int index = 1;
       
        java.util.Iterator<StudyRecord> it = manager.getIterator();
        while (it.hasNext()) {
            StudyRecord r = it.next();
            System.out.println(index + ". " + r.getProjectName() + " (" + r.getDate() + ")");
            index++;
        }

        System.out.print("请选择要修改的记录序号：");
        int seq = Integer.parseInt(scanner.nextLine());

        StudyRecord old = manager.getRecord(seq);
        if (old == null) {
            System.out.println("❌ 序号无效！");
            return;
        }

        System.out.println("（直接回车表示保留原值）");
        System.out.print("日期（原：" + old.getDate() + "）：");
        String date = scanner.nextLine();
        if (date.isEmpty()) date = old.getDate();
        System.out.print("项目名称（原：" + old.getProjectName() + "）：");
        String project = scanner.nextLine();
        if (project.isEmpty()) project = old.getProjectName();
        System.out.print("编程语言（原：" + old.getLanguage() + "）：");
        String language = scanner.nextLine();
        if (language.isEmpty()) language = old.getLanguage();
        System.out.print("新增行数（原：" + old.getAddedLines() + "）：");
        String addedStr = scanner.nextLine();
        int added = addedStr.isEmpty() ? old.getAddedLines() : Integer.parseInt(addedStr);
        System.out.print("删除行数（原：" + old.getDeletedLines() + "）：");
        String deletedStr = scanner.nextLine();
        int deleted = deletedStr.isEmpty() ? old.getDeletedLines() : Integer.parseInt(deletedStr);
        System.out.print("提交次数（原：" + old.getCommitCount() + "）：");
        String commitStr = scanner.nextLine();
        int commits = commitStr.isEmpty() ? old.getCommitCount() : Integer.parseInt(commitStr);
        System.out.print("提交摘要（原：" + old.getCommitDesc() + "）：");
        String desc = scanner.nextLine();
        if (desc.isEmpty()) desc = old.getCommitDesc();
        System.out.print("标签（原：" + old.getTag() + "）：");
        String tag = scanner.nextLine();
        if (tag.isEmpty()) tag = old.getTag();
        System.out.print("心得（原：" + old.getSummary() + "）：");
        String summary = scanner.nextLine();
        if (summary.isEmpty()) summary = old.getSummary();

        StudyRecord newRecord = RecordFactory.createRecord(date, project, language,
                                                           added, deleted, commits,
                                                           desc, tag, summary);
        boolean success = manager.modifyRecord(seq, newRecord);
        if (success) {
            System.out.println("✅ 记录修改成功！");
        } else {
            System.out.println("❌ 修改失败！");
        }
    }
}