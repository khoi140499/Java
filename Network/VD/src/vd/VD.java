/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Dang Khoi
 */
public class VD {

    /**
     * @param args the command line arguments
     */
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the IP lookup application.");
        String host="";
        do {            
            System.out.println("\nEnter a host name:");
            host=sc.nextLine();
            try {
                InetAddress[] ad=InetAddress.getAllByName(host);
                for(InetAddress as:ad)
                    System.out.println(as.toString());
            } catch (UnknownHostException e) {
                System.out.println("Unknow host.");
            }
        } while (doAgain());
    }
    public static boolean doAgain(){
        System.out.println();
        String s;
        while (true) {            
            System.out.println("Look up another?" +" (Y or N)" );
            s=sc.nextLine();
            if(s.equalsIgnoreCase("Y")){
                return true;
            }
            else if(s.equalsIgnoreCase("N")){
                return false;
            }
            
        }
    }
    
}
