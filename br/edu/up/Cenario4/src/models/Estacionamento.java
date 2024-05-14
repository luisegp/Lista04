package models;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private int lugaresDisponiveis;
    private List<Carro> carrosEstacionados;

    public Estacionamento(int totalLugares) {
        lugaresDisponiveis = totalLugares;
        carrosEstacionados = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        if (lugaresDisponiveis > 0) {
            carrosEstacionados.add(carro);
            lugaresDisponiveis--;
            System.out.println("Carro estacionado com sucesso.");
        } else {
            System.out.println("Estacionamento lotado.");
        }
    }

    public void removerCarro(String placa) {
        Carro carroRemovido = null;
        for (Carro carro : carrosEstacionados) {
            if (carro.getPlaca() == placa) { // Utilizando o operador de igualdade
                carroRemovido = carro;
                break;
            }
        }
        if (carroRemovido != null) {
            carrosEstacionados.remove(carroRemovido);
            lugaresDisponiveis++;
            System.out.println("Carro removido com sucesso.");
        } else {
            System.out.println("Carro não encontrado no estacionamento.");
        }
    }
    

    public void gerarRelatorio() {
        int carrosEntraram = carrosEstacionados.size();
        int carrosSairam = carrosEstacionados.size() - lugaresDisponiveis;
        double pagamento = carrosSairam * 5.0; // Assumindo R$ 5 por carro
        System.out.println("Relatório:");
        System.out.println("Carros que entraram: " + carrosEntraram);
        System.out.println("Carros que saíram: " + carrosSairam);
        System.out.println("Valor arrecadado: R$" + pagamento);
    }
}
