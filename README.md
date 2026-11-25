# Projeto de Integração com Impressora

## 1. Sobre o Projeto

Este projeto foi desenvolvido em Java e tem como objetivo realizar a comunicação e o controle de uma impressora por meio de uma biblioteca DLL. O sistema funciona por meio de um menu interativo no terminal, permitindo que o usuário selecione diferentes operações de impressão e controle da impressora.

## 2. Tecnologias Utilizadas

- **Java:** linguagem utilizada no desenvolvimento do sistema.
- **Scanner:** utilizado para receber informações digitadas pelo usuário no terminal.
- **Biblioteca DLL da impressora:** responsável pela comunicação com o equipamento e pela execução dos comandos de impressão.

## 3. Estrutura do Projeto

O projeto é organizado principalmente nas seguintes classes:

- **Menu.java:** responsável por exibir as opções disponíveis e direcionar a execução de cada funcionalidade.
- **Impressora.java:** contém os métodos responsáveis pela configuração, conexão e execução dos comandos da impressora.
- **ImpressoraDLL:** interface utilizada para acessar as funções disponibilizadas pela biblioteca da impressora.

## 4. Como Executar

1. Certifique-se de que o Java esteja instalado no computador.
2. Disponibilize a biblioteca DLL necessária para a comunicação com a impressora.
3. Abra o projeto em uma IDE compatível com Java.
4. Verifique se a biblioteca está corretamente configurada no projeto.
5. Execute a classe principal que contém o menu do sistema.
6. Utilize as opções apresentadas no terminal para realizar as operações.

**Observação:** a comunicação com a impressora depende da disponibilidade e da configuração correta da DLL fornecida pelo fabricante.

## 5. Login de Teste

O sistema não possui autenticação de usuários. Portanto, não é necessário realizar login para acessar suas funcionalidades.

## 6. Funcionalidades do Menu

| Opção | Funcionalidade | Descrição |
|---|---|---|
| 1 | Configurar Conexão | Recebe os dados necessários para configurar a comunicação com a impressora. |
| 2 | Abrir Conexão | Inicia a comunicação com a impressora. |
| 3 | Impressão de Código de Barras | Envia um código de barras para impressão. |
| 4 | Impressão de QR Code | Solicita os dados e realiza a impressão de um QR Code. |
| 5 | Sinal Sonoro | Aciona o sinal sonoro da impressora. |
| 6 | Impressão de Texto | Solicita um texto ao usuário e envia para impressão. |
| 7 | Impressão de XML SAT | Realiza a impressão de um arquivo XML SAT. |
| 8 | Impressão de XML de Cancelamento SAT | Realiza a impressão de um XML de cancelamento SAT. |
| 9 | Posição de Impressão Horizontal | Permite configurar a posição horizontal de impressão. |
| 10 | Fechar Conexão | Encerra a comunicação com a impressora. |
| 0 | Sair | Encerra a execução do programa. |

## 7. Testes Realizados

O desenvolvimento contempla a implementação dos métodos de comunicação e impressão, além do tratamento de exceções para identificar possíveis erros durante a execução.

Foram implementadas verificações do retorno das operações de abertura e fechamento da conexão, permitindo identificar se essas ações foram executadas corretamente.

**Observação:** os testes de funcionamento físico da impressora devem ser registrados conforme as operações efetivamente realizadas no equipamento.

## 8. Autores

- Fábio Feliphe de Freitas da Silva
- Gabriel Dias de Sousa
- Gabriely Silva de Abreu
