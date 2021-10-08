package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("How many rolls do you want: ");
        int rolls = input.nextInt();
        System.out.print("What is the number of sides: ");
        int maxNumber = input.nextInt();

        int tempVar;
        for (int i = 0; i < rolls; i++) {
            tempVar = random.nextInt(maxNumber)+1;
            map.putIfAbsent(tempVar, 0);
            map.put(tempVar, map.get(tempVar) + 1);
        }
        System.out.println(map);
    }
}
