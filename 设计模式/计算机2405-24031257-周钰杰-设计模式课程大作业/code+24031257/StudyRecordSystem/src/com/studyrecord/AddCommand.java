package com.studyrecord;

import java.util.Scanner;

/**
 * 录入记录命令
 */
public class AddCommand implements Command {

    private Scanner scanner;

    public AddCommand(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.println("\n========== 录入新记录 ==========");
        System.out.print("日期（格式 yyyy-MM-dd）：");
        String date = scanner.nextLine();
        System.out.print("项目名称：");
        String project = scanner.nextLine();
        System.out.print("编程语言：");
        String language = scanner.nextLine();
        System.out.print("新增代码行数：");
        int added = Integer.parseInt(scanner.nextLine());
        System.out.print("删除代码行数：");
        int deleted = Integer.parseInt(scanner.nextLine());
        System.out.print("Git提交次数：");
        int commits = Integer.parseInt(scanner.nextLine());
        System.out.print("提交说明摘要：");
        String desc = scanner.nextLine();
        System.out.print("标签（练习/工作/开源/算法）：");
        String tag = scanner.nextLine();
        System.out.print("简要心得：");
        String summary = scanner.nextLine();

        StudyRecord record = RecordFactory.createRecord(date, project, language,
                                                        added, deleted, commits,
                                                        desc, tag, summary);
        RecordManager manager = RecordManager.getInstance();
        manager.addRecord(record);
        System.out.println("✅ 记录添加成功！");
    }
}