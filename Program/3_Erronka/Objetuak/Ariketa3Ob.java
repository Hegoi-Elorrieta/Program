package Objetuak;

public class Ariketa3Ob {
	
	String izena;
	int adina;
	String nan;
	String sexua;
	float pisua;
	float altuera;
	
	public Ariketa3Ob(String izena, int adina, String nan, String sexua, float pisua, float altuera) {
		this.izena = izena;
		this.adina = adina;
		this.nan = nan;
		this.sexua = sexua;
		this.pisua = pisua;
		this.altuera = altuera;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public int getAdina() {
		return adina;
	}

	public void setAdina(int adina) {
		this.adina = adina;
	}

	public String getNan() {
		return nan;
	}

	public void setNan(String nan) {
		this.nan = nan;
	}

	public String getSexua() {
		return sexua;
	}

	public void setSexua(String sexua) {
		this.sexua = sexua;
	}

	public float getPisua() {
		return pisua;
	}

	public void setPisua(float pisua) {
		this.pisua = pisua;
	}

	public float getAltuera() {
		return altuera;
	}

	public void setAltuera(float altuera) {
		this.altuera = altuera;
	}
	
	public Ariketa3Ob () {
		izena = "";
		adina = 0;
		nan = "";
		sexua = "";
		pisua = 0;
		altuera = 0;
	}

}
