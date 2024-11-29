package isla;

public class AnimalRunnable implements  Runnable {
    private Animal animal;
    private Isla isla;

    // Constructor
    public AnimalRunnable(Animal animal, Isla isla) {
        this.animal = animal;
        this.isla = isla;
    }

    @Override
    public void run() {
        // Acción repetitiva: mover y comer
        while (true) {
            isla.moverAnimal(animal);   // Mover al animal
            isla.comer(animal);         // El animal intenta comer
            try {
                Thread.sleep(1000);     // El animal realiza su acción cada 1 segundo
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
