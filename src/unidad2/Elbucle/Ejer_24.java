/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejer_24 {
    
        public static void main(String[] args) {
          
              int h=1; //numeros que serán escritos
              int altura;   
              Scanner entrada=new Scanner(System.in);
              System.out.println("Inserte un número");
              altura=entrada.nextInt();
              int espacios=altura-1;
              
           
              for(int linea=0; linea<altura; linea++){
                  
                  for(int j=1;j<=espacios; j++){
                      
                      System.out.print(" ");
                  }

                  for(int j=1; j<=h; j++){
                      
                      System.out.print(j);
                  }
                  
                  for(int j=h-1; j>0; j--){
                      
                      System.out.print(j);
                  }
                  h++;
                  System.out.println("");
                  espacios--;
              }
              
              
              /* for(int i=1; i<=h; i++){
                  
                  if(i>1) System.out.println();
                  
                 //for(int j=1; j<2*h ; j++){
                      
                   //  System.out.print(j>h-i&&j<h+i? i:" ");
                      
                  for(int j=1; j<=h; j++){
                      
                      System.out.print(j%h>0?j%h: i);}
                  
                  for(int z=h-1; z>=1; z--)
                      
                    System.out.print(z%h>0?z%h :i);
                      
                   //  for(int z=h)
                  }
              
              
              
              /*
                 for(int i=0; i<h; i++){
              
                  if(i>0)
                System.out.println();
                
                    for(int j=1; j<h*2; j++)
                  
                  System.out.print(j>=h-i&&j<=h+i? i+1:" ");             
           
                   */   
                  }
              }
         
    

