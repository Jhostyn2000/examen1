
package Matriz;
import java.util.Scanner;
public class Matriz {
     
    public static void main(String[] args) {
        
        Scanner tecla = new Scanner (System.in);
        int matriz1 [][] = new int [3][3];
        
       
        System.out.println("TIENE UNA MATRIZ DE 3X3");
        for (int i = 0; i < matriz1.length; i++){
           for (int j = 0; j < matriz1.length; j++){
                double X = 0;
                double Y = 0; 
                double expo = 4;
                double expo2 = 3;
               
                   System.out.println("ingrese la X;");
                   X = tecla.nextInt();
                   System.out.println("ingrese la Y");
                   Y = tecla.nextInt();
                   System.out.println ("operacion:");
                   
                   double op1 = Math.pow(X, expo);
                   double op2 = Math.pow(Y, expo2);
                   
                   double a = 23 * op1;
                   double b = 20 * op2;
                   
                   double fin = (op1 + op2) - 3;
                   
                   
                   System.out.println(" el resultado es :"+ fin);
                   
                   matriz1[i][j] = (int) fin;
                   
                   System.out.println("");
                  
               }
           }
        
        for (int i = 0; i < matriz1.length; i++){
           for (int j = 0; j < matriz1.length; j++){
               
               System.out.print("[" + matriz1[i][j] +"]");
              
           }
           System.out.println("");
        }
        
        }
    
    
        
        
    }
   
