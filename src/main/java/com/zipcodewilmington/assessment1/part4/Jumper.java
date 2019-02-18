package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int jumpNum = 0;
        if(k > j) {
            for (int i = j; i < k; i++) {
                jumpNum += i;
            }
        }else if(j > k){
            for (int x = k; x < j; x++) {
                jumpNum += x;
            }
        }else if(k == j){
            jumpNum = 1;
        }

        return jumpNum;
    }
}
