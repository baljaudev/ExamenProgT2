package dam.ej2.model;

public class Socio {
    protected String dni;
    protected String telefono;
    protected String email;


    public Socio(String dni, String telefono, String email) {
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return "\n DNI: "+dni
                +"\n Teléfono: "+telefono
                +"\n Email: "+email;
    }

    public String getDni() {
        return dni;
    }

}
