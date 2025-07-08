package mx.com.santander.hexagonalmodularmaven.cliente.adapter.feign.dao;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

import mx.com.santander.hexagonalmodularmaven.cliente.adapter.entity.ClienteEntity;
import mx.com.santander.hexagonalmodularmaven.cliente.adapter.feign.ClienteFeignAdapter;
import mx.com.santander.hexagonalmodularmaven.cliente.adapter.mapper.ClienteDBMapper;
import mx.com.santander.hexagonalmodularmaven.cliente.model.entity.Cliente;
import mx.com.santander.hexagonalmodularmaven.cliente.port.dao.ClienteDao;



@Repository
public class ClienteFeignDao implements ClienteDao {
    private final ClienteDBMapper clienteDBMapper;
    private final ClienteFeignAdapter clienteFeignAdapter;

    public ClienteFeignDao(ClienteDBMapper clienteDBMapper, ClienteFeignAdapter clienteFeignAdapter){
        this.clienteDBMapper = clienteDBMapper;
        this.clienteFeignAdapter = clienteFeignAdapter;
    }

    @Override
    public Cliente getById(Long id) {
       final ClienteEntity clienteEntity = clienteFeignAdapter.getCliente(id);
       return clienteDBMapper.toDomain(clienteEntity);
    }

    @Override
    public List<Cliente> getAll() {
        List<ClienteEntity> clientes = clienteFeignAdapter.getClientes();
        return clientes.stream().map(clienteDBMapper::toDomain).collect(Collectors.toList());
    }

}
