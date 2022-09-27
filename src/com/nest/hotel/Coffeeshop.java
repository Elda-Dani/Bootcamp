package com.nest.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Coffeeshop {
    public static void main(String[] args) {
        int m,choice,q;
        ArrayList itemName = new ArrayList<>();
        ArrayList qunatity = new ArrayList<>();
        ArrayList price = new ArrayList<>();
        Items dineIn = new Items(12,50,78);
        Items takeAway = new Items(7, 6, 11);
        Scanner in = new Scanner(System.in);

        System.out.println("Select mode");
        System.out.println("1. DineIn");
        System.out.println("2. Takeaway");
        System.out.println("3. Exit");
        m = in.nextInt();
        switch (m){
            case 1:
                while(true){

                    System.out.println("Select an Option: ");
                    System.out.println("1. Black Coffee :"+dineIn.getCoffee());
                    System.out.println("2. Black Tea :"+dineIn.getShake());
                    System.out.println("3. Tea :"+dineIn.getSandwitch());
                    System.out.println("4. Bill");
                    System.out.println("5. Exit");

                    choice = in.nextInt();
                    switch (choice){

                        case 1:
                            System.out.println("Enter the qty");
                            q = in.nextInt();
                            itemName.add(" Coffee");
                            qunatity.add(q);
                            price.add(q* dineIn.getCoffee());
                            break;
                        case 2:
                            System.out.println("Enter the qty");
                            q = in.nextInt();
                            itemName.add("Shake");
                            qunatity.add(q);
                            price.add(q* dineIn.getShake());
                            break;
                        case 3:
                            System.out.println("Enter the qty");
                            q = in.nextInt();
                            itemName.add("Sandwitch");
                            qunatity.add(q);
                            price.add(q*dineIn.getSandwitch());
                            break;


                        case 4:
                            System.out.println("******************");
                            System.out.println("Item Qty Price");
                            int sum = 0;
                            for (int i = 0; i <= itemName.size()-1; i++) {
                                System.out.println(itemName.get(i)+" "+qunatity.get(i)+" :"+price.get(i));

                            }
                            System.out.println("Total is "+sum);
                            sum=0;
                            System.exit(0);
                        case 5:
                            System.exit(0);
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                }
            case 2:
                while(true){

                    System.out.println("Select an Option: ");
                    System.out.println("1. Coffee :"+takeAway.getCoffee());
                    System.out.println("2. Shake :"+takeAway.getShake());
                    System.out.println("3. Sandwitch :"+takeAway.getSandwitch());

                    System.out.println("4. Bill");
                    System.out.println("5. Exit");

                    choice = in.nextInt();
                    switch (choice){

                        case 1:
                            System.out.println("Enter the qty");
                            q = in.nextInt();
                            itemName.add("Coffee");
                            qunatity.add(q);
                            price.add(q*takeAway.getCoffee());
                            break;
                        case 2:
                            System.out.println("Enter the qty");
                            q = in.nextInt();
                            itemName.add("Shake");
                            qunatity.add(q);
                            price.add(q* takeAway.getShake());
                            break;
                        case 3:
                            System.out.println("Enter the qty");
                            q = in.nextInt();
                            itemName.add("Sandwitch");
                            qunatity.add(q);
                            price.add(q* takeAway.getSandwitch());
                            break;

                        case 4:
                            System.out.println("******************");
                            System.out.println("Item Qty Price");
                            int sum = 0;
                            for (int i = 0; i <= itemName.size()-1; i++) {
                                System.out.println(itemName.get(i)+" "+qunatity.get(i)+" :"+price.get(i));

                            }
                            System.out.println("Total is "+sum);
                            sum=0;
                            System.exit(0);
                        case 5:
                            System.exit(0);
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                }
            case 3:
                System.exit(0);
        }

    }
}
