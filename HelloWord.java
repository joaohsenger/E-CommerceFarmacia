/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword;

import java.util.Scanner;

/**
 *
 * @author João henrique
 */
public class HelloWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada  = new Scanner (System.in);
        System.out.println("Entre com o nome");
        String nome = entrada.nextLine();
        System.out.println("vc é: \n A- Macho \n B - Gay ?");
        String opcao = entrada.nextLine();
        if (opcao.equalsIgnoreCase("a"))
            System.out.println(nome + " é " + "Macho!");
        if (opcao.equalsIgnoreCase("b"))
            System.out.println(nome + " é " + "Gay!" );
        else
            System.out.println("você" + " é " + "Gay!" );
               
    }
    
}
