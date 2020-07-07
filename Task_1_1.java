package by.epamtc.aladzyin.array.simple;

import java.util.Arrays;

public class Task_1_1 {

    public int getMaxSum (int [] arr){

        int maxSum;

        if(arr.length == 0){
            System.out.println("Array is empty!");
            return 0;
        };

        boolean isEven = arr.length % 2 == 0;

        int length = isEven ? arr.length / 2 : arr.length / 2 + 1;

        int [] tempArr = new int[length];

        for ( int i = 0; i < length - 1; i++ ){
            tempArr[i] = arr[i] + arr[arr.length -1 - i];
        }

        tempArr[length-1] = isEven ? arr[length - 1] + arr[length] : arr[length -1];

        Arrays.sort(tempArr);
        maxSum = tempArr[length - 1];

        return maxSum;
    }
}
