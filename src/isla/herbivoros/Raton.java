package isla.herbivoros;

import isla.Animal;
import isla.Omnivoro;

public class Raton extends Animal implements Omnivoro {
    public Raton(String nombre, float peso, int salud, int posicionX, int posicionY, float alimentoNecesario, int velocidad, int energia){
        super(nombre, peso, salud, posicionX, posicionY,alimentoNecesario,velocidad, energia);
    }

    @Override
    public void mover() {
       // System.out.println("El raton " + getNombre() + " se mueve ágilmente.");
    }

    @Override
    public void comer() {
        //System.out.println("El ratón está comiendo.");
    }

    @Override
    public void reproducirse() {
        //System.out.println("El ratón se está reproduciendo.");
    }
    @Override
    public void cazar(Animal presa) {
        //System.out.println("El ratón está cazando " + presa.getNombre());
    }

    @Override
    public void comerPlanta() {
        //System.out.println("El ratón está comiendo una planta.");
    }
}
