package br.com.appfrontreactandbackspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.appfrontreactandbackspring.model.Curso;
import br.com.appfrontreactandbackspring.service.CursoService;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class CursoController {
    
    @Autowired
    private CursoService service;

    @GetMapping("/cursos")
    public List<Curso> getAllCursos() {
        return service.findAll();
    }

    @PostMapping("/cursos")
    public long salvarCurso(@RequestBody Curso curso) {
        service.saveOrUpdate(curso);

        return curso.getId();
    }

    @PutMapping("/cursos/{id}")
    public Curso update(@RequestBody Curso curso){
        service.saveOrUpdate(curso);
        return curso;
    }

    @DeleteMapping("/cursos/{id}")
    public void excluirCurso(@PathVariable("id") long id) {
        service.delete(id);
    }
}
