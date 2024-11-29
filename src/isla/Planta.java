package isla;

public class Planta implements Ocupable{
    //private int energiaP;
    //private String nombre;
    private int posicionX;
    private int posicionY;
    //Constructor

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public Planta(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    //public Planta (int energia, String nombre, int x, int y){

    //}

    //public int getEnergia() {
      //  return energia;
    //}

    //public void setEnergia(int energia) {
        //this.energia = energia;
    //}

    public void ocupar() {
        System.out.println("Planta en la posición (" + posicionX + ", " + posicionY + ")");
    }
}
