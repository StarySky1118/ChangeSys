package com.starysky.changesys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// 账户类
// 包括余额属性，消费和收入方法
public class Account {
    // 余额
    private double balance;

    // 收支日志
    private String details = "";

    // 无参构造方法
    public Account() {
    }

    // 有参构造方法
    public Account(double balance) {
        this.balance = balance;
    }

    // setter and getter
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // 显示余额
    public void showBalance() {
        System.out.println("余额:" + balance);
    }

    // 显示收支明细
    public void showDetails() {
        System.out.println("--------交易明细--------");
        System.out.println(details);
    }

    // 收入
    public void income() {
        // 创建扫描器对象
        Scanner scanner = new Scanner(System.in);
        // 接收用户键入数据
        System.out.print("请输入收入金额:");
        double income_money = scanner.nextDouble();
        // 判断数据合法性
        if(income_money <= 0) {
            System.out.println("请输入合法的收入金额！");
            return;
        }
        // 修改余额并添加修改日志
        balance += income_money;
        Date date = new Date(); // 获取当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); // 日期格式化器
        details += "+" + income_money + "\t交易时间:" + sdf.format(date) + "\t余额:" + balance + "\n";
    }

    public void consume() {
        // 创建扫描器对象
        Scanner scanner = new Scanner(System.in);
        // 接收用户键入数据
        System.out.print("请输入支出金额:");
        double consume_money = scanner.nextDouble();
        // 判断数据合法性
        if(consume_money <= 0 || consume_money > balance) {
            System.out.println("请输入合法的支出金额！");
            return;
        }
        // 修改余额并添加修改日志
        balance -= consume_money;
        Date date = new Date(); // 获取当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); // 日期格式化器
        details += "-" + consume_money + "\t交易时间:" + sdf.format(date) + "\t余额:" + balance + "\n";
    }

}
