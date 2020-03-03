package negocio;

public abstract class Calculo implements ICalculo {
	protected float valor1, valor2;
	protected float resultado;
	

	public void setValor1(float valor1) {
		this.valor1 = valor1;
	}

	public void setValor2(float valor2) {
		this.valor2 = valor2;
	}

	public float getResultado() {
		return resultado;
	}
	
	public void calcular() {};
	

	
	

}
