package DomainModel;
import javax.persistence.*;

@Entity
@Table(name = "caixa")
/**
 * @author lucimario
 */
public class Caixa {
    @Id
    @Column
    private int codigo;
    @Column
    private float saldoInicial;
    @Column
    private float valorTotal;
    @Column
    private String dataCaixa;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(float saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getDataCaixa() {
        return dataCaixa;
    }

    public void setDataCaixa(String dataCaixa) {
        this.dataCaixa = dataCaixa;
    }
}