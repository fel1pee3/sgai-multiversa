# 🏠 **Sistema de Gestão de Aluguéis de Imóveis**

## 📖 **Descrição**

O **Sistema de Gestão de Aluguéis de Imóveis** foi desenvolvido com o objetivo de controlar e organizar os processos relacionados ao aluguel de imóveis, facilitando a gestão para proprietários, inquilinos e administradores.

Com esse sistema, é possível cadastrar imóveis, proprietários, inquilinos e gerenciar contratos de aluguel. O sistema oferece funcionalidades como controle de status de aluguel, geração de relatórios, e registro de pagamentos, tornando a administração de imóveis mais eficiente.

---

## 🚀 **Funcionalidades**

- **Cadastro de Imóveis**: Cadastro de imóveis disponíveis para aluguel, incluindo informações como endereço, tipo de imóvel (casa, apartamento, etc.), e preço de aluguel.
- **Cadastro de Proprietários e Inquilinos**: Cadastro de dados de proprietários de imóveis e inquilinos, com informações de contato.
- **Registro de Contratos de Aluguel**: Gerenciamento de contratos de aluguel, com datas de início e término, associando imóveis a inquilinos.
- **Controle de Status de Aluguel**: Controle do status de aluguel (ativo, finalizado, cancelado).
- **Relatórios**: Geração de relatórios sobre imóveis alugados, inquilinos com contratos ativos e receitas geradas pelos aluguéis.

---

## 💻 **Tecnologias Utilizadas**

- **Backend**: Spring Boot 3.4.0
- **Banco de Dados**: MySQL

---

## ⚙️ **Pré-requisitos**

Para rodar este projeto localmente, você precisa ter:

- **Java 17** instalado.
- **Maven** instalado para gerenciar dependências e build do projeto.
- **MySQL** configurado e rodando em sua máquina.

---

## 💻 **Configuração do Ambiente**

### 1. Clonar o Repositório

```bash
git clone https://github.com/fel1pee3/SAW-multiversa.git
```

### 2. Criar o Banco de dados

```bash
create databade sgai
```

### 3. Configuração do Banco de Dados

```bash
spring.application.name=sgai

spring.datasource.url=jdbc:mysql://localhost:3306/sgai
spring.datasource.username=root
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
```

---

## 📚 **Dependências**

```bash
<dependencies>
    <!-- Spring Boot Starter Web - Para criar aplicações web RESTful -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Boot Starter Data JPA - Para trabalhar com JPA e Hibernate -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- PostgreSQL Driver - Para conectar com o banco de dados PostgreSQL -->
    <dependency>
        <groupId>org.mysql</groupId>
        <artifactId>mysql</artifactId>
    </dependency>

    <!-- Spring Boot DevTools - Para facilitar o desenvolvimento com reinicializações rápidas -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Lombok - Para reduzir código boilerplate (getters, setters, etc.) -->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

---

## 🛠 **Instruções para Executar**

### 1. Para rodar o projeto localmente, execute o seguinte comando:

```bash
mvn spring-boot:run
```

### 2. Ou, se preferir empacotar o projeto em um arquivo JAR, use:

```bash
mvn clean package
java -jar target/first-spring-app.jar
```

---

## 📚 **Estrutura do Banco de Dados**

### O sistema utiliza as seguintes tabelas para gerenciar os dados:

 - Imóveis (imoveis): Armazena informações sobre os imóveis disponíveis para aluguel.
 - Proprietários (proprietarios): Armazena informações sobre os proprietários dos imóveis.
 - Inquilinos (inquilinos): Armazena informações sobre os inquilinos que alugam os imóveis.
 - Aluguéis (alugueis): Registra os contratos de aluguel, com detalhes como data de início, término e status.

---

## 📝 **Como Contribuir**

1. Faça um fork do projeto.
2. Crie uma branch para sua feature:
   ```bash
   git checkout -b minha-feature
   ```
3. Commit suas alterações:
   ```bash
   git commit -m 'Adiciona nova feature'
   ```
4. Envie para a branch principal:
   ```bash
   git push origin minha-feature
   ```
5. Abra um Pull Request.

---

## 📄  **Licença**

Este projeto está sob a licença MIT.
