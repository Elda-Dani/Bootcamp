package com.calculator;

import java.util.Scanner;

public class calculation {
    public static void main(String[] args) {
        int a, b;
        int choice;



        while (true) {
            System.out.println("select an option");
            System.out.println("1.add ");
            System.out.println("2.substract");
            System.out.println("3.multiply");
            System.out.println("3.division");
            System.out.println("4.Exit");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println("Enter two numbers ");
            a = scanner.nextInt();
            b = scanner.nextInt();



            switch (choice) {
                case 1:
                    System.out.println("sum   :"+(a+b));

                    break;
                case 2:
                    System.out.println("sub   :"+(a-b));

                    break;
                case 3:
                    System.out.println("product="+(a*b));

                    break;
                case 4:
                    System.out.println("division="+(a/b));

                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
