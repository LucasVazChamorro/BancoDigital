🏦 Banco Digital
📋 Descrição
Sistema bancário desenvolvido em Java que simula operações bancárias básicas com diferentes tipos de contas. 

O projeto implementa conceitos fundamentais de Programação Orientada a Objetos e boas práticas de programação.




⭐ Características Principais
===============================

Tipos de Conta
==

💳 Conta Corrente: Conta padrão para movimentações diárias

💰 Conta Poupança: Conta para economia

📈 Conta Remunerada: Conta com rendimento mensal de 0.5%



Operações Disponíveis
==

📥 Depósito

📤 Saque

💸 Transferência entre contas

🧾 Impressão de extrato

📊 Registro de transações

Segurança
==

✅ Validação de operações

🔒 Proteção contra saques sem saldo

📝 Registro de todas as movimentações

⚠️ Tratamento de exceções

🛠️ Tecnologias Utilizadas
===
Java

Programação Orientada a Objetos

Collections Framework

Tratamento de Exceções

LocalDateTime API


🏗️ Arquitetura do Projeto
==
Estrutura de Classes

Copy├── Banco

├── Cliente

├── Conta (abstrata)

│   ├── ContaCorrente

│   ├── ContaPoupanca

│   └── ContaRemunerada

├── IConta (interface)

└── Transacao

Conceitos de POO Aplicados
==

Encapsulamento: Proteção dos dados através de atributos privados e métodos de acesso

Herança: Reutilização de código através da hierarquia de classes

Polimorfismo: Diferentes comportamentos para os diferentes tipos de conta

Abstração: Utilização de classe abstrata e interface para definir contratos

🚀 Como Usar
=
Exemplo de Criação de Conta e Operações

javaCopy// Criar cliente

Cliente cliente = new Cliente();

cliente.setNome("João");

cliente.setCpf("12345678901");


// Criar contas
==
ContaCorrente contaCorrente = new ContaCorrente(cliente);

ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);

// Realizar operações
=
contaCorrente.depositar(1000.00);

contaCorrente.transferir(500.00, contaPoupanca);

// Verificar extratos
=
contaCorrente.imprimirExtrato();

contaPoupanca.imprimirExtrato();

🔒 Validações e Segurança
=
Exemplos de Validações Implementadas

javaCopy// Validação de saque

if (valor <= 0) {

throw new IllegalArgumentException("Valor de saque deve ser positivo");

}

if (valor > saldo) {

throw new IllegalArgumentException("Saldo insuficiente");

}


// Validação de cliente
=
public boolean isValido() {

return nome != null && !nome.trim().isEmpty()
&& cpf != null && cpf.matches("\\d{11}");

}

📊 Registro de Transações
=

Cada operação é registrada automaticamente

Armazena tipo de operação, valor, data e descrição

Histórico completo disponível para consulta


🔄 Fluxo de Operações
=

Cliente é cadastrado com dados pessoais

Contas são criadas e vinculadas ao cliente

Operações são realizadas com validações

Transações são registradas automaticamente

Extratos podem ser consultados a qualquer momento


🎯 Benefícios do Sistema
=

✨ Código limpo e organizado

📌 Fácil manutenção

🔄 Escalável para novas funcionalidades

🛡️ Seguro e confiável


🔜 Próximas Atualizações Planejadas
=

Interface gráfica

Persistência de dados em banco

Sistema de login

Novas modalidades de conta

Relatórios financeiros


👥 Contribuições
=
Contribuições são bem-vindas! Sinta-se à vontade para:

Reportar bugs

Sugerir novas features

Melhorar a documentação

Submeter pull requests