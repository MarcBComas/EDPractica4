import java.util.Date;
/**
 * Clase Barco que implementa la interface Onomatopeya
 * @author marc barcelo comas
 * @author antoni xavier bascuñana
 */
public class Barco implements Onomatopeya {
    private final CopiaBarco copiaBarco = new CopiaBarco();

    // Constructor vacio
    public Barco() {
        copiaBarco.setMotor(new Motor());
    }
    /**
     * Constructor completo
     * @param nombre String que contiene el nombre
     * @param fechaConstruccion Date que contiene la fecha de construccion
     * @param numCamarotes Integer que contiene el numero de camarotes
     */
    public Barco(String nombre, Date fechaConstruccion, int numCamarotes) {
        copiaBarco.setMotor(new Motor());
        this.copiaBarco.setNombre(nombre);
        this.copiaBarco.setFechaConstruccion(fechaConstruccion);
        this.copiaBarco.setNumCamarotes(numCamarotes);
    }

    /**
     * Getters/Setters del atributo nombre
     * @param nombre String que contiene el nuevo valor del atributo nombre
     */
    public void setNombre(String nombre) {
        copiaBarco.setNombre(nombre);
    }
    public String getNombre() {
        return copiaBarco.getNombre();
    }

    /**
     * Getters/Setters del atributo fechaConstruccion
     * @param fechaConstruccion Date que contiene el nuevo valor del atributo fechaConstruccion
     */
    public void setFechaConstruccion(Date fechaConstruccion) {
        copiaBarco.setFechaConstruccion(fechaConstruccion);
    }
    public Date getFechaConstruccion() {
        return copiaBarco.getFechaConstruccion();
    }

    /**
     * Getters/Setters del atributo numCamarotes
     * @param numCamarotes Integer que contiene el nuevo valor de numCamarotes
     */
    public void setNumCamarotes(int numCamarotes) {
        copiaBarco.setNumCamarotes(numCamarotes);
    }
    public int getNumCamarotes() {
        return copiaBarco.getNumCamarotes();
    }

    /**
     * Getters/Setters del atributo motor
     * @param motor Objeto motor que contiene el nuevo valor de motor
     */
    public void setMotor(Motor motor) {
        copiaBarco.setMotor(motor);
    }
    public Motor getMotor() {
        return copiaBarco.getMotor();
    }

    // Implementacion del metodo sonido()
    @Override
    public void sonido() {
        copiaBarco.sonido();
    }
    // Metodo toString
    @Override
    public String toString() {
        return copiaBarco.toString();
    }

}
