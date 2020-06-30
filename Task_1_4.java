package by.epamtc.aladzyin.array.simple;

import java.util.Arrays;
import static java.lang.Math.min;

public class Task_1_4 {

    private int prev;
    private int last;

    private int countPrev;
    private int countLast;

    private boolean isPrevFound;
    private boolean isOtherFound;

    public int getPredominantNumber( int[] ints ){

        if( ints.length == 0 ) {
            System.out.println("Array is empty!!!");
            return -1;
        }

        if( ints.length == 1 ) return ints[0];

        if( ints.length == 2 ) return ints[0] == ints[1] ? ints[0] : min( ints[0], ints[1] );

        Arrays.sort( ints );

        System.out.println( Arrays.toString(ints) +'\n');

        if( ints[1] == ints[0] ){
            prev = ints[0];
            countPrev++;
            isPrevFound = true;
        }

        for( int i = 1; i < ints.length -1; i++ ){

            if( ints[i] == ints[i + 1]  || ints[i] == ints[i-1] ){

                if(!isPrevFound){
                    prev = ints[i];
                    isPrevFound = true;
                }

                if(ints[i] == prev){
                    countPrev++;
                }else if(!isOtherFound){
                    isOtherFound = true;
                    last = ints[i];
                }

                if(ints[i] == last){
                    countLast++;
                }

                if(countLast > countPrev){
                    prev = last;
                    countPrev = countLast;
                }

                if(ints[i] > last && isOtherFound){
                    last = ints[i];
                    countLast = 1;
                }
            }
        }

        if(ints[ints.length-1] == prev) countPrev++;
        if(ints[ints.length-1] == last) countLast++;

        return countPrev >= countLast ? prev : last ;
    }

}
