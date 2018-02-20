package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}
	
	public void adicionar(CiaAerea nova) {
		empresas.add(nova);
	}
	
	public ArrayList<CiaAerea> listarTodas() {
		ArrayList<CiaAerea> copia = new ArrayList<>();
		for(CiaAerea cia: empresas)
			copia.add(cia);
		return copia;				
	}
	
	public CiaAerea buscarCodigo(String cod) {
		for(CiaAerea cia: empresas)
			if(cod.equals(cia.getCodigo()))
				return cia;
		return null; // Não achei!
	}
	
	public CiaAerea buscarNome(String nome) {
		for(CiaAerea cia: empresas)
			if(nome.equals(cia.getNome()))
				return cia;
		return null; // Não achei!
	}
	
	
	
	
	
	
	
	
	
}
