package Clinte;

import Model.Tarefa;
import Services.TarefasControl;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        ArrayList<Tarefa> model = new ArrayList<>();
        TarefasControl controller = new TarefasControl(model);
        
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("===========================================");
            System.out.println("|Selecione uma opcao:                     |");
            System.out.println("|1. Criar Tarefa                          |");
            System.out.println("|2. Deletar Tarefa                        |");
            System.out.println("|3. Editar Titulo                         |");
            System.out.println("|4. Editar Descrição                      |");
            System.out.println("|5. Concluir Tarefa                       |");
            System.out.println("|6. Listar Tarefas                        |");
            System.out.println("===========================================");

            String optStr = scan.nextLine();
            int opt = Integer.parseInt(optStr);

            switch(opt){
                case 1:
                    controller.criarTarefa();
                    break;

                case 2:
                    controller.deletarTarefa();
                    break;

                case 3:
                    controller.editarTitulo();
                    break;

                case 4:
                    controller.editarDescricao();
                    break;
                case 5:
                    controller.concluirTarefa();
                    break;
                case 6:
                    controller.listarTarefas();
                    break;        
            }

            int buffer = scan.nextInt();
            scan.nextLine();

            System.out.println("Deseja continuar? [y/n]");
            String cont = scan.nextLine();

            if("n".equals(cont)){
                break;
            }
        }
    }
}
