package com.projeto.gerenciadortarefas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data; // Se não usar Lombok, gere Getters e Setters manualmente
import java.time.LocalDate;

@Document(collection = "tarefas")
@Data // Cria getters, setters e toString automaticamente
public class Tarefa {
    
    @Id
    private String id;
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao = LocalDate.now(); // Define data atual por padrão
    private LocalDate dataConclusao;
    private Status status;
}