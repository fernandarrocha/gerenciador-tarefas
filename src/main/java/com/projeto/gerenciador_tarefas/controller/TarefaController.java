package com.projeto.gerenciadortarefas.controller;

import com.projeto.gerenciadortarefas.model.Tarefa;
import com.projeto.gerenciadortarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository repository;

    // 1. Criar uma nova tarefa
    @PostMapping
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
        return repository.save(tarefa);
    }

    // 2. Listar todas as tarefas
    @GetMapping
    public List<Tarefa> listarTarefas() {
        return repository.findAll();
    }

    // 3. Buscar tarefa por ID
    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarPorId(@PathVariable String id) {
        return repository.findById(id)
                .map(tarefa -> ResponseEntity.ok().body(tarefa))
                .orElse(ResponseEntity.notFound().build());
    }

    // 4. Atualizar tarefa
    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizarTarefa(@PathVariable String id, @RequestBody Tarefa tarefaAtualizada) {
        return repository.findById(id)
                .map(tarefa -> {
                    tarefa.setTitulo(tarefaAtualizada.getTitulo());
                    tarefa.setDescricao(tarefaAtualizada.getDescricao());
                    tarefa.setDataConclusao(tarefaAtualizada.getDataConclusao());
                    tarefa.setStatus(tarefaAtualizada.getStatus());
                    Tarefa atualizado = repository.save(tarefa);
                    return ResponseEntity.ok().body(atualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // 5. Excluir tarefa
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTarefa(@PathVariable String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}