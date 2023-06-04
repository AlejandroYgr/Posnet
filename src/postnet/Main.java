package postnet;

/**
 * @author Alejandro Raúl Jumbo Moncada
 * @version 1
 * @since 31/03/2023
 */
public class Main {
    public static void main(String[] args){
        Posnet posnet= new Posnet();
        Persona p= new Persona("40545665M", "Pepe", "Gomez", "1112345678", "pepe@fakegmail.com");
        
       TarjetaDeCredito tarj= new TarjetaDeCredito("FakeBank", "1234567890123456", 15000, EntidadFinanciera.BIRZA, p);
       
       System.out.println("Tarjeta:");
       System.out.println(tarj);
       
       System.out.println("Tiket:");
       Ticket ticket= posnet.efectuarPago(tarj, 10000, 5);
       System.out.println(ticket);
       
       System.out.println("Tarjeta post pago:");
       System.out.println(tarj);
}
}
