package test;

import java.util.*;
import java.lang.*;

class Solution {
    /**
     ·* @param int[] arr - List of integ
     ·* @return int - Number of elements
     ·*/
    public static int countElements(int[] arr){
        int result = Integer.MIN_VALUE;

        int num;
        int count = 0;

        LinkedHashSet<Integer> UniqueList
                = new LinkedHashSet<Integer>();

        // Adding elements to LinkedHashSet
        for (int y : arr){
            UniqueList.add(y);
        }

        for (int j : arr) {
            num = j;
            int z = num + 1;


            for (int x : UniqueList) {
                if (x == z) count = count + 1;
            }
        }
        result = count;

        return result;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] components = sc.nextLine().split(" ");
        int[] nums = new int[components.length];
        for(int i = 0; i < components.length; i++){
            nums[i] = Integer.parseInt(components[i]);
        }

        System.out.println(Solution.countElements(nums));
    }
}


