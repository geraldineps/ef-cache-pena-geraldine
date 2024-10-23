package pe.edu.cibertec.ef_cache_pena_geraldine.service;

import pe.edu.cibertec.ef_cache_pena_geraldine.model.Reserva;

import java.util.List;

public interface IReservaService {

    List<Reserva> obtenerReservasxCliente(int id_cliente);

    List<Reserva> obtenerReservasxCompletadas();
}
