package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;

public class Encryptor {
    
    public static int determineColumns(int messageLen, int rows){
        while (messageLen % rows != 0) {
            messageLen++;
        }
        return messageLen/rows;
    }
    
    public static String[][] generateEncryptArray(String message, int rows) {
        int col = determineColumns(message.length(), rows);
        String[][] qwe = new String[rows][col];
        int idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (idx == message.length()) {
                    qwe[i][j] = "=";
                }
                else {
                    qwe[i][j] = message.substring(idx, idx+1);
                    idx++;       
                }

            }
        }
        return qwe;
    }

    public static String encryptMessage(String message, int rows){
        String[][] qwe = generateEncryptArray(message, rows);
        String toReturn = "";
        for (int j = qwe[0].length-1; j >= 0; j--) {
            for (int i = 0; i < qwe.length; i++) {
                toReturn += qwe[i][j];
            }
        }
        return toReturn;
    }

    public static String decryptMessage(String encryptedMessage, int rows) {
        String toReturn = "";
        int start = encryptedMessage.length()-rows;
        for (int j = 0; j < rows; j++) {
            for (int i = start; i >= 0 ;i -= rows) {
                if (!encryptedMessage.substring(i, i+1).equals("=")) {
                    toReturn += encryptedMessage.substring(i, i+1);                    
                }
            }
            start++;
        }
        return toReturn;
    }
}