import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long count = 0;
        long repeatTime = n / s.length();
        count = s.chars().filter(c -> c == 'a').count() * repeatTime;
        long remainder = n % s.length();
        
        if (remainder != 0) {
            for (int i = 0; i < remainder; i++) {
                if (s.charAt(i) =='a') {
                    count++;
                }
            }
        }
        
        return count;
    }
}