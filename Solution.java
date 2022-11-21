import java.util.*;
import java.io.*;
import java.math.*;
import java.util.HashMap;

class Solution {
    public static int triangularSum(int[] nums) {
        return recursiveSum(nums);
    }

    public static int recursiveSum(int[] num) {
        if(num.length == 1){
            return num[0] % 10;
        }
        int[] new_num = new int[num.length - 1];
        for(int i = 0; i< num.length - 1; i++){
            new_num[i] = (num[i] + num[i + 1])  % 10;
        }
 
        return recursiveSum(new_num);
    } 

    public static void main(String args[]) {
        int[] nums = { 1,2,3,4,5 };
        int answer = triangularSum(nums);
        System.out.println("answer--------------:" + answer);
    }
}

