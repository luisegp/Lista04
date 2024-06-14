package cenario5.view;

import cenario5.model.Evento;

public class EventoView {
    public void exibirDetalhesEvento(Evento evento) {
        System.out.println("Nome: " + evento.getNome());
        System.out.println("Data: " + evento.getData());
        System.out.println("Local: " + evento.getLocal());
        System.out.println("Lotação Máxima: " + evento.getLotacaoMaxima());
        System.out.println("Ingressos Vendidos: " + evento.getIngressosVendidos());
        System.out.println("Preço do Ingresso: " + evento.getPrecoIngresso());
        System.out.println();
    }
}