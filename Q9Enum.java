package com.company;


import com.sun.jdi.PathSearchingVirtualMachine;

enum HOUSE{
    ALPHA("1BHK",10000),BETA("3BHK",10000),GAMA("2BHK",10000);
    String  name;
    int price;


    HOUSE(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
}
public class Q9Enum {
    public static void main(String[] args) {
          for(HOUSE h1: HOUSE.values()){
              System.out.println(h1.getName()+" "+h1.getPrice());
          }
    }

}
