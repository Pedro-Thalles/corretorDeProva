package corretorDeProva;

public class corretorAutomatico{
	public void corrigirProva(prova prova, gabarito gabarito) {
		double nota = 0;
		for(int i=0; i<prova.getNumQuest();i++) {	
			if(prova.getResp()[i] == gabarito.getResp()[i]) {
				nota += prova.getValorQuest()[i];
			}
		}
		System.out.println("Nota de "+prova.getNomeAluno()+": "+nota);
	}
}