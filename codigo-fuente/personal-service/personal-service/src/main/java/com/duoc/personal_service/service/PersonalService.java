package com.duoc.personal_service.service;

import com.duoc.personal_service.model.Personal;
import com.duoc.personal_service.repository.PersonalRepository;
import java.util.List;
import org.springframework.stereotype.Service;


@Service //Clase que contiene la logica del negocio
public class PersonalService {
    private final PersonalRepository repository;

    //Inyección de dependencias por constructor para mayor seguridad
    public PersonalService(PersonalRepository repository){
        this.repository = repository;
    }

    public List<Personal> listarTodo(){
        return repository.findAll(); //Recupera a los funcionarios ya registrados
    }

    public Personal registrar(Personal personal){
        return repository.save(personal); //Guerda un nuevo funcionario en MySQL
    }
}
