
package Heroe;

import Anillos.Ente;
import Bestia.Trasgo;

/**
 * 
 * @author Daniel Sacor Barrios
 */
public class Elfo extends Ente{

    public Elfo(int vida, int armadura, String nombre) {
        super(vida, armadura, nombre);
    }
        public int modificadorAtaque(Ente enemigo){
      int res = 0;
      if (enemigo instanceof Trasgo) res=20;
                  System.out.println(this.toString()+ " Le tuvo furia al trasgo");
            return res;
    }
}
