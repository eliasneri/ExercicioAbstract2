package entities;

public class Fisica extends Pessoa {
	private Double rendaAnual;
	private Double gastosSaude;
	
	
	public Fisica () {
		super();
	}
	
	public Fisica(String nome, Double rendaAnual, Double gastosSaude) {
	super(nome);
	this.rendaAnual = rendaAnual;
	this.gastosSaude = gastosSaude;
	}
	
	
	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		double imposto=0;
		if (rendaAnual <=20000.00) {
			if (gastosSaude !=0) {
				imposto = (rendaAnual * 0.15) - (gastosSaude * 0.5);
			} else
				{
				imposto = (rendaAnual * 0.15);
				}
		}
		
		if (rendaAnual > 20000.00) {
			if (gastosSaude !=0) {
				imposto = (rendaAnual * 0.25) - (gastosSaude * 0.5);
			} else
				{
				imposto = (rendaAnual * 0.25);
				}
			
		}
		
		return imposto;
	}
	

}
