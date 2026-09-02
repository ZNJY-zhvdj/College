package com.studyrecord;

import java.util.Scanner;

/**
 * 主入口并构建菜单
 */
public class Main {

    public static void main(String[] args) {
    	
        System.out.println("=================================");
        System.out.println("   学习/工作记录管理系统");
        System.out.println("   班级：计科2405");
        System.out.println("   学号：24031257");
        System.out.println("   姓名：周钰杰");
        System.out.println("=================================\n");

        Scanner scanner = new Scanner(System.in);

        Command addCmd = new AddCommand(scanner);
        Command modifyCmd = new ModifyCommand(scanner);
        Command viewCmd = new ViewCommand();
        Command exitCmd = new ExitCommand();

        while (true) {
            System.out.println("\n--- 主菜单 ---");
            System.out.println("1. 录入记录");
            System.out.println("2. 修改记录");
            System.out.println("3. 查看所有记录");
            System.out.println("4. 退出程序");
            System.out.print("请选择（1-4）：");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addCmd.execute();
                    break;
                case "2":
                    modifyCmd.execute();
                    break;
                case "3":
                    viewCmd.execute();
                    break;
                case "4":
                    exitCmd.execute();
                    break;
                default:
                    System.out.println("❌ 无效输入，请重新选择。");
            }
        }
    }
}