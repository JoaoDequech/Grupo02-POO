import java.util.ArrayList;

public class Pedido extends Item_pedido {

    private ArrayList<Item_pedido> iP = new ArrayList<>();

    private int nmPedido;

    public Pedido(int nmPedido, String [] status){

        this.nmPedido = nmPedido;
        this.status = status;
    }

    public Pedido(){
        
    }
    public int getNmPedido() {
        return nmPedido;
    }
    public String[] getStatus() {
        return status;
    }
    public void setNmPedido(int nmPedido) {
        this.nmPedido = nmPedido;
    }
    

    String[] status = new String[4];

    public void setStatus(String[] status) {
       
        this.status[0] = "Aguardando";
        this.status[1] = "Preparando";
        this.status[2] = "Pronto";
        this.status[3] = "Servido";
    }

}