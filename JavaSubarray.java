import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int[] a;
        int count=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        a = new int[n];
        
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            if(a[i]<0){
                        count++;
                    }
                for(int j=i;j<n;j++){
                    sum += a[j];
                    if(sum<0){
                        count++;
                    }
                }
        }
        System.out.println(count);
    }
}
