/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioxadrez;

import java.util.Scanner;

/**
 *
 * @author Root
 */
public class Desafioxadrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
        
        String topo;
        String conteudo;
        //Ajuda_xadrez
        int opc = 0;
        
        System.out.println("Movimentos de uma torre no xadrez!");
        String t = "-";
        int num = 0;
        int num2 = 0;
        System.out.print("Linha:");
        num =leitor.nextInt();
        System.out.print("Coluna:");
        num2 =leitor.nextInt();
        
         System.out.print("*  ");
        for(int lin = 1; lin <= 8; lin++){
            System.out.print(lin+"  ");
             
             for(int x = 1; x <= 7; x++){
                 if(x == 7 ){
                   
                 }
             }
             
        }
             
        
        
        System.out.println("");
          for(int col = 1; col <= 8; col++){
            System.out.print(col+"|");
            for(int j=1 ; j<= 7 ; j++){
                
                System.out.print(" "+ t+" ");
                if(num == j ){
                System.out.print(" "+ "x ");
                }
                 if(j == 7 ){
                
                    
                        System.out.println("");
                    				
                         
                        
                        }
                     
                    }
                
                
            }
	
    }

}
         
                
        
      
		
	
   
    
   
   
      

  


                
            
        
        
       
            
        
            
            
         
        
    
