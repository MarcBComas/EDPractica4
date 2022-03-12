package edpractica4;

/** 
 * Clase Gato que heredará los atributos y métodos de la clase Mascota
 * @author marc barcelo comas
 * @author xavier antoni bascuñana
 */
public class Gato extends Mascota {
    // Atributos
    private String raza;
    // Constructor vacio
    public Gato() {}
    /**
     * Constructores (vacío y completo)
     * @param nombre String que contiene la edad
     * @param edad Integer que contiene la edad
     * @param raza String que contiene la raza
     */
    public Gato(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    /**
     * Getters/Setters del atributo raza
     * @param raza String que contiene el nuevo valor de raza 
     */
    public void setRaza(String raza) { this.raza = raza; }
    public String getRaza() { return this.raza; }
    
    // Implementacion del metodo sonido
    @Override
    public void sonido() { System.out.println("MIAUU"); }
    // Metodo toString
    @Override
    public String toString() { return "Gato{nombre="+this.getNombre()+", edad="+this.getEdad()+", raza="+this.raza+'}'; }
}

