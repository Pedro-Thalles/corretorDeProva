package corretorDeProva;

public class Main{
	public static void main(String[] args) {
		String[] gabresp = new String[5];
		gabresp[0] = "A";
		gabresp[1] = "B";
		gabresp[2] = "C";
		gabresp[3] = "D";
		gabresp[4] = "E";
		double[] gabval = new double[5];
		gabval[0] = 2;
		gabval[1] = 2;
		gabval[2] = 2;
		gabval[3] = 2;
		gabval[4] = 2;
		
		String[] prova1resp = new String[5];
		
		prova1resp[0] = "A";
		prova1resp[1] = "B";
		prova1resp[2] = "B";
		prova1resp[3] = "D";
		prova1resp[4] = "E";
		
		String[] prova2resp = new String[5];
		prova2resp[0] = "C";
		prova2resp[1] = "A";
		prova2resp[2] = "B";
		prova2resp[3] = "D";
		prova2resp[4] = "E";
		
		prova prova1 = new prova();
		prova1.setNomeAluno("Fernand");
		prova1.setNumQuest(5);
		prova1.setResp(prova1resp);
		prova1.setValorQuest(gabval);
		
		prova prova2 = new prova();
		prova2.setNomeAluno("Pedro");
		prova2.setNumQuest(5);
		prova2.setResp(prova2resp);
		prova2.setValorQuest(gabval);
		
		gabarito gabarito = new gabarito();
		gabarito.setNumQuest(5);
		gabarito.setResp(gabresp);
		
		corretorAutomatico corretor = new corretorAutomatico();
		corretor.corrigirProva(prova1, gabarito);
		corretor.corrigirProva(prova2, gabarito);
		
	}
}