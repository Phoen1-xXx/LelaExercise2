package org.example;

public class ChildOfAbstract extends AbstractClass{

    @Override
    public int countVowel(String word) {

        char[] vowels = {'a','e','i','o','u'};

        int counter = 0;

        for (int i = 0; i<vowels.length; i++){
            for (int j = 0; j<word.length(); j++){
                if (vowels[i]==(word.toLowerCase().charAt(j))){
                    counter++;
                }
            }
        }
        return counter;
    }
}
