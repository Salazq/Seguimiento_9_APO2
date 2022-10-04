
import java.util.*;
import java.lang.Math;

class Main {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int input=Integer.parseInt(sc.nextLine());

        for(int i=0; i<input;i++){

            int input1=Integer.parseInt(sc.nextLine());
            
            String input2=sc.nextLine();
            int[] parts2 = Arrays.stream(input2.split(" ")).mapToInt(Integer::parseInt).toArray();
            
            sortIntegerArrayInsertion(parts2,input1);
        }
    }

    public static void sortIntegerArrayInsertion(int[]array, int n) {

        
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
       
        int difer=1000000000;

        for(int e=0; e<n-1;e++){

            if(array[e]-array[e+1]<difer){
                difer=array[e]-array[e+1];
            }
        }
        System.out.println( Math.abs(difer));
    }
}