package edpractica4;

/** 
 * Clase Adulto que heredará los atributos y métodos de la clase Persona
 * @author marc barcelo comas
 * @author antoni xavier bascuñana
 */
public class Adulto extends Persona {
    // Atributos
    private String NSS;
    private String direccion;
    // Constructor vacio
    public Adulto() {}
    /**
    * Constructor completo
    * @param nombre String que contiene el nombre del Niño
    * @param DNI String que contiene el DNI del Niño
    * @param edad Integer que contiene la edad del Niño
    * @param colegio String que contiene el colegio del Niño
    * @param juguete Objeto Juguete que contiene el juguete del Niño
    */
    public Adulto(String nombre, String DNI, int edad, String NSS, String direccion) {
        super(nombre, DNI, edad);
        this.NSS = NSS;
        this.direccion = direccion;
    }
    /**
     * Getters/Setters del atributo NSS
     * @param NSS String que contiene el nuevo valor del atributo NSS 
     */
    public void setNSS(String NSS) { this.NSS = NSS; }
    public String getNSS() { return this.NSS; }
    
    /**
     * Getters/Setters del atributo direccion
     * @param direccion String que contiene el nuevo valor del atributo direccion
     */
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getDireccion() { return this.direccion; }
    
    // Metodo toString
    @Override
    public String toString() { return "Adulto{nombre="+this.getNombre()+", DNI="+this.getDNI()+", edad="+this.getEdad()+", NSS="+this.NSS+", direccion="+this.direccion+'}'; }
}

