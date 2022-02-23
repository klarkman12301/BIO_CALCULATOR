package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inpol = new Scanner(System.in);
        System.out.print("Input your Sex: ");
        String pol = inpol.nextLine();
        String man = "man";
        String Man = "Man";
        String male = "male";
        String Male = "Male";
        String woman = "woman";
        String Woman = "Woman";
        String female = "female";
        String Female = "Female";
        int malerostrus = 178;
        int malerostind = 165;
        int malerostcan = 176;
        int malerostspain = 173;
        int malerostbritain = 175;
        int malerostfrance = 176;
        int malerostkitai = 170;
        int malerostusa = 178;
        int malerostnider = 184;
        int malerostukorea = 174;
        int malerostgerman = 173;
        int malerostjapan = 172;
        int ferostrus = 166;
        int ferostind = 152;
        int ferostcanada = 162;
        int ferostspain = 160;
        int ferostbritain = 167;
        int ferostfrance = 166;
        int ferostkitai = 159;
        int ferostusa = 165;
        int ferostnider = 171;
        int ferostukorea = 161;
        int ferostgerman = 164;
        int ferostjapan = 158;
        if(pol.equals(woman))
            pol = woman;
        if(pol.equals(Woman))
            pol = woman;
        if(pol.equals(female))
            pol = woman;
        if(pol.equals(Female))
            pol = woman;
        if(pol.equals(man))
            pol = man;
        if(pol.equals(Man))
            pol = man;
        if(pol.equals(male))
            pol = man;
        if(pol.equals(Male))
            pol = man;
        inpol.close();
        System.out.println(pol);
        Scanner inrost = new Scanner(System.in);
        System.out.print("Input your Height: ");
        int rost = inpol.nextInt();
        if(pol == man){
        }
    }
}
