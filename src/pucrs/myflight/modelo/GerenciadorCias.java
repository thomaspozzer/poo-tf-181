package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;

    public GerenciadorCias() {
        this.empresas = new ArrayList<>();
    }

    public ArrayList<CiaAerea> listarTodas() {
        ArrayList<CiaAerea> aux = new ArrayList<>();
        for(int pos=0; pos < empresas.size(); pos++)
            aux.add(empresas.get(pos));
        return aux;
    }
}
