package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Quanto Contribuinter irá cadastrar? :");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			sc.nextLine();
			System.out.println("Dados do Contribuinte #"+i);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Pessoa Física, ou Juridica? (f/j): ");
			char op = sc.next().charAt(0);
			
				if (op == 'f' || op == 'F') {
					System.out.print("Renda Anual: ");
					double rendaAnual = sc.nextDouble();
					System.out.print("Gastos com Saúde: ");
					double gastosSaude = sc.nextDouble();
					list.add(new Fisica(nome, rendaAnual, gastosSaude));
				
				} else if (op =='j' || op == 'J') {
				
					System.out.print("Renda Anual: ");
					double rendaAnual = sc.nextDouble();
					System.out.print("Número de funcionários: ");
					int numeroFuncionarios = sc.nextInt();
					list.add(new Juridica(nome, rendaAnual, numeroFuncionarios));
				
				} else {
				System.out.println("Opção Inválida!!");
				}
				
		System.out.println();	
		}
					
		System.out.println("Total dos Impostos!");
		
		double totImposto=0;
		for (Pessoa l : list) {
			System.out.println(l.getNome() + ": $" + String.format("%.2f", l.imposto()));
			totImposto += l.imposto();
		}
		
		System.out.printf("Valor total $%.2f", totImposto);
		sc.close();
	}

}
