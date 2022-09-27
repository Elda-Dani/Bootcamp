package com.emp;

import java.util.ArrayList;
import java.util.Scanner;

public class Employees {
    public static void main(String[] args) {
int choice;
        String empname;
        ArrayList<String>empList=new ArrayList<String>();

        while (true) {
            System.out.println("select an option");
            System.out.println("1.Add employee");
            System.out.println("2.View employee");
            System.out.println("4.Exit");

           Scanner opt = new Scanner(System.in);
            choice = opt.nextInt();


            switch (choice)
            {

                case 1:
                    System.out.println("Add employee name");
                    empname=opt.next();
                    empList.add(empname);
                    break;
                case 2:
                    if(empList.size()==0) {
                        System.out.println("No employees added");
                    }
                    else {
                        System.out.println(empList);
                    }
                    break;

                case 4:
                    System.exit(0);


            }
        }


    }
}