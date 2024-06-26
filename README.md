# Sistema do Chapeu Seletor de Hogwarts

Este é um sistema em Java para cadastrar alunos e determinar a qual casa de Hogwarts eles pertencem com base em suas respostas a um questionário...

## Funcionalidades

- **Cadastrar Aluno**: Permite que novos alunos sejam cadastrados no sistema.
- **Remover Aluno**: Permite a remoção de alunos do sistema.
- **Exibir Aluno**: Permite visualizar as informações de um aluno específico.
- **Listar Alunos**: Lista todos os alunos cadastrados no sistema.
- **Alterar**: Altera as informacoes do Aluno(Nome, Idade, Status de Sangue).
- **Determinação de Casas**: Atribui uma casa de Hogwarts ao aluno com base nas respostas de um questionário.(Fica junto ao cadatro do Aluno)..

## Estrutura do Projeto

O projeto contém as seguintes classes principais:


### Estrutura Principal do Projeto
- **Principal**: A classe Principal que roda o sistema.
- **Sistema**: A classe que contém o menu e a lógica para interação com o usuário.
- **GerenciadorAluno**: Classe responsavel por salvar e apresentar as informacoes doa Alunos em .txt.

### Package Classes
- **Aluno**: Representa um aluno, contendo informações como nome, matrícula, idade, sexo, status de sangue e casa.
- **Cadastro**: Gerencia o cadastro de alunos.
- **Console**: Fornece métodos para interação no console.

### Package Casas
`Classes usadas Para manipular e definir os metodos Da Interface...`
- **Grifinoria.java**: Gerencia a casa e o escudo da Grifinoria.
- **Sonserina.java**: Gerencia a casa e o escudo da Sonserina.
- **Corvinal.java**: Gerencia a casa e o escudo da Corvinal.
- **LufaLufa.java**: Gerencia a casa e o escudo da Lufa Lufa.


### Interface Interfaces
- **Casas**: Interface ou classe que define as casas e escudos(Desenhos das Casas) de Hogwarts.

## Como Utilizar o Sistema

1. Clone o repositório para sua máquina local:

```bash
https://github.com/malobr/trabalho-final-java.git
```

### Abra e Execute o Sistema

Compile e execute a classe `Sistema` para iniciar o programa.

### Menu Principal

Selecione uma opção do menu para realizar uma ação:
- `[1] Cadastrar Aluno`
- `[2] Remover Aluno`
- `[3] Exibir Aluno`
- `[4] Listar todos os Alunos`
- `[5] Atualizar Aluno`
- `[0] Sair`

### Cadastrar um Novo Aluno

1. Selecione a opção `[1] Cadastrar Aluno`.
2. Siga as instruções para fornecer os dados do aluno e responder às perguntas do questionário.
3. O sistema determinará a casa do aluno com base nas respostas e cadastrará o aluno.

## Requisitos

- Java JDK 8 ou superior
- IDE para desenvolvimento Java (opcional, mas recomendado)



