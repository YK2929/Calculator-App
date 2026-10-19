package com.example.training;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[4]; // 4人分の配列

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "人目の情報を入力してください。");
            
            System.out.print("名前: ");
            String name = scanner.nextLine();
            
            System.out.print("年齢: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // 改行文字の読み飛ばし

            students[i] = new Student(name, age);
            System.out.println();
        }

        System.out.println("--- 入力された学生の一覧 ---");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
