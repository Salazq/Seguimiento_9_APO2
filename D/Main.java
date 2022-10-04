
import java.util.*;
import java.lang.Math;

class Main {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int input=Integer.parseInt(sc.nextLine());

        for(int i=0; i<input;i++){

            String input1=sc.nextLine();
            int[] parts1 = Arrays.stream(input1.split(" ")).mapToInt(Integer::parseInt).toArray();
            
            String input2=sc.nextLine();
            int[] parts2 = Arrays.stream(input2.split(" ")).mapToInt(Integer::parseInt).toArray();
            
            sortIntegerArrayInsertion(parts2, parts1[0], parts1[1]);

        }
    }

    public static void sortIntegerArrayInsertion(int[]array, int n, int k) {

        
        for (int rojo = 1; rojo < array.length; rojo++) {
            int valorRojo = array[rojo];
            int verde = rojo-1;

            while ( verde > -1 && array[verde] <= valorRojo ) {
                int valorVerde = array[verde];
                array[verde+1]=valorVerde;
                
                verde--;
            }
            array[verde+1]=valorRojo;
        }
       

       
        if(n - k> k){
            k= n - k;
        }

        int sum1=0, sum2=0;

        for(int e=0; e<k;e++){

            sum1+=array[e];
        }
        for(int e=k;e<n;e++){

            sum2+=array[e];
        }
        System.out.println( Math.abs(sum2-sum1));
    }
}