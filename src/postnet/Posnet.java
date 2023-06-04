package postnet;


/**
 * @author Alejandro Raúl Jumbo Moncada
 * @version 1
 * @since 31/03/2023
 * La clase Posnet se encarga de verificar los pagos realizados.
 */

public class Posnet {
    //Atributos
    public static final double RECARGO_POR_CUOTA= 0.03;
    public static final int MIN_CANT_CUOTA= 1;
    public static final int MAX_CANT_CUOTA= 6;
    
/**
 * @param tarjeta de la clase TarjetaDeCredito.
 * @param montoAbonar de la clase double.
 * @param cantCuota de la clase integer.
 * @return devolverá un Ticket si todo es correcto, por el contrario devolverá null.
 */
    public Ticket efectuarPago (TarjetaDeCredito tarjeta, double montoAbonar, int cantCuota){
       
        Ticket ticket= null;
        if (datosValidos(tarjeta, montoAbonar, cantCuota)){
            double montoTotal= montoAbonar+ montoAbonar* recargoCuota(cantCuota);
        }
        return ticket;
    }
    
/**
 * @param tarjeta de la clase TarjetaDeCredito.
 * @param montoAbonar de la clase double.
 * @param cantCuota de la clase integer.
 * @return devolverá "true" si los datos introducidos son validos y "false" si no son validos.
 */
    private boolean datosValidos(TarjetaDeCredito tarjeta, double monto, int cuota){
        boolean tarjetaValida= tarjeta!=null;
        boolean montoValido= monto>0;
        boolean cuotaValida= cuota >= MIN_CANT_CUOTA && cuota <= MAX_CANT_CUOTA;
        return tarjetaValida&&montoValido&&cuotaValida;
    }
    
/**
 * @param cantCuota de la clase integer.
 * @return devolverá el resultado de la cantidad de recargo por las cuotas.
 */
    private double recargoCuota(int cantCuota){
        return ((cantCuota-1)*RECARGO_POR_CUOTA) ;
    }
}
