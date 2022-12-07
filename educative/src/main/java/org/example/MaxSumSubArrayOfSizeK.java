package org.example;

public class MaxSumSubArrayOfSizeK {


    //The time complexity of the above algorithm will be O(N*K)

//    public static int findMaxSumSubArray(int k , int []arr){
//        int maxSum=0, windowSize;
//        for(int i =0; i<=arr.length-k; i++){
//            windowSize = 0;
//            for (int j=i; j<i+k; j++){
//                windowSize += arr[j];
//            }
//            maxSum = Math.max(maxSum, windowSize);
//        }
//        return maxSum;
//    }

    //a better approach

//    Time Complexity #
//    The time complexity of the above algorithm will be O(N)
//
//    Space Complexity #
//    The algorithm runs in constant space O(1).


    public static int findMaxSumSubArray(int k, int []arr){
        System.out.println("better aproach");

        int windowSum= 0, maxSum = 0 ,  windowStart =0;
        for(int windowEnd = 0 ;  windowEnd < arr.length; windowEnd ++){
            windowSum += arr[windowEnd]; // add next element


            if(windowEnd >= k-1){
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];  //substract element going out
                windowStart++;//slide ahead
            }

        }
        return maxSum;
    }


}
