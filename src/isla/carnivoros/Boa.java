package isla.carnivoros;

import isla.Animal;
import isla.Carnivoro;

public class Boa extends Animal implements Carnivoro {
    //Constructor
    public Boa (String nombre,float peso, int salud,  int posicionX,int posicionY,float alimentoNecesario, int velocidad, int energia){
        //Llamando a los atributos ya inializados de la clase Animal
        super(nombre, peso, salud, posicionX, posicionY, alimentoNecesario, velocidad, energia);
    }

    @Override
    public void mover() {
        System.out.println("La boa se mueve.");
    }

    @Override
    public void comer() {
        System.out.println("La boa está comiendo.");
    }
    @Override
    public void reproducirse() {
        System.out.println("La boa se está reproduciendo.");
    }

    @Override
    public void cazar(Animal presa) {
        System.out.println("La boa está cazando " + presa.getNombre());
    }
}
