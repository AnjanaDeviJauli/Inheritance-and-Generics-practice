package org.perscholas;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner s = new Scanner(System.in);
            int a,b;
            a=s.nextInt();
            b=s.nextInt();
            s.close();
        }catch(InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        try{
              Scanner s = new Scanner(System.in);
            int a,b;
            a=s.nextInt();
            b=s.nextInt(); 
            s.close();
            int divide = a/b;
        }catch(ArithmeticException ae){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}