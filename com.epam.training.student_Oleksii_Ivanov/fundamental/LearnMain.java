package com.epam.training.student_Oleksii_Ivanov.fundamental;

import java.math.BigDecimal;

public class LearnMain{
    public static void main(String args[]){
        int bonus;
        int discount = 10;
        int purchaseItem = 3;
        final int DISCOUNT_LIMIT = 3;
        if (purchaseItem > DISCOUNT_LIMIT) {
            bonus = discount;
        } else {
            bonus = 0;
        }

    }
}
