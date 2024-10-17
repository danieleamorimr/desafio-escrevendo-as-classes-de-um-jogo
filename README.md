# Hero Attack Simulation

Este projeto é uma simulação simples de um herói que realiza um ataque, com base nas entradas fornecidas pelo usuário. O usuário pode definir o nome, a idade e o tipo do herói, e o programa exibirá o resultado do ataque.

## Como desenvolvi o projeto

Criei uma classe pública chamada "Hero", dentro do pacote MODEL. Nela criei os atributos necessários para definir as características da classe `Hero`. Optei pelo modificador de acesso "private" para que as informações fiquem encapsuladas e, desta forma, não seja possível ter acesso direto a essas variáveis de fora da classe.

Depois, criei o construtor da classe definindo suas propriedades, evitando que o objeto seja criado com atributos nulos. Optei por desenvolver um `Switch Case` (ferramenta de controle de fluxo) para atribuir o valor a propriedade `attack` , variando o `case` de acordo com o tipo de ataque utilizado pelo Herói.

Por fim, criei um método para imprimir na tela concatenando um texto com os atributos definidos para o objeto Hero no método construtor como abaixo:

```txt
The hero {name}, who is {age} years old, is a {type}. He/She attacked with `{attack}`.
```

Sendo `name`, `age`, `type` e `attack` os atributos da classe `Hero`.

Após concluir a construção da classe, foi necessário criar a classe `main`, local em que o código do programa começará a ser executado.
Utilizei o Scanner, do pacaote Java.util, com o objetivo de capturar os dados de entrada do teclado.

Com o intuito de evitar comportamentos inesperados na aplicação, implementei exceções e as tratei com os blocos `try`, `catch` e `finally`. No bloco `try`, encontra-se o trecho do código que pode gerar alguma exceção, já o `catch` vai capturar e tratar a exceção caso ela ocorra. O `finally `sempre é executado após a execução dos blocos try e catch, encerrando a execução do bloco de código.

## Pré-requisitos

Antes de executar o projeto, certifique-se de que você tenha o seguinte instalado:
- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

## Como executar

### 1. Compilamos o programa:

```bash
javac Main.java
```

### 2. Execute o programa:

```bash
java -jar Main
```

### 3. O programa solicitará as seguintes entradas:

   - Nome do herói
   - Idade do herói
   - Tipo do herói (warrior, wizard, monk, ninja)

### 4. Exemplo de execução:

```bash
Digite o nome do herói: # Enzo
Digite a idade do herói: # 6
Digite o tipo do herói (warrior, wizard, monk, ninja): # warrior
#The hero Enzo, who is 6 years old, is a warrior. He/She attacked with sword.
```

## Conclusão

Durante o desenvolvimento deste sistema, coloquei em prática o conteúdo aprendido no Bootcamp, tais como criação de classes, métodos, controle de fluxo, como instanciar um novo objeto. Incluí um pouco do que havia aprendido em outros cursos também, como o uso dos tratamentos de exceção. Enfim, acredito que eu tenha conseguido assimilar conceitos que antes não havia conseguido entender muito bem. O Bootcamp de Lógica de Programação veio para me ajudar nesse processo de aprendizado.
Optei por utilizar a linguagem Java, pois é a que estudo atualmente.

