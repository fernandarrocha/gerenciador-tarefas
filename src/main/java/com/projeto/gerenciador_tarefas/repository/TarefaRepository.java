package com.projeto.gerenciadortarefas.repository;

import com.projeto.gerenciadortarefas.model.Tarefa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TarefaRepository extends MongoRepository<Tarefa, String> {
    // O Spring Data MongoDB implementa os métodos básicos (save, findById, delete) automaticamente.
}