package com.company;

import java.lang.Math;
import java.util.*;
public class Quest_1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number limit");
        int n=sc.nextInt();
        int e=1;
        for(int i = 1 ;i<=n;i++)
        {
            int j=i*i*i;
            int v=2*i;
            System.out.print(j+v+" ");
            e++;
        }

    }
}
