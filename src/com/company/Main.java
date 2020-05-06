package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList <String> arrayList = new ArrayList<>();

        arrayList.add("No");
        arrayList.add("Te");
        arrayList.add("Olvides");
        arrayList.add("De");
        arrayList.add("Poner");
        arrayList.add("El");
        arrayList.add("Where");
        arrayList.add("En");
        arrayList.add("El");
        arrayList.add("Delete");
        arrayList.add("From");

        System.out.println(removeEvenLength(arrayList));

    }

    public static ArrayList<String> removeEvenLength(ArrayList<String> arrayList) {
        ArrayList <String> arrayNewList = new ArrayList<>();

       for(int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i).length() % 2 != 0){
                arrayNewList.add(arrayList.get(i));
            }
        }

        return arrayNewList;
    }
}
