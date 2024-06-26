# Sistema do Chapeu Seletor de Hogwarts

Este é um sistema desenvolvido em Java que simula o famoso Chapéu Seletor de Hogwarts. O sistema permite o cadastro de alunos e determina a qual casa de Hogwarts (Grifinória, Sonserina, Corvinal ou Lufa-Lufa) eles pertencem com base nas suas respostas de 5 perguntas objetivas. Através deste processo, os alunos serão designados às casas que melhor correspondem às suas características e valores.


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
- **Casas**: Interface ou classe que cria o nome e o desenho das casas de Hogwarts.

## Uso de IAs

Para fazer o sistema eu utilizei as IAs majoritariamente para tirar duvidas sobre erros no codigo, e principalmente para introduzir os desenhos no codigo.. alguns como `return` e outros como `System.out` .

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



