package Model;

import java.time.LocalDateTime;

public class Tarefa {
	private int id;
	private String titulo;
	private String descricao;
	private LocalDateTime data_inicio;
	private LocalDateTime data_concluido;
	private Boolean concluido;
	
	public Tarefa() {
		this.id = 0;
		this.titulo = "Insira o título";
		this.descricao = "Insira a descricao aqui"; 
		this.data_inicio = LocalDateTime.now();
		this.concluido = false;
	}

	public Tarefa(int id,String titulo, String descricao) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao; 
		this.data_inicio = LocalDateTime.now();
		this.concluido = false;
	}
	
	public Tarefa(int id, String titulo) {
		this.id = id;
		this.titulo = titulo;
		this(id, titulo, "");
	}
}
