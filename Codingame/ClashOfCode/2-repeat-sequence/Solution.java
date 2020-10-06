import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lenT = in.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        String res = "";
        for (int i = 0; i < lenT; i++) {
            list.add(in.nextInt());

        }
        res = ""+list.get(0);
        for (int i = 1; i < lenT; i++) {
            res += ".".repeat(list.get(i - 1)) + list.get(i);
        }
        System.out.println(res);
    }
}