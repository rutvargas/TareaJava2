package isla.carnivoros;

import isla.Animal;
import isla.Carnivoro;

public class Aguila extends Animal implements Carnivoro {
    public Aguila(String nombre, float peso, int salud, int posicionX,int posicionY, float alimentoNecesario, int velocidad, int energia){
        super(nombre, peso, salud, posicionX, posicionY, alimentoNecesario, velocidad, energia);
    }

    @Override
    public void mover() {

    }

    @Override
    public void comer() {

    }

    @Override
    public void reproducirse() {

    }

    @Override
    public void cazar(Animal presa) {

    }
}
