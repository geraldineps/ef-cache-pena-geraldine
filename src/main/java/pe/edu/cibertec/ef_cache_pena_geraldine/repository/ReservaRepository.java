package pe.edu.cibertec.ef_cache_pena_geraldine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.ef_cache_pena_geraldine.model.Reserva;

import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

    @Query(value = "SELECT * FROM reserva WHERE id_cliente = :id_cliente;",
            nativeQuery = true)
    List<Reserva> obtenerReservasxCliente(@Param("id_cliente") int id_cliente);

    @Query(value = "SELECT * FROM reserva WHERE YEAR(fecha_salida) = YEAR(CURDATE()) - 1 ;",
            nativeQuery = true)
    List<Reserva> obtenerReservasxCompletadas();

}
