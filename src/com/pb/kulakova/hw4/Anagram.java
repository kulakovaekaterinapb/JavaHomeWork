package com.pb.kulakova.hw4;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String s1, String s2)
    {
        if(s1.length() != s2.length()) {
            return false;
        }
        int flag=0;
        HashMap<Character,Integer> table = new HashMap<Character,Integer>();
        for(int i=0; i< s1.length();i++) {
            table.put(s1.charAt(i),1);
        }

        for(int i=0; i< s2.length();i++) {
            if(table.containsKey(s2.charAt(i))) {
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
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        s1=s1.toLowerCase().replaceAll("[^А-Яа-я]","");
        s2=s2.toLowerCase().replaceAll("[^А-Яа-я]","");


        boolean result = isAnagram(s1,s2);
        if(result) {
            System.out.println("Это Анаграмма");
        } else{
            System.out.println("Это не Анаграмма");
        }
    }
}

