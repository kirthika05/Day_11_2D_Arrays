package com.kirthika;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int ans=maxSum(arr);
        System.out.printf("%d",ans);
    }

    public static int maxSum(int [][] arr){
        int []s = new int[16];
        int k=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                s[k]= arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                k++;
            }
        }
        Arrays.sort(s);
        return s[15];
    }
}
