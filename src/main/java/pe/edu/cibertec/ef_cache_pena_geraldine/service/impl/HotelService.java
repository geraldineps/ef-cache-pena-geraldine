package pe.edu.cibertec.ef_cache_pena_geraldine.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ef_cache_pena_geraldine.model.Hotel;
import pe.edu.cibertec.ef_cache_pena_geraldine.repository.HotelRepository;
import pe.edu.cibertec.ef_cache_pena_geraldine.service.IHotelService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class HotelService implements IHotelService {

    private final HotelRepository hotelRepository;

    @Cacheable(value = "reservaxcliente", key = "#id_cliente")
    @Override
    public List<Hotel> obtenerHotelesXPais(int id_pais) {
        return hotelRepository.obtenerHotelesXPais(id_pais);
    }
}
