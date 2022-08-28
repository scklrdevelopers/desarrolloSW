package proyecto;
import proyecto.out.production.proyecto.proyecto.Roles;

import static java.lang.System.out;

public class Principal {
    public static void main(String[] args) {
        Empleado empl_1 = new Empleado();
        empl_1.setNombre("Kadir Obando");
        empl_1.setCorreoEmpleado("kfobandom@unal.edu.co");
        empl_1.setIdEmpleado(12345678);
        empl_1.setRolEmpleado(Roles.administrador);
        empl_1.setNit(111111111);
        System.out.println("EMPLEADO:");
        out.println("Nombre: "+ empl_1.getNombre());
        out.println("Correo: " + empl_1.getCorreoEmpleado());
        out.println("Id: " + empl_1.getIdEmpleado());
        out.println("Rol: " + empl_1.getRolEmpleado().toString());
        out.println("Nit Empresa: " + empl_1.getNit());
        Empresa empr_1 = new Empresa();
        empr_1.setNombre("SCKLR Developers");
        empr_1.setDireccion("Carrera 30 Calle 53");
        empr_1.setTelefono(601111);
        empr_1.setNit(111111111);
        out.println("\n");
        out.println("EMPRESA:");
        out.println("Nombre: " + empr_1.getNombre());
        out.println("Dirección: " + empr_1.getDireccion());
        out.println("Telefono: " + empr_1.getTelefono());
        out.println("Nit: " + empr_1.getNit());


        MovimientoDinero mov_1 = new MovimientoDinero();
        mov_1.setMonto(-5000000);
        mov_1.setConcepto("Pago Servicios Publicos");
        mov_1.setIdEmpleado(12345678);
        mov_1.setNit(111111111);

        out.println("\n");
        out.println("MOVIMIENTO DINERO");
        out.println("Monto: " + mov_1.getMonto());
        out.println("Concepto: " + mov_1.getConcepto());
        out.println("Empleado: " + mov_1.getIdEmpleado());
        out.println("Empresa: " + mov_1.getNit());
    }
}
