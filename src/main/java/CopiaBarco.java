import java.util.Date;

public class CopiaBarco implements Onomatopeya {// Atributos
    String nombre;
    Date fechaConstruccion;
    int numCamarotes;
    Motor motor;

    public CopiaBarco() {
    }

    /**
     * Getters/Setters del atributo nombre
     *
     * @param nombre String que contiene el nuevo valor del atributo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    /**
     * Getters/Setters del atributo fechaConstruccion
     *
     * @param fechaConstruccion Date que contiene el nuevo valor del atributo fechaConstruccion
     */
    public void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public Date getFechaConstruccion() {
        return this.fechaConstruccion;
    }

    /**
     * Getters/Setters del atributo numCamarotes
     *
     * @param numCamarotes Integer que contiene el nuevo valor de numCamarotes
     */
    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public int getNumCamarotes() {
        return this.numCamarotes;
    }

    /**
     * Getters/Setters del atributo motor
     *
     * @param motor Objeto motor que contiene el nuevo valor de motor
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return this.motor;
    }// Implementacion del metodo sonido()

    @Override
    public void sonido() {
        System.out.println("CHUU CHUU");
    }// Metodo toString

    @Override
    public String toString() {
        return "Barco{nombre=" + this.nombre + ", fechaConstruccion=" + this.fechaConstruccion + ", numCamarotes=" + this.numCamarotes + ", motor=" + this.motor + '}';
    }
}