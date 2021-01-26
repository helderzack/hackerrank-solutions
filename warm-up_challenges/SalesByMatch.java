import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class SalesByMatch {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Long> socksMap = Arrays.stream(ar).boxed().
        collect(Collectors.groupingBy(socks -> socks, Collectors.counting()));
        
        long pairs = socksMap.values().stream().map(quantity -> quantity / 2).
        collect(Collectors.summingLong(Long::longValue));
        
        return (int) pairs;
    }
}