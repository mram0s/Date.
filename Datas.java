import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Datas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*LocalTime horaAgora = LocalTime.now();
		System.out.println(horaAgora.getHour()+":"+horaAgora.getMinute());
		
		LocalTime meioDia = LocalTime.of(12, 0);
		System.out.println(meioDia);
		
		Duration dif = Duration.between(meioDia, horaAgora);
		System.out.println(dif);
		
		long horasPassadas = ChronoUnit.HOURS.between(meioDia, horaAgora);
		long minutosPassados = ChronoUnit.MINUTES.between(meioDia, horaAgora);
		
		System.out.println("Tempo passado: "+horasPassadas+":"+(minutosPassados - horasPassadas*60));*/
		
		/*LocalDateTime dataHrSaidaSP = LocalDateTime.of(2014,9,2,4,20);
		LocalDateTime dataHrChegadaNY = LocalDateTime.of(2014,9,2,11,0);
		
		ZoneId fusoSP = ZoneId.of("America/Sao_Paulo");
		ZoneId fusoNY = ZoneId.of("America/New_York");
		
		ZonedDateTime dataHrSP = ZonedDateTime.now(fusoSP);
		ZonedDateTime dataHrNY = ZonedDateTime.now(fusoNY);
		
		ZonedDateTime dataHrSaidaSPFuso = ZonedDateTime.of(dataHrSaidaSP, fusoSP);
		ZonedDateTime dataHrChegadaNYFuso = ZonedDateTime.of(dataHrChegadaNY, fusoNY);
		
		Duration tempoVoo = Duration.between(dataHrSaidaSPFuso, dataHrChegadaNYFuso);
		System.out.println("Tempo de vôo: "+tempoVoo);*/
		
		/*Instant agora = Instant.now();
		System.out.println(agora);
		
		for(int i=0; i<100000; i++){}
		Instant depois = Instant.now();
		Duration tempoExec = Duration.between(agora, depois);
		System.out.println("Tempo de execução: "+tempoExec.toMillis());*/
		
		/*LocalDate dataHoje = LocalDate.now();
		System.out.println(dataHoje);
		
		LocalDate torresGemeas = LocalDate.of(2001, 9, 11);
		System.out.println(torresGemeas);
		
		Period diferenca = Period.between(torresGemeas, dataHoje);
		System.out.println(diferenca);
		
		System.out.println(diferenca.getYears()+" anos, "+diferenca.getMonths()+" meses e "+diferenca.getDays()+" dias");*/
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate torresGemeas = LocalDate.of(2001, 9, 11);
		System.out.println(torresGemeas.format(formatador));
		
	}

}
