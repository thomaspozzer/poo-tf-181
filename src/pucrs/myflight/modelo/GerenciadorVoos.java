package pucrs.myflight.modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorVoos {

    private ArrayList<Voo> voos;

    public GerenciadorVoos() {
        this.voos = new ArrayList<>();
    }

    public void adicionar(Voo r) {
        voos.add(r);
    }

    public ArrayList<Voo> listarTodos() {
        return new ArrayList<>(voos);
    }

    public ArrayList<Voo> buscarData(LocalDate data) {
       ArrayList<Voo> result = new ArrayList<>();
       for(Voo v: voos)
           if(v.getDatahora().toLocalDate().equals(data))
               result.add(v);
       return result;
    }
}
