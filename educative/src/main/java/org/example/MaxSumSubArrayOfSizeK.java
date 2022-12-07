package org.example;

public class MaxSumSubArrayOfSizeK {

    public static int findMaxSumSubArray(int k , int []arr){

        int maxSum=0, windowSize;

        for(int i =0; i<=arr.length-k; i++){
            windowSize = 0;

            for (int j=i; j<i+k; j++){
                windowSize += arr[j];
            }

            maxSum = Math.max(maxSum, windowSize);

        }

        return maxSum;


    }


}
