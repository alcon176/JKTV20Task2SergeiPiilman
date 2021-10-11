/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20task2sergeipiilman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JKTV20Task2SergeiPiilman {

 public static void main(String[] args) {
        System.out.println("Введите трехзначное число:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        System.out.println("Сумма цифр равна: "+((number%10)+((number/10)%10)+(number/100)));
    }   
}