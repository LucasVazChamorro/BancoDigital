public class Main {
    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente();
            cliente.setNome("Lucas");
            cliente.setCpf("12345678901");

            ContaCorrente cc = new ContaCorrente(cliente);
            ContaPoupanca cp = new ContaPoupanca(cliente);
            ContaRemunerada cr = new ContaRemunerada(cliente);

            cc.depositar(1000);
            cc.transferir(500, cp);
            cr.depositar(2000);
            cr.aplicarRendimento();

            System.out.println("=== Extratos ===");
            cc.imprimirExtrato();
            cp.imprimirExtrato();
            cr.imprimirExtrato();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro na operação: " + e.getMessage());
        }
        try {
            Cliente cliente = new Cliente();
            cliente.setNome("Letícia");
            cliente.setCpf("98778954137");

            ContaCorrente cc = new ContaCorrente(cliente);
            ContaPoupanca cp = new ContaPoupanca(cliente);
            ContaRemunerada cr = new ContaRemunerada(cliente);

            cc.depositar(3000);
            cc.transferir(2500, cp);
            cr.depositar(1000);
            cr.aplicarRendimento();

            System.out.println("=== Extratos ===");
            cc.imprimirExtrato();
            cp.imprimirExtrato();
            cr.imprimirExtrato();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro na operação: " + e.getMessage());
        }
    }
}