package PooTamaguchi;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Principal {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a Raça: ");
        String raca = teclado.nextLine();
        System.out.print("Digite o Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite o Porte do Cachorro: ");
        String porte = teclado.nextLine();
        System.out.print("Digite o Peso: ");
        int peso = teclado.nextInt();
        System.out.print("Digite o Ano de Nascimento: ");
        int nascimento = teclado.nextInt();
        System.out.print("Digite o Valor da Energia Inicial: ");
        int energia = teclado.nextInt();
        int idade = 2016 - nascimento;

        cachorro.criarCachorro(raca, nome, porte, peso, nascimento, energia);
        while (cachorro.energia > 0 || cachorro.peso > 2 || cachorro.idade < 15) {
            
            System.out.println("----------Tamaguchi POO----------");
            System.out.println("|1. Calcular Idade           |");
            System.out.println("|2. Envelhecer               |");
            System.out.println("|3. Alimentar                |");
            System.out.println("|4. Passear                  |");
            System.out.println("|5. Dormir                   |");
            System.out.println("|6. Verifica Status          |");
            System.out.println("|0. Sair                     |");
            System.out.println("---------------------------------");
            System.out.println("Escolha uma opção: ");

            int escolha = teclado.nextInt();
            if (escolha == 1) {
                cachorro.calculaIdade();
                System.out.println(idade);
            } else if (escolha == 2) {
                cachorro.envelhecer();
                
            } else if (escolha == 3) {
                cachorro.alimentar();
            } else if (escolha == 4) {
                cachorro.passear();
            }    else if (escolha == 5) {
                cachorro.dormir();
            } else if (escolha == 6) {
                String resultado = cachorro.toString();
                System.out.println(resultado);
                
            } else if (escolha == 0) {
                break;
            } else {
                System.out.println("Opção Inválida!!");
                
            }
            
        } 
    }
}
