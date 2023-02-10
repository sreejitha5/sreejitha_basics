package main.java.com.basic.practice;

public class Study {
    static int removeDuplicates(int[]arr, int n){
        if(n==0 || n==1)
            return n;
        int k =0;
        for(int i=0;i<n-1;i++)
            if(arr[i]!=arr[i+1])
                arr[k++] =arr[i];
        arr[k++]=arr[n-1];
        return k;

    }
}
