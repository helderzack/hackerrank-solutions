import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int index = 0;
        
        while (index < c.length - 1) {
            jumps++;
            index += 2;
            
            if (index >= c.length - 1) {
                break;
            }
            
            if (c[index] == 1) {
                index--;
            }
        }
        
        return jumps;
    }
}