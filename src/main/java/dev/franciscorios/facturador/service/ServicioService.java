package dev.franciscorios.facturador.service;

import dev.franciscorios.facturador.exceptions.ServicioNotFaundException;
import dev.franciscorios.facturador.model.Servicio;
import dev.franciscorios.facturador.repository.ServicioRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
@Transactional
public class ServicioService {

    private final ServicioRepository servicioRepository;

    public void save(Servicio servicio) {
        servicioRepository.save(servicio);
    }

    @Transactional(readOnly = true)
    public Servicio getServicio(Long id) {
        return servicioRepository.findById(id).orElseThrow(() -> new ServicioNotFaundException(id.toString()));
    }

    @Transactional(readOnly = true)
    public List<Servicio> getAllServicios() {
        return servicioRepository.findAll();
    }
}
