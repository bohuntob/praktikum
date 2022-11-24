package de.hfu;
import java.util.Scanner;

/**
* Einlesen von String. AUsgabe in Uppercase.
*/

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input=scanner.next();
        System.out.println(input.toUpperCase());
        scanner.close();
    }
}

