
package aula19_10;

import java.util.Random;
import java.util.Scanner;

public class Atividade1 {

    public static void inteiro(){
        int n;
        Scanner entrada = new Scanner (System.in);
            System.out.println("Insira um número inteiro");
            
            n = entrada.nextInt();
            System.out.println("Seu número é: "+n);
            
    }
    
    public static void main(String[] args) {
        System.out.println("Iniciando programa!");
        
                //Colocar o que vai aconteer ao executar
        System.out.println("Criando menu...");
        System.out.println("--------------------");
        System.out.println("1. Somar 2 números");
        System.out.println("2. Calcular número²");
        System.out.println("3. Raiz quadrada");
        System.out.println("4. Calcular dobro");
        System.out.println("5. Calcular tabuada");
        System.out.println("0. Sair");
        System.out.println("--------------------");
        
        
        inteiro();
        
        
        
       /* Random r = new Random();
        
        int n = r.nextInt(60);
        
        System.out.println(n);*/
       
       /*
       Crie uma função para pedir um número inteiro ao usuário. 
       Toda vez que você precisar de um número informado pelo usuário, 
       utilize ela. Ela não tem parâmetro e o retorno é o valor digitado 
       pelo usuário.
       
       
       */
    }
    
}
