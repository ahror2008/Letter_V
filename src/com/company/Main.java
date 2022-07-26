package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=10;
        int x=1;

        for (int i = 1 ;i <=n ; i++) {
            for (int j = 1; j <2*n ; j++) {
                if (j==x||j==2*n-x){
                    System.out.print("V ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            x++;
        }
    
    }
}
