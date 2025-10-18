package animal;

public class Animal {
    // Atributos privados
    private String nome;
    private String especie;
    private int idade;
    private double peso;

    // Construtor
    public Animal(String nome, String especie, int idade, double peso) {
        setNome(nome);
        setEspecie(especie);
        setIdade(idade);
        setPeso(peso);
    }

    // Getters e Setters com validações básicas
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.trim().isEmpty()) {
            throw new IllegalArgumentException("Espécie não pode ser vazia");
        }
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser positivo");
        }
        this.peso = peso;
    }

    // Método para calcular idade em anos humanos (aproximação simples)
    public int calcularIdadeEmAnosHumanos() {
        // Fator de conversão varia por espécie - esta é uma aproximação geral
        if (especie.equalsIgnoreCase("cão") || especie.equalsIgnoreCase("cachorro")) {
            return idade * 7;
        } else if (especie.equalsIgnoreCase("gato")) {
            return idade * 5;
        } else {
            return idade * 4; // Fator padrão para outras espécies
        }
    }

    // Método para atualizar o peso com validação
    public void atualizarPeso(double novoPeso) {
        if (novoPeso <= 0) {
            throw new IllegalArgumentException("Peso deve ser positivo");
        }
        this.peso = novoPeso;
    }

    // Método para classificar o porte do animal
    public String classificarPorte() {
        if (especie.equalsIgnoreCase("cão") || especie.equalsIgnoreCase("cachorro")) {
            if (peso < 10) return "Pequeno";
            else if (peso < 25) return "Médio";
            else return "Grande";
        } else if (especie.equalsIgnoreCase("gato")) {
            if (peso < 4) return "Pequeno";
            else return "Médio";
        } else {
            return "Porte não classificado para esta espécie";
        }
    }

    // Método para exibir todas as informações
    public void exibirInformacoes() {
        System.out.println("\n--- Informações do Animal ---");
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Idade em anos humanos: " + calcularIdadeEmAnosHumanos());
        System.out.println("Porte: " + classificarPorte());
    }
}