public class Programa {
    public static void main(String[] args) {
        Compromisso compromisso1 = new Compromisso("João", "Sala de Reuniões", "10:00", "Reunião de Projeto");
        Compromisso compromisso2 = new Compromisso("Maria", "Cafeteria", "15:00", "Encontro Informal");
        
        compromisso1.exibirDetalhes();
        compromisso2.exibirDetalhes();
    }
}