# Hero Attack Simulation

Este projeto é uma simulação simples de um herói que realiza um ataque, com base nas entradas fornecidas pelo usuário. O usuário pode definir o nome, a idade e o tipo do herói, e o programa exibirá o resultado do ataque.

## Funcionalidades
- Solicita ao usuário que insira o nome, a idade e o tipo do herói.
- Cria um objeto `Hero` com base nas entradas fornecidas.
- Executa o método `attack()` do herói, que exibe uma mensagem de ataque personalizada.

## Pré-requisitos
Antes de executar o projeto, certifique-se de que você tenha o seguinte instalado:
- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- Um ambiente de desenvolvimento Java (como IntelliJ IDEA, Eclipse ou NetBeans)

## Como executar
1. Clone este repositório para o seu ambiente local:
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```
2. Navegue até o diretório do projeto:
```bash
cd seu-repositorio
```
3. Compile o projeto:
```bash
javac -d bin src/model/Hero.java src/Main.java
```
4. Execute o programa:
```bash
java -cp bin Main
```
5. O programa solicitará as seguintes entradas:
   - Nome do herói
   - Idade do herói
   - Tipo do herói (warrior, wizard, monk, ninja)

6. Exemplo de execução:
```bash
Digite o nome do herói: Enzo
Digite a idade do herói: 6
Digite o tipo do herói (warrior, wizard, monk, ninja): warrior
```

Saída esperada:
```bash
The hero Enzo, who is 6 years old, is a warrior. He/She attacked with sword.
```

## Estrutura do Projeto
```bash
├── src
│   ├── model
│   │   └── Hero.java # Classe que define o herói
│   └── Main.java     # Classe principal que executa o programa
├── bin               # Diretório onde os arquivos compilados são armazenados
└── README.md         # Documentação do projeto
```

## Classe `Hero`
A classe `Hero` contém os seguintes atributos e métodos:
- **Atributos**:
  - `name`: Nome do herói.
  - `age`: Idade do herói.
  - `type`: Tipo do herói (warrior, wizard, monk, ninja).
- **Métodos**:
  - `attack()`: Exibe uma mensagem de ataque com base no tipo do herói.

## Tratamento de Exceções
O programa captura exceções que possam ocorrer durante a execução, como entradas inválidas, e exibe uma mensagem de erro apropriada.

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença
Este projeto está licenciado sob a [MIT License](LICENSE).