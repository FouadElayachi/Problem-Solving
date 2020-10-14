import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();`
        String line0 = "1234567890-="
        String line1 = "qwertyuiop[]\\";
        String line2 = "asdfghjkl';";
        String line3 = "zxcvbnm,./";
        int r = 0;
        String line = "";
        if(line0.contains(word.substring(0, 1))) {
            line = line0;
        }
        if(line1.contains(word.substring(0, 1))) {
            line = line1;
        }
        else if(line2.contains(word.substring(0, 1))) {
            line = line2;
        }
        else line = line3;
        for(int i = 1; i < word.length(); i++) {
            if(line.indexOf(word.charAt(i)) != -1) r++;
        }
        if(r + 1 == word.length())
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
