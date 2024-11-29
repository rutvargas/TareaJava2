package isla.carnivoros;


import isla.Animal;
import isla.Carnivoro;
import isla.Herbivoro;
import isla.Isla;
import isla.herbivoros.Conejo;

import java.util.Random;

public class Lobo extends Animal implements Carnivoro {

    //Constructor
    public Lobo(String nombre, float peso, int salud, int posicionX, int posicionY, float alimentoNecesario, int velocidad, int energia) {
        //Llamando a los atributos ya inializados de la clase Animal
        super(nombre, peso, salud, posicionX, posicionY, alimentoNecesario, velocidad, energia);
    }

    @Override
    public void mover() {
        System.out.println("El lobo " + getNombre() + " se mueve a una posición adyacente." + "Posicion X: " + getPosicionX() + "Posicion Y" + getPosicionY());
        //setEnergia(getEnergia() - 2); // Consume más energía que el conejo
    }


    @Override
    public void comer() {
        System.out.println("El lobo está comiendo.");
    }

    @Override
    public void reproducirse() {
        System.out.println("El lobo se está reproduciendo.");
    }


    @Override
    public void cazar(Animal presa) {

    }
}