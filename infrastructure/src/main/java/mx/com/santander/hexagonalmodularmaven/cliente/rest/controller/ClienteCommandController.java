package mx.com.santander.hexagonalmodularmaven.cliente.rest.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.cliente.command.ClienteCreateHandler;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.ClienteDto;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.command.ClienteCreateCommand;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteCommandController {

    private final ClienteCreateHandler clienteCreateHandler;

    @PostMapping()
    public ClienteDto create(@RequestBody ClienteCreateCommand clienteCreateCommand){
        return clienteCreateHandler.execute(clienteCreateCommand);
    }
}
