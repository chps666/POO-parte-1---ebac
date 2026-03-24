import Carros.registradoraDeCarros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        registradoraDeCarros  RegistrosCarros = new registradoraDeCarros();
        Scanner sc = new Scanner(System.in);
        int escolha;
        do{
            System.out.println("==========REGISTRADORA DE CARROS=========");
            System.out.println("[1] Registrar Carro\n" +
                    "[2] Lista De Carros\n" +
                    "[3] Sair");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    RegistrosCarros.registrar();
                    break;

                case 2:
                    RegistrosCarros.listaCarros();
                    break;

                default:
                    break;
            }
        }while(escolha != 3 );

    }
}