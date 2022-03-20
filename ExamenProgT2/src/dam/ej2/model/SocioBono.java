package dam.ej2.model;

public class SocioBono extends Socio {
    private int numSesiones;

    public SocioBono(String dni, String telefono, String email, int numSesiones) {
        super(dni, telefono, email);
        this.numSesiones = numSesiones;
    }

    @Override
    public String toString() {
        return "\nSocio de Bono:"
                + super.toString()
                +"\n Sesiones en bono: "+numSesiones;
    }

    public void recargarBono(int num) {
        numSesiones+=num;
    }
}
