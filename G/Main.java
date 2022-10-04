
import java.util.*;
 
public class Main{
 
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
 
        int input=Integer.parseInt(sc.nextLine());
 
        for(int i=0; i<input;i++){
 
            int n=sc.nextInt();
            int k=sc.nextInt();
 
            long[] array=new long[n];  
            for(int e=0;e<n;e++){
                array[e]=(sc.nextLong());
            }
            array=quickSort(array, 0, array.length-1);
 
            for(int e=0; e<k;e++){
                array[n-1]+=array[(n-2)-e];
            }
            System.out.println(array[n-1]);
        }
    }
    public static long[] quickSort(long[]array, int first, int last){
        long piv = (array[first] + array[last])/2;
        int i = first;
        int j = last;

        while (i<j){
            while (array[i]<piv) i++;
            while (array[j]>piv) j--;
            if(i<=j){
                long x = array[i];
                array[i] = array[j];
                array[j] = x;
                i++;
                j--;
            }
        }
        if(first<j){
            array = quickSort(array, first, j);
        }
        if(last>i){
            array = quickSort(array, i, last);
        }
        return array;
    }
}