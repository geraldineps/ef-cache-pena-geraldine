package pe.edu.cibertec.ef_cache_pena_geraldine.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ef_cache_pena_geraldine.model.Reserva;
import pe.edu.cibertec.ef_cache_pena_geraldine.repository.ReservaRepository;
import pe.edu.cibertec.ef_cache_pena_geraldine.service.IReservaService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ReservaService implements IReservaService {

    private final ReservaRepository reservaRepository;

    @CachePut(value = "reservasxcliente", key = "#id_cliente")
    @Override
    public List<Reserva> obtenerReservasxCliente(int id_cliente) {
        return reservaRepository.obtenerReservasxCliente(id_cliente);
    }

    @Cacheable(value = "reservasFinalizadas", key = "#activo")
    @Override
    public List<Reserva> obtenerReservasxCompletadas() {
        return reservaRepository.obtenerReservasxCompletadas();
    }
}
