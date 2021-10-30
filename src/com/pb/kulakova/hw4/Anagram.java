package com.pb.kulakova.hw4;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String string1, String string2)
    {
        if(string1.length() != string2.length()) {
            return false;
        }
        int flag=0;
        HashMap<Character,Integer> table = new HashMap<Character,Integer>();
        for(int i=0; i< string1.length();i++) {
            table.put(string1.charAt(i),1);
        }

        for(int i=0; i< string2.length();i++) {
            if(table.containsKey(string2.charAt(i))) {
                continue;
            } else {
                flag=1;
                break;
            }
        }
        return flag == 0;
    }

    public static void main(String[] args) {
        System.out.println("Введите выражение:");
        Scanner sc= new Scanner(System.in);
        String string1= sc.nextLine();
        String string2= sc.nextLine();
        string1=string1.toLowerCase();
        string2=string2.toLowerCase();


        boolean result = isAnagram(string1,string2);
        if(result) {
            System.out.println("Это Анаграмма");
        } else{
            System.out.println("Это не Анаграмма");
        }
    }
}

