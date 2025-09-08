package Services;

import Model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TarefasControl {

    private ArrayList<Tarefa> model;

    public TarefasControl(ArrayList<Tarefa> model) {
        this.model = model;
    }

    public void criarTarefa (){
        Scanner scan = new Scanner(System.in);

        int tamanho = model.size();

        String Titulo;
        String Descricao;

        System.out.println("Digite o titulo:");
        Titulo = scan.nextLine();

        System.out.println("Digite a descricao (digite \"FIM\", em uma linha separada, para encerrar):");

        StringBuilder textoCompleto = new StringBuilder();

        while(true){
            String texto = scan.nextLine();

            if("FIM".equals(texto)){
                break;
            }

            textoCompleto.append(texto);
        }

        Descricao = textoCompleto.toString();

        if("".equals(Titulo) && "".equals(Descricao)){
            model.add(new Tarefa());
        }
        else {
            model.add(new Tarefa(tamanho, Titulo, Descricao));    
        }

        System.out.println("Sua tarefa foi criada com sucesso!");

        scan.close();

    }

    public void deletarTarefa (int id){

        Scanner leitor = new Scanner(System.in);

        for(Tarefa obj : model) {

            if(obj.getId() == id) {

                System.out.println("Deseja excluir a tarefa: " + obj.getTitulo() + "? (y/n)");

                char escolha = leitor.nextLine().charAt(0);

                if (escolha == 'y') {
                    model.removeIf(f -> f.getId() == id);
                    System.out.println("A tarefa foi excluída!");

                } else  {
                    System.out.println("A tarefa não foi excluída.");
                    // Aqui dá pra botar um return dependendo de como ficar o método que chama esse método.

                }

            }

        }

        leitor.close();

    }

    public void editarTitulo (int id){
        Scanner scan = new Scanner(System.in);

        for(Tarefa obj : model){
            
            if(obj.getId() == id){
                System.out.println("Digite o novo título.");
                String novoTitulo = scan.nextLine();

                obj.setTitulo(novoTitulo);

                System.out.println("O titulo foi modificado com sucesso!");
            }
        }    

        scan.close();    
    }

    public void editarDescricao (int id){
        Scanner leitor = new Scanner(System.in);
        
        for(Tarefa obj : model) {
        
            if(obj.getId() == id) {
                System.out.print("Digite a nova descricao (digite \"FIM\", em uma linha separada, para encerrar):");

                StringBuilder textoCompleto = new StringBuilder();

                while(true){
                    String texto = leitor.nextLine();

                    if("FIM".equals(texto)){
                        break;
                    }

                    textoCompleto.append(texto);
                }
                
                String novaDescricao = textoCompleto.toString();
                
                obj.setDescricao(novaDescricao);
                
                System.out.println("A descrição foi modificada com sucesso!");
            } 

        }

        leitor.close();
        
    }

}
