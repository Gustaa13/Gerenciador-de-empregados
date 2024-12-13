# Gerenciador de Empregados

## 📋 Descrição do Projeto
O **Gerenciador de Empregados** é um sistema desenvolvido em **Java** que visa auxiliar no gerenciamento de informações de empregados, como **registro**, **consulta** e **exclusão** de dados. O projeto é estruturado de forma modular, com uma clara separação entre **lógica de negócios**, **armazenamento de dados** e **exibição de informações** no terminal.

---

## 🗂️ Estrutura do Repositório

### Diretórios Principais

- **`database/`**  
  Arquivo binário utilizado para armazenar objetos de forma persistente.

- **`src/`**  
  Contém os arquivos de código-fonte, organizados por pacotes:

  - **`dao/`**  
    Arquivo responsável pelo gerenciamento de banco de dados:
    - `PessoasDAO`: Utiliza o padrão Singleton para armazenar dados em tempo de execução. A persistência dos dados é feita através da serialização da classe `Pessoa`.

  - **`model/`**  
    Contém as classes principais, enumerações e interfaces:
    - **`classes/`**:
      - `Endereco`: Representa o endereço de um empregado e é um campo da classe `Pessoa`.
      - `Pessoa`: Classe abstrata, base para as entidades `Professor` e `TecnicoADM`.
      - `Professor`: Herda de `Pessoa` e implementa a interface `Funcionario`.
      - `TecnicoADM`: Herda de `Pessoa` e implementa a interface `Funcionario`.

    - **`enums/`**:
      - `Formacao`: Define os tipos `ESPECIALIZACAO`, `MESTRADO` e `DOUTORADO`.
      - `Genero`: Define os tipos `MASC`, `FEM` e `OUTRO`.
      - `Nivel`: Define os níveis `I`, `II`, `III`, `IV`, `V`, `VI`, `VII` e `VIII`.

    - **`interfaces/`**:
      - `Funcionario`: Declara o método `calcularSalario()`, implementado por `Professor` e `TecnicoADM`.

  - **`services/`**  
    Contém a lógica de negócios:
    - `Funcionarios`: Métodos de adição, remoção, busca e listagem das instâncias de `Professor` e `TecnicoADM`.

  - **`utils/`**  
    Contém classes auxiliares para leitura de dados, exibição de informações e controle dos menus:
    - `ControladorDeMenu`: Gerencia as interações do usuário com o sistema.
    - `Leitor`: Responsável pela leitura de entradas no terminal.
    - `LerClasse`: Auxilia na validação e instânciação de objetos.
    - `Menu`: Exibe os menus principais e secundários do sistema.

  - **`Main`**  
    A classe principal que inicializa o sistema e delega operações para o controlador de menus.

---

## ⚙️ Requisitos de Sistema

- **Java 11** ou superior.
- **Nenhuma dependência externa obrigatória.**

---

## 🚀 Configuração e Execução

### Configuração Inicial

1. Clone o repositório:
   ```bash
   git clone https://github.com/Gustaa13/Gerenciador-de-empregados.git
   ```
2. Abra o projeto em sua IDE de preferência.

### Executando o Sistema
1. Execute o arquivo principal `Main.java` localizado na raiz de `src`.
2. Utilize os menus apresentados no terminal para realizar operações.

