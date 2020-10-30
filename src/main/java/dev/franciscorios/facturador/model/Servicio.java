package dev.franciscorios.facturador.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Servicio {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long servicioId;
    @NotBlank(message = "Servicio Name cannot be empty or Null")
    private String servicioName;
    @Nullable
    @Lob
    private String detalle;
    @Nullable
    //TODO hacer enum de area?
    private String area;
    @Nullable
    private Integer precio;
}
