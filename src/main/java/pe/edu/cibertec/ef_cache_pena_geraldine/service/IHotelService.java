package pe.edu.cibertec.ef_cache_pena_geraldine.service;

import pe.edu.cibertec.ef_cache_pena_geraldine.model.Hotel;
import pe.edu.cibertec.ef_cache_pena_geraldine.model.Reserva;

import java.util.List;

public interface IHotelService {

    List<Hotel> obtenerHotelesXPais(int id_pais);
}
