package Ariketa_03;

public class Kotxea {

	private int abiadura;
	
	public Kotxea() {
		abiadura = 0;
	}
	
	public int getAbiadura() {
		return abiadura;
	}
	
	public void bizkortu(int zenbat) {
		abiadura = abiadura + zenbat;
	}
	
	public void geldotu(int zenbat) {
		abiadura = abiadura + zenbat;
		if (abiadura < 0) {
			abiadura = 0;
		}
	}
}
