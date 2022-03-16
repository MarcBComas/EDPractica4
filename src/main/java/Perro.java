/**
 * Clase Perro que heredará los atributos y métodos de la clase Mascota
 * @author marc barcelo comas
 * @author antoni xavier bascuñana
 */
public class Perro extends Mascota {
    // Atributos
    private String raza;
    /**
     * Constructores (vacío y completo)
     * @param nombre String que contiene el nombre
     * @param edad Integer que contiene la edad
     * @param raza String que contiene la raza
     */
    public Perro() {}
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    /**
     * Getters/Setters del atributo raza
     * @param raza String que contiene el nuevo valor de raza
     */
    public String getRaza() { return this.raza; }
    public void setRaza(String raza) { this.raza = raza; }
    // Implementacion del metodo sonido
    @Override
    public void sonido() { System.out.println("GUAU GUAU"); }
    // Metodo toString
    @Override
    public String toString() { return "Perro{nombre="+this.getNombre()+", edad="+this.getEdad()+", raza="+this.raza+'}'; }
}
