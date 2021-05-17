
package view;

import Model.Cliente;
import Model.Servico;


public class Main {
    
    public static void main(String[] args){
        
        String nome = "Camila";
        System.out.println(nome);
        
        Servico alongamento = new Servico(1, "Alongamento de cílios clássico", 260);
        
        System.out.println(alongamento.getDescricao());
        System.out.println(alongamento.getValor());
        
        
        Cliente cliente = new Cliente(1, "Anny", "rua teste", "955862013");        
        System.out.println(cliente.getNome());
        
        
      
    }
}
