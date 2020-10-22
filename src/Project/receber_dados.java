package Project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class receber_dados {
	private List<Palavras> listPalavras = new ArrayList<Palavras>(); //Instanciando o ArrayList com a class Palavras
	
	
	public void pegar_dados_arq() {	
		String path = "C:\\Users\\jvcco\\Desktop\\Ex4_Parabens.txt"; //Caminho do arquivo.
		try (BufferedReader br = new BufferedReader(new FileReader(path))) { //Dessa maneira, j� instancia os recursos no bloco try.
			//Primeira linha															//Quando terminar o bloco try ou cair no catch j� haver� a desaloca��o dos recursos.
			String line = br.readLine(); //Ler de linha a linha. ReadLine() le a string at� a quebra de linha								
			while (line != null) { //Ler at� o final do arquivo.
				String[] palavrasDaLinha  = line.split(" "); //Recorta a string em partes dividindo por espa�o em branco e armazena em um vetor.
				//Vai pegar cada palavra da linha, dividindo por espa�o em branco, e armazenar em um vetor.
				for(String palavra : palavrasDaLinha) { //Para cada palavra na string PalavrasdaLinha fa�a:
		            if(!"".equals(palavra.trim())) { //Se n�o for espa�o em branco, salve na listPalavras
		            	
		            	Palavras palavras_class= new Palavras(palavra);
		            	this.listPalavras.add(palavras_class);  //Adicionar o Objeto no ArrayList
		            }
				}
				line = br.readLine(); //Quando line receber o null ele sai do arquivo. Significa que acabou o arquivo.
			}
			
		} 
		catch (IOException e) { //Classe gen�rica para o tratamento de erros de Entradas e Sa�das (Input/Output)
			System.out.println("Error: " + e.getMessage());
		}
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
	


