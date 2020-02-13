package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baoshu {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入人数");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int cnt=0,index = 1,flag = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        while(true){
            cnt++;
            while(arr[index]==0){
                index++;
                if(index>arr.length-1){
                    index=1;
                }
            }
            if(cnt%3==0){
                arr[index] = 0;
                flag--;
                if(flag==1){
                    break;
                }
            }
            index++;
            if(index>arr.length-1){
                index=1;
            }
        }
        int sum=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=0){
                System.out.println(arr[i]);
                break;
            }
        }*/
        System.out.println(shu(100));
    }
    public static int shu(int n){
        List<Integer> list = new ArrayList<>();
        for(int i= 1; i<=n; i++){
            list.add(i);
        }
        int m= 1;
        while(list.size()>1){
            if(m!=3){
                int first = list.remove(0);
                list.add(first);
                m++;
            }else {
                list.remove(0);
                m = 1;
            }
        }
        return list.get(0);
    }
}
