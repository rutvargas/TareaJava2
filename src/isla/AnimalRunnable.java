package isla;

public class AnimalRunnable implements  Runnable {
    private Animal animal;
    private Isla isla;

    ///// constructor
    public AnimalRunnable(Animal animal, Isla isla) {
        this.animal = animal;
        this.isla = isla;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Nuevo proceso de hilo "+animal.getNombre());
            isla.moverAnimal(animal);
            isla.comer(animal);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
