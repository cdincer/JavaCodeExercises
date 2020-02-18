package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {


        int[] inputArray = {6, 2, 3, 8};

        int result = makeArrayConsecutive2(inputArray);

        System.out.println(result);


    }

    public static int makeArrayConsecutive2(int[] statues) {

        int counter, former, latter;
        counter = 0;
for(int n=0; n<statues.length-1;n++)
{
    if(statues[n]>statues[n+1])
    {
        former=statues[n];
        statues[n]=statues[n+1];
        statues[n+1]=former;
    }
}
        for (int i = 0; i < statues.length - 1; i++) {
            former = statues[i];
            latter = statues[i + 1];
            if (former + 1 != latter) {
                while(former<latter-1)
                {
                    former++;
                    counter++;
                }
            }
        }

        return counter;
    }

}


