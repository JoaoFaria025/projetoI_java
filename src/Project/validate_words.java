package Project;

import java.util.List;

public class validate_words extends receber_dados {
private String aux = "JO�O.";
	public void formatar_words() {
			String recebe = aux.toLowerCase();//minusculas
			System.out.println("-----------\nRECEBER_DADOS\n-----------");
			recebe = recebe.replace(".", "");//substitui a acentua��o por vazio
			recebe = recebe.replace("�", "a");
			System.out.println(recebe);



		}

	}

