package isla;

public abstract class Animal implements Ocupable{
    private String nombre;
    private float peso;
    private int salud;
    private int posicionX;
    private int posicionY;
    private float alimentoNecesario;
    private int velocidad;
    private int energia;


    public Animal (String nombre, float peso, int salud, int posicionX,int posicionY, float alimentoNecesario, int velocidad, int energia){
        this.nombre=nombre;
        this.peso=peso;
        this.salud=salud;
        this.posicionX=posicionX;
        this.posicionY=posicionY;
        this.alimentoNecesario=alimentoNecesario;
        this.velocidad=velocidad;
        this.energia=energia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

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

    public float getAlimentoNecesario() {
        return alimentoNecesario;
    }

    public void setAlimentoNecesario(float alimentoNecesario) {
        this.alimentoNecesario = alimentoNecesario;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }


    public void ocupar() {}
    public abstract void mover();
    public abstract void comer();
    public abstract void reproducirse();




}
