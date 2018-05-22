package br.com.jonas.TrabalhoMaven;

import java.util.Scanner;


public class App {

  
    public static void main(String[] args) {
      
        Scanner leitor = new Scanner (System.in);
           int numero;
           int divisores = 0;
          
        
           System.out.println("Digite um valor: ");
        numero = leitor.nextInt();
        
        for(int i=1;  i <= numero; i++){
    
        if (numero % i ==0){
           divisores++;       
        }
    
    }
      if(divisores == 2)  {
          System.out.println("O número digitado é primo!");
      }
      else {
          System.out.println("O número digitado não é primo :( ");
	 System.out.println("tente outra vez");

      }
          
       }
      
}