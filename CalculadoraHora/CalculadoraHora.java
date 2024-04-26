package CalculadoraHora;
	import java.util.Scanner;

		public class CalculadoraHora {
			public static void main(String[] args) {
				Scanner scanner = new Scanner (System.in);
//primeira palavra se refere ao tipo de variavel que a segunda palavra nomeia.
// o = recebe o valor do comando adiante.
// se chama o metodo que foi criado.
				// o que está em pareteses diz que o sistema recebe.
					System.out.println("Quantas Horas você trabalha por dia ?");
						double horaTrabalhada = scanner.nextDouble();
// de novo é declarado o tipo de variavel a ser nomeada.
// o sinal de = diz que a variavel recebe o valor do metodo com uma ação.
// o next doule é uma ação do metodo scanner.		
//Para o script.
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
