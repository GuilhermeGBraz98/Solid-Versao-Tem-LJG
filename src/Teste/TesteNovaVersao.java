package Teste;

import Notificadores.Celular;
import Notificadores.EmailCliente;
import Notificadores.Notificador;
import NotificaçõesClima.Chuvoso;
import Monitorador.MonitoradorClima;
import NotificaçõesClima.Ensolarado;
import NotificaçõesClima.Frio;

public class TesteNovaVersao {

    public static void main(String[] args) {
        MonitoradorClima Monitorador = new MonitoradorClima();

        Notificador celular = new Celular();
        Notificador emailCliente = new EmailCliente();

        Monitorador.setNotificacaoClima(new Chuvoso());
        Monitorador.notifica(celular);
        Monitorador.notifica(emailCliente);

        System.out.println("------------------------------------------------------------------------------");

        Monitorador.setNotificacaoClima(new Ensolarado());
        Monitorador.notifica(celular);
        Monitorador.notifica(emailCliente);

        System.out.println("------------------------------------------------------------------------------");

        Monitorador.setNotificacaoClima(new Frio());
        Monitorador.notifica(celular);
        Monitorador.notifica(emailCliente);
    }
}
