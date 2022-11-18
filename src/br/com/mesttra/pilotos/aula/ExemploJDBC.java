package br.com.mesttra.pilotos.aula;

import java.sql.SQLException;
import java.util.Scanner;

public class ExemploJDBC {
	
	public static void main(String[] args) throws SQLException {
		
		// Aqui estamos criando uma conexão com o banco através da chamada 
		// string JDBC.
		// Nela estão contidas todas as informações necessárias
		// para o driver realizar a conexão
		// jdbc:postgresql - aqui estamos especificando o SGBD
		// 127.0.0.1:5432 - o endereco (local) e porta do BD
		// /mildevs - o banco de dados
		// Os parametros seguintes são o usuário do banco e a senha
		PilotoDAO pilotoDao = new PilotoDAO();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("INSERCAO DE PILOTOS");
		System.out.println("Digite a matricula");
		int matricula = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Digite o nome: ");
		String nome = teclado.nextLine();
		System.out.println("Digite o numero da aeronave: ");
		int numAeronave = teclado.nextInt();
		System.out.println("Digite o salário: ");
		double salario = teclado.nextDouble();
		System.out.println("Digite as horas de Voo: ");
		int horasVoo = teclado.nextInt();
		
		Piloto pilotoASerInserido = new Piloto(matricula, nome, numAeronave, salario, horasVoo);
		pilotoDao.inserePiloto(pilotoASerInserido);

		teclado.close();
	}

}
