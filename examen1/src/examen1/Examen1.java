
package examen1;

// Jhostyn Brito

public class Examen1 {


    public static void main(String[] args) {
        
        int matriz_1 [][] = new int[3][3];
        int matriz_2 [][] = new int[3][3];
        int matriz_3 [][] = new int[3][3];
        int suma[][] = new int [3][3];
        int matriz_resultante [][] = new int[3][3];
       
        
        //primer matriz
        for (int i = 0; i < matriz_1.length; i++){
           for (int j = 0; j < matriz_1.length; j++){
            
            matriz_1[i][j] = (int) (Math.random()*4);
        }
    }
        //segunda matriz
        for (int i = 0; i < matriz_2.length; i++){
           for (int j = 0; j < matriz_2.length; j++){
            
            matriz_2[i][j] = (int) (Math.random()*4);
        }
    }
        //tercer matriz
        for (int i = 0; i < matriz_3.length; i++){
           for (int j = 0; j < matriz_3.length; j++){
            
            matriz_3[i][j] = (int) (Math.random()*4);
        }
    }
        //NOTA: LLENE LAS MATRICES DE MANERA RANDOM PORQUE TOMA MENOS TIEMPO EN HACERLO
        
        //OPERACION SUMA
        for (int i = 0; i < matriz_1.length; i++){
            for (int j = 0; j < matriz_1.length; j++){
                
                suma[i][j] = matriz_1[i][j] + matriz_2[i][j];
                
             
            }
        }
        
        //OPERACION MULTIPLICACION
        for ( int i= 0; i < matriz_3.length; i++){
            for ( int j = 0; j < matriz_3.length;j++){
                
                if ( matriz_resultante[0][0]==0){
                    
                    int fin = 0;
                    
                    fin = ((suma[0][0]*matriz_3[0][0])) + ((suma[1][0]*matriz_3[0][1])) + ((suma[2][0]*matriz_3[0][2]));
                    
                    matriz_resultante[0][0] = fin;
                    
                } else if ( matriz_resultante[0][1]==0){
                    
                     int fin = 0;
                    
                    fin = (suma[0][1]*matriz_3[0][0]) + (suma[1][1]*matriz_3[0][1]) + (suma[2][1]*matriz_3[0][2]);
                    
                    matriz_resultante[0][1] = fin;
                    
                } else if ( matriz_resultante[0][2]==0 ) {
                    
                    int fin = 0;
                    
                    fin = (suma[0][2]*matriz_3[0][0]) + (suma[1][2]*matriz_3[0][1]) + (suma[2][2]*matriz_3[0][2]);
                    
                    matriz_resultante[0][2] = fin;
                    
                } else if ( matriz_resultante[1][0]==0){
                    
                    int fin = 0;
                    
                    fin = (suma[0][0]*matriz_3[1][0]) + (suma[1][0]*matriz_3[1][1]) + (suma[2][0]*matriz_3[1][2]);
                    
                    matriz_resultante[1][0] = fin;
                    
                } else if ( matriz_resultante[1][1]==0) {
                    
                    int fin = 0;
                    
                    fin = (suma[0][1]*matriz_3[1][0]) + (suma[1][1]*matriz_3[1][1]) + (suma[2][1]*matriz_3[1][2]);
                    
                    matriz_resultante[1][1] = fin;
                    
                } else if ( matriz_resultante[1][2]==0){
                    
                    int fin = 0;
                    
                    fin = (suma[0][2]*matriz_3[1][0]) + (suma[1][2]*matriz_3[1][1]) + (suma[2][2]*matriz_3[1][2]);
                    
                    matriz_resultante[1][2] = fin;
                    
                } else if ( matriz_resultante[2][0]==0){
                    
                    int fin = 0;
                    
                    fin = (suma[0][0]*matriz_3[2][0]) + (suma[0][1]*matriz_3[2][1]) + (suma[0][2]*matriz_3[2][2]);
                    
                    matriz_resultante[2][0] = fin;
                    
                } else if ( matriz_resultante[2][1]==0){
                    
                    int fin = 0;
                    
                    fin = (suma[0][1]*matriz_3[2][0]) + (suma[1][1]*matriz_3[2][1]) + (suma[2][1]*matriz_3[2][2]);
                    
                    matriz_resultante[2][1] = fin;
                    
                } else if ( matriz_resultante[2][2]==0){
                    
                    int fin = 0;
                    
                    fin = (suma[0][2]*matriz_3[2][0]) + (suma[1][2]*matriz_3[2][1]) + (suma[2][2]*matriz_3[2][2]);
                    
                    matriz_resultante[2][2] = fin;
                }
            }
        }
        
        //IMPRIMIR
        for (int i = 0; i < matriz_1.length; i++){
            
            for (int j = 0; j < matriz_1.length; j++){
                System.out.print("[" + matriz_1[i][j] +"]");
            }
                
           if (i == 1){
               System.out.print("   +   ");
           } else {
               System.out.print("       "); 
           }
           //colocando el signo +(mas)
           
           for (int j = 0; j < matriz_2.length; j++){
               System.out.print("[" + matriz_2[i][j] +"]");
            }
           
           if (i == 1){
               System.out.print("   *   ");
           } else {
               System.out.print("       ");
           }
           
           for (int j = 0; j < matriz_3.length; j++){
               System.out.print("[" + matriz_3[i][j] +"]");
            }
           
           if (i == 1){
               System.out.print("   =   ");
           } else {
               System.out.print("       ");
           }
           
           for (int j = 0; j < matriz_resultante.length; j++){
               System.out.print("[" + matriz_resultante[i][j] +"]");
            }
           
            //acomodando las matrices
            System.out.println("");
        }
        System.out.println("ESPERO QUE LE HALLA GUSTADO, PRIMER PROGRAMA QUE ME COPILA TAN BIEN DESDE QUE QUE VI PASCAL JAJAJA ");
        // profe espero que me ponga algunos puntos por esfuerzo e interes en esta evaluacion :)
    }
    
}
