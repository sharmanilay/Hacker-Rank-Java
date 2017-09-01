import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        BigInteger n1 = new BigInteger(a.next());
        BigInteger n2 = new BigInteger(a.next());
        
        BigInteger n3,n4;
        n3 = n1.add(n2);
        n4 = n1.multiply(n2);
        System.out.println(n3);
        System.out.println(n4);
        
        
    }
}
