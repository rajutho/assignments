package Assignments;

import java.util.Arrays;

public class Shuflle {
    public static void shuflle(int arr[]){
        int ran,tem;
        for(int i=arr.length-1;i>0;i--){
            ran=(int)(Math.random()*(i+1));
            tem=arr[ran];
            arr[ran]=arr[i];
            arr[i]=tem;
        }
    }
    public static void main(String srgs[]){
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        shuflle(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    
}
