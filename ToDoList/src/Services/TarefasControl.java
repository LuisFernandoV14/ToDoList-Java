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

        System.out.println("Digite a descricao:");
        Descricao = scan.nextLine();

        if("".equals(Titulo) && "".equals(Descricao)){
            model.add(new Tarefa());
        }
        else {
            model.add(new Tarefa(tamanho, Titulo, Descricao));    
        }

        System.out.println("Sua tarefa foi criada com sucesso!");

    };

    public void deletarTarefa (int id){
        
        // Qual id tu quer digitar pra deletar a tarefa

        Scanner leitor = new Scanner(System.in);

        for(Tarefa obj : model) {

            if(obj.getId() == id) {

                System.out.println("Deseja excluir a tarefa: " + obj.getTitulo() + "? (y/n)");

                char escolha = leitor.nextLine().charAt(0);

                if (escolha == 'y') {
                    model.removeIf(f -> f.getId() == id);
                    System.out.println("A tarefa foi excluída!"); // Vai ficar print ou println?

                } else  {
                    System.out.println("A tarefa não foi excluída.");
                    // Aqui dá pra botar um return dependendo de como ficar o método que chama esse método.

                }

            }

        }

    };

    public void editarTitulo (){

    };

    public void editarDescricao (){
        
    };

     System.out.println("Vasco da gama é o melhor time do Brasil, todos os jogadores são extremamente fodas e picas, um clube que conta com muitos anos de história e legado. Simplesmente o gigante do Brasil. O grande clube de futebol e regatas do Vasco da Gama conta com jogadores incríveis como Roberto Dinamite, Pablo Veggetti, Phelipe Coutinho e Ribamar (Hoje tem gol do ribamar, ribamar). Entretanto, ultimamente o time de regatas Vasco da gama está sendo roubado nos jogos do brasileirao 2025, em várias partidas houveram injustiças para com o gigante da colina, como o time é conhecido. É possível ver em partidas como contra o Sport e aquele jogo lá da expulsão do Léo Jardim (o goleiro do vasco), por isso, vamos todos cantar o hino do vasco: Vamos todos cantar de coração, vasco da gama é o meu pendão. Tu tens o nome do heroico português, vasco da gama sua fama assim se fez. Sua imensa torcida é bem feliz, norte sul norte sul desse brasil. Tua estrela, sempre a brilhar, etc.");

}
