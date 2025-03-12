package com.example.project;

public class Main {
    public static void main(String[] args) {
        String ert = "a hd= rtn=seoa=ntb .iu ssfcngtf aoauehdcPrt  ";
        String qwe = Encryptor.encryptMessage("twopointsevenoneeighttwoeightoneeighttwoeightfourfiveninezerofourfivetwothreefivethreesixzerotwoeightsevenfoursevenonethreefivetwosixsixfourninesevensevenfiveseventwofoursevenzeroninethreesixninenineninefive", 72);
        String wer = Encryptor.decryptMessage(ert, 5);
        System.out.println(wer);

        
    }
}
