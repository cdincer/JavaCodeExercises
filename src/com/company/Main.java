package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
    String    s1 = "zzzz";
     String   s2 = "zzzzzzz" ;       /*
                int[][] matrix = {{4,0,1},{10,7,0},{0,0,0},{9,1,2}}; //15
                int[][] matrix = {{0,1,1,2},{0,5,0,0},{2,0,3,3}}; // 9

         */
        /* i
           0 1 2 3
    j   0 {0,1,1,2},
        1 {0,5,0,0},
        2 {2,0,3,3}
         */

      int result=  commonCharacterCount(s1,s2);

      System.out.println(result);
    }

//floors loop inner because main  constraint is zeroes nulling the floors down. We start at top and move down
//Anything goes wrong break the floor search.
public static int commonCharacterCount(String s1, String s2) {
    HashMap <Character,Integer> CommonCounter = new HashMap<Character,Integer>();
    HashMap <Character,Integer> CommonCounter2 = new HashMap<Character,Integer>();
    int sum = 0 ;


    int result =0;
    int CountHolder=0;
    for (char ch: s1.toCharArray())
    {
        if(CommonCounter.containsKey(ch))
        {
            CountHolder= CommonCounter.get(ch);
            CommonCounter.remove(ch);
            CountHolder++;
            CommonCounter.put(ch, CountHolder);
        }
        else
        {
            CommonCounter.put(ch, 1);
        }

    }

    for (char ch: s2.toCharArray())
    {
        if(CommonCounter2.containsKey(ch))
        {
            CountHolder= CommonCounter2.get(ch);
            CommonCounter2.remove(ch);
            CountHolder++;
            CommonCounter2.put(ch, CountHolder);
        }
        else
        {
            CommonCounter2.put(ch, 1);
        }

    }


    for (Map.Entry<Character, Integer> entry : CommonCounter.entrySet()) {

        if(CommonCounter2.containsKey(entry.getKey()))
        {
            //Get One of the commons count.
            CountHolder= CommonCounter2.get(entry.getKey());
            if(entry.getValue()>CountHolder)
            {
                sum += CountHolder;
            }
            else
            {
                sum += entry.getValue();
            }
        }

//    System.out.println(entry.getKey() + "/" + entry.getValue());
    }



    return sum;
}




}


