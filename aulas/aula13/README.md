# Sistema de Cadastro de Veículos

Trabalho da disciplina de **Programação Orientada a Objetos** desenvolvido em **Java**, utilizando
**orientação a objetos**, **manipulação de arquivos** e **comunicação cliente × servidor com Socket**.

O projeto é dividido em duas partes:

- **Parte 1 –** Sistema de cadastro de veículos com menu e persistência em arquivo texto.
- **Parte 2 –** A mesma lógica distribuída entre uma aplicação **Cliente** e uma aplicação **Servidor**,
  que se comunicam pela rede usando **Socket** e troca de **objetos serializados**.

---

## 📁 Estrutura do projeto

```
aula13/
├── Veiculo.java        # Classe de domínio (Parte 1)
├── Main.java           # Sistema de cadastro com menu (Parte 1)
├── veiculos.txt        # Arquivo de dados gerado em tempo de execução (Parte 1)
│
└── parte2/
    ├── Veiculo.java    # Classe de domínio serializável (Parte 2)
    ├── Servidor.java   # Recebe o objeto, cadastra e salva no arquivo
    ├── Cliente.java    # Lê os dados, cria o objeto e envia ao servidor
    └── veiculos.txt    # Arquivo de dados gerado pelo servidor
```

---

## 🚗 A classe `Veiculo`

A classe segue as boas práticas de orientação a objetos:

| Atributo         | Tipo     | Acesso              |
|------------------|----------|---------------------|
| `placa`          | `String` | privado (só `get`)  |
| `modelo`         | `String` | privado (só `get`)  |
| `marca`          | `String` | privado (só `get`)  |
| `anoFabricacao`  | `int`    | privado (só `get`)  |
| `quilometragem`  | `double` | privado (`get`/`set`) |

- Todos os atributos são **privados** (encapsulamento).
- Todos possuem método **`get`**.
- Apenas a **quilometragem** possui **`set`**, pois é o único dado que muda ao longo do tempo.

---

## 🧩 Parte 1 — Sistema de cadastro

Sistema com **menu em laço infinito** e as seguintes opções:

```
1 - Cadastrar veículo
2 - Alterar quilometragem do veículo
3 - Excluir veículo pelo número da placa
4 - Sair do sistema
```

### Como funciona

- Os veículos são mantidos em uma **lista** (`List<Veiculo>`) em memória.
- A cada operação, o veículo é **instanciado como objeto**, **adicionado à lista** e a **lista é gravada no arquivo** `veiculos.txt`.
- Ao iniciar, o sistema **carrega** os dados já existentes no arquivo.
- O armazenamento é feito em **arquivo texto**, com os campos separados por `;`:

```
ABC1234;Gol;Volkswagen;2020;45000.0
```

### Como executar

A partir da **raiz do projeto**:

```bash
# Java 22 ou superior (recomendado, não gera arquivos .class)
java aulas/aula13/Main.java
```

```bash
# Forma tradicional (compila e depois executa)
javac -encoding UTF-8 aulas/aula13/*.java
java aulas.aula13.Main
```

---

## 🌐 Parte 2 — Cliente × Servidor com Socket

A mesma lógica de cadastro, agora **dividida em dois programas** que se comunicam pela rede:

- **Servidor:** guarda a **lista** e o **arquivo** de veículos. Recebe o objeto, verifica se a placa já existe,
  cadastra, salva e responde **sucesso** ou **erro**.
- **Cliente:** **não tem acesso à lista**. Apenas lê os dados do teclado, **instancia o objeto `Veiculo`**
  e o **envia ao servidor**, exibindo a resposta recebida.

A troca de objetos pela rede usa **serialização** (a classe `Veiculo` implementa `Serializable`).

### Fluxo da comunicação

```
CLIENTE                               SERVIDOR
lê os dados do teclado
cria o objeto Veiculo
conecta no servidor  ───────────────► aguarda conexão (porta 12345)
envia o objeto       ───────────────► recebe o objeto
                                       verifica a placa
                                       cadastra na lista + salva no arquivo
exibe a resposta     ◄─────────────── responde "SUCESSO" ou "ERRO"
```

### Como executar

São necessários **dois terminais**, ambos abertos na **raiz do projeto**.

**Terminal 1 — iniciar o servidor primeiro:**

```bash
java aulas/aula13/parte2/Servidor.java
```

Aguarde a mensagem: `Servidor ligado na porta 12345. Aguardando clientes...`

**Terminal 2 — executar o cliente:**

```bash
java aulas/aula13/parte2/Cliente.java
```

> Forma tradicional (gera `.class`):
> ```bash
> javac -encoding UTF-8 aulas/aula13/parte2/*.java
> java aulas.aula13.parte2.Servidor
> java aulas.aula13.parte2.Cliente
> ```

---

## ✅ Requisitos atendidos

- [x] Programação orientada a objetos (encapsulamento, classe `Veiculo`, lista de objetos).
- [x] Atributos privados com `get`; apenas `quilometragem` com `set`.
- [x] Menu em laço infinito (Parte 1).
- [x] Manipulação de arquivo texto para persistência dos dados.
- [x] Objeto instanciado, adicionado à lista e lista atualizada no arquivo.
- [x] Comunicação Cliente × Servidor com Socket (Parte 2).
- [x] Envio de objeto `Veiculo` serializado pela rede.
- [x] Servidor retorna ao cliente se o cadastro foi efetuado com sucesso ou não.

---

## 🛠️ Tecnologias

- **Java** (testado com JDK 25)
- **Sockets** (`java.net`)
- **Serialização** (`java.io.Serializable`)
- **Manipulação de arquivos** (`java.io` — `BufferedReader` / `BufferedWriter`)

---

## 👤 Autor

Eduardo Butzen — Universidade Franciscana (UFN)
