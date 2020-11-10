import java.util.HashMap;
import java.util.Map;

public class RelativeSortArray_1122 {


    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr1)
        {
           if(map.containsKey(i))
            {
                map.put(i, map.get(i)+ 1);
            }
            else
            {
                map.put(i, 1);
            }
        }

        int[] output = new int[arr1.length];

        for(int i : arr2)
        {
            populateArray(output, map.get(i),i);
        }


        for(int k : output)
        {
            System.out.print(k + " ");
        }
        return output;


    }


    public void populateArray(int[] arr, int n, int element)
    {
        int len = arr.length;
        while(n > 0)
        {
            arr[len-1] = element;
            n = n-1;
            len =+ 1;
        }
    }



    public static void main(String args[])
    {
        RelativeSortArray_1122 obj = new RelativeSortArray_1122();

        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};

        System.out.println("Result: " + obj.relativeSortArray(arr1,arr2));
    }
}
