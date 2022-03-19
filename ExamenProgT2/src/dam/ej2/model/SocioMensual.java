package dam.ej2.model;

public class SocioMensual extends Socio {
    private String plan;
    private String numCuenta;

    public SocioMensual(String dni, String telefono, String email) {
        super(dni, telefono, email);
    }

    @Override
    public String toString() {
        return "\nSocio de Mensualidad:"
                +"\n DNI: "+dni
                +"\n Teléfono: "+telefono
                +"\n Email: "+email
                +"\n Plan : "+plan
                +"\n Número de cuenta: "+numCuenta;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

}
