package ru.vsu.num6.console;

import ru.vsu.num6.logic.SumArrayElements;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainConsole {

    public static void main(String[] args) {
        SumArrayElements sumArrayElements = new SumArrayElements();
        System.out.println("PROGRAM");
        try {
            int sizeArray = readInteger("size array --> ");
            int[] array = new int[sizeArray];
            fillArrayWithValues(sizeArray, array);
        } catch (InputMismatchException e) {
            System.out.println("Invalid character entered.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Introduced negative array size");
        }
        int[] array = new int[0];
        printResults(
                sumArrayElements.findMinimumValueOfArray(array), sumArrayElements.findLargestValueOfArray(array),
                sumArrayElements.getSumOfElements(array),
                array
        );
    }

    private static void fillArrayWithValues(int sizeArray, int[] array) {
        for (int i = 0; i < sizeArray; i++) {
            array[i] = readInteger("put integers into array --> ");
        }
    }

    private static void printResults(int minIndex, int maxIndex, int sumElements, int[] array) {
        String arr = Arrays.toString(array);
        System.out.println("Injected array: " + arr + "\n");

        if (maxIndex > minIndex) {
            System.out.println("The maximum element runs after the smallest element. Try again.");
        } else if (minIndex > maxIndex) {
            System.out.printf(
                    "Sum of elements between the last minimum element and the first maximum: %d \n", sumElements
            );
        }
    }

    private static int readInteger(String phrase) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %s", phrase);
        return scanner.nextInt();
    }
}
