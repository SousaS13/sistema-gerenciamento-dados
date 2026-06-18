import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// --- MODELAGEM DE DADOS (ORIENTAÇÃO A OBJETOS) ---
class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Preço: R$ " + preco;
    }
}

// --- LÓGICA COMPLETA DE BACKEND ---
public class ECommerceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> carrinho = new ArrayList<>();
        
        System.out.println("--- SISTEMA CORPORATIVO DE E-COMMERCE (BACKEND) ---");
        
        try {
            String continuar = "S";
            while (continuar.equalsIgnoreCase("S")) {
                System.out.print("\nDigite o nome do produto: ");
                String nome = scanner.nextLine();
                
                System.out.print("Digite o preço do produto (apenas números): ");
                double preco = scanner.nextDouble();
                scanner.nextLine(); // Limpa o buffer do teclado
                
                if (preco <= 0) {
                    throw new IllegalArgumentException("O preço do produto precisa ser maior que zero!");
                }
                
                carrinho.add(new Produto(nome, preco));
                System.out.println("[SUCESSO] Produto adicionado ao carrinho.");
                
                System.out.print("Deseja adicionar mais um produto? (S/N): ");
                continuar = scanner.nextLine();
            }
            
            System.out.println("\n=== RESUMO DO PEDIDO CORPORATIVO ===");
            double total = 0;
            for (Produto p : carrinho) {
                System.out.println(p);
                total += p.preco;
            }
            
            System.out.println("------------------------------------");
            System.out.println("VALOR TOTAL DO PEDIDO: R$ " + total);
            System.out.println("\nSimulando persistência no Banco de Dados MySQL... Concluído com sucesso!");
            
        } catch (Exception e) {
            System.out.println("\n[ERRO DE VALIDAÇÃO] Falha no fluxo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
