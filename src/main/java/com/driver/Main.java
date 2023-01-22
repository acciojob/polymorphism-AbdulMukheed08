package com.driver;

class Product{
    public int product(int x,int y){
        return x*y;
    }
    public int product(int x,int y,int z){
        return x*y*z;
    }
    public double product(double x,double y){
        return x*y;
    }
}

public class Main {
    public static void main(String[] as){
        Product p = new Product();
        p.product(5,4);
        p.product(5,4,3);
        p.product(5.5,4.3);
    }
}
