package com.company;

public class Q4Java1 {
    public static void main(String[] args) {
        String s = "sumitSjkUMIT12345)(^*&^";
        char[] ch = s.toCharArray();
        int len= s.length();
        int lc = 0, uc = 0, nm = 0, sc = 0;
        for (int i = 0; i< ch.length; i++) {
            if (ch[i] > 65 && ch[i] < 90) {
                uc++;
            }
            else if (ch[i] > 96 && ch[i] < 122) {
                lc++;
            }
            else if(ch[i]>'0' && ch[i]<='9'){
                nm++;
            }
            else{
                sc++;
            }
        }
        double c = (uc*100.0)/len;
        double d = (lc*100.0)/len;
        double e = (nm*100.0)/len;
        double f = (sc*100.0)/len;

        System.out.println("Upper case letter is "+uc+" times and % is "+ c);
        System.out.println("Lower case letter is "+lc+" times an d % is "+ d);
        System.out.println("Numbers in string are "+nm+" times and % is "+ e);
        System.out.println("Special case character is "+sc+" times and % is "+ f);

    }
}