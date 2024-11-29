package isla.herbivoros;

import isla.Animal;
import isla.Herbivoro;

public class Conejo extends Animal implements Herbivoro {
    public Conejo(String nombre, float peso, int salud, int posicionX,int posicionY, float alimentoNecesario, int velocidad, int energia){
        super(nombre, peso, salud, posicionX, posicionY,alimentoNecesario,velocidad, energia);
    }

    @Override
    public void mover() {
        System.out.println("El conejo " + getNombre() + " se mueve a una posición adyacente."+"Posicion X: "+getPosicionX()+"Posicion Y"+getPosicionY());
        //setEnergia(getEnergia() - 1); // Reduce la energía al moverse
    }


    @Override
    public void comer() {
        System.out.println("El conejo está comiendo.");
    }

    @Override
    public void reproducirse() {
        System.out.println("El conejo se está reproduciendo.");
    }

    @Override
    public void comerPlanta() {
        // Lógica para comer una planta
        System.out.println(this.getNombre() + " ha comido una planta.");
        // Aquí puedes agregar la lógica para eliminar la planta, etc.
    }

}


