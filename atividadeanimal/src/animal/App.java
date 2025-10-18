import animal.Animal;

import java.animal.Animal;

public class App {
    public static void main(String[] args) {
        Scanner animal = new Animal(System.in);
        Animal = null; // Inicialmente, não há animal cadastrado

        int opcao;
        do {
            try {
                // Menu interativo
                System.out.println("\n--- Sistema de Gerenciamento de Animais ---");
                System.out.println("1. Cadastrar novo animal");
                System.out.println("2. Atualizar peso");
                System.out.println("3. Calcular idade em anos humanos");
                System.out.println("4. Verificar porte");
                System.out.println("5. Exibir informações");
                System.out.println("6. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                switch (opcao) {
                    case 1:
                        // Cadastrar novo animal
                        System.out.print("\nNome do animal: ");
                        String nome = scanner.nextLine();
                        System.out.print("Espécie: ");
                        String especie = scanner.nextLine();
                        System.out.print("Idade (anos): ");
                        int idade = scanner.nextInt();
                        System.out.print("Peso (kg): ");
                        double peso = scanner.nextDouble();

                        animal = new Animal(nome, especie, idade, peso);
                        System.out.println("\nAnimal cadastrado com sucesso!");
                        break;

                    case 2:
                        // Atualizar peso
                        if (animal != null) {
                            System.out.print("\nNovo peso (kg): ");
                            double novoPeso = scanner.nextDouble();
                            animal.atualizarPeso(novoPeso);
                            System.out.println("Peso atualizado com sucesso!");
                        } else {
                            System.out.println("\nNenhum animal cadastrado ainda.");
                        }
                        break;

                    case 3:
                        // Calcular idade em anos humanos
                        if (animal != null) {
                            System.out.println("\nIdade em anos humanos: " + 
                                animal.calcularIdadeEmAnosHumanos());
                        } else {
                            System.out.println("\nNenhum animal cadastrado ainda.");
                        }
                        break;

                    case 4:
                        // Verificar porte
                        if (animal != null) {
                            System.out.println("\nPorte do animal: " + 
                                animal.classificarPorte());
                        } else {
                            System.out.println("\nNenhum animal cadastrado ainda.");
                        }
                        break;

                    case 5:
                        // Exibir informações
                        if (animal != null) {
                            animal.exibirInformacoes();
                        } else {
                            System.out.println("\nNenhum animal cadastrado ainda.");
                        }
                        break;

                    case 6:
                        System.out.println("\nSaindo do sistema...");
                        break;

                    default:
                        System.out.println("\nOpção inválida. Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("\nErro: " + e.getMessage());
                scanner.nextLine(); // Limpar o buffer em caso de erro
            }
        } while (opcao != 6);

        scanner.close();
    }
}
