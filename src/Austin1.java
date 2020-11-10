import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Austin1 {


    public String extrapolateForMinimum(int n, List<Integer> instances,List<Float> price)
    {
        int size = instances.size();
        int quantity1 = instances.get(0); // 100
        int quantity2 = instances.get(1); // 500

        int diffInQuantity = quantity2 - quantity1; // 400

        float price1 = price.get(0); // 18
        float price2 = price.get(1);  // 15.5

        float diffInPrice = price2 - price1; // 2.5

        /* so there is a price increase of 2.5 for every 400 decrease in quantity

         */
        int difference = n - instances.get(size - 1); // n = 10  instances[0] = 100 difference = 100  - 10 = 90

        float numberOfJumps = (float)difference/diffInQuantity; // 400/90 = 4.44

        double unitPrice = price1 - numberOfJumps * diffInPrice;

        return String.format("%.2f", unitPrice);
    }


    public String extrapolateForMaximum(int n , List<Integer> instances,List<Float> price)
    {

        int size = instances.size();
        int quantity1 = instances.get(size - 1); // 100
        int quantity2 = instances.get(size - 2); // 500

        int diffInQuantity = quantity1 - quantity2; // 400

        float price1 = price.get(size - 1); // 18
        float price2 = price.get(size - 2);  // 15.5

        float diffInPrice = price2 - price1; // 2.5

        /* so there is a price increase of 2.5 for every 400 decrease in quantity

         */
        int difference = n - instances.get(size - 1); // n = 10  instances[0] = 100 difference = 100  - 10 = 90

        float numberOfJumps = (float)difference/diffInQuantity; // 400/90 = 4.44

        double unitPrice = price1 - numberOfJumps * diffInPrice;

        return String.format("%.2f", unitPrice);
    }


    /*
    Iterate through the instances(sorted) and find:
    1. If n matches;
    2. If next instance value is less then increment
    3. If not end of List and the next instance value is greater than n
       then get the range for the instance



     */

    public int findRange(int n, List<Integer> instances,List<Float> price)
    {
        // holds the current value of the instance
        int currentValue = instances.get(0);

        // if it has only one quantity then return that

        if(instances.size() == 1)
        {
            return instances.size()-1;
        }

        // check for the minimum value
        if(n < currentValue)
        {
           extrapolateForMinimum(n,instances,price);
        }

        // if n is greater than maximum instance value

        if( n > instances.get(instances.size()-1))
        {
            extrapolateForMaximum(n , instances,price);
        }


        for(int i =0; i < instances.size(); i++)
        {
            // if instance value has expired then ignore the value
            if(currentValue <= 0)
            {
                continue;
            }

            // check for the min value
            else if(currentValue < instances.size())
            {

            }

            // if the value matches exactly then send the index
            else if(currentValue ==  n)
            {
                return i;
            }


        }

            return 0;
    }



    /*
     * Complete the 'interpolate' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY instances
     *  3. FLOAT_ARRAY price
     */

    public static String interpolate(int n, List<Integer> instances, List<Float> price) {


        // Write your code here
        return "";

    }


    public static void main(String args[])
    {
        int n = 2000;

        List<Integer> instances = Arrays.asList(10,25,50,100,500);

        List<Float> price = new ArrayList<Float>();

        price.add(27.32f);
        price.add(23.13f);
        price.add(21.25f);
        price.add(18.00f);
        price.add(15.50f);


        Austin1 obj = new Austin1();
        obj.findRange(n, instances,price);

    }

}
