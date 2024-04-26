package CalculadoraHora;
	import java.util.Scanner;

		public class CalculadoraHora {
			
			public static void main(String[] args) {

				Scanner scanner = new Scanner (System.in);
					System.out.println("Quantas Horas você trabalha por dia ?");
						double horaTrabalhada = scanner.nextDouble();
					System.out.println("Quantos dias você Trabalha no mês ?");
						double diasTrabalhados = scanner.nextDouble();
					System.out.println("Qual é o valor do seu sálario ?");
						double valorSalario = scanner.nextDouble();					
							double valorHoraTrabalhada = (valorSalario / diasTrabalhados / horaTrabalhada);
					String valorHoraTrabalhadaFormatada = String.format("%.2f", valorHoraTrabalhada);
						System.out.println ("A sua hora de trabalho vale R$:" + (valorHoraTrabalhadaFormatada) + ".");
				scanner.close();
		
			}

	}

