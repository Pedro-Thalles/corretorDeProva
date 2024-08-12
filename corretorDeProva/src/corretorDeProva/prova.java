package corretorDeProva;

public class prova{
	private String nomeAluno;
	private int numQuest;
	private String[] resp;
	private double[] valorQuest;
	
	public String getNomeAluno() {
		return this.nomeAluno;
	}
	public int getNumQuest() {
		return this.numQuest;
	}
	public String[] getResp() {
		return this.resp;
	}
	public double[] getValorQuest(){
		return this.valorQuest;
	}
	public void setNomeAluno(String nome) {
		this.nomeAluno = nome;
	}
	public void setNumQuest(int num) {
		this.numQuest = num;
	}
	public void setResp(String[] resp) {
		this.resp = resp;
	}
	public void setValorQuest(double[] valor){
		this.valorQuest = valor;
	}
	
}