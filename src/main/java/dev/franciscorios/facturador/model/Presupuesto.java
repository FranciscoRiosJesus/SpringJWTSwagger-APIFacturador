package dev.franciscorios.facturador.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;

import java.time.Instant;
import java.util.List;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Presupuesto {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long presupuestoId;
    private Instant createdDate;
    private Integer cantDiasValidez;
    @Nullable
    private String empresa;
    @Nullable
    private String nombreDelCliente;
    @OneToMany(fetch = LAZY)
    private List<Servicio> servicioOfrecido;
    @OneToMany(fetch = LAZY)
    private List<Servicio> servicioOpcional;
    private PaymentType paymentType;
    @OneToMany(fetch = LAZY)
    private List<Descuento> descuentosList;
}