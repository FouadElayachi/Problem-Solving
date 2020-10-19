import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            long a = 0, b = 0, c = 0;
            a = (n - 1) / 3;
            b = (n - 1) / 5;
            c = (n - 1) / 15;
            long sum3 = 3 * a * (a + 1) / 2;
            long sum5 = 5 * b * (b + 1) / 2;
            long sum15 = 15 * c * (c + 1) / 2;
            long sum = sum3 + sum5 - sum15;
            System.out.println(sum);
        }
    }
}