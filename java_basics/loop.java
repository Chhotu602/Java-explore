package java_basics;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        // for(int a=1;a<=5;a++){
        //     System.out.println(a);
        // }

        // while(i<11){
        //     System.out.println(i);
        //     i++;
        // }

        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<11);

        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        // int add=0;
        // for(int i=1;i<=sum;i++){
        //     add=add+i;
            
        // }System.out.println(add);
        for(int i=1;i<=10;i++){
            System.out.println(sum*i);
        }
        
    }
}
