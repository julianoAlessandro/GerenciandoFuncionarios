import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarFuncionario {
	Scanner  leia = new Scanner(System.in);
    public static List<Funcionario> listFuncionarios = new ArrayList<>();
    
	

	public static void main(String[] args) {
	  GerenciarFuncionario  gf = new GerenciarFuncionario();
	  int opcao = 0;
	  do {
		  System.out.println("================Bem vindo ao Menu de Escolhas============");
		  System.out.println("===========================================================");
		  System.out.println("Digite 1 para Cadastrar funcionarios");
		  System.out.println("Digite 2 para Consultar um  funcionario especifico:");
		  System.out.println("Digite 3 para bonficar um unico funcionario");
		  System.out.println("Digite 4 para bonficar todos os funcionarios");
		  System.out.println("Digite 5 para Mostrar todos os funcionários:");
		  System.out.println("Digite 9 para sair");
		  opcao = Integer.parseInt(gf.leia.nextLine());// estamos evitando a buferização
		  switch(opcao) {
		  case 1:
			  gf.execCadastrar();
			  break;
		  case 2:
			  gf.execConsultarUnico();
			  break;
		  case 3:
			  gf.execBonificarUnico();
			  break;
		  case 4:
			  gf.execBonificar();
			  break;
		  case 5:
			  gf.execMostrarFuncionarios();
			  break;
		  case 9:
			  System.out.println("Programa encerrado ! obrigado pela participação");
			  break;
		default:
			System.out.println("Escolha inválida");
			  
		  }
		  
	  }while(opcao != 9);

	}
	// métodos fora do main
	public void execCadastrar() {
		System.out.println("=========Cadastro de Funcionarios======");
		System.out.println("Informe seu salario:");
		double salario = Double.parseDouble(leia.nextLine());
		System.out.println("Informe o seu registro");
		long registro = Long.parseLong(leia.nextLine());
		System.out.println("Está ativo?");
		boolean estaAtivo = Boolean.parseBoolean(leia.nextLine());
		System.out.println("Informe seu nome:");
		String nome = (leia.nextLine());
		
		Funcionario funcionarios = new Funcionario(salario,registro,estaAtivo,nome);
		listFuncionarios.add(funcionarios);
		
	}
	
	public void execConsultarUnico() {
		System.out.println("Informe o registro do seu funcionario:");
		long registro = Long.parseLong(leia.nextLine());
		for(Funcionario funcionarios: listFuncionarios) {
			if(funcionarios.getRegistro() == registro) {
				System.out.println("Esses são os dados especificos da conta "+ funcionarios.getNome());
				funcionarios.imprimir();
				break;
				
				
			}
			else {
				System.out.println("Registro inválido");
				break;
				
			}
			
			
		}
		
	}
	public void execBonificarUnico() {
		System.out.println("Bem vindo ao Sistema de Bonificação unica escolha um funcionario para bonifcar:");
		System.out.println("Informe o registro do funcionario que deseja registrar:");
		long registro = Long.parseLong(leia.nextLine());
		for(Funcionario funcionarios: listFuncionarios) {
			if(funcionarios.getRegistro() == registro) {
				funcionarios.bonificar(200);
				break;
			
				
			
				
				
			}
			else {
				
				System.out.println("Registro não encontrado");
				break;
									
					
						
					}
			
			
		}
		
		
	}
	
	public void  execBonificar() {
		for(Funcionario funcionarios: listFuncionarios) {
			funcionarios.bonificar(300);
			
		}
		
		
	}
	
	public void execMostrarFuncionarios() {
		System.out.println("====\nSegue abaixo os registros dos funcionarios:======");
		for( int i = 0; i < listFuncionarios.size(); i++ ) {
			System.out.println("\nEsses são seus dados dos funcionarios cadastrados: "+ listFuncionarios);
			
			
		}
	}


}
