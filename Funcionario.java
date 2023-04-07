package ProgramaFuncionario;

public class Funcionario {
	private double salario;
	private long registro;
	private boolean estaAtivo;
	private String nome;
	private String Departamento;
	private String rg;
	public Funcionario(double salario, long registro, boolean estaAtivo, String nome,String Departamento, String rg) {
	this.salario = salario;
	this.registro = registro;
	this.estaAtivo = estaAtivo;
	this.nome = nome;
	this.Departamento = Departamento;
	this. rg = rg;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public long getRegistro() {
		return registro;
	}
	public void setRegistro(long registro) {
		this.registro = registro;
	}
	public boolean isEstaAtivo() {
		return estaAtivo;
	}
	public void setEstaAtivo(boolean estaAtivo) {
		this.estaAtivo = estaAtivo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return Departamento;
	}
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
    public String toString() {
        return "\nFuncionario{" +
                "\nNome=" + nome  +
                ", \nregistro='" + registro + '\'' +
                ", \nestaAtivo ='" +  estaAtivo + '\'' +
                 ", \nDepartamento ='" + Departamento   + '\'' +
                  ", \nRG ='" + rg   + '\'' +
                ", \nSalario='" + salario + '\'' +
                   '}';
    }
	
	public void bonificar(double valor) {
		salario  = salario + valor;
		System.out.println("Com uma bonificação de "+ valor + " reais " +" Seu novo salario será: " + salario);
	 
		
	}
	public void imprimir() {
		System.out.println("\nNome:" +nome+ "\nsalario:"+ salario + "\nSeu departamento é:" +Departamento+ "\nregistro:"+registro+"\nEsta ativo?"+estaAtivo+"\nRG:"+rg);
	}


}


