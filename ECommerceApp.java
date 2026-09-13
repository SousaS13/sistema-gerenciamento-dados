// ==============================================================================
// PROJETO: Sistema de Integração e Consistência de Dados (Java & SQL)
// AUTORA: Thaynara Sousa Nascimento
// OBJETIVO: Simular a triagem, validação e persistência de atos de pessoal (MGI/Dataprev)
// ==============================================================================

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ECommerceApp {

    // Configurações de conexão com o banco de dados local
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_corporativo";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // Insira a senha do seu banco local se houver

    public static void main(String[] args) {
        System.out.println("--- Iniciando o Sistema de Governança e Consistência de Dados ---");

        // Estabelecendo a conexão com o banco usando a estrutura Try-With-Resources (Garante o fechamento seguro do banco)
        try (Connection conexao = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("[SUCESSO] Conexão estabelecida com o banco de dados corporativo.");

            // 1. INSERÇÃO E VALIDAÇÃO DE ATOS ADMINISTRATIVOS
            // Usamos PreparedStatement para evitar ataques de SQL Injection, garantindo a segurança da informação do órgão.
            String sqlInsercao = "INSERT INTO atos_pessoal (nome_servidor, tipo_ato) VALUES (?, ?)";
            try (PreparedStatement stmt = conexao.prepareStatement(sqlInsercao)) {
                
                // Simulação de triagem diária (Exemplo: Dados extraídos do Diário Oficial)
                stmt.setString(1, "Mariana Costa");
                stmt.setString(2, "LICENÇA");
                stmt.executeUpdate();
                
                System.out.println("[SUCESSO] Novo ato administrativo validado e persistido no banco.");
            }

            // 2. AUDITORIA E LEITURA DOS DADOS (RELATÓRIO)
            System.out.println("\n--- Executando Query de Auditoria Interna (Força de Trabalho) ---");
            String sqlConsulta = "SELECT id, nome_servidor, tipo_ato, data_publicacao FROM atos_pessoal";
            
            try (Statement stmtConsulta = conexao.createStatement();
                 ResultSet rs = stmtConsulta.executeQuery(sqlConsulta)) {

                // Loop para ler os registros vindos do banco de dados e exibir no terminal de forma estruturada
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome_servidor");
                    String ato = rs.getString("tipo_ato");
                    String data = rs.getString("data_publicacao");

                    System.out.printf("ID: %d | Servidor: %-15s | Ato: %-12s | Publicado em: %s%n", id, nome, ato, data);
                }
            }

        } catch (SQLException e) {
            System.err.println("[ERRO] Falha na integração ou consistência dos dados com o banco MySQL.");
            e.printStackTrace();
        }
    }
}
