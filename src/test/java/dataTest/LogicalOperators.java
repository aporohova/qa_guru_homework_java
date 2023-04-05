package dataTest;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("Logical operators");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your education level");
        String Education = sc.nextLine();
        System.out.println("Enter your experience");
        int experience = sc.nextInt();
        if ((experience >= 3 && Education.equals("High"))) {
            System.out.println("Your salary is 2500$");
        } else if (experience < 3 || Education.equals("Middle")) {
            System.out.println("Your salary is 1500$");
        } else {
            System.out.println("No job for you");
        }
        //если добавить условие else if (!(experience < 3 && Education.equals("High")))- не приводит к false;

    }
    }

