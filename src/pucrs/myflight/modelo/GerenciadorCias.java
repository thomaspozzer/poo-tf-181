package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;

    public GerenciadorCias() {
        this.empresas = new ArrayList<>();
    }

    public ArrayList<CiaAerea> listarTodas() {
        return new ArrayList<>(empresas);
    }

    public void adicionar(CiaAerea cia1) {
        empresas.add(cia1);
    }

    public CiaAerea buscarCodigo(String cod) {
        for(CiaAerea cia: empresas)
            if(cia.getCodigo().equals(cod))
                return cia;
        return null;
    }
}
