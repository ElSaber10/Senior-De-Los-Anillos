
package Heroe;

import Anillos.Ente;
import Bestia.Trasgo;

/**
 * 
 * @author Daniel Sacor Barrios
 */
public class Hobbit extends Ente{

    public Hobbit(int vida, int armadura, String nombre) {
        super(vida, armadura, nombre);
    }
    public int modificadorDefenza(Ente enemigo){
        int res = 0;
        if (enemigo instanceof Trasgo){
            res = -20;
            System.out.println(this.toString()+ " Le tuvo miedo al trasgo");
        }
        return res;
    }
}
