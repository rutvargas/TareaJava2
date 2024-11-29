package isla.herbivoros;

import isla.Animal;
import isla.Herbivoro;

public class Bufalo extends Animal implements Herbivoro {
    public Bufalo(String nombre, float peso, int salud, int posicionX,int posicionY, float alimentoNecesario, int velocidad, int energia){
        super(nombre, peso, salud, posicionX, posicionY,alimentoNecesario,velocidad, energia);
    }

    @Override
    public void mover() {
        System.out.println("El búfalo se mueve.");
    }

    @Override
    public void comer() {
        System.out.println("El búfalo está comiendo.");
    }

    @Override
    public void reproducirse() {
        System.out.println("El búfalo se está reproduciendo.");
    }

    @Override
    public void comerPlanta() {
        System.out.println("El búfalo está comiendo una planta.");
    }

}
