package colaboradores;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		
		System.out.println();
		Colaborador designer = new UIDesigner("Roberto", "111", Genero.MASCULINO, 2500,
				"222", LocalDate.of(2024, 1, 1), ModeloContratacao.CONTRATO,
				Senioridade.ESTAGIARIO, Status.ACTIVED);
		
		Colaborador devFront = new DevFrontEnd("Rayane", "111", Genero.FEMININO, 2500,
				"222", LocalDate.of(2024, 1, 1), ModeloContratacao.CLT,
				Senioridade.JUNIOR, Status.STANDINGBY);
		
		Colaborador devBack = new DevBackEnd("Jose", "111", Genero.MASCULINO, 2500,
				"222", LocalDate.of(2024, 1, 1), ModeloContratacao.PJ,
				Senioridade.PLENO, Status.DESACTIVATED);
		
		designer.visualizarDadosColaborador();
		devFront.visualizarDadosColaborador();
		devBack.visualizarDadosColaborador();
		
	}

}
