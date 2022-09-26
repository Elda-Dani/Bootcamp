package com.mainjava;

import java.util.Scanner;

public class menudriven {

    public static void main(String[] args) {
        int choice;

        while (true) {
            System.out.println("select an option");
            System.out.println("1.add students");
            System.out.println("2.search student");
            System.out.println("3.delete student");
            System.out.println("4.view all student");
            System.out.println("5.Exit");

            Scanner opt = new Scanner(System.in);
            choice = opt.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Add student selected");
                    break;
                case 2:
                    System.out.println("search student selected");
                    break;
                case 3:
                    System.out.println("Deleted student selected");
                    break;
                case 4:
                    System.out.println("All student selected");
                    break;
                case 5:
                    System.exit(0);


            }
        }


    }
}
