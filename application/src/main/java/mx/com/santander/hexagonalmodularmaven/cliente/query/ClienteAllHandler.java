package mx.com.santander.hexagonalmodularmaven.cliente.query;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.cliente.mapper.ClienteDtoMapper;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.ClienteDto;
import mx.com.santander.hexagonalmodularmaven.cliente.service.ClienteAllService;

@RequiredArgsConstructor
@Component
public class ClienteAllHandler {

    private final ClienteDtoMapper clienteDtoMapper;
    private final ClienteAllService clienteAllService;

    public List<ClienteDto> execute(){
        return clienteAllService.execute().stream().map(clienteDtoMapper::toDto).collect(Collectors.toList());
    }
}
