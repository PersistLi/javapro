package com.neuedu.web;

import java.util.Scanner;

public class deptWeb {
    public void menumain(){
        System.out.println("1.查询");
        System.out.println("2.增加");
        System.out.println("3.修改");
        System.out.println("4.删除");
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
    }
}
