package java_basics;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

/**
 * index
 */
public class variable {
    public static void main(String[] args) {
    //Variables

    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    System.out.println(name);
    int a=10;
    int b=5;
    int sum=a+b;
    // System.out.println(sum);

    int diff =b-a;
    // System.out.println(diff);

    int mul=a*b;
    // System.out.println(mul);

    //To Calculate a*b/a-b

    int ans=(a*b)/(a-b);
    System.out.println(ans);
    }
}