
package tp5_uml_dependenciacreaciongeneradorqr;


public class Usuario {
    private String nombre;
    private String email;
    
    //Constructor

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", email=" + email + '}';
    }
    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
    
    
    
}
