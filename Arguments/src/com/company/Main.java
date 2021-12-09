package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Всего аргументов в командной строке: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
