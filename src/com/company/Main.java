package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {









    }


   public  int firstDuplicate(int[] a)
    {
        Set<Integer> result = new HashSet();
        for(int i=0; i<a.length; i++)
        {
            if(result.contains(a[i]))
            {
                return a[i];
            } else
            {

                result.add(a[i]);
            }
        }
        return -1;
    }


}
