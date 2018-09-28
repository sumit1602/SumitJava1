package com.company;

public class RepeatedTwice {

        public static void main(String[] args)
        {
            int[] arr={2,5,5,5,5,2,6};
            int len=arr.length;
            for(int i=0;i<len;i++)
            {
                int count=0;
                for(int j=0;j<len;j++)
                {
                    if((i>j) && (arr[i]==arr[j]))
                    {
                        break;
                    }
                    if((arr[i]==arr[j]))
                    {
                        count++;
                    }
                    if(j==len-1)
                    {
                        if(count!=2)
                        {
                            System.out.println("number of values repeated " + arr[i] + " is " + count);
                        }
                    }
                }
            }

        }
    }

