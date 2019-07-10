package DomainModel;
import javax.persistence.*;

@Entity
@Table(name = "cliente")

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; 
    @Column
    private int cpf;
    @Column
    private String nome;
    @Column
    private String endereco;
    @Column
    private String telefone;
     
    public Cliente() {
    }
    public int getId() {
        return id;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getCpf() {
        return cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
     public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefone() {
        return telefone;
    } 
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }    
}
