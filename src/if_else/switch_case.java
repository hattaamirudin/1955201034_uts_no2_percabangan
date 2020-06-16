/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class switch_case {
    public static void main(String[] args){
        String input;
        
        Scanner inputUser = new Scanner(System.in);
        System.out.print("MILIHO NOMER :");
        input=inputUser.next();
        
        switch(input){
            case "1":
                System.out.println("PUBG");
                break;
            case "2":
                System.out.println("MOBILE LAGEND");
                break;
            case "3":
                System.out.println("MINECRAFT");
                break;
            case "4":
                System.out.println("DOTA");
                break;
            case "5":
                System.out.println("COC");
                break;
            default:
                System.out.println("pilihan hanya sampai 5");
        }
    }
}
