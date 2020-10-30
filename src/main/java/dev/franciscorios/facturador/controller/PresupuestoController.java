package dev.franciscorios.facturador.controller;

import dev.franciscorios.facturador.dto.PresupuestoRequest;
import dev.franciscorios.facturador.dto.PresupuestoResponse;
import dev.franciscorios.facturador.service.PresupuestoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/presupuestos")
@AllArgsConstructor
public class PresupuestoController {

    private final PresupuestoService presupuestoService;

    @PostMapping
    public ResponseEntity<Void> createPresupuesto(@RequestBody PresupuestoRequest presupuestoRequest) {
        presupuestoService.save(presupuestoRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PresupuestoResponse>> getAllPresupuestos() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(presupuestoService.getAllPresupuestos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PresupuestoResponse> getPresupuesto(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(presupuestoService.getPresupuesto(id));
    }
}
