package app;

import lombok.Data;

// use esta classe para representar cada classe de atendimento
// a anotação @Data cria automaticamente getters e setters (entre outras coisas)
@Data
public class ClasseAtendimento {
    char codigo;
    String descricao;
    int tempo_maximo_espera;
    int prioridade;

    // você pode acrescentar métodos para implementar operações necessárias !
}
