import java.util.HashMap;
import java.util.Map;

public class TribonacciNumber {

    static Map<Integer, Integer> lookUP = new HashMap<Integer, Integer>();

    static
    {
        lookUP.put(0,0);
        lookUP.put(1,1);
        lookUP.put(2,1);
    }

    public int tribonacci(int n) {

        if(lookUP.containsKey(n))
        {
            return lookUP.get(n);
        }
        lookUP.put(n, tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3));
        return lookUP.get(n);
    }
}
