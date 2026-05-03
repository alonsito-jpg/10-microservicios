package com.duoc.traveler_service.service;


import com.duoc.traveler_service.model.Traveler;
import com.duoc.traveler_service.repository.TravelerRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class TravelerService {
    private final TravelerRepository repository;

    public TravelerService(TravelerRepository repository){
        this.repository = repository;
    }

    public List<Traveler> listarTodos(){
        return repository.findAll();
    }

    public Traveler registrar(Traveler traveler){
        return repository.save(traveler);
    }


}
