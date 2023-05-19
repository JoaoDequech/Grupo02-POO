import java.util.ArrayList;

public class Pedido {

    private ArrayList<Item_pedido> iP = new ArrayList<>();

    private int nmPedido;

    String[] status = new String[4];

    public void setstatus(String[] status) {
       
        status[0] = "Aguardando";
        status[1] = "Preparando";
        status[2] = "Pronto";
        status[3] = "Servido";
    }

}