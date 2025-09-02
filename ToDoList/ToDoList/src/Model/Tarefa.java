package Model;

import java.time.LocalDateTime;

public class Tarefa {
	private Long id;
	private String titulo;
	private String descricao;
	private LocalDateTime data_inicio;
	private LocalDateTime data_concluido;
	private Boolean concluido;
	
	public Tarefa() {
		this.data_inicio = LocalDateTime.now();
		this.concluido = false;
	}
	
	public Tarefa(Long id, String titulo) {
		this.id = id;
	}
}
