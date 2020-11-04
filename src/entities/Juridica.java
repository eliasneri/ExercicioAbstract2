package entities;

public class Juridica extends Pessoa{

	private Double rendaAnual;
	private Integer numeroFuncionarios;
	
	public Juridica () {
		super();
	}
	
	public Juridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome);
		this.rendaAnual = rendaAnual;
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double imposto() {
		double imposto=0;
		if (numeroFuncionarios <=10) 
			imposto = rendaAnual * 0.16;
		 else
			imposto = rendaAnual * 0.14;
		
		return imposto;
	}
	

}
