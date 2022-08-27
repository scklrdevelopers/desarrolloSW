package proyecto;

public class MovimientoDinero {
    private double monto;
    private String concepto;

//constructor


    public MovimientoDinero(double monto, String concepto) {
        this.monto = monto;
        this.concepto = concepto;
    }

// set and get

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

//metodo movimientos negativos y positivos

public void crearMonto() {

}

// metodo encargado movimiento

public void registrarEncargadoMovimiento() {

}

}
