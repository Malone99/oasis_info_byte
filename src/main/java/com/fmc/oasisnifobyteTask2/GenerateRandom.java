package com.fmc.oasisnifobyteTask2;

import java.util.Random;

public class GenerateRandom {
    public static int random(int num){
        Random random= new Random();
        return random.nextInt(num) + 1;
    }

    public static void main(String[] args) {
        System.out.println(GenerateRandom.random(10));
    }
}
