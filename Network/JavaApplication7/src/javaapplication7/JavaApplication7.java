/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Dang Khoi
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static int ktra(int a){
        int dem=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                dem++;
            }
        }
        return dem;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            if(ktra(i)==2){
                System.out.println(i);
            }
        }
    }
    
}
