
package Anillos;

import java.util.Objects;


public class Ente {
    private int vida, armadura;
    private String nombre;

    public Ente(int vida, int armadura, String nombre) {
        this.vida = vida;
        this.armadura = armadura;
        this.nombre = nombre;
    }

    public void atacarEnte(Ente enemigo){
        int ataque = aleatorio() + modificadorAtaque(enemigo); 
        enemigo.recibirAtaque(this, ataque);
    }
    public int aleatorio(){
        return (int)(Math.random()* 80+10);
    }
    public int modificadorAtaque(Ente enemigo){
        return 0;
    }
    public void recibirAtaque( Ente enemigo, int danyoAtaque ){
    int ataqueRecibido = danyoAtaque + modificadorDefenza(enemigo);
        if (this.getArmadura()   <= danyoAtaque + modificadorDefenza(enemigo)){
            this.setVida(this.vida - ataqueRecibido);
        }else{
            System.out.println("El ataque de " + enemigo.toString() + "No fue suficiente para hacer daño a " + this.toString()  );
        }
    }
    public int modificadorDefenza(Ente enemigo){
        return 0;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ente other = (Ente) obj;
        if (this.vida != other.vida) {
            return false;
        }
        if (this.armadura != other.armadura) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ente{" + "vida=" + vida + ", armadura=" + armadura + ", nombre=" + nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.vida;
        hash = 89 * hash + this.armadura;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        return hash;
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida  < 0){
            this.vida = 0;
            System.out.println("Ha muerto " + this.toString());
        }else {
            this.vida = vida;
        }
        this.vida = vida;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
