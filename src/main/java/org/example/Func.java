package org.example;

import java.util.Scanner;

public class Func {
       public static void buf (String one){
        try (Scanner sc = new Scanner(System.in)) {
            int i = 0;
            boolean start = true;
            while (start){
                if (sc.hasNextInt()){
                    i = sc.nextInt();
                }else{
                    System.out.println("Введено не число");
                    break;
                }
                if (i == 1) {
                    ReversStringi first = s -> new StringBuilder(s).reverse().toString();
                    System.out.println(first.revers(one));
                    start = false;
                } else {
                    System.out.println("Введите 1");
                }
            }
        }catch (Exception e){
            System.out.println("We have a problem");
        }
    }
}
