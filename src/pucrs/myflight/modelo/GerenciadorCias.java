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
}
