package com.epam.training.student_Oleksii_Ivanov.fundamental;

public class TernaryOperator {
    public static void main(String args[]){
        int bonus;
        int discount = 10;
        int purchaseItem = 3;
        final int DISCOUNT_LIMIT = 3;
        bonus = purchaseItem > DISCOUNT_LIMIT ? discount : 0;
//        if (purchaseItem > DISCOUNT_LIMIT) {
//            bonus = discount;
//        } else {
//            bonus = 0;
//        }

    }
}
