/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class If_else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // membuat variabel dan scanner
        int nilai;

        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("NILAI TUGAS RAKARUAN: ");
        nilai = scan.nextInt();

        // higung gradenya
        if ( nilai >= 90 ) {
            System.out.println("nilai mu adalah A");
            System.out.println("Mantab lanjutkan");
        } else if ( nilai >= 80 ){
            System.out.println("nilai mu adalah B+");
            System.out.println("Bagus jangan ngrepek");
        } else if ( nilai >= 70 ){
            System.out.println("nilai mu adalah B");
            System.out.println("Bagus ojo nuron");
        } else if ( nilai >= 60 ){
            System.out.println("nilai mu adalah C+");
            System.out.println("Sinau too");
        } else if ( nilai >= 50 ){
            System.out.println("nilai mu adalah C");
            System.out.println("Teros sinau");
        } else if ( nilai >= 40 ){
            System.out.println("nilai mu adalah D");
            System.out.println("Peh kon sinau angel eram");
        } else {
            System.out.println("nilai mu adalah E");
            System.out.println("Mantok mantok :)");
        }
    }

    }
   
