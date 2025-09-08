package Clinte;

import Model.Tarefa;
import Services.TarefasControl;
import java.util.ArrayList;

public class Main {
    ArrayList<Tarefa> model = new ArrayList<>();
    TarefasControl controller = new TarefasControl(model);

}
