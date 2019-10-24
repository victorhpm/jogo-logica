/**
 * @author Eduardo dos Santos 00189290
 * @author Victor Machado 00188118
 * Exercicio para matéria de TDD
 * Usando JUnit 4
 */
package logica;

import java.util.Scanner;
import org.junit.Assert;

public class Test {

	/**
	 * Para o teste passar deve inserir os seguintes valores
	 * A = 1
	 * B = 4
	 * C = 2
	 * D = 3
	 * E = 5
	 */
	@org.junit.Test
	public void Solucao() {
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3, num4, num5;
		boolean primeira_equacao = false;
		boolean segunda_equacao = false;
		boolean terceira_equacao = false;
		
		System.out.println("Equação: \n E = A + 4 \n C = A + 1 \n D = C + 1");
		
		System.out.println("Insira o primeiro número (A): ");
		num1 = scan.nextInt();
		
		System.out.println("Insira o segundo número (B): ");
		num2 = scan.nextInt();
		
		System.out.println("Insira o terceiro número (C): ");
		num3 = scan.nextInt();
		
		System.out.println("Insira o quarto número (D): ");
		num4 = scan.nextInt();
		
		System.out.println("Insira o quinto número (E): ");
		num5 = scan.nextInt();
		
		if (num1 + 4 == num5) primeira_equacao = true;
		
		if (num1 + 1 == num3) segunda_equacao = true;
		
		if (num3 + 1 == num4) terceira_equacao = true;
		
		Assert.assertTrue(primeira_equacao);
		Assert.assertTrue(segunda_equacao);
		Assert.assertTrue(terceira_equacao);
	}
}
