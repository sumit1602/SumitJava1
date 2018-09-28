package com.company;
import java.lang.String;

public class EnumProgram {
    public static void main(String[] args) {
        for (Houses h: Houses.values())
        {
            System.out.println("house Block is "+ h+ " & House flat is " + h.getName() + " and price  " + h.getPrice());
//            System.out.println(h.RED.name);
        }
//        System.out.println(Houses.RED.name);
    }

    enum Houses {
        BLUE("1BHK",900000),
        RED("2BHK",80000),
        GREEN("3BHK",60000),
        YELLOW("4BHK",50000),
        WHITE("5BHK",90000);



        private int price;
        private String name;
        Houses(String name, int price) {
            this.price = price;
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }


        }
    }
