package pucrs.myflight.modelo;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.time.Duration;

public class App {

	public static void main(String[] args) {

		GerenciadorCias gerCias = new GerenciadorCias();

		gerCias.adicionar(new CiaAerea("JJ", "LATAM Linhas Aéreas"));
		gerCias.adicionar(new CiaAerea("G3", "Gol Linhas Aéreas S/A"));
		gerCias.adicionar(new CiaAerea("TP", "TAP Portugal"));
		gerCias.adicionar(new CiaAerea("AD", "Azul Linhas Aéreas"));

		GerenciadorAeronaves gerAvioes = new GerenciadorAeronaves();

		gerAvioes.adicionar(new Aeronave("733", "Boeing 737-300", 140));
		gerAvioes.adicionar(new Aeronave("73G", "Boeing 737-400", 126));
		gerAvioes.adicionar(new Aeronave("380", "Airbus Industrie A380", 644));
		gerAvioes.adicionar(new Aeronave("764", "Boeing 767-400", 304));

		GerenciadorAeroportos gerAero = new GerenciadorAeroportos();

		gerAero.adicionar(new Aeroporto("POA", "Salgado Filho Intl",
                new Geo(-29.9939, -51.1711)));
		gerAero.adicionar(new Aeroporto("GRU", "São Paulo Guarulhos Intl",
                new Geo(-23.4356, -46.4731)));
		gerAero.adicionar(new Aeroporto("LIS", "Lisbon",
                new Geo(38.7742, -9.1342)));
		gerAero.adicionar(new Aeroporto("MIA", "Miami Intl Airport",
                new Geo(25.7933, -80.2906)));

		// Para facilitar a criação de rotas:

        CiaAerea latam = gerCias.buscarCodigo("JJ");
        CiaAerea gol   = gerCias.buscarCodigo("G3");
        CiaAerea tap   = gerCias.buscarCodigo("TP");
        CiaAerea azul  = gerCias.buscarCodigo("AD");

        Aeronave b733 = gerAvioes.buscarCodigo("733");
        Aeronave b73g = gerAvioes.buscarCodigo("73G");
        Aeronave a380 = gerAvioes.buscarCodigo("380");

		Aeroporto poa = gerAero.buscarCodigo("POA");
		Aeroporto gru = gerAero.buscarCodigo("GRU");
		Aeroporto lis = gerAero.buscarCodigo("LIS");
		Aeroporto mia = gerAero.buscarCodigo("MIA");

		GerenciadorRotas gerRotas = new GerenciadorRotas();

		Rota poagru = new Rota(latam, poa, gru, b733);
        Rota grupoa = new Rota(latam, gru, poa, b733);
        Rota grumia = new Rota(tap, gru, mia, a380);
        Rota grulis = new Rota(tap, gru, lis, a380);

		gerRotas.adicionar(poagru);
		gerRotas.adicionar(grupoa);
		gerRotas.adicionar(grumia);
		gerRotas.adicionar(grulis);

		LocalDateTime manhacedo = LocalDateTime.of(2018, 3, 29, 8, 0);
        LocalDateTime manhameio = LocalDateTime.of(2018, 4, 4, 10, 0);
        LocalDateTime tardecedo = LocalDateTime.of(2018, 4, 4, 14, 30);
        LocalDateTime tardetarde = LocalDateTime.of(2018, 4, 5, 17, 30);

        Duration curto = Duration.ofMinutes(90);
        Duration longo1 = Duration.ofHours(12);
        Duration longo2 = Duration.ofHours(14);

        GerenciadorVoos gerVoos = new GerenciadorVoos();

        gerVoos.adicionar(new Voo(poagru, manhacedo, curto));
        gerVoos.adicionar(new Voo(grupoa, manhameio, curto));
        gerVoos.adicionar(new Voo(grumia, manhacedo, longo1));
        gerVoos.adicionar(new Voo(grulis, tardecedo, longo2));
        gerVoos.adicionar(new Voo(grulis, tardetarde, longo2));

        for(Voo v: gerVoos.listarTodos())
            System.out.println(v);

		// Ex: criando objetos data e duração
		//LocalDateTime datahora1 = LocalDateTime.of(2017, 8, 14, 22, 3);
		//System.out.println("Data e hora: "+datahora1);
		
		//Duration duracao1 = Duration.ofMinutes(90); // 1:30
		//System.out.println("Duração: "+duracao1);
	}
}
