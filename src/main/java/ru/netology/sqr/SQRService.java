package ru.netology.sqr;


public class SQRService {
    public int shouldCalculateQuantitySquares(int start, int end) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            if ((i * i) >= start) {
                if ((i * i) <= end) {
                    count++;
                }
            }
        }
        return count;
    }
}