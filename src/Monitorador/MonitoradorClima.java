package Monitorador;

import Notificadores.Notificador;
import NotificaçõesClima.NotificacaoClima;

/**
 * Created by mrk on 4/8/14.
 */
public class MonitoradorClima {

    NotificacaoClima notificacaoClima;

    public void setNotificacaoClima(NotificacaoClima weatherDescription) {
        this.notificacaoClima = weatherDescription;
    }

    public void notifica(Notificador notifier) {
        notifier.AlertaCondicaoClima(notificacaoClima);
    }
}
