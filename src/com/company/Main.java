package com.company;

import java.util.Scanner;

import static com.company.objective1.generateNum;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        int aiNum = generateNum();

        if (ans == aiNum)
        {
            System.out.println(String.valueOf(aiNum));
            System.out.println("Good Job");
        }
        else
        {
            System.out.println("Wrong, the number was " + aiNum);
        }

    }
}
