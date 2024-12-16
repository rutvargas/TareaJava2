package isla;

import isla.carnivoros.*;
import isla.herbivoros.*;

import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Isla isla= new Isla(6,9);
        Random random=new Random();

        // //objetos de animales y plantas con posiciones aleatorias
        Lobo lobo = new Lobo("Lobo", 50, 100, random.nextInt(6), random.nextInt(9), 5, 10, 100);
        Oso oso=new Oso("Oso", 50, 100, random.nextInt(6), random.nextInt(9), 5, 10, 100);
        Aguila aguila=new Aguila("Aguila", 50, 100, random.nextInt(6), random.nextInt(9), 5, 10, 100);
        Zorro zorro=new Zorro("Zorro", 50, 100, random.nextInt(6), random.nextInt(9), 5, 10, 100);
        Boa boa = new Boa("Boa", 20, 80, random.nextInt(6), random.nextInt(9), 3, 4, 60);


        Bufalo bufalo = new Bufalo("Bufalo", 300, 200, random.nextInt(6), random.nextInt(9), 15, 7, 150);
        Caballo caballo=new Caballo("Caballo", 100, 200, random.nextInt(6), random.nextInt(9), 15, 7, 150);
        Cabra cabra=new Cabra("Cabra", 25, 200, random.nextInt(6), random.nextInt(9), 15, 7, 150);
        Ciervo ciervo =new Ciervo("Ciervo", 20, 200, random.nextInt(6), random.nextInt(9), 15, 7, 150);
        Conejo conejo = new Conejo("Conejo", 2, 50, random.nextInt(6), random.nextInt(9), 1, 5, 50);
        Jabali jabali =new Jabali("Jabali", 12, 200, random.nextInt(6), random.nextInt(9), 15, 7, 150);
        Oruga oruga=new Oruga("Oruga", 1, 200, random.nextInt(6), random.nextInt(9), 15, 7, 150);
        Oveja oveja=new Oveja("Oveja", 30, 200, random.nextInt(6), random.nextInt(9), 15, 7, 150);
        Pato pato=new Pato("Pato", 10, 200, random.nextInt(6), random.nextInt(9), 15, 7, 150);
        Raton raton = new Raton("Raton", 1, 30, random.nextInt(6), random.nextInt(9), 0.5f, 6, 40);
        Planta planta = new Planta(random.nextInt(6), random.nextInt(6));
        Planta planta1 = new Planta(random.nextInt(6), random.nextInt(9));
        Planta planta2 = new Planta(random.nextInt(6), random.nextInt(9));



        //// poblar la isla con los animales y plantas en posiciones aleatorias

        isla.poblarIsla(aguila, aguila.getPosicionX(), aguila.getPosicionY());
        isla.poblarIsla(boa, boa.getPosicionX(), boa.getPosicionY());
        isla.poblarIsla(lobo, lobo.getPosicionX(), lobo.getPosicionY());
        isla.poblarIsla(oso, oso.getPosicionX(), oso.getPosicionY());
        isla.poblarIsla(zorro, zorro.getPosicionX(), zorro.getPosicionY());

        isla.poblarIsla(bufalo, bufalo.getPosicionX(), bufalo.getPosicionY());
        isla.poblarIsla(caballo, caballo.getPosicionX(), caballo.getPosicionY());
        isla.poblarIsla(cabra, cabra.getPosicionX(), caballo.getPosicionY());
        isla.poblarIsla(ciervo, ciervo.getPosicionX(), ciervo.getPosicionY());
        isla.poblarIsla(conejo, conejo.getPosicionX(), conejo.getPosicionY());
        isla.poblarIsla(jabali, jabali.getPosicionX(), jabali.getPosicionY());
        isla.poblarIsla(oruga, oruga.getPosicionX(), oruga.getPosicionY());
        isla.poblarIsla(pato, pato.getPosicionX(), pato.getPosicionY());
        isla.poblarIsla(raton, raton.getPosicionX(), raton.getPosicionY());
        isla.poblarIsla(planta, planta.getPosicionX(), planta.getPosicionY());
        isla.poblarIsla(planta1, planta1.getPosicionX(), planta1.getPosicionY());
        isla.poblarIsla(planta2, planta2.getPosicionX(), planta2.getPosicionY());





        ///mostrar la isla
        System.out.println("Mapa de la isla:");
        isla.mostrarIsla();




        /// crea y empeza hilos para cada animal
        Thread loboThread = new Thread(new AnimalRunnable(lobo, isla));
        Thread osoThread = new Thread(new AnimalRunnable(oso, isla));
        Thread aguilaThread = new Thread(new AnimalRunnable(aguila, isla));
        Thread zorroThread = new Thread(new AnimalRunnable(zorro, isla));
        Thread boaThread = new Thread(new AnimalRunnable(boa, isla));

        // inicia los hilos
        loboThread.start();
        osoThread.start();
        aguilaThread.start();
        zorroThread.start();
        boaThread.start();

        //hilo principal
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // detener los hilos cuando el tiempo haya pasado
        loboThread.interrupt();
        osoThread.interrupt();
        aguilaThread.interrupt();
        zorroThread.interrupt();
        boaThread.interrupt();


        isla.mostrarIsla();

    }
}