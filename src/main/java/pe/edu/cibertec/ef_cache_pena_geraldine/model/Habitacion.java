package pe.edu.cibertec.ef_cache_pena_geraldine.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "habitacion")
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_habitacion;
    private String numero;
    private String tipo;
    private Double precio;
    @ManyToOne
    @JoinColumn(name = "id_hotel")
    private Hotel hotel;
}
