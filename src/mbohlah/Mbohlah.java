/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbohlah;

import java.util.Scanner;

/**
 *
 * @author SENJU
 */
public class Mbohlah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //mana yan lebih besar?
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Mana yang lebih besar");
        System.out.print("masukkan nilai a :");
        a= input.nextInt();
        System.out.print("masukkan nilai b :");
        b=input.nextInt();
        
        if (a > b){
            System.out.println("yang lebih besar : "+a);
        }else if (a < b){
            System.out.println("yang lebih besar : "+b);
        }
    }
    
}
