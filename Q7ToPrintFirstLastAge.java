package com.company;

public class Q7ToPrintFirstLastAge {

    //static variables
    static String FirstName="s";
    static String LastName="ss";
    static int Age=1;


    //static block
    static{
//        System.out.println(FirstName);
//        System.out.println(LastName);
//        System.out.println(Age);

        Age = 97;
        FirstName="sumit";
        LastName="chaudhary";
    }

    //static method
    static void staticMethod(){
        System.out.println("First Name is: "+FirstName);
        System.out.println("Last Name is: "+LastName);
        System.out.println("Age is: "+Age);
    }
    public static void main(String args[])
    {
        System.out.println("First Name is: "+FirstName);
        System.out.println("Last Name is: "+LastName);
        System.out.println("Age is: "+Age);
        staticMethod();
    }
}
