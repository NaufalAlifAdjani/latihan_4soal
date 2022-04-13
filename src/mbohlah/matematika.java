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
public class matematika {
    public static void main(String[] args) {
        //ganjil atau genap
        int a;
        Scanner input = new Scanner (System.in);
        System.out.println("masukkan angka : ");
        a = input.nextInt();
        
        if (a%2==0){
            System.out.println("genap");
        }else{
            System.out.println("ganjil");
        }
    }
}
