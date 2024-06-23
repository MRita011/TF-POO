package dados;

public enum Status {
    CADASTRADA,  // Estado inicial quando a locação é criada
    EXECUTANDO,  // Todos os robôs foram locados e a locação está em execução
    FINALIZADA,  // A locação foi concluída
    CANCELADA,   // A locação foi cancelada
    DISPONIVEL,  // Robô disponível para locação
    LOCADO;      // Robô que está atualmente locado
}
