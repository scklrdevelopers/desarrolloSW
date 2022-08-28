package proyecto;

import proyecto.out.production.proyecto.proyecto.Roles;

public class Empleado extends Empresa {
    private long idEmpleado;
    private String nombreDeEmpleado;
    private String correoEmpleado;
    private Roles rolEmpleado;
//constructor

    public Empleado(String nombre, String direccion, long telefono, long nit, long idEmpleado, String nombreDeEmpleado, String correoEmpleado, Roles rolEmpleado) {
        super();
        this.idEmpleado = idEmpleado;
        this.nombreDeEmpleado = nombreDeEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.rolEmpleado = rolEmpleado;
    }

    public Empleado() {
        super();
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

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

    public Roles getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(Roles rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombreDeEmpleado='" + nombreDeEmpleado + '\'' +
                ", correoEmpleado='" + correoEmpleado + '\'' +
                ", rolEmpleado=" + rolEmpleado +
                '}';
    }
}
