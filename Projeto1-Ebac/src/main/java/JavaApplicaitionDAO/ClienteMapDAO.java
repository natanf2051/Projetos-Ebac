package JavaApplicaitionDAO;
import JavaApplicationCliente.Clientes;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;




public class ClienteMapDAO implements IClienteDAO {

    private Map<Long, Clientes> map;

    public ClienteMapDAO(){
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(Clientes cliente) {
        if(this.map.containsKey(cliente.getCpf())){
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(long cpf) {
        Clientes clienteCadastrado = this.map.get(cpf);
        
        if(clienteCadastrado != null){
            this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
        }
    }

    @Override
    public void alterar(Clientes cliente) {
        Clientes clienteCadastrado = this.map.get(cliente.getCpf());
        
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setCpf(cliente.getCpf());
            clienteCadastrado.setEndereco(cliente.getEndereco());
            clienteCadastrado.setNumero(cliente.getNumero());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setEstado(cliente.getEstado());
            clienteCadastrado.setTelefone(cliente.getTelefone());
        
    }

    @Override
    public Clientes consultar(long cpf) {
        
        return this.map.get(cpf);
    }

    @Override
    public Collection<Clientes> buscarTodos() {
        // TODO Auto-generated method stub
        return this.map.values();
    }

    @Override
    public Clientes alterar(Long Cpf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
