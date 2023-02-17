// bài 1 : input [1,2,3] -> output [1,2,3,3,2,1]

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int[] Array = new int[] {1,2,3};
            for ( int i = 0; i < 3; i++){
                System.out.println(Array[i]);
                if (i == 2){
                    for ( int j = 2; j >= 0; j--) {
                        System.out.println(Array[j]);
                    }
                }

            }

    }
    
}