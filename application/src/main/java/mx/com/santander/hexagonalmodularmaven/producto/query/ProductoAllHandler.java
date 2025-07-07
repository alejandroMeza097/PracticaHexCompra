package mx.com.santander.hexagonalmodularmaven.producto.query;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.producto.mapper.ProductoDtoMapper;
import mx.com.santander.hexagonalmodularmaven.producto.model.dto.ProductoDto;
import mx.com.santander.hexagonalmodularmaven.producto.service.ProductoAllService;

@RequiredArgsConstructor
@Component
public class ProductoAllHandler {
    private final ProductoDtoMapper productoDtoMapper;
    private final ProductoAllService productoAllService;

    public List<ProductoDto> execute(){
        return productoAllService.execute().stream().map(productoDtoMapper::toDto).collect(Collectors.toList());
    }

}
