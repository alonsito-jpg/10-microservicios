package com.duoc.noti_service.repository;

import com.duoc.noti_service.model.Noti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Marca este componente para que spring gestione la persistencia
public interface NotiRepository extends JpaRepository<Noti, Long> {
    // Al heredar de JpaRepository
}
