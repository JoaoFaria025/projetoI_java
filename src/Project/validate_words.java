package Project;

import java.util.List;

public class validate_words extends receber_dados {
private String aux = "JOÃO.";
	public void formatar_words() {
			String recebe = aux.toLowerCase();//minusculas
			System.out.println("-----------\nRECEBER_DADOS\n-----------");
			recebe = recebe.replace(".", "");//substitui a acentuação por vazio
			recebe = recebe.replace("ã", "a");
			System.out.println(recebe);



		}

	}

