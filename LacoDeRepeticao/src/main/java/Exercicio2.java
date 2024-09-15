/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Exercicio2 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       
    
      
        System.out.println("Digite um numero, para exibir sua tabuada: ");
        int numero = scanner.nextInt();
        
        for (int i = 1 ; i <=100; i++){
     
            System.out.println(" " +i*numero);
        }
    }
    
}
