package controls;

import models.Passageiro;
import models.Tripulacao;
import models.Aeronave;

public class TrafegoController {
    
    public void registrarPassageiro(String nome, String rg, String identificadorBagagem) {
        // Criar uma nova instância de Passageiro e registrar no sistema
        Passageiro passageiro = new Passageiro();
        passageiro.setNome(nome);
        passageiro.setRg(rg);
        passageiro.setIdentificadorBagagem(identificadorBagagem);
        
        // Lógica para salvar o passageiro no banco de dados ou em outra fonte de dados
    }

    public void registrarTripulante(String nome, String rg, String identificacaoAeronautica) {
        // Criar uma nova instância de Tripulacao e registrar no sistema
        // (Poderia ser Comandante ou Comissario, dependendo da função)
        Tripulacao tripulante = new Tripulacao();
        tripulante.setNome(nome);
        tripulante.setRg(rg);
        tripulante.setIdentificacaoAeronautica(identificacaoAeronautica);
        
        // Lógica para salvar o tripulante no banco de dados ou em outra fonte de dados
    }

    public void atualizarInformacoesAeronave(String codigo, String tipo, int quantidadeAssentos) {
        // Criar uma nova instância de Aeronave e atualizar suas informações
        Aeronave aeronave = new Aeronave();
        aeronave.setCodigo(codigo);
        aeronave.setTipo(tipo);
        aeronave.setQuantidadeAssentos(quantidadeAssentos);
        
        // Lógica para atualizar as informações da aeronave no banco de dados ou em outra fonte de dados
    }
}
