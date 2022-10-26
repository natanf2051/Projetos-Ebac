package JavaApplicaitionDAO;

import JavaApplicationCliente.Clientes;
import java.util.Collection;


public interface IClienteDAO{

    public Boolean cadastrar(Clientes clientes);
    
    public void excluir(long cpf);
    
    public void alterar(Clientes cliente);
    
    public Clientes consultar(long cpf);
    
    public Collection<Clientes> buscarTodos();

    public Clientes alterar(Long Cpf);
    

}
