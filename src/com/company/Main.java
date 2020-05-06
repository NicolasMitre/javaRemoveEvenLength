package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String a[] = new String[] { "No", "Te", "Olvides", "De", "Poner", "El", "Where", "En", "El", "Delete", "From"};

        List<String> words = Arrays.asList(a);

        System.out.println(removeEvenLength(words));
    }

    public static List<String> removeEvenLength(List<String> words) {
        ArrayList <String> arrayNewList = new ArrayList<>();

       for(String word : words){
            if (word.length() % 2 != 0){
                arrayNewList.add(word);
            }
        }

        return arrayNewList;
    }
}
