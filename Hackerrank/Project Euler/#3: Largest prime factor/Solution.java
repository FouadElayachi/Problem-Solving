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
            if (n>0)
            {
                while (n%2==0)
                {
                    list.add((long)2);
                    n /= 2;
                }

                for (long i = 3; i <= Math.sqrt(n); i+= 2)
                {
                    while (n%i == 0)
                    {
                        list.add(i);
                        n /= i;
                    }
                }
                if (n > 2)
                    list.add(n);
            }
            Collections.sort(list);
            if(list.isEmpty())
                System.out.println(n);
            else
                System.out.println(list.get(list.size() - 1));
        }
    }
}