package dataStructure;

import java.util.Scanner;

public class Code01 {
    public static void main(String[] args){
        String str="Hello";
        String input = null;

        Scanner kb=new Scanner(System.in);

        System.out.print("Please type a string:");
        input=kb.next();//spacebar 전까지만 인식;

        if(str.equals(input)){
            System.out.println("strings match!");
        }else{
            System.out.println("strings do not match!");
        }
        kb.close();
    }
}
