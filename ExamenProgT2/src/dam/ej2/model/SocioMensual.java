package dam.ej2.model;

public class SocioMensual extends Socio {
    private String plan;
    private String numCuenta;

    public SocioMensual(String dni, String telefono, String email, String plan, String numCuenta) {
        super(dni, telefono, email);
        this.plan = plan;
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return "\nSocio de Mensualidad:"
                + super.toString()
                +"\n Plan: "+plan
                +"\n Número de cuenta: "+numCuenta;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

}
