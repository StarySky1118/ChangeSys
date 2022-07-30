package com.starysky.changesys;

import java.util.Scanner;

// 系统菜单类
// 显示零钱通系统的菜单，创建对象，调用相关方法
public class SystemManu {
    public static void showMenu(Account account) {
        // 相关属性
        boolean loop = true; // 菜单是否循环显示标志
        Scanner scanner = new Scanner(System.in); // 扫描器对象

        // 显示菜单
        do {
            System.out.println("--------零钱通系统--------");
            System.out.println("      1 交易明细");
            System.out.println("      2 收   入");
            System.out.println("      3 支   出");
            System.out.println("      4 显示余额");
            System.out.println("      5 退   出");
            System.out.print("请输入(1-5):");

            // 接收用户输入
            int userInputNum = scanner.nextInt();

            // 根据用户键入运行功能
            switch (userInputNum) {
                case 1 :
                    account.showDetails();
                    break;
                case 2 :
                    account.income();
                    break;
                case 3 :
                    account.consume();
                    break;
                case 4 :
                    account.showBalance();
                    break;
                case 5 :
                    // 一直接收直到用户输入y/n
                    String choice;
                    System.out.println("请问您确定要退出吗(y/n)？");
                    while(true) {
                        choice = scanner.next();
                        if("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    if("y".equals(choice)) {
                        loop = false;
                    }
                    break;
            }
        } while(loop);
    }
}
