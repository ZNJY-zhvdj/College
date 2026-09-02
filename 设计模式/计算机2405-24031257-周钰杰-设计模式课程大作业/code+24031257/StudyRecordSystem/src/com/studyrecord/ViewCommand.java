package com.studyrecord;

import java.util.Iterator;


public class ViewCommand implements Command {

    @Override
    public void execute() {
        RecordManager manager = RecordManager.getInstance();
        if (manager.size() == 0) {
            System.out.println("📭 暂无记录，请先录入。");
            return;
        }

        System.out.println("\n========== 所有记录 ==========");
        Iterator<StudyRecord> it = manager.getIterator();
        int count = 1;
        while (it.hasNext()) {
            StudyRecord record = it.next();
            System.out.println("---- 记录 #" + count + " ----");
            System.out.println(record);
            count++;
        }
        System.out.println("共 " + manager.size() + " 条记录。");
    }
}