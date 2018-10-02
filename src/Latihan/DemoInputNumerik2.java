/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
import java.io.*;
/**
 *
 * @author Hp
 */
public class DemoInputNumerik2 {
    public static void main(String[] args) throws Exception{
        
        System.out.print("Masukkan sebuah bilangan riil : ");
        
        String temp;
        double bilangan = 0;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //input data dianggap sebagai string 
        temp = br.readLine();
        try{
            //konversi dari string ke floating point
            bilangan = Double.parseDouble(temp);
        }catch (NumberFormatException nfe){
            System.out.println("Data yang dimasukkan bukan bilangan");
            System.exit(1);
        }
        System.out.println("Bilangan yang dimasukkan " +"adalah " + bilangan);
    }
}
