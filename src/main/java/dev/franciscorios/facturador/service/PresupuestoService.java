package dev.franciscorios.facturador.service;

import dev.franciscorios.facturador.dto.PresupuestoRequest;
import dev.franciscorios.facturador.dto.PresupuestoResponse;
import dev.franciscorios.facturador.exceptions.PresupuestoNotFoundException;
import dev.franciscorios.facturador.mapper.PresupuestoMapper;
import dev.franciscorios.facturador.model.Presupuesto;
import dev.franciscorios.facturador.repository.PresupuestoRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
@Transactional
public class PresupuestoService {

    private final PresupuestoRepository presupuestoRepository;
    private final PresupuestoMapper presupuestoMapper;

    public void save(PresupuestoRequest presupuestoRequest) {
        presupuestoRepository.save(presupuestoMapper.map(presupuestoRequest));
    }

    @Transactional(readOnly = true)
    public PresupuestoResponse getPresupuesto(Long id) {
        Presupuesto presupuesto = presupuestoRepository.findById(id)
                .orElseThrow(() -> new PresupuestoNotFoundException(id.toString()));
        return presupuestoMapper.mapToDto(presupuesto);
    }

    @Transactional(readOnly = true)
    public List<PresupuestoResponse> getAllPresupuestos() {
        return presupuestoRepository.findAll()
                .stream()
                .map(presupuestoMapper::mapToDto)
                .collect(Collectors.toList());
    }

}
