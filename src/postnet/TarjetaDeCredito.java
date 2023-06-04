package postnet;

/**
 * @author Alejandro Raúl Jumbo Moncada
 * @version 1
 * @since 31/03/2023
 * La clase TarjetaDeCredito guarda los datos introducidos por el usuario de su tarjeta.
 */
class TarjetaDeCredito {
    
    //Atributos
    private String entidadBancaria;
    private String nroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;
    
    //Constructor
    public TarjetaDeCredito(String entidadBancaria, String nroTarjeta, double saldo, EntidadFinanciera entidadFinanciera, Persona titular) {
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public String getNroTarjeta() {
        return nroTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public EntidadFinanciera getEntidadFinanciera() {
        return entidadFinanciera;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public void setNroTarjeta(String nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setEntidadFinanciera(EntidadFinanciera entidadFinanciera) {
        this.entidadFinanciera = entidadFinanciera;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    /**
     * @return Devuelve todos los atributos de la clase TarjetaDeCredito como una String.
     */
    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }
    
    
}
