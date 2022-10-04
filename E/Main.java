
import java.util.*;
    
public class Main{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int input=Integer.parseInt(sc.nextLine());

        for(int i=0; i<input;i++){

            int n=sc.nextInt();
    
            int[] w=new int[n];
            int[] l=new int[n];
            int count=0;

            for(int e=0;e<n;e++){
                w[e]=(sc.nextInt());
            }
            for(int e=0;e<n;e++){
                l[e]=(sc.nextInt());
            }


            switch (n){

                case 2:
                    if(w[0]>w[1]){
                        count++;
                        if(l[0]==1){
                            count++;
                        }
                    }
                    System.out.println(count);
                break;

                case 3:
                    organize3_4(w, l, 3);

                break;

                case 4:
                    organize3_4(w, l, 4);
                break;
            }
            
        }
    }

    public static void organize3_4(int [] w, int [] l, int n){
        int count=0;

        int [] l_1=new int[2];
        int [] l_2=new int[2];
        int [] l_3=new int[2];
        int [] l_4=new int[2];

        for(int i = 0; i< w.length; i++ ){

            if(w[i]==1){
                l_1[0]=i;
                l_1[1]=l[i];
            }
    
            if(w[i]==2){
                l_2[0]=i;
                l_2[1]=l[i];
            }
            if(w[i]==3){
                l_3[0]=i;
                l_3[1]=l[i];
            }
            if(n==4 &&w[i]==4){
                l_4[0]=i;
                l_4[1]=l[i];
            }
        }

        while(l_2[0]<=l_1[0]){
            l_2[0]+=l_2[1];
            count++;
        }

        while (l_3[0]<=l_2[0]){
            l_3[0]+=l_3[1];
            count++;
        }

        if(n==4){

            while (l_4[0]<=l_3[0]){
                l_4[0]+=l_4[1];
                count++;
            }
        }
        System.out.println(count);
 
    }

}
    