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
public class Ejer_26 {
    
   
      public static void main(String[] args) {
          
              int n;
              int digito;
              String numero="";
              int cifra;
              
              
              Scanner entrada=new Scanner(System.in);
              System.out.println("Inserte un número");
              n=entrada.nextInt();
              System.out.println("Inserte un dígito");
              digito=entrada.nextInt();
               int count=0; 
                 for(long i=1; i<=n; i*=10){ 
                     if(n%i>=0) 
                     count++;}
            
            
            System.out.println("El número tiene "+count+  (count>1?" dígitos": " dígito"));
            
            while(count>0){
                
            cifra=(int)(n/Math.pow(10, count-1));
            
            if(cifra==digito)
            System.out.println("La cifra posición "+ count+ " es = al dígito");
            //else System.out.println("No hay coincidencias en la posición "+ count);
            n=n-( cifra*(int)Math.pow(10, count-1));
            count--;
 
            }
            
           
            
       
            
            }              
    
    }


