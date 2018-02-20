package pucrs.myflight.modelo;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.time.Duration;

public class App {

	public static void main(String[] args) {
		GerenciadorCias gerCias = new GerenciadorCias();
		
		CiaAerea cia1 = new CiaAerea("JJ", "LATAM");
		CiaAerea cia2 = new CiaAerea("G3", "Gol");
		CiaAerea cia3 = new CiaAerea("TP", "TAP");
		
		gerCias.adicionar(cia1);
		gerCias.adicionar(cia2);
		gerCias.adicionar(cia3);
		
		// Teste: buscando cia pelo código
		CiaAerea result = gerCias.buscarCodigo("G3");
		if(result != null) {
			System.out.println("cia: "+result.getNome());
		}
		
		// Ex: criando objetos data e duração
		LocalDateTime datahora1 = LocalDateTime.of(2017, 8, 14, 22, 3);
		System.out.println("Data e hora: "+datahora1);		
		
		Duration duracao1 = Duration.ofMinutes(90); // 1:30
		System.out.println("Duração: "+duracao1);
	}
}
