package com.github.app.model.medico;

public record DadosCadastroMedico(
    String nome, 
    String email, 
    String crm,
    Especialidade especialidade


) {
    
}

// Essa classe é responsável por pegar os dados que estão vindo
// do simulador de requisição (insomnia) e transformar em atributos(variáveis) de uma entidade chamada Médico.
// A classe do tipo record já cria todos os getters, setters, constructors, hashcode e equals.