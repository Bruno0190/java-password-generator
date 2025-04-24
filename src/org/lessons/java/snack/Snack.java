package org.lessons.java.snack;

import java.util.Scanner;

public class Snack {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Scrivi una parola: ");
        String parola = input.nextLine().trim();
        String alorap = "";

        for (int i = parola.length() - 1; i >= 0; i--) {

            alorap += parola.charAt(i);
            
        }
        System.out.println("Al contrario sarebbe " + alorap );
        input.close();
    }

    
}
