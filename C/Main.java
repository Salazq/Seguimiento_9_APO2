
import java.util.*;

public class Main {


    public Main(){

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Main m = new Main();
        String input1=sc.nextLine();
        String input2=sc.nextLine();
        String input3=sc.nextLine();
        String names=input1+input2;
        
        String [] parts1 = names.split("");
        String [] parts2 = input3.split("");

        if( Arrays.equals((m.sortStringArrayBubble(parts1)),(m.sortStringArrayBubble(parts2)))){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    public String[] sortStringArrayBubble(String [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if(array[j].compareTo(array[j-1])<0){
                    // get values to swap
                    String anterior = array[j-1];
                    String actual = array[j];
                    // swap
                    array[j]=anterior;
                    array[j-1]=actual;
                }
            }

        }
        return array;
    }
}


