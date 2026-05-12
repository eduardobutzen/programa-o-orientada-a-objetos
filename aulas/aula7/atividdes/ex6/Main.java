package aula7.atividdes.ex6;

public class Main {
    public static void main(String[] args) {

        // Array polimórfico de Funcionario
        Funcionario[] funcionarios = {
            new Gerente("Carlos Oliveira", 8000.00, 2000.00),
            new Gerente("Fernanda Lima", 9500.00, 3000.00),
            new Desenvolvedor("Lucas Martins", 6000.00, 20),
            new Desenvolvedor("Beatriz Santos", 6500.00, 15),
            new Desenvolvedor("Rafael Costa", 7000.00, 30)
        };

        // ── Situação inicial ────────────────────────────────────────────
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║           SITUAÇÃO INICIAL DOS FUNCIONÁRIOS      ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
        for (Funcionario f : funcionarios) {
            System.out.println(f); // chama toString() sobrescrito
        }

        // ── Aumento geral: 5% para todos ───────────────────────────────
        System.out.println("\n╔══════════════════════════════════════════════════╗");
        System.out.println("║     AUMENTO GERAL DE 5% (todos os funcionários)  ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
        for (Funcionario f : funcionarios) {
            System.out.println("► " + f.getNome());
            f.aumentarSalario(0.05); // sobrecarga 1 — método da superclasse
        }

        // ── Aumento especial: Gerentes com bônus ───────────────────────
        System.out.println("\n╔══════════════════════════════════════════════════╗");
        System.out.println("║   AUMENTO ADICIONAL PARA GERENTES (10% + bônus)  ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
        for (Funcionario f : funcionarios) {
            if (f instanceof Gerente) {
                Gerente g = (Gerente) f;
                System.out.println("► " + g.getNome());
                g.aumentarSalario(0.10, true); // sobrecarga 2 — exclusiva do Gerente
            }
        }

        // ── Situação final ─────────────────────────────────────────────
        System.out.println("\n╔══════════════════════════════════════════════════╗");
        System.out.println("║            SITUAÇÃO FINAL DOS FUNCIONÁRIOS       ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
        for (Funcionario f : funcionarios) {
            System.out.println(f); // toString() sobrescrito de cada subclasse
        }
    }
}
