//Check whether a number is prime or not and if not then how many factors it has using Java

package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n,temp=0;       //Declaring variables

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");     //Taking number input from user
        n=sc.nextInt();

        if(n==1){
            System.out.println(n+" is not a prime Number."); //for n=1 if statement is declared
        }



        else if(n<1){
            System.out.println("Enter a valid number to check"); //for n<1 elseif statement is declared.
        }



        else{
            for(int i=2;i<=n-1;i++){        //else in other cases determine whether a number is prime or not using for loop.
                                            // if there is a factor then it must be in i<(n-1) so that's why loop is till n-1.

                // you can also use loop till sqrt(n) but here we have to find number of factors also that's why I used till n-1.


                if (n%i==0){
                    temp+=1;            //initially temp=0 but if there will be any factor found then temp value will increase.

                }
            }if(temp>0){
                System.out.print(n+" is not a Prime number. ");
                System.out.println("And "+n+" has  "+ (temp+2) +" Number of factors "); // including 1 and itself that's why temp+2.
            }else{
                System.out.println(n+" is a Prime number.");
                System.out.println("A prime number is a natural number greater than 1 that is not a product of two smaller natural numbers.");
            }

        }




    }
}
