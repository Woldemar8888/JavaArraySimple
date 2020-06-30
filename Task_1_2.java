package by.epamtc.aladzyin.array.simple;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_1_2 {
    public String filterMin(int [] arr){

        if(arr.length == 0){
            System.out.println("Array is empty");
            return null;
        }

        Arrays.sort(arr);
        ArrayList arrayList = new ArrayList();

        int min = arr[0];

        for(int i =0; i < arr.length; i++ ){
            if( arr[i] != min){
                arrayList.add(arr[i]);
            }
        }

        return arrayList.toString();
    }
}
