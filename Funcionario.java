

public class Funcionario {
	private double salario;
	private long registro;
	private boolean estaAtivo;
	private String nome;
	public Funcionario(double salario, long registro, boolean estaAtivo, String nome) {
	this.salario = salario;
	this.registro = registro;
	this.estaAtivo = estaAtivo;
	this.nome = nome;
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
	private String Departamento;
	private String rg;
	
	@Override
    public String toString() {
        return "\nFuncionario{" +
                "\nsalario=" + salario  +
                ", \nregistro='" + registro + '\'' +
                ", \nestaAtivo ='" +  estaAtivo + '\'' +
                ", \nnome='" + nome + '\'' +
                   '}';
    }
	
	public void bonificar(double valor) {
		double bonificar  = salario + valor;
		System.out.println("Com uma bonificação de "+ valor + " reais" +"Seu novo salario será: " + bonificar);
	 
		
	}
	public void imprimir() {
		System.out.println("\nNome:" +nome+ "\nsalario:"+ salario+"\nregistro:"+registro+"\nEsta ativo?"+estaAtivo);
	}


}


