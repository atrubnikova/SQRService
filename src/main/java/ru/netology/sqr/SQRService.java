package ru.netology.sqr;

public class SQRService {
    public int numberOfSqrInRange(int aRange, int bRange){
        int count=0;
        for (int i = aRange; i <= bRange ; i++) {
            for (int j = 10; j <=99 ; j++) {
                if (i==j*j) {
                    count++;
                }

            }
        }
    return count;
    }

}
