package proyecto;

public class Empleado extends Empresa {
    private String nombreDeEmpleado;
    private String correoEmpleado;
    private String rolEmpleado;

//constructor

    public Empleado(String nombre, String direccion, long telefono, long nit, String nombreDeEmpleado, String correoEmpleado, String rolEmpleado) {
        super(nombre, direccion, telefono, nit);
        this.nombreDeEmpleado = nombreDeEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.rolEmpleado = rolEmpleado;
    }
//set and get

    public String getNombreDeEmpleado() {

        return nombreDeEmpleado;
    }

    public void setNombreDeEmpleado(String nombreDeEmpleado) {

        this.nombreDeEmpleado = nombreDeEmpleado;
    }

    public String getCorreoEmpleado() {

        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {

        this.correoEmpleado = correoEmpleado;
    }

    public String getRolEmpleado() {

        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {

        this.rolEmpleado = rolEmpleado;
    }



}
