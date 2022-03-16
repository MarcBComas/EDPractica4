import java.util.Date;
/**
 * Clase Barco que implementa la interface Onomatopeya
 * @author marc barcelo comas
 * @author antoni xavier bascuñana
 */
public class Barco implements Onomatopeya {
    // Atributos
    private String nombre;
    private Date fechaConstruccion;
    private int numCamarotes;
    private Motor motor;
    // Constructor vacio
    public Barco() {
        motor = new Motor();
    }
    /**
     * Constructor completo
     * @param nombre String que contiene el nombre
     * @param fechaConstruccion Date que contiene la fecha de construccion
     * @param numCamarotes Integer que contiene el numero de camarotes
     */
    public Barco(String nombre, Date fechaConstruccion, int numCamarotes) {
        motor = new Motor();
        this.nombre = nombre;
        this.fechaConstruccion = fechaConstruccion;
        this.numCamarotes = numCamarotes;
    }

    /**
     * Getters/Setters del atributo nombre
     * @param nombre String que contiene el nuevo valor del atributo nombre
     */
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return this.nombre; }

    /**
     * Getters/Setters del atributo fechaConstruccion
     * @param fechaConstruccion Date que contiene el nuevo valor del atributo fechaConstruccion
     */
    public void setFechaConstruccion(Date fechaConstruccion) { this.fechaConstruccion = fechaConstruccion;}
    public Date getFechaConstruccion() { return this.fechaConstruccion; }

    /**
     * Getters/Setters del atributo numCamarotes
     * @param numCamarotes Integer que contiene el nuevo valor de numCamarotes
     */
    public void setNumCamarotes(int numCamarotes) { this.numCamarotes = numCamarotes; }
    public int getNumCamarotes() { return this.numCamarotes; }

    /**
     * Getters/Setters del atributo motor
     * @param motor Objeto motor que contiene el nuevo valor de motor
     */
    public void setMotor(Motor motor) { this.motor = motor; }
    public Motor getMotor() { return this.motor; }

    // Implementacion del metodo sonido()
    @Override
    public void sonido() { System.out.println("CHUU CHUU"); }
    // Metodo toString
    @Override
    public String toString() { return "Barco{nombre="+this.nombre+", fechaConstruccion="+this.fechaConstruccion+", numCamarotes="+this.numCamarotes+", motor="+this.motor+'}'; }

}
