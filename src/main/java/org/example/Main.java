package org.example;

public class Main {
    public static void main(String[] args) {
        //1 задача
        for(int i=0;i<2;i++){
            int a = 0;
            int b = a*a;
            int c = 1;
            int d = c*c;
            int e = 2;
            int f = e*e;
            int g = 3;
            int h = g*g;
            int j = 4;
            int k = j*j;
            int l = 5;
            int m = l*l;
            int n = 6;
            int o = n*n;
            int p = 7;
            int q = p*p;
            int r = 8;
            int s = r*r;
            int t = 9;
            int u = t*t;
            int y = 10;
            int x = y*y;
            System.out.println(b + " " + d + " " + f + " " + h + " " + k + " " + m + " " + o + " " + q + " " + s + " " + u + " " + x);
        }
        //Изначальный вариант решения 2й задачи до того как увидел, что n должен быть целочисленным
        //char y = 1000;
        //char x = 31;
        //while(y>=x){
        //    x++;
        //    System.out.println(x);
        //}
        int n = 1000;
        int m = 32;
        while(n>=m){
            char c = (char) m;
            System.out.println("1"+c);
            m++;
        }
        int v = 32;
        int b = 1000;
        do{
            char c = (char) v;
            System.out.println("2"+ c);
            v++;

        }while(b>=v);
        //3 задача
        String message = "Hello World";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            int ascii = (int) c;
            System.out.println("Символ: " + c + "  Код ASCII: " + ascii);
        }
    }
}