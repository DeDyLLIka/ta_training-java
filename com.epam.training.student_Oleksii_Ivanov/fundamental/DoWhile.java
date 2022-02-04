package com.epam.training.student_Oleksii_Ivanov.fundamental;

public class DoWhile {
    public static void main(String[] args) {
        int value = 42;
        while(value < 50){
            value++;
            if(value > 44 && value < 48){
                break;
            }
            System.out.println("' Hello");
        } while(value < 40);

    }

    }

