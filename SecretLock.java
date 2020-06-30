package by.epamtc.aladzyin.array.simple;

public class SecretLock {
    private int firstNum;
    private int secondNum;
    private int thirdNum;

    private int[] keyArray;

    public SecretLock(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.keyArray = new int[10];
    }

    public int[] getKeyArray(){
        if((firstNum + secondNum) > 9 || (firstNum + secondNum) < 4 ){
            System.out.println("Unable to create a key. Try entering other numbers");
            return null;
        }

        if(firstNum < 1 || firstNum > 6 || secondNum < 1 || secondNum > 6){
            System.out.println("Invalid input numbers. The numbers must be in the range of 1 to 6 ");
            return null;
        }

        thirdNum = 10 - firstNum - secondNum;

        int [] numbers = {firstNum, secondNum, thirdNum};

        for(int i = 0; i < 10; i++){
            keyArray[i] = numbers[i % 3];
        }

        return keyArray;
    }
}
