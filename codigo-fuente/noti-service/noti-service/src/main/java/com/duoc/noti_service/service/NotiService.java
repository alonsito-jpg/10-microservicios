package com.duoc.noti_service.service;

import com.duoc.noti_service.model.Noti;
import com.duoc.noti_service.repository.NotiRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotiService {
    private final NotiRepository repository;

    //Inyectamos el repositorio por constructor para asegurar 
    public NotiService(NotiRepository repository){
        this.repository = repository;
    }

    public List<Noti> obtenerTodas(){
        return repository.findAll();
    }

    public Noti enviarNotificacion(Noti noti){
        return repository.save(noti); //Guarda el nuevo aviso en MySQL
    }
}


