/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Numeric {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);

        String string =sc.next();
        boolean numeric = true;

        try {
            Double num = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println(string + " is a number");
        else
            System.out.println(string + " is not a number");
    }
}
