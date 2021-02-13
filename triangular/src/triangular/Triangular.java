package triangular;


public class Triangular {


  
    public static void main(String[] args) {
        
        
      //se declara la matriz o arreglo
        int matriz[][] = new int [4][4];
        
        //el ciclo para recorrer la matriz
        for( int i = 0; i < matriz.length; i++){
            
            for ( int j = 0; j < matriz.length; j++){
                
                
                //con esta condiccion se determinan los valores para la matriz
                // porque si dejo que lo haga el usuaria nunca va dar la matriz triangular jajajaja
                //me estoy murion del cansancio, trabajar y estudiar no es facil
                if( i<= j){
                    
                    matriz[i][j] = j +1;
                   
                }
            }
        }
        
        //imprimir
        for (int i = 0; i< matriz.length; i++){
            
            for (int j = 0; j< matriz.length; j++){
                
                System.out.print("["+matriz[i][j]+"]");
                
            }
            
            System.out.println("");
        }
        System.out.println("");
        System.out.println("matriz triangular superior");
               
    }
    
}//este es todo, espero que le guste
//primera vez desde que estoy viendo clase con usted que muestro ganas de pasar esta materia
