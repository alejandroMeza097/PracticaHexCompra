package mx.com.santander.hexagonalmodularmaven.cliente.command;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.cliente.mapper.ClienteDtoMapper;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.ClienteDto;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.command.ClienteCreateCommand;
import mx.com.santander.hexagonalmodularmaven.cliente.service.ClienteCreateService;

@RequiredArgsConstructor
@Component
public class ClienteCreateHandler {

    private final ClienteDtoMapper clienteDtoMapper;
    private final ClienteCreateService clienteCreateService;

    public ClienteDto execute(ClienteCreateCommand clienteCreateCommand){
        return clienteDtoMapper.toDto(clienteCreateService.execute(clienteCreateCommand));
    }

}
