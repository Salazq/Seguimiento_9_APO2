import java.util.Scanner;

public class Main {


    public Main(){

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Main m = new Main();
        String input=sc.nextLine();
        String [] parts = input.split("\\+");
        m.sortStringArrayBubble(parts);


}

    public void sortStringArrayBubble(String [] array) {
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
        for(int i=0; i<array.length-1;i++){
                System.out.print(array[i]+"+");
        }
        System.out.print(""+array[array.length-1]);
        }
    }
