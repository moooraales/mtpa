package cliente;

import java.awt.EventQueue;
import java.io.IOException;

public class PrincipalCliente {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Estableciendo conexión con el servidor...");
        try {
            EventQueue.invokeLater(new cliente.interfaces.MenuInicial());
            Servidor servidor = Servidor.getServidor();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
