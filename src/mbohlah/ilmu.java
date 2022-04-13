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
public class ilmu {
    public static void main(String[] args) {
        //berapakah jumlahnya?
        Scanner input = new Scanner (System.in);
        int a;
        int b;
        int c=0;
       
        System.out.println("masukkan angka bwang : ");
        a = input.nextInt();
        
        for (b=1;b<=a;b++){
            c += b;
            System.out.println("jumlah : "+c);
        }
            
    }
}
