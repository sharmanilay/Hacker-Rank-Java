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
        a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            int sum = 0;
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
