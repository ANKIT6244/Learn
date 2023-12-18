package com.internshala.javaapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int score;
        char grade;
        Scanner org = new Scanner(System.in);
        System.out.println("Enter your Score:");
        score = org.nextInt();
        org.close();
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else if (score >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Your Grade is:" + grade);
        switch (grade) {
            case 'A':
                System.out.println("Excellent score.");
                break;
            case 'B':
                System.out.println("Good Score.");
                break;
            case 'C':
                System.out.println("Good score keep it up.");
                break;
            case 'D':
                System.out.println("Make yourself good.");
                break;
            case 'E':
                System.out.println("Good.");
                break;
            case 'F':
                System.out.println("Fail.");
                break;
        }
    }
}
