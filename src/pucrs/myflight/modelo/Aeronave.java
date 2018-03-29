package pucrs.myflight.modelo;

public class Aeronave {
	private String codigo;
	private String descricao;
	private int capacidade;
	
	public Aeronave(String codigo, String descricao, int cap) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.capacidade = cap;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public int getCapacidade() {
		return capacidade;
	}

    @Override
    public String toString() {
        return codigo + " - " + descricao + " (" + capacidade + ")";
    }
}
