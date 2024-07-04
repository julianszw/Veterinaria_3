package modelo;

public abstract class Usuario {
    private String telefono;
    private String email;
    private String dni;
    private String nombre;
    private String apellido;

    public Usuario(String telefono, String email, String dni, String nombre, String apellido) {
        this.telefono = telefono;
        this.email = email;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public abstract void reaccionar();
}
