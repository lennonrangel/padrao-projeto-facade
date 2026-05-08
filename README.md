# Padrão de Projeto Facade

Projeto desenvolvido para a disciplina de **Arquitetura e Projeto de Software**.

## Descrição

Este projeto demonstra a implementação do padrão estrutural **Facade**, que tem como objetivo fornecer uma interface simplificada para um conjunto de interfaces de um subsistema, tornando o subsistema mais fácil de usar.

O padrão foi aplicado para modelar um sistema de **checkout de pedidos**. O `Cliente` não precisa conhecer os subsistemas de `Estoque`, `Pagamento` e `Entrega` — basta chamar `finalizarPedido()`, que delega toda a verificação à `PedidoFacade`.

## Estrutura

| Classe | Papel |
|---|---|
| `Cliente` | Usuário da fachada — chama apenas `finalizarPedido()` |
| `PedidoFacade` | Fachada — coordena as verificações dos subsistemas |
| `Departamento` | Classe abstrata dos subsistemas |
| `Estoque` | Subsistema Singleton — verifica disponibilidade |
| `Pagamento` | Subsistema Singleton — verifica pendências financeiras |
| `Entrega` | Subsistema Singleton — verifica restrições de entrega |

## Funcionamento

A `PedidoFacade` centraliza as chamadas aos três subsistemas. Quando o `Cliente` chama `finalizarPedido()`, a facade verifica sequencialmente cada departamento:

- Se `Estoque` tiver pendência → retorna `false`
- Se `Pagamento` tiver pendência → retorna `false`
- Se `Entrega` tiver pendência → retorna `false`
- Se nenhum tiver pendência → retorna `true`

Isso evita que o `Cliente` precise conhecer e chamar diretamente cada subsistema:
- `Estoque.getInstancia().verificarClienteComPendencia(cliente)`
- `Pagamento.getInstancia().verificarClienteComPendencia(cliente)`
- `Entrega.getInstancia().verificarClienteComPendencia(cliente)`

## Vantagens

- Simplifica o uso de subsistemas complexos com uma única interface
- Reduz o acoplamento entre o cliente e os subsistemas
- Facilita a adição de novos subsistemas sem alterar o cliente
- Centraliza a lógica de orquestração na fachada
- Segue o princípio da Lei de Demeter (fale apenas com seus amigos imediatos)

## Como executar

Abrir o projeto no IntelliJ como um projeto Maven e executar os testes localizados em:

- `ClienteTest`
