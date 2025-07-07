package mx.com.santander.hexagonalmodularmaven.producto.port.dao;

import java.util.List;

import mx.com.santander.hexagonalmodularmaven.producto.model.entity.Producto;

public interface ProductoDao {

    public Producto getById(Long id);
    public List<Producto> getAll();

}
