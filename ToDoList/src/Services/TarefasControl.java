package Services;

import Model.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;

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

    public void deletarTarefa (){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o id da tarefa.");
        int id = leitor.nextInt();

        for(Tarefa obj : model) {

            if(obj.getId() == id) {

                System.out.println("Deseja excluir a tarefa: " + obj.getTitulo() + "? (y/n)");

                char escolha = leitor.nextLine().charAt(0);

                if (escolha == 'y') {
                    model.removeIf(f -> f.getId() == id);
                    System.out.println("A tarefa foi excluída!");

                    return;
                }

            }

        }

        leitor.close();

        System.out.println("Tarefa não existe.");
        return;
        
    }

    public void editarTitulo (){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o id da tarefa.");
        int id = scan.nextInt();

        for(Tarefa obj : model){
            
            if(obj.getId() == id){
                System.out.println("Digite o novo título.");
                String novoTitulo = scan.nextLine();

                obj.setTitulo(novoTitulo);

                System.out.println("O titulo foi modificado com sucesso!");
                return;
            }
        }    

        scan.close();   

        System.out.println("Tarefa não existe.");
        return; 
    }

    public void editarDescricao (){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o id da tarefa.");
        int id = leitor.nextInt();
        
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

                return;
            } 

        }

        leitor.close();
        

        System.out.println("Tarefa não existe.");
        return;
    }

    public void concluirTarefa(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o id da tarefa.");
        int id = scan.nextInt();

        for(Tarefa obj : model){

            if(obj.getId() == id){
                obj.setConcluido(true);
                obj.setData_concluido(LocalDateTime.now());

                System.out.println("Tarefa" + obj.getId() + "concluida com sucesso!");
                return;
            }

        }

        System.out.println("Tarefa não existe.");
        return;
    }

    public void listarTarefas(){
        int tamanho = model.size();

        if(tamanho < 1){
            System.out.println("Lista de tarefas não existe.");
            return;
        } 
        else {

            System.out.println("===============================================");
            System.out.println("Atividades");
            System.out.println("===============================================");

            for(Tarefa obj : model){
                System.out.println("Id:" + obj.getId() + "\n" + "Titulo:" + obj.getTitulo() + "\n" + "Descrição:" + obj.getDescricao() + "\n" + "Data Inicio:" + obj.getData_inicio() + "Data Concluido:" + obj.getData_concluido() + "\n" + "Concluido?" + obj.getConcluido());
            }

            System.out.println("===============================================");

        }

    }
}
