package gr.aueb.cf.exercises.ch4;

import java.util.Scanner;

public class StarsHN {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.println("Please insert number of horizontal stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}
