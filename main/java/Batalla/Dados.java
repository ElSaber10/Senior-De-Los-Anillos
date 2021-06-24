
package Batalla;

import java.util.Random;

/**
 * 
 * @author Daniel Sacor Barrios
 */
public final class Dados {
        
    public Dados(){
         System.out.println("Generando los tiros...");
         RamdomHeroes();
         RamdomBestias();
     }
     public void RamdomHeroes(){
         int H2 = (int)(Math.random()*100+1);
          int H1 = (int)(Math.random()*100+1);
          if (H2 < H1){
              System.out.println("El mayor es");
          }else {
              System.out.println("El mayor es");
          }
     }
     
     public void RamdomBestias(){
         int H2 = (int)(Math.random()*90+1);
     }
}
