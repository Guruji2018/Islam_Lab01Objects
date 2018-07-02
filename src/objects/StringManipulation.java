package objects;

import java.util.Random;

/**
 * Created by islama1 on 7/1/18.
 */
public class StringManipulation {
    public static void main(String[] args) {

        String string1 = "        First";
        String string2 = " Lab ";
        String string3 = "Computer";
        String string4 = " Program     ";
        String string5 = string1 + string2 + string3 + string4;
        int string5Length = string5.length();
        System.out.println("Length of string5 is: " + string5Length);

        String string6 = string5.trim();
        int string6Length = string6.length();
        System.out.println("Length of string6 is: " + string6Length);

        String newProgram = string6.substring((string6Length-7), string6Length);
        System.out.println("Program: " + newProgram);

        String funIs = "fnunfunisfufunnufn";
        int funInt = funIs.indexOf("fun");
        String fun = funIs.substring(funInt, funInt+3);
        System.out.println("String fun: " + fun);
        int isInt = funIs.indexOf("is");
        String is = funIs.substring(isInt, isInt+2);
        System.out.println("String is: " + is);

        System.out.println("Programming " + is + " " + fun);

        double myValue = 48.50;
        double myValueSrt = Math.sqrt(myValue);
        System.out.println("Square root of 48.50 is: " + myValueSrt);
        System.out.println("Ceiling of sqrt of 48.50 is: " + Math.ceil(myValueSrt) + " and floor of sqrt of 48.50 is: " + Math.floor(myValueSrt));

        double myValue1 = 90;
        double myValue2 = 20;
        System.out.println("Rounded Sine of 90 is: " + Math.round(Math.sin(myValue1))
                + " and rounded Sine of 20 is: " + Math.round(Math.sin(myValue2)));

        System.out.println("Rounded Tangent of 90 is: " + Math.round(Math.tan(myValue1))
                + " and rounded Tangent of 20 is: " + Math.round(Math.tan(myValue2)));

        int myNumber1 = 3;
        int myNumber2 = 5;
        System.out.println("5 raised to the power of 3 is: " + Math.pow(myNumber1, myNumber2));

        System.out.println("Math Cosine h is: " + Math.ceil(Math.cosh(Math.sqrt(Math.pow(3, 2) + 4*2*2 + 3)/(2*4))));

        Random randomWithSeed = new Random();
        randomWithSeed.setSeed(20L);
        System.out.println("First random value: " + randomWithSeed.nextInt(100));
        System.out.println("Second random value: " + randomWithSeed.nextInt(99));
        System.out.println("Third random value: " + randomWithSeed.nextInt(1));
        System.out.println("Fourth random value: " + randomWithSeed.nextInt(10));
        System.out.println("Fifth random value: " + randomWithSeed.nextInt(5));
        System.out.println("4b). We get the same result each time when we use seed");
        System.out.println();

        Random randomNoSeed = new Random();
        System.out.println("First random value: " +  randomNoSeed.nextInt(100));
        System.out.println("Second random value: " + randomNoSeed.nextInt(99));
        System.out.println("Third random value: " + randomNoSeed.nextInt(1));
        System.out.println("Fourth random value: " + randomNoSeed.nextInt(10));
        System.out.println("Fifth random value: " + randomNoSeed.nextInt(5));
        System.out.printf("4d). When no seed is used, we get different result each time the program is ran");

    }
}
