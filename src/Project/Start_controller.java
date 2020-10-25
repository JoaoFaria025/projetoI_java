package Project;

public class Start_controller {
	public  void start () {
	receber_dados dados = new receber_dados();
	dados.pegar_dados_arq();
	dados.exibir_elementos();
	/*dados.formatar_words();
	String aux = dados.removeAcents("√¡¡");//FUNCIONANDO RETIRAR ACENTOS
	System.out.println(aux);*/
	}
		
}
	   
	    
	
