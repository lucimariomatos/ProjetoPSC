package DomainModel;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "mercadoria")

public class Mercadoria {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int codigo;
  @Column
  private String descricao;
  @Column
  private float precoCompra;
  @Column
  private float precoVenda;
  @Column
  private int quantidade;
  @Column
  private String dataCompra;
  
  public Mercadoria(){  
  }
  public int getCodigo() {
    return codigo;
  }
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public float getPrecoCompra() {
    return precoCompra;
  }
  public void setPrecoCompra(float precoCompra) {
    this.precoCompra = precoCompra;
  }
  public float getPrecoVenda() {
    return precoVenda;
  }
  public void setPrecoVenda(float precoVenda) {
    this.precoVenda = precoVenda;
  }
  public String getDataCompra() {
        return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }
  public int getQuantidade() {
    return quantidade;
  }
  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
}
