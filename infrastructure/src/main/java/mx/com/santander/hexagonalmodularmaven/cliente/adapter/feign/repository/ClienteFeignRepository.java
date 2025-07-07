package mx.com.santander.hexagonalmodularmaven.cliente.adapter.feign.repository;

import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.cliente.adapter.feign.ClienteFeignAdapter;
import mx.com.santander.hexagonalmodularmaven.cliente.adapter.mapper.ClienteDBMapper;
import mx.com.santander.hexagonalmodularmaven.cliente.model.entity.Cliente;
import mx.com.santander.hexagonalmodularmaven.cliente.port.repository.ClienteRepository;


@Repository
@Transactional
@RequiredArgsConstructor
public class ClienteFeignRepository implements ClienteRepository {

    private final ClienteFeignAdapter clienteFeignAdapter;
    private final ClienteDBMapper clienteDBMapper;

    @Override
    public Cliente create(Cliente cliente) {
        var clienteToSave = clienteDBMapper.toDboCreate(cliente);
		var clienteSaved = clienteFeignAdapter.create(clienteToSave);
		return clienteDBMapper.toDomain(clienteSaved);
      
        
    }

}
