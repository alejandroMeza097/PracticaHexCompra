package mx.com.santander.hexagonalmodularmaven.producto.port.repository;

import mx.com.santander.hexagonalmodularmaven.producto.model.entity.Producto;

public interface ProductoRepository {

    public Producto create(Producto producto);
}
