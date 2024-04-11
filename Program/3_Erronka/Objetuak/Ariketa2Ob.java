package Objetuak;

public class Ariketa2Ob {
	
	String izena;
	String abizena;
	int adina;
	boolean ezkondua;
	String nan;
	
	public Ariketa2Ob(String izena, String abizena, int adina, boolean ezkondua, String nan) {
		this.izena = izena;
		this.abizena = abizena;
		this.adina = adina;
		this.ezkondua = ezkondua;
		this.nan = nan;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public int getAdina() {
		return adina;
	}

	public void setAdina(int adina) {
		this.adina = adina;
	}

	public boolean isEzkondua() {
		return ezkondua;
	}

	public void setEzkondua(boolean ezkondua) {
		this.ezkondua = ezkondua;
	}

	public String getNan() {
		return nan;
	}

	public void setNan(String nan) {
		this.nan = nan;
	}
	
	public Ariketa2Ob() {
		izena = "";
		abizena = "";
		adina = 0;
		ezkondua = false;
		nan = "";
	}

}
