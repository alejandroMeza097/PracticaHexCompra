package mx.com.santander.hexagonalmodularmaven.cliente.adapter.feign;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import mx.com.santander.hexagonalmodularmaven.cliente.adapter.entity.ClienteEntity;



@FeignClient(name = "${feign.name}", url = "${feign.base-url}")
public interface ClienteFeignAdapter {
    
    @RequestMapping(method = RequestMethod.GET, value = "${feign.clientes-resource}")
    List<ClienteEntity> getClientes();

    @RequestMapping(method = RequestMethod.GET, value = "${feign.cliente-resource}/{id}", produces = "application/json")
    ClienteEntity getCliente(@PathVariable("id") Long id);

    @RequestMapping(method = RequestMethod.POST, value = "${feign.cliente-resource}")
    ClienteEntity create(@RequestBody ClienteEntity cliente);
}
