package Projeto;

public abstract class Planta {
	
	private String raiz;
	private String aspecto;
	private String clima;
	
	abstract public void trocarTerra();
	abstract public void reporTerra();
	abstract public void regar();
	abstract public void pararDeRegar();
	abstract public void tirarDoSol();
	abstract public void colocarNoSol();
	
	
	public Planta(String raiz,String aspecto,String clima) {
		this.raiz = raiz;
		this.aspecto = aspecto;
		this.clima = clima;
	}
	
	public String getRaiz() {
		return raiz;
	}
	public void setRaiz(String raiz) {
		this.raiz = raiz;
	}
	public String getAspecto() {
		return aspecto;
	}
	public void setAspecto(String aspectoPlanta) {
		this.aspecto = aspectoPlanta;
	}
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	
	

}
