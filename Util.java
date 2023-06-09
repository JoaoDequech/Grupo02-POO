import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;

public class Util {

    private ArrayList<Pedido> listaPedido = new ArrayList<>();

    public void controle(ArrayList<Prato> pratos) {

        //prato teste
Prato p = new Prato(TOOL_TIP_TEXT_KEY);
p.setNome("Arroz");
p.setCodigo("1");
p.setIngredientes(null);
p.setDescricao("Arroz branco soltinho");
p.setPreco(12.99);
p.setStatus(true);
pratos.add(p);

Prato p2 = new Prato(TOOL_TIP_TEXT_KEY);
p2.setNome("Feijão");
p2.setCodigo("2");
p2.setIngredientes(null);
p2.setDescricao("Combina perfeitamente com o arroz");
p2.setPreco(5.99);
p2.setStatus(true);
pratos.add(p2);

        int cont=0;
        int interFazer = 0;
        String aux = "1 - Fazer pedido\n2 - Mostrar status\n3 - Mostrar pedidos\n4 - Finalizar";

        int interPedido = 0;
        String aux2 = "1 - Mostrar cardápio\n2 - Adicionar prato\n3 - Remover prato\n4 - Ver pedido\n5 - Enviar pedido\n6 - Cancelar pedido";

        while (interFazer != 4) {
            try {
                interFazer = parseInt(showInputDialog(null, aux));
                switch (interFazer) {
                    case 1:
                        interPedido = 0;   
                        while (interPedido != 6) {
                            interPedido = parseInt(showInputDialog(null, aux2));
                            switch (interPedido) {
                                case 1:
                                    cardapio(pratos);
                                    break;

                                case 2:
                                    addPrato(pratos);
                                    break;

                                case 3:
                                    delPrato();
                                    break;

                                case 4:
                                    verPedido();
                                    break;
                                
                                case 5:
                                    enviarPedido(cont);
                                    break;
                            }
                        }
                        break;

                    case 2:

                        break;

                    case 3:
                        listarPedidos(listaPedido);
                        break;
                }

            } catch (Exception e) {
                showMessageDialog(null, "Entrada Inválida", "ERRO: " + e, ERROR_MESSAGE);
            }
        }
        }
    

    private void enviarPedido(int cont) {
    
        int i = cont++;
        Pedido p = new Pedido();
        p.setNmPedido(i);
        showMessageDialog(getRootFrame(), "Pedido " + i + " registrado.");

    }

    private void cardapio(ArrayList<Prato> pratos) {

        int size = pratos.size();
        String card = "";

        for (int i = 0; i < size; i++) {
            Prato p = pratos.get(i);
            card = pratos + "\n \n";
        }

        showMessageDialog(null, "Cardapio: \n" + card);
        return;

    }

    private void listarPedidos(ArrayList<Pedido> pedidos) {

        int size = pedidos.size();

        for (int i = 0; i < size; i++) {
            Pedido p = pedidos.get(i);
            showMessageDialog(null, p);
        }
        return; 

    }

    private void addPrato(ArrayList<Prato> pratos) {
        int codigo = 0;
        while (codigo <= pratos.size()) {
            try {
                int size = pratos.size();
        String card = "";

        for (int i = 0; i < size; i++) {
            Prato p = pratos.get(i);
            card = pratos + "\n \n";
        }
                codigo = parseInt(showInputDialog(null, "Cardapio:\n" + card + "\nDigite o código do prato:"));
                Item_pedido item = new Item_pedido();
                item.setCodigo(codigo);
                

                return;
            } catch (Exception e) {
                showMessageDialog(null, "Entrada Inválida", "ERRO: " + e, ERROR_MESSAGE);
            }
            return;
        }
        showMessageDialog(getRootFrame(), "Código inexistente");
    }

    private void delPrato() {

    }

    private void verPedido() {


    }

}