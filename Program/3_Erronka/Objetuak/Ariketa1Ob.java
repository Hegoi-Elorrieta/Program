package Objetuak;

public class Ariketa1Ob {
	
	String probintzia;
	String matrikula;
	String udalerria;
	String motorra;
	
	public Ariketa1Ob(String probintzia, String matrikula, String udalerria, String motorra) {
		this.probintzia = probintzia;
		this.matrikula = matrikula;
		this.udalerria = udalerria;
		this.motorra = motorra;
	}

	public String getProbintzia() {
		return probintzia;
	}

	public void setProbintzia(String probintzia) {
		this.probintzia = probintzia;
	}

	public String getMatrikula() {
		return matrikula;
	}

	public void setMatrikula(String matrikula) {
		this.matrikula = matrikula;
	}

	public String getUdalerria() {
		return udalerria;
	}

	public void setUdalerria(String udalerria) {
		this.udalerria = udalerria;
	}

	public String getMotorra() {
		return motorra;
	}

	public void setMotorra(String motorra) {
		this.motorra = motorra;
	}
	
	public Ariketa1Ob() {
		probintzia = "";
		matrikula = "";
		udalerria = "";
		motorra = "";
	}

}
