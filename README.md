 # desenvolvimento de software i
aulas de desenvolvimento de software I com o professor João Siles 

# Como configurar o java no computador?
**donwload:** Acesse o site da Oracle e baixe o instalador adequado para Windows (x64 Installer).

**instalação:** Execute o arquivo baixado e siga as instruções na tela ***(clique em "Next" até concluir)***. O Java será instalado geralmente em ***C:\Program Files\Java\jdk-xx.***

**Configurar Variáveis de Ambiente (Essencial):**

1. Pesquise por "editar as variáveis de ambiente do sistema" no Windows
2. Clique em "Variáveis de Ambiente".
3. Em "Variáveis do Sistema", clique em "Novo" e crie ***JAVA_HOME*** com o caminho da pasta de instalação do JDK (ex: ***C:\Program Files\Java\jdk-21***).
4. Encontre a variável ***Path***, selecione-a, clique em "Editar" e depois em "Novo". ***Adicione %JAVA_HOME%\bin***.

**verificação:** Abra o Prompt de Comando (cmd) e digite ***java -version.*** Se a instalação foi bem-sucedida, a versão do Java instalada será exibida. 

# regras do java:


**Nome do Arquivo e Classe:**  Arquivos Java devem ter o mesmo nome da classe public neles contida. Ex: ***public class MinhaClasse*** deve estar em ***MinhaClasse.java.***

**Case Sensitivity (Maiúsculas/Minúsculas):** Java diferencia letras maiúsculas de minúsculas. ***String*** é diferente de ***string.***

**Estrutura da Classe:** ***public class NomeDaClasse { ... }***.

**Método Main:** O ponto de entrada é o ***public static void main(String[] args) { ... }***.

**Chaves:** Definem blocos de código ({ abre, } fecha)

# O que e java e como ele funciona?

java e uma linguagem de programação "antiga", com diferentes funções principalmente para o **backend**, dando uma "funcionalidade" para o site ou pagina que você esta fazendo, e possivel utilizalo em diferentes plataformas, como por exemplo **vscode**, permitindo você juntar com outras linguagens de programação. ele funciona primeiramente em "linguagem humana", sendo primeiramente nos codando o codigo, apos isso ele tgraduz para o *bytecode* (linguagem intermediaria do usuario e maquina), após isso o JMA traduz o *bytecode* para a linguagem da maquina, sendo ela expecifica para o tipo do seu computador (windows,linux, apple e etc). 

# Tutorial: Como criar um projeto Spring Boot

## 1. O que é Spring Boot?

O **Spring Boot** é uma ferramenta baseada no Spring Framework que facilita a criação de aplicações Java, principalmente APIs e aplicações web.

Com o Spring Boot, conseguimos criar projetos rapidamente sem precisar configurar manualmente várias dependências.

---

## 2. Pré-requisitos

Antes de começar, é necessário ter instalado:

- Java JDK 17 ou superior
- IntelliJ IDEA, Eclipse ou VS Code
- Maven (opcional, pois o projeto pode utilizar o Maven Wrapper)

Para verificar se o Java está instalado, abra o terminal e execute:

```bash
