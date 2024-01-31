package java_basics;

import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int age=sc.nextInt();

        // if(age>18){
        //     System.out.println("Adult");

        // }else{
        //     System.out.println("Not Adult");
        // }

        // Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt();
        // if(num%2==0){
        //     System.out.println("even");
        // }
        // else{
        //     System.out.println("odd");
        // }

        // Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // if(a==b){
        //     System.out.println("equal");


        // }else{
        //     if(a>b){
        //         System.out.println("a is greater");
        //     }
        //     else{
        //         System.out.println("a is lesser");
        //     }
            
        // }

        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        // if(button==1){
        //     System.out.println("Hello");
        // }
        // else if(button==2){
        //     System.out.println("Namaste");
        // }else{
        //     System.out.println("Bonjour");
        // }
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
            System.out.println("Invalid Button");
        }

    }
    
}
