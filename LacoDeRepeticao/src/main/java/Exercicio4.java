/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o Valor Inicial");
        int valorinicial = scanner.nextInt();
        
                System.out.println("Informe o Valor Final");
        int valorfinal = scanner.nextInt();
        
        
        int SomaPares = 0 ;
        
        System.out.println("ValorInicial :" +valorinicial);
        
        System.out.println("ValorFinal :"  +valorfinal);
        
        for(int i = valorinicial; i <= valorfinal;  i++){
            if( i % 2 == 0){
                SomaPares += i; //Soma Apenas Os Numeros Pares
            }
            
            
           
        }
      System.out.println("A soma dos numeros pares : " +SomaPares);
     
        
     scanner.close();
    }
    
}
