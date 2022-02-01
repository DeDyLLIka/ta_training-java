package com.epam.training.student_Oleksii_Ivanov.fundamental;

public class IfElse {
    public static void main(String[] args) {
        int value = 1;
        int x = 2;
        boolean flag;
        if (value > 0) {
            value++;
            value++;
            flag = false;// non correct to use false result if if(true)

        } else{
            flag = true;
        }
            System.out.println(value);
        x = x > 0 ? ++x : x--;
        System.out.println(x);
    }
}
