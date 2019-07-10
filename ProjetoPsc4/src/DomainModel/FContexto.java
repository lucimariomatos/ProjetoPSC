
package DomainModel;
import Apresentacao.JFCaixaInicial;
import Apresentacao.JFCliente;
import Apresentacao.JFVenda;
import Apresentacao.JFUsuario;
import Apresentacao.JFMercadoria;
import Apresentacao.JFPrincipal;
import Apresentacao.JFRelatorioCaixa;
import Apresentacao.JFProprietario;
import Apresentacao.JFFuncionario;
import Apresentacao.JTFAtualizarMercadoria;
import Apresentacao.JTAtualizarCliente;
/**
 *
 * @author tads
 */
public class FContexto {
    public static void main(String[] args){
        FContexto.getPrincipal().setVisible(true);
    }
    private static JFCliente jfCliente;
    private static JFCaixaInicial jfCaixainicial;
    private static JFMercadoria jfMercadoria;
    private static JFRelatorioCaixa jfRelatorioCaixa;
    private static JFUsuario jfUsuario;
    private static JFVenda jfVenda;
    private static JFPrincipal jfPrincipal;
    private static JFProprietario jfProprietario;
    private static JFFuncionario jfFuncionario;
    private static JTFAtualizarMercadoria jfAtualizarMercadoria;
    private static  JTAtualizarCliente jfAtualizarCliente;
    
    
    public static JTAtualizarCliente getJTAtualizarCliente() {
       if(jfAtualizarCliente==null){
           jfAtualizarCliente=new JTAtualizarCliente();
       }
       return jfAtualizarCliente;
    }
    
    public static JFProprietario getJfProprietario() {
       if(jfProprietario==null){
           jfProprietario=new JFProprietario();
       }
       return jfProprietario;
    }
    
    public static JFVenda getJfVenda() {
        if(jfVenda==null){
            jfVenda=new JFVenda();
        }        
        return jfVenda;
    }
    public static JFMercadoria getJfMercadoria() {
        if(jfMercadoria==null){
            jfMercadoria=new JFMercadoria();
        } 
        return jfMercadoria;
    }
    public static JFUsuario getJfUsuario() {
         if(jfUsuario==null){
            jfUsuario=new JFUsuario();
        } 
        return jfUsuario;
    }
    public static JFCliente getCliente(){
        if(jfCliente==null){
            jfCliente=new JFCliente();
        }
        return jfCliente;
    }
    
     public static JFPrincipal getPrincipal(){
        if(jfPrincipal==null){
            jfPrincipal=new JFPrincipal();
        }
        return jfPrincipal;
    }
    public static JFRelatorioCaixa getRelatorioCaixa(){
        if(jfRelatorioCaixa==null){
            jfRelatorioCaixa =new JFRelatorioCaixa();
        }
        return jfRelatorioCaixa;
    }
            
    public static JFCaixaInicial getCaixainicial(){
        if(jfCaixainicial==null){
            jfCaixainicial =new JFCaixaInicial();
        }
        return jfCaixainicial;
    } 
    
    public static JFFuncionario getJFFuncionario() {
       if(jfFuncionario==null){
           jfFuncionario=new JFFuncionario();
       }
       return jfFuncionario;
    }
     public static JTFAtualizarMercadoria getJTFAtualizarMercadoria() {
       if(jfAtualizarMercadoria==null){
           jfAtualizarMercadoria=new JTFAtualizarMercadoria();
       }
       return jfAtualizarMercadoria;
    }
}
