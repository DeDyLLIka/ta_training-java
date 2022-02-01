package com.epam.training.student_Oleksii_Ivanov.fundamental;

public class switchCase {
    public static void main(String[] args) {
        byte value = 2; //short, int, char, string, enum
        final byte RANGE = 127;
        switch (value){
            case 2:
            case 3:
            case 4:// more code 1
                break;
            case RANGE:
                break;
            case 0:
                break;
            default:
        }
    }
    public static int defineLevel(String role) throws IllegalAccessException {
        int level = 5;
        switch(role){
            case "guest":  level = 0;
            break;
            case "client": level =1;
            break;
            case "moderator":  level = 2;
            break;
            case "admin": level =3;
            break;
            default: throw new IllegalAccessException("non-authentic role = " + role);
        }
        return level;
    }
}
