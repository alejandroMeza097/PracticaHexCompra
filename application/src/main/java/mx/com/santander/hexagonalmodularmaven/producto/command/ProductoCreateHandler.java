package mx.com.santander.hexagonalmodularmaven.producto.command;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.producto.mapper.ProductoDtoMapper;
import mx.com.santander.hexagonalmodularmaven.producto.model.dto.ProductoDto;
import mx.com.santander.hexagonalmodularmaven.producto.model.dto.command.ProductoCreateCommand;
import mx.com.santander.hexagonalmodularmaven.producto.service.ProductoCreateService;

@RequiredArgsConstructor
@Component
public class ProductoCreateHandler {
    private final ProductoDtoMapper productoDtoMapper;
    private final ProductoCreateService productoCreateService;

    public ProductoDto execute(ProductoCreateCommand productoCreateCommand){
        return productoDtoMapper.toDto(productoCreateService.execute(productoCreateCommand));
    }

}
