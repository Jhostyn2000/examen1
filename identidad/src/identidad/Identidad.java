package identidad;

import java.util.Scanner;


public class Identidad {


    public static void main(String[] args) {
        int matriz[][] = new int [3][3];
        Scanner tecla = new Scanner (System.in);
        
        //LLENAR LA MATRIZ
         for (int i = 0; i < matriz.length; i++){
             for (int j = 0; j < matriz.length; j++) {
                 
                System.out.println("");
                System.out.println("INGRESE DATO;");
                matriz[i][j] = tecla.nextInt();
                System.out.println("");
                
             }
        }
         
         for (int i = 1; i < matriz.length; i++){
             for(int j = 1; j < matriz.length; j++){
                 
                 if ( matriz[1][1] == 1){
                     
                     System.out. println("EL NUMERO ES CORRECTO");
                             
                 } else if (matriz [2][1] ==0){
                     
                     System.out.println(" EL NUMERO ES CORRECTO");
                 } else if ( matriz[3][1] == 0){
                     
                     System.out. println("EL NUMERO ES CORRECTO");
                             
                 } else if ( matriz[1][2] == 0){
                     
                     System.out. println("EL NUMERO ES CORRECTO");
                             
                 } else if ( matriz[2][2] == 1){
                     
                     System.out. println("EL NUMERO ES CORRECTO");
                             
                 } else if ( matriz[3][2] == 0){
                     
                     System.out. println("EL NUMERO ES CORRECTO");
                             
                 } else if ( matriz[1][3] == 0){
                     
                     System.out. println("EL NUMERO ES CORRECTO");
                             
                 } else if ( matriz[2][3] == 0){
                     
                     System.out. println("EL NUMERO ES CORRECTO");
                             
                 } else if ( matriz[3][3] == 1){
                     
                     System.out. println("EL NUMERO ES CORRECTO");
                             
                 } else {
                     System.out.println("NUMERO INCORRECTO");
                 }
                 
                 
             }
         }
         
         //IMPRIMIR
         for( int i =0; i < matriz.length; i++){
             for ( int j = 0; j < matriz.length; j++){
                 
          System.out.print("[" + matriz[i][j]+"]");
                
             }
        System.out.println("");
        }
        
        
    }
    
}
