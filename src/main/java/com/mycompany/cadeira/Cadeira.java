package com.mycompany.cadeira;

import java.util.Scanner;


public class Cadeira {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        cadeira2 c1 = new cadeira2();
        
        
        System.out.println(" qual a cor da cadeira; ");
        c1.cor = teclado.nextLine();
        System.out.println(" qual a marca da cadeira;  ");
        c1.marca = teclado.nextLine();
        System.out.println("qual o modelo da cadeira; ");
        c1.modelo = teclado.nextLine();
        System.out.println("qual o tamanho da cadeira");
        c1.tamanho = teclado.nextDouble();
        boolean inclinar = c1.inclinacao();
        c1.inclinada = inclinar;
        c1.estado();
        

    }
}
