package com.company;

import java.util.Scanner;

import static com.company.objective1.generateNum;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Type your name");
        Scanner sc1 = new Scanner(System.in);
        String playerName = sc1.nextLine();


        System.out.println("Hello " + playerName + "! type a number from 0-10");
        Scanner sc2 = new Scanner(System.in);
        int ans = sc2.nextInt();
        int aiNum = generateNum();

        while(ans != aiNum)
        {
            System.out.println("Wrong answer, " + playerName + ", try again");
            ans = sc2.nextInt();

        }
        System.out.println("Correct! Good job " + playerName + "!");

    }
}
