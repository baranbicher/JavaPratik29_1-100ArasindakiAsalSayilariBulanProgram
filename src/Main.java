import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Asal 1'den 100'e kadar!:::");
        for(int i=1; i<=100; i++){
            int n=0;
            for (int m=1;m<=i; m++ ){
                if( i%m==0){
                    n++;

                }

            }

            if(n<=2){
                System.out.println(i);
            }

        }


    }
}