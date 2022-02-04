package com.epam.training.student_Oleksii_Ivanov.fundamental;

public class ArrayCreator {
    public int[] createArray(){
        int[] array;
        array = new int[10];
        for(int i =0; i < 10; i++){
            array[i] = 100 + i;
        }
        return array;
    }
    public String[] createStringArray(final int SIZE){
        String [] strings = new String[SIZE];
    }

}
