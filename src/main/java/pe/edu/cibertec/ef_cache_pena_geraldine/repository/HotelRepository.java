package pe.edu.cibertec.ef_cache_pena_geraldine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.ef_cache_pena_geraldine.model.Cliente;
import pe.edu.cibertec.ef_cache_pena_geraldine.model.Hotel;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Integer> {

    @Query(value = "SELECT * FROM hotel WHERE id_pais = :id_pais;",
            nativeQuery = true)
    List<Hotel> obtenerHotelesXPais(@Param("id_pais") int id_pais);
}
