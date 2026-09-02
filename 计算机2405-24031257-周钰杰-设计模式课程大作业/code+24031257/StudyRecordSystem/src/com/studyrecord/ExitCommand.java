package com.studyrecord;

/**
 * 退出程序命令
 */
public class ExitCommand implements Command {

    @Override
    public void execute() {
        System.out.println("👋 感谢使用，再见！");
        System.exit(0);
    }
}