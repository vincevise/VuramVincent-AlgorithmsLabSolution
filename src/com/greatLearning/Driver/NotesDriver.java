package com.greatLearning.Driver;

import com.greatLearning.Service.MergeSortImpl;
import com.greatLearning.Service.NotesCount;

import java.util.Arrays;
import java.util.Scanner;

public class NotesDriver {
    public static void main(String[] args) {
        MergeSortImpl mergeSortImpl = new MergeSortImpl();
        NotesCount notesCount = new NotesCount();

        int size;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the size of currency denomination");
        size = scan1.nextInt();

        System.out.println("Enter the currency denomination values: ");

        int[] noteDenomination = new int[size];

        for (int i = 0; i < size; i++) {

            noteDenomination[i] = scan1.nextInt();

        }
        System.out.println("Please enter the amount you want to pay: ");
        int amt = scan1.nextInt();
        mergeSortImpl.mergeSort(noteDenomination,0, noteDenomination.length - 1);


            System.out.println(Arrays.toString(noteDenomination));

        notesCount.implementNotesCount(noteDenomination,amt);

    }

}
