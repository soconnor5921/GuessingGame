package com.company;

import java.util.Scanner;

import static com.company.objective1.generateNum;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Type a number from 1-10");
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        int aiNum = generateNum();

        while(ans != aiNum)
        {
            System.out.println("Wrong answer, try again");
            ans = sc.nextInt();

        }
        System.out.println("Correct!");

    }
}
