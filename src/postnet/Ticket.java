package postnet;

/**
 * @author Alejandro Raúl Jumbo Moncada
 * @version 1
 * @since 31/03/2023
 * La clase Ticket guarda los datos introducidos mediante el pago que se realiza en al clase Posnet y devuelve los atributos simulando un ticket.
 */
class Ticket {
        //Atributos
    private String nombreApellido;
    private double monto;
    private double montoPorCuota;

    //Constructor
    public Ticket(String nombreApellido, double monto, double montoPorCuota) {
        this.nombreApellido = nombreApellido;
        this.monto = monto;
        this.montoPorCuota = montoPorCuota;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public double getMonto() {
        return monto;
    }

    public double getMontoPorCuota() {
        return montoPorCuota;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setMontoPorCuota(double montoPorCuota) {
        this.montoPorCuota = montoPorCuota;
    }

    /**
     * @return Devuelve todos los atributos de la clase Ticket como una String.
     */
    @Override
    public String toString() {
        return "Ticket{" + "nombreApellido=" + nombreApellido + ", monto=" + monto + ", montoPorCuota=" + montoPorCuota + '}';
    }
    
    
}
