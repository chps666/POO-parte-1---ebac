package Carros;

import java.util.ArrayList;
import java.util.Scanner;

public class registradoraDeCarros {
    ArrayList<String> modelo = new ArrayList<>();
    ArrayList <String> preco = new ArrayList<>();
    ArrayList <Double> kmRodados = new ArrayList<>();
    static int totalDeCarros;
    private int limiteDeCarros = 50;

    Scanner sc = new Scanner(System.in);

    public void registrar(){
        if(totalDeCarros != limiteDeCarros){
            System.out.println("Digite o modelo do carro: ");
            modelo.add(sc.nextLine());

            System.out.println("Digite o preco do carro: ");
            preco.add(sc.nextLine());

            System.out.println("Digite quantos quilometragem rodada: ");
            kmRodados.add(sc.nextDouble());
            sc.nextLine();

            totalDeCarros ++;
        }else{
            System.out.println("Limite maximo de carros atingidos!");

        }
    }

    public static void printTotalCarros(){
        System.out.println("Quantidade de carros registrados: " + totalDeCarros);

    }

    public void listaCarros(){
        System.out.println(" MODELO  |  PRECO  |  QUILOMETRAGEM");
        for(int c = 0; c < totalDeCarros; c ++){
            System.out.println("  " + modelo.get(c) + "  |  " + preco.get(c) + "  |  " + kmRodados.get(c)+ "Km");

        }
        System.out.println("==Total de Carros: " + totalDeCarros + " (Limite de registros: 50)");

    }
}
