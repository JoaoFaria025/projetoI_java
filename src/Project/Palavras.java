package Project;

public class Palavras {
	
		private String palavra;
	
		public Palavras () {
		}
		
		
		public Palavras(String palavra) {
			super();
			this.palavra = palavra;

		}

		public String getPalavra() {
			return palavra;
		}

		public void setPalavra(String palavra) {
			this.palavra = palavra;
		}
		@Override
		public String toString() {
			return "Palavras [palavra=" + palavra + "]";
		}
		
		
}
