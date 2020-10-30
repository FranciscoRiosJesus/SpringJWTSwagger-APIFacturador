package dev.franciscorios.facturador.repository;

import dev.franciscorios.facturador.model.Presupuesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

@Repository
public interface PresupuestoRepository extends JpaRepository<Presupuesto, Long> {
//    List<Presupuesto> findByOrderByCreatedDateDesc(Instant createdDate);
}