package Notificadores;

import NotificaçõesClima.NotificacaoClima;

/**
 * Created by mrk on 4/8/14.
 */
public class Celular implements Notificador {
    public void AlertaCondicaoClima(NotificacaoClima notificacao) {
        notificacao.notificaClima();
    }
}
