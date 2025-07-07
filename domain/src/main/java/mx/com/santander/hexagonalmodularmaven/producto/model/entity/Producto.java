package mx.com.santander.hexagonalmodularmaven.producto.model.entity;
import java.math.BigDecimal;

import lombok.NoArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.producto.model.dto.command.ProductoCreateCommand;

@NoArgsConstructor
public class Producto {
    private ProductoId id;
    private ProductoNombre nombre;
    private ProductoPrecio precio;

    public Producto(Long id, String nombre,BigDecimal precio ){
        this.id = new ProductoId(id);
        this.nombre = new ProductoNombre(nombre);
        this.precio = new ProductoPrecio(precio);
    }

    public Producto requestToCreate(ProductoCreateCommand productoCreateCommand){
        this.nombre = new ProductoNombre(productoCreateCommand.getNombre());
        this.precio = new ProductoPrecio(productoCreateCommand.getPrecio());
        return this;
    }

    public Long getId() {
        return id.getId();
    }



    public String getNombre() {
        return nombre.getNombre();
    }



    public BigDecimal getPrecio() {
        return precio.getPrecio();
    }

    



}
