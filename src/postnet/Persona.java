package postnet;

/**
 * @author Alejandro Raúl Jumbo Moncada
 * @version 1
 * @since 31/03/2023
 * La clase Persona guarda los datos introducidos del usuario sobre sí mismo.
 */
class Persona {
    //Atributos
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;

    //Constructor
    public Persona(String dni, String nombre, String apellido, String telefono, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return Devolverá el nombre y primer apellido del usuario.
     */
    public String nombreCompleto(){
        return nombre+" "+apellido;
    }
    
}
