## Descrição

O **buscaCep** é uma aplicação simples desenvolvida em Java que permite aos usuários buscar informações de endereço utilizando um CEP (Código de Endereçamento Postal) brasileiro. A aplicação utiliza a API pública do ViaCEP para realizar as consultas e retorna dados como rua, bairro, cidade, estado, entre outros.

## Funcionalidades

- Buscar informações de endereço a partir de um CEP válido.
- Retornar dados detalhados como logradouro, bairro, cidade, estado e mais.
- Exibir mensagens de erro apropriadas para CEPs inválidos ou não encontrados.
- Criar um arquivo JSON no diretório do projeto com o nome do CEP consultado, contendo as informações de endereço.

## Tecnologias Utilizadas

- Java
- Gson (para manipulação de dados JSON)
- HttpURLConnection (para realizar chamadas HTTP)

## Instalação

1. Clone este repositório para o seu ambiente local:
   ```bash
   git clone https://github.com/vinecwb/buscaCep.git
2. Navegue até o diretório do projeto:

   ```bash
    cd buscaCep
3. Importe o projeto em sua IDE preferida (IntelliJ, Eclipse, etc.).

4. Adicione a biblioteca Gson ao seu projeto. Você pode fazer isso baixando o JAR do Gson ou utilizando um gerenciador de dependências como Maven ou Gradle. Exemplo com Maven:

   ```xml
    <dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.8</version>
    </dependency>
## Uso
Para usar a aplicação, execute o método main da classe principal (Main.java).

Você será solicitado a inserir um CEP. Digite um CEP válido e pressione Enter. A aplicação realizará a consulta e exibirá as informações de endereço correspondentes. Além disso, um arquivo JSON será criado no diretório do projeto com o nome do CEP consultado, contendo as informações de endereço.

Exemplo
```plaintext
Digite o CEP: 01001000
Resultado:
  "logradouro": "Praça da Sé",
  "cep": "01001-000",
  "localidade": "São Paulo",
  "uf": "SP"
