package org.example;

public class Class4Implements implements Interface1, Interface2{
    @Override
    public String replaceSymbolA(String word) {
        return word.replace('a','z');
    }

    @Override
    public String replaceSymbolB(String word) {
        return word.replace('b','w');
    }
}
