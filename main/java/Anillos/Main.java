
package Anillos;

import Bestia.Orco;
import Bestia.Trasgo;
import Heroe.Hobbit;
import Heroe.Humano;

/**
 *
 * @author Daniel Sacor Barrios
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Ente p1 = new Ente(350, 75, "Legolas");
        
        Ente t1 = new Trasgo(250, 40, "trasgo1");
        Ente t5 = new Trasgo(250, 40, "trasgo5");
        Ente t2 = new Trasgo(250, 40, "trasgo2");
        Ente t3 = new Trasgo(250, 40, "trasgo3");
        Ente t4 = new Trasgo(250, 40, "trasgo4");
                
         Ente orco1 = new Orco(350, 50, "Orco1");
         Ente orco2 = new Orco(350, 50, "Orco2");
         Ente orco3 = new Orco(350, 50, "Orco3");
         Ente orco4 = new Orco(350, 50, "Orco4");
        
        Ente h2 = new Hobbit(350, 50, "Hobit2");
        Ente h3 = new Hobbit(350, 50, "Hobit3");
        Ente h4 = new Hobbit(350, 50, "Hobit4");
        Ente h5 = new Hobbit(350, 50, "Hobit5");
        Ente h6 = new Hobbit(350, 50, "Hobit6");
        
        Ente hum = new Humano(350, 50, "Humano1");
        Ente hum2 = new Humano(350, 50, "Humano2");
        Ente hum3 = new Humano(350, 50, "Humano3");
        Ente hum4 = new Humano(350, 50, "Humano4");
        

        
        
        System.out.println(p1.toString());
        System.out.println(h2.toString());
        t1.atacarEnte(h2);
        h2.atacarEnte(t1);
        t2.atacarEnte(h3);
        h3.atacarEnte(t2);
        orco1.atacarEnte(h4);
        h4.atacarEnte(orco1);
        orco2.atacarEnte(hum);
        hum.atacarEnte(orco2);
        orco3.atacarEnte(hum2);
        hum2.atacarEnte(orco3);
        
        
        System.out.println(p1.toString());
        System.out.println(h2.toString());
        
    }
    
}
