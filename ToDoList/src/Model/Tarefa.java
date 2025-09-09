package Model;

import java.time.LocalDate;

public class Tarefa {
	private int id;
	private String titulo;
	private String descricao;
	private LocalDate data_inicio;
	private LocalDate data_concluido;
	private Boolean concluido;
	
	public Tarefa() {
		this.id = 0;
		this.titulo = "Insira o título";
		this.descricao = "Insira a descricao aqui"; 
		this.data_inicio = LocalDate.now();
		this.concluido = false;
	}

	public Tarefa(int id,String titulo, String descricao) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao; 
		this.data_inicio = LocalDate.now();
		this.concluido = false;
	}
	
	public Tarefa(int id, String titulo) {
		this(id, titulo, "");
		
	}
	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDate getData_concluido() {
        return data_concluido;
    }

    public void setData_concluido(LocalDate data_concluido) {
        this.data_concluido = data_concluido;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }
}

