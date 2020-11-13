package com.company;

import java.io.File;
import java.lang.System;

public class Main {
    static final String PATH_TO_FILE = "D:\\labs\\doggie.bmp";
    private static final float[] coefficients = new float[] {1.2f, 3f, 7f, 21f};

    public static void main(String[] args) {
        File output = new File(PATH_TO_FILE);
        if(output.exists()) {
            BilinearInterpolation task = new BilinearInterpolation(output);
            for (float koef: coefficients) {
                File newFile = task.compress(koef);
                task.resize(koef, newFile);
            }
        } else {
            System.out.println("Enter: correct image path");
        }
    }
}
