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
            List<Long> list = new ArrayList<>();
            long n = in.nextLong();
            for(long i = 2; i < n; i++) {
                if(n % i == 0)
                    list.add(i);
            }
            Collections.sort(list);
            if(list.isEmpty())
                System.out.println(n);
            else
                System.out.println(list.get(list.size() - 1));
        }
    }
}