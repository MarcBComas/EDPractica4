package edpractica4;

/** 
 * Clase abstracta de Persona
 * @author marc barcelo comas
 * @author antoni xavier bascuñana
 */
public abstract class Persona extends Humano {
    /** 
    * Constructores (vacío y completo)
    * @param nombre String que contiene el nombre
    * @param DNI String que contiene el DNI
    * @param edad Integer que contiene la edad
    */
    public Persona() {}
    public Persona(String nombre, String DNI, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }
}

