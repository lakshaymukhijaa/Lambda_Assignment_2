package com.ReturnNextEven;

import java.util.Scanner;
// public class Created as implementing NextEvenNumber
public class NextEvenNumberGenerationImply {

    public static void main(String[] args) {

        // Lambda Expression to Return next even value.
        com.ReturnNextEven.NextEvenNumberInterface lambda= num-> (num%2!=0) ? num+1:num+2 ;
        Scanner scanner = new Scanner(System.in);

        // Entering Input to perform above Lambda Function
        System.out.println("\n Enter integer value :");
        long number = (long) Double.parseDouble(scanner.next());

        // To show the result :
        System.out.println("\n Value of next even number entered is:");
        System.out.println(lambda.nextEven(number));
    }
}
