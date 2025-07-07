package mx.com.santander.hexagonalmodularmaven.cliente.rest.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.ClienteDto;
import mx.com.santander.hexagonalmodularmaven.cliente.query.ClienteAllHandler;
import mx.com.santander.hexagonalmodularmaven.cliente.query.ClienteByIdHandler;



@RestController
@RequestMapping("/clientes")
public class ClienteQueryController {
    private final ClienteByIdHandler clienteByIdHandler;
    private final ClienteAllHandler clienteAllHandler;

    public ClienteQueryController(ClienteAllHandler clienteAllHandler, ClienteByIdHandler clienteByIdHandler){
        this.clienteAllHandler = clienteAllHandler;
        this.clienteByIdHandler = clienteByIdHandler;
    }

    @GetMapping
	public List<ClienteDto> getAll() {
		return clienteAllHandler.execute();
	}

	@GetMapping("/{id}")
	public ClienteDto getById(@PathVariable("id") Long id) {
		return clienteByIdHandler.execute(id);
	}


}
