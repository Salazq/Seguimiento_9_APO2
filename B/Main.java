import java.util.Scanner;

public class Main {


    public Main(){

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Main m = new Main();
        String input1=sc.nextLine();
        String input2=sc.nextLine();
        String [] parts = input2.split(" ");

        if(Integer.parseInt(input1)!=parts.length){
            System.out.println(-1);
        }
        
        else{
        System.out.println(m.sortStringArrayBubble(parts));
        }
}
    public String sortStringArrayBubble(String [] array) {
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
        int out=0;
        for(int i=0; i<array.length;i++){

            if(!array[i].equals("0")){
                if(i+2<array.length &&array[i].equals(array[i+2])){
                    return "-1";
                }
                if(i+1<array.length&&array[i].equals(array[i+1])){
                    out++;
                    i++;
                }
            } 
        }
        return ""+out;
        }

    }


