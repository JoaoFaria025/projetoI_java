package Project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

public class receber_dados {
	private List<Palavras> listPalavras = new ArrayList<Palavras>(); //Instanciando o ArrayList com a class Palavras
	private String aux = "ááÀ.";//CORSI -----> retirar serve so pra ver q ta rodando
	
	public void pegar_dados_arq() {	
		String path = "C:\\Users\\htols\\Desktop\\Ex4_Parabens.txt"; //Caminho do arquivo.
		try (BufferedReader br = new BufferedReader(new FileReader(path))) { //Dessa maneira, já instancia os recursos no bloco try.
			//Primeira linha															//Quando terminar o bloco try ou cair no catch já haverá a desalocação dos recursos.
			String line = br.readLine(); //Ler de linha a linha. ReadLine() le a string até a quebra de linha								
			while (line != null) { //Ler até o final do arquivo.
				String[] palavrasDaLinha  = line.split(" "); //Recorta a string em partes dividindo por espaço em branco e armazena em um vetor.
				//Vai pegar cada palavra da linha, dividindo por espaço em branco, e armazenar em um vetor.
				for(String palavra : palavrasDaLinha) { //Para cada palavra na string PalavrasdaLinha faça:
		            if(!"".equals(palavra.trim())) { //Se não for espaço em branco, salve na listPalavras
		            	
		            	Palavras palavras_class= new Palavras(palavra);
		            	this.listPalavras.add(palavras_class);  //Adicionar o Objeto no ArrayList
		            }
				}
				line = br.readLine(); //Quando line receber o null ele sai do arquivo. Significa que acabou o arquivo.
			}
			
		} 
		catch (IOException e) { //Classe genérica para o tratamento de erros de Entradas e Saídas (Input/Output)
			System.out.println("Error: " + e.getMessage());
		}
	}
	public static String removeAcents(String str) { //CORSI -----> POE A LISTA P RECEBER
	    return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}
	
	public void formatar_words() {
		System.out.println("-----------\nRECEBER_DADOS\n-----------");
		String recebe = aux.toLowerCase();//mínusculas CORSI -----> POE A LISTA P RECEBER 
		System.out.println(aux);//TESTE P/ VERIFICAR SE DEIXA MINUSCULO	---> RETIRAR DPS
	}
	
	public List<Palavras> getListPalavras() {
		return listPalavras;
	}

	public void setListPalavras(List<Palavras> listPalavras) {
		this.listPalavras = listPalavras;
	}
	
	public void exibir_elementos() {
		for (int i = 0; i <getListPalavras().size(); i++) {
			System.out.println(getListPalavras().get(i));	

	}
		
			
	}
}
	


