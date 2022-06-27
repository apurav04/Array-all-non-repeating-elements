package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr= new int[5];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        nonrepeating(arr);

    }
    public static void nonrepeating(int[] arr){
        Arrays.sort(arr);
        if(arr[0] != arr[1]){
            System.out.print(arr[0]);
        }
        for(int i=1;i< arr.length-1;i++){
            if(arr[i]!=arr[i+1] && arr[i]!=arr[i+1]){
                System.out.print(arr[i]);
            }
        }
    }
}
