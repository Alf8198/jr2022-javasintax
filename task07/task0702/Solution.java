package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] array = new String[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 8; i++) {
            array[i] = bufferedReader.readLine();
        }//напишите тут ваш код

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}