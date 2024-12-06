package org.example;

import java.sql.Array;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

//        1. ( ChatGPT said me that 'Y' is sometimes as Vowel but i didn't considered it in my code. )
        //    შექმენით აბსტრაქტული კლასი, რომელსაც ექნება ერთი აბსტრაქტული მეთოდი სახელად countVowel. შემდეგ შექმენით შვილი კლასი, რომელიც ამ აბსტრაქტულ მეთოდს გაუკეთებს ოვერაიდინგს, ანუ შვილ კლასში გაიწერება ამ მეთოდის ლოგიკა. ბოლოს კი მეინ კლასში შექმენით ამ შვილი კლასის ობიექტი, რომელიც გამოიძახებს
//    countVowel მეთოდს, რომელიც არგუმენტის სახით მიიღებს სტრინგს და დაბეჭდავს ამ სტრინგში არსებული ხმოვანების რაოდენობას. მაგალითად თუ გადავეცით სტრინგი Hello, უნდა დაიბეჭდოს “ამ სტრიქონში არის 2 ხმოვანი ”, რადგან 2 ხმოვანია. თუ გადავეცი სტრინგი I love testing, უნდა დაიბეჭდოს “ამ
//    სტრიქონში არის 5 ხმოვანი ”, რადგან მართლა 5 ხმოვანია. მხოლოდ ინგლისური სტრინგებისთვის დაწერეთ პროგრამა, ანუ მხოლოდ ინგლისურ ხმოვანებს ითვლიდეს.
        ChildOfAbstract childOfAbstract = new ChildOfAbstract();
        System.out.println(childOfAbstract.countVowel("Aleksandre"));

//        2. ( დავალებაში არ იყო მოცემული UpperCase სიმბოლოების replace. So my code is working only for lowercase 'a' & 'b'. )
//    შექმენით ორი ინტერფეისი, პირველ ინტერფეისში შექმენით მეთოდი replaceSymbolA და მეორე ინტერფეისში შექმენით მეთოდი replaceSymbolB. შემდეგ შექმენით კლასი, რომელიც ორივე ინტერფეისს ერთდორულად გაუკეთებს იმპლემენტაციას. ბოლოს კი მეინ კლასში შექმენით ამ კლასის ობიექტი, რომელიც გამოიძახებს replaceSymbolA და replaceSymbolB მეთოდებს, რომლებიც არგუმენტის სახით მიიღებენ
//    String -ს და პირველი მეთოდი შეცვლის ყველა a ასოს z -ით, ხოლო მეორე მეთოდი ყველა b ასოს შეცვლის w -ით. მაგალითად, თუ პირველი მეთოდი მიიღებს ტექსტს Lela, უნდა დაბეჭდოს Lelz, ხოლო თუ მეორე მეთოდი მიიღებს ტექსტს Gabelaia, უნდა დაბეჭდის Gawelaia. მინიშნება, String -ში უკვე არსებული replace მეთოდით მარტივად გაართმევთ თავს ამ ამოცანას.
        Class4Implements class4Implements = new Class4Implements();
        System.out.println(class4Implements.replaceSymbolA("Aleksandre"));
        System.out.println(class4Implements.replaceSymbolB("Babylon"));


//        3.
        for (int num : thirdTask()) System.out.print(num + ", ");
    }


//        3.
//    ზრდადობით დალაგეთ შემდეგი int ტიპის მასივი int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89}.
//            არ გამოიყენოთ sort ან რამე სხვა ჯავას მეთოდი და თქვენით დაალაგეთ მასივი
//    ზრდადობით.
//    პირდაპირ main მეთოდში იმუშავეთ, დაალაგეთ მოცემული მასივი ზრდადობით და ბოლოს
//    დაბეჭდეთ ამ მასივში არსებული ელემენტები.
//    კარგად საფიქრალი ამოცანა არის და არ არის მარტივი. შეიძლება for -ში მეორე for -ის
//    გამოყენებაც დაგჭირდეთ და კარგად მოიფიქრეთ.

    public static int[] thirdTask(){
        int[] array = {18, -3, 5, -7, 6, 89, 13, 0, -89};

        for (int i = 0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                if (array[i]>array[j]){
                    int valueSaver = array[i];
                    array[i] = array[j];
                    array[j] = valueSaver;
                }
            }
        }
        return array;
    }
}