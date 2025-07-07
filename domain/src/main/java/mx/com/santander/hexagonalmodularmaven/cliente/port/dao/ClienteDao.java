package mx.com.santander.hexagonalmodularmaven.cliente.port.dao;

import java.util.List;

import mx.com.santander.hexagonalmodularmaven.cliente.model.entity.Cliente;

public interface ClienteDao {
    Cliente getById(Long id);
    List<Cliente> getAll();
} 
