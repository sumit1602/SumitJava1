package com.company;

abstract public class Q11Bank {
    String bankName;
    int roi;

    public Q11Bank(String bankName, int roi) {
        this.bankName = bankName;
        this.roi = roi;
    }

    public void getDetails() {
        System.out.println("name of bank is "+ bankName);
        System.out.println("Rate Of Interest is "+ roi);
    }

    public static void main(String[] args) {
        Q11Bank b1= new SBI();
        b1.getDetails();
        Q11Bank b2 = new BOI();
        b2.getDetails();
        Q11Bank b3= new ICICI();
        b3.getDetails();
    }
}

    class SBI extends Q11Bank{

         SBI() {
            super("state bank of india", 10);
        }
    }
    class BOI extends Q11Bank{
        BOI() {
            super("bank of india", 12);
        }
    }
    class ICICI extends Q11Bank{

        ICICI() {
            super("icici bank", 13);
        }
    }


