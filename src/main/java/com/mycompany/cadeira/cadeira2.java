
package com.mycompany.cadeira;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class cadeira2 {
    Scanner teclado = new  Scanner (System.in);
    String cor;
    String marca;
    String modelo;
    Double tamanho;
    boolean inclinada;
    
    
    void estado (){
        System.out.println(" informaçoes da cadeira : ");
        System.out.println(" cor : " + this.cor);
        System.out.println(" marca : " + this.marca);
        System.out.println(" modelo : " + this.modelo);
        System.out.println(" tamanho : " + this.tamanho);
        System.out.println(" possui inclinação : " + (this.inclinada? "sim" : "nao"));
    }
    
    
    
    
    
    boolean inclinacao(){
        System.out.println("e essa cadeira inclina?");
        String resposta;
        resposta = teclado.nextLine().toLowerCase();
        if (resposta.equals("sim")) {
            return true;
            
        }else if (resposta.equals("nao")){
            return false;
            
        }else{
            return inclinacao();
        }
       
       
    }
    
    
    
    
    
}
