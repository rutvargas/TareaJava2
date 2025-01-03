package isla;

public class AnimalRunnable implements  Runnable {
    private Animal animal;
    private Isla isla;

    private volatile boolean detenido=false;
    ///// constructor
    public AnimalRunnable(Animal animal, Isla isla) {
        this.animal = animal;
        this.isla = isla;
    }

    @Override
    public void run() {
        int iteraciones=0;
        while (iteraciones<10) {
            System.out.println("Nuevo proceso de hilo "+animal.getNombre());
            isla.moverAnimal(animal);
            isla.comer(animal);
            //reproducirse
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
            iteraciones++;
        }
    }


    //public void detener
    //varibale de clace interna booleana
    //empieza en false . se llama en detener se cambia a verdadero

    public void detener() {
        detenido = true;
    }
}
