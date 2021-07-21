package br.com.appfrontreactandbackspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appfrontreactandbackspring.model.Curso;
import br.com.appfrontreactandbackspring.repository.CursoRepository;

@Service
public class CursoService {
    
    // private static List<Curso> cursos = new ArrayList<>();
    // private static long idContador = 0;

    // static {

    //     cursos.add(new Curso(++idContador, "https://github.com/diegotpereira/VueSpringBootRestMasterClienteFrontend", "Projeto React + Spring Boot"));
    //     cursos.add(new Curso(++idContador, "https://github.com/diegotpereira/vue-laravel-crud-master", "Projeto Vue + Spring Boot"));
    // }

    @Autowired
    CursoRepository repository;

    public List<Curso> findAll() {
        return repository.findAll();
    }

    public Curso getCursosById (long id) {
        return repository.findById(id).get();
    }

    public void saveOrUpdate(Curso curso) {
        repository.save(curso);
    }

    public void update(Curso curso, int id) {
        repository.save(curso);
    }

    public void delete(long id){
        repository.deleteById(id);
    }
}
