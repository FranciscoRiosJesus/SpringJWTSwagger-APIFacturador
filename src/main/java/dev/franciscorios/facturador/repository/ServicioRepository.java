package dev.franciscorios.facturador.repository;

import dev.franciscorios.facturador.model.Presupuesto;
import dev.franciscorios.facturador.model.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Long> {
//    List<Servicio> findByOrderByAreaAsc(Instant createdDate);
}
