package mx.com.santander.hexagonalmodularmaven.producto.query;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.producto.mapper.ProductoDtoMapper;
import mx.com.santander.hexagonalmodularmaven.producto.model.dto.ProductoDto;
import mx.com.santander.hexagonalmodularmaven.producto.service.ProductoByIdService;

@RequiredArgsConstructor
@Component
public class ProductoByIdHandler {
    private final ProductoDtoMapper productoDtoMapper;
    private final ProductoByIdService productoByIdService;

    public ProductoDto execute(Long id){
        return productoDtoMapper.toDto(productoByIdService.execute(id));
    }

}
