/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author DaniB
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inicio ;
        int fim;
        
        System.out.println("Digite o primeiro numero: ");
       inicio = scanner.nextInt();
       
       
        System.out.println("Digite o segundo numero: ");
       fim = scanner.nextInt();
       
      
        for(int i = fim; i >= inicio;  i--) {
            
            if(i % 2 ==0){
                
            
               
            System.out.println("Numeros Pares : " +i);
            }
             
    }
    
         scanner.close();
}
    
}
