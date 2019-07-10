package DomainModel;
import javax.persistence.*;
@Entity
@Table(name = "venda")
/**
 *
 * @author lucimario
 */
public class Venda {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Column
    private float valorTotal;
    @Column
    private String dataVenda;
    @Column
    private String CodMercadoria;

    public String getCodMercadoria() {
        return CodMercadoria;
    }

    public void setCodMercadoria(String CodMercadoria) {
        this.CodMercadoria = CodMercadoria;
    }
    
       
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    } 
    
}