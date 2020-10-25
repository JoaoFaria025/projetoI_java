package Project;

import java.text.Normalizer;
import java.util.List;

public class validate_words extends receber_dados { //Reecebe uma list e transformas as letras em mínusculas e retira a pontuação
private String aux = "ááÀ.";//CORSI -----> retirar serve so pra ver q ta rodando
	public void formatar_words() {
		System.out.println("-----------\nRECEBER_DADOS\n-----------");
		String recebe = aux.toLowerCase();//mínusculas CORSI -----> POE A LISTA P RECEBER 
		System.out.println(aux);//TESTE P/ VERIFICAR SE DEIXA MINUSCULO	---> RETIRAR DPS
		}
	public static String removeAcents(String str) { //CORSI -----> POE A LISTA P RECEBER
	    return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}
	
	/*
	@Override
	public List<Palavras> getListPalavras() {
		for(int i = 0;i<getListPalavras().size();i++) {
			aux = getListPalavras().get(i).toString();
			System.out.println("A");
		}
		return super.getListPalavras();
	}*/

	
	}

