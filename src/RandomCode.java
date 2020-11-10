public class RandomCode {

    public int convert(String num)
    {
        boolean positive = true;
            num = num.trim();
            if(num.startsWith("-"))
            {
                positive = false;
            }
         int result = Integer.valueOf(num);
            if(result > Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }
            else if(result < Integer.MIN_VALUE)
            {
                return Integer.MIN_VALUE;
            }
         System.out.println("output: " + result);
            return result;
    }


    public static void main(String args[])
    {
        String str = "-123453534455";
        RandomCode code = new RandomCode();
        code.convert(str);
    }
}
