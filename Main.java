import java.io.*;
import java.util.*;

class Main{
    static public void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String c = sc.nextLine();
        int a=sc.nextInt();
        int b=sc.nextInt();
        calc(c,a,b);
        calc(c,(float)a,(float)b);
    }
    static public void calc(String c,int a, int b){
        System.out.println("operating with int");
        switch(c){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            default:
                System.out.println("incorrect operator");
        }
    }

    static public void calc(String c,float a, float b){
        System.out.println("operating with floats");
        switch(c){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            default:
                System.out.println("incorrect operator");
        }
    }
}
