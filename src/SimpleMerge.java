/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] combarray = new int[arr1.length + arr2.length];
        int var;
        for (int i = 0; i < combarray.length; i++) {
           for(int i1=0;i1<arr1.length;i++){
               for(int i2:arr2)
           }
            combarray[i]=var;
        }
        return combarray;
    }
}
