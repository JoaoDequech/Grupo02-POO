import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt; 

public class Util{

public void controle(){

    int interFazer = 0;
    String aux = "1 - Fazer pedido\n2 - Mostrar status\n3 - Mostrar pedidos\n4 - Finalizar";

    int interPedido = 0;
    String aux2 = "1 - Mostrar cardapio\n2 - Adicionar prato\n3 - Remover prato\n4 - Ver pedido\n5 - Enviar pedido";


    while(interFazer != 4){
        try{
            interFazer = parseInt(showInputDialog(null, aux));
            switch (interFazer){
            case 1:

                while(interPedido != 5){
                    interPedido = parseInt(showInputDialog(null, aux2));
                    switch (interPedido) {
                        case 1:
                            cardapio();
                        break;

                        case 2:
                            addPrato();
                        break;

                        case 3:
                            delPrato();
                        break;

                        case 4:
                            verPedido();
                        break;
                    }
                }
                break;

                case 2:

                break;

                case 3:

                break;
            }
    
        }catch (Exception e) {
            showMessageDialog(null,"Entrada Inválida", "ERRO: " + e, ERROR_MESSAGE);
        }
    }
}
    



    private void cardapio() {


    }

    private void addPrato() {


    }

    private void delPrato() {


    }

    private void verPedido() {


    }










}