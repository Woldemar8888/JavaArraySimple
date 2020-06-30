package by.epamtc.aladzyin.array.simple;

import java.util.ArrayList;
import java.util.Collections;

public class Task_1_5 {
    private int[] arr;

    public Task_1_5(int[] arr) {
        this.arr = arr;
    }

    public int getSumMinMax(){
        if(arr.length == 0) return 0;

        ArrayList arrayListEven = new ArrayList();
        ArrayList arrayListOdd = new ArrayList();

        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                arrayListEven.add(arr[i]);
            }else{
                arrayListOdd.add(arr[i]);
            }
        }

        Collections.sort(arrayListEven);
        Collections.sort(arrayListOdd);

        return ((int) arrayListEven.get(arrayListEven.size() -1)) +
               ((int) arrayListOdd.get(0));
    }
}
