package isla.herbivoros;

import isla.Animal;
import isla.Herbivoro;

public class Ciervo extends Animal implements Herbivoro {
    public Ciervo(String nombre, float peso, int salud, int posicionX,int posicionY, float alimentoNecesario, int velocidad, int energia){
        super(nombre, peso, salud, posicionX, posicionY,alimentoNecesario,velocidad, energia);
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
    public void comerPlanta() {

    }

}