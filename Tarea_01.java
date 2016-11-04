/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_01;

/**
 *
 * @author Juan
 */
public class Tarea_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] matriz = new int[11][11];
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(i==0)
                {
                    matriz[i][j]=j;
                }
                else if(j==0){
                    matriz[i][j]=i;
                }
                else{
                    matriz[i][j]=i*j;
                }
            }
        }
        
        for(int[] c:matriz){
            for(int m:c){
                System.out.print(m+"\t");
            }
            System.out.print("\n");
        }
        
    }
    
}
