package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        person person = new person();

        Scanner inpol = new Scanner(System.in);
        System.out.print("Input your Sex: ");
        person.pol = inpol.nextLine();

        Scanner inrost = new Scanner(System.in);
        System.out.print("Input your Height: ");
        person.rost = inrost.nextInt();

        Scanner inves = new Scanner(System.in);
        System.out.print("Input your weight: ");
        person.ves = inves.nextInt();



        String man = "man";
        String Man = "Man";
        String male = "male";
        String Male = "Male";
        String woman = "woman";
        String Woman = "Woman";
        String female = "female";
        String Female = "Female";

        int maleaverost = 175;
        int feaverost = 162;
        int maleaveves = 80;
        int feaveves = 62;

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

        if(person.pol.equals(woman))
            person.pol = woman;
        if(person.pol.equals(Woman))
            person.pol = woman;
        if(person.pol.equals(female))
            person.pol = woman;
        if(person.pol.equals(Female))
            person.pol = woman;

        if(person.pol.equals(man))
            person.pol = man;
        if(person.pol.equals(Man))
            person.pol = man;
        if(person.pol.equals(male))
            person.pol = man;
        if(person.pol.equals(Male))
            person.pol = man;



        if(person.pol == man){
            if(person.rost > maleaverost){
                System.out.println("You are taller than the average man on earth");
            }
            if (person.rost == maleaverost) {
                System.out.println("you are of average height");
            }
            if (person.rost < maleaverost){
                System.out.println("You are lower than the average man on earth");
            }
        }
        if (person.pol == woman){
            if (person.rost > feaverost){
                System.out.println("You are taller than the average woman on earth");
            }
            if (person.rost == feaverost){
                System.out.println("you are of average height");
            }
            if (person.rost < feaverost){
                System.out.println("You are lower than the average woman on earth");
            }
        }
        if(person.pol == man) {
            if (person.ves > maleaveves) {
                System.out.println("your weight is bigger than average weight of man on earth ");

            }
            if (person.ves < maleaveves) {
                System.out.println("your weight is smaller than average weight of man on earth ");

            }
            if (person.ves == maleaveves) {
                System.out.println("you have average weight of the man on earth");

            }
        }
        if(person.pol == woman) {
            if (person.ves > feaveves) {
                System.out.println("your weight is bigger than average weight of woman on earth ");

            }
            if (person.ves < feaveves) {
                System.out.println("your weight is smaller than average weight of woman on earth ");

            }
            if (person.ves == feaveves) {
                System.out.println("you have average weight of the woman on earth");

            }
        }


        System.out.println(person.pol);
        System.out.println(person.rost);

    }
}
