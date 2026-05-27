<div align="center">

# 💼 Sistema de Folha de Pagamento

### Projeto desenvolvido em Java utilizando Programação Orientada a Objetos (POO)

<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>

<img src="https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge"/>

<img src="https://img.shields.io/badge/POO-Herança%20%7C%20Polimorfismo-blueviolet?style=for-the-badge"/>

</div>

---

# 📖 Sobre o Projeto

Este projeto simula um sistema simples de **folha de pagamento**, desenvolvido para fins acadêmicos na disciplina de **Algoritmos e Programação** da Una (curso: Análise e Desenvolvimento de Sistemas) através da plataforma DreamShaper.

O sistema permite cadastrar 3 diferentes tipos de funcionários e calcular automaticamente seus salários de acordo com suas características (padrão, comissionado e produção).

Tudo isso utilizando conceitos fundamentais da **Programação Orientada a Objetos**, como:

- Herança
- Polimorfismo
- Sobrescrita de métodos
- Encapsulamento
- Classes e Objetos

---

# ✨ Funcionalidades

✔️ Cadastro de funcionários  
✔️ Funcionários armazenados em `ArrayList`  
✔️ Menu interativo no terminal  
✔️ Cálculo automático de salários  
✔️ Folha de pagamento completa  
✔️ Diferentes tipos de funcionários  
✔️ Aplicação de conceitos de POO  

---

# 👨‍💼 Tipos de Funcionários

## 🧍 Funcionário Padrão

Recebe apenas o salário base.

---

## 💰 Funcionário Comissionado

Recebe:
- salário base
- comissão sobre as vendas realizadas naquele mês

### Fórmula da comissão

```java
comissao = venda * (percentual / 100);
```

---

## 🏭 Funcionário Produção

Recebe:
- salário base
- bônus pela produtividade mental

### Fórmula da produtividade

```java
bonus = qtdPecas * valorPeca;
```

---

# 🧠 Conceitos Aplicados

Este projeto utiliza conceitos fundamentais da linguagem Java:

| Conceito | Aplicação |
|---|---|
| Classes e Objetos | Estrutura principal do sistema |
| Herança | Classes filhas herdando da classe `Funcionario` |
| Polimorfismo | Métodos diferentes para cada funcionário |
| `@Override` | Sobrescrita de métodos |
| `ArrayList` | Armazenamento dinâmico |
| `Scanner` | Entrada de dados |
| `switch` | Controle do menu |
| `do while` | Repetição do sistema |

---

# 🖥️ Demonstração

```text
--- MENU CADASTRO DE FUNCIONÁRIO ---

1 - Cadastrar funcionário padrão
2 - Cadastrar funcionário comissionado
3 - Cadastrar Funcionário Produção
4 - Cadastrar funcionário de produçã
0 - Encerrar
```

---

# 💸 Exemplo da Folha de Pagamento

```text
--- FUNCIONÁRIOS / FOLHA DE PAGAMENTO ---
Quantidade de funcionários cadastrados: 3

Nome: Pedro
Matrícula: 398
Tipo de funcionário: Padrão
Salário fixo: 2000.0
Extras: 0.00
Salário final: 2000.0

Nome: Joana
Matrícula: 241
Tipo de funcionário: Comissionado
Salário fixo: 2000.0
Comissão: 200.0
Salário final: 2200.0

Nome: Sam
Matrícula: 567
Tipo de funcionário: Produção
Salário fixo: 2000.0
Produtividade: 100.0
Salário final: 2100.0
```

---

# 📂 Estrutura do Projeto

```text
📦 Sistema-Folha-de-Pagamento
 ┣ 📦 Dreamshaper AlgProg
    ┣ 📜Comissionado.java
    ┣ 📜Funcionario.java
    ┣ 📜Padrao.java
    ┣ 📜Producao.java
    ┣ 📜SistemaPagamento.java
 ┗ 📜 LICENSE
 ┗ 📜 README.md
```

---

# 🚀 Como Executar

## 1️⃣ Clone (ou baixe) o repositório

```bash
git clone https://github.com/Vyn-Lazarotti/Sistema-Folha-de-Pagamento
```

---

## 2️⃣ Abra em uma IDE Java

Recomendadas:

- Visual Studio Code/Zed (necessário a instalação de extensão Java)
- IntelliJ IDEA
- NetBeans
- Eclipse

---

## 3️⃣ Execute o arquivo

```text
SistemaPagamento.java
```

---

# 🛠️ Tecnologias Utilizadas

<div align="left">

- Java
- Programação Orientada a Objetos (POO)
- Visual Studio Code

</div>

---

# 🎯 Objetivo Acadêmico

O objetivo deste projeto foi praticar:

- lógica de programação
- estruturação de sistemas
- orientação a objetos
- manipulação de listas
- cálculos de salários
- menus interativos
- organização de código em Java

---

# 📚 Aprendizados

Durante o desenvolvimento deste projeto foram reforçados conhecimentos sobre:

✔️ Herança  
✔️ Polimorfismo  
✔️ Estruturas de repetição  
✔️ Estruturas condicionais  
✔️ Métodos  
✔️ Classes abstratas e reutilização de código  

---

<div align="center">
