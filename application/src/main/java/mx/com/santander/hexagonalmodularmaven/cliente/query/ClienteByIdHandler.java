package mx.com.santander.hexagonalmodularmaven.cliente.query;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.cliente.mapper.ClienteDtoMapper;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.ClienteDto;
import mx.com.santander.hexagonalmodularmaven.cliente.service.ClienteByIdService;

@RequiredArgsConstructor
@Component
public class ClienteByIdHandler {
    private final ClienteDtoMapper clienteDtoMapper;
    private final ClienteByIdService clienteByIdService;

    public ClienteDto execute(Long id){
        return clienteDtoMapper.toDto(clienteByIdService.execute(id)) ;
    }

}
