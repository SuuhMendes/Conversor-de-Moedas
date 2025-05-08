
# Conversor de Moeda

Este é um projeto em Java que permite converter valores entre diferentes moedas utilizando taxas de câmbio atualizadas em tempo real por meio da API da [ExchangeRate](https://www.exchangerate-api.com/).

## Funcionalidades

- Conversão entre moedas com valores atualizados da internet
- Interface interativa via console
- Solicitação da chave de API diretamente no início da execução
- Arquitetura simples e orientada a objetos

## Requisitos

- Java 17 ou superior
- Conexão com a internet

## Como usar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/ConversorDeMoeda.git
``

2. Compile o projeto com sua IDE favorita (IntelliJ, Eclipse etc.) ou via terminal

3. Execute o arquivo `Main.java`

4. Ao iniciar o programa, será exibida a seguinte mensagem:

   ```
   Digite sua chave API Key :
   ```

5. Após inserir a chave, o programa estará pronto para realizar conversões entre moedas.

## Obtenção da API Key

Para utilizar este conversor, você precisa de uma **API Key gratuita** do site ExchangeRate. Siga os passos abaixo:

1. Acesse: [https://www.exchangerate-api.com](https://www.exchangerate-api.com)
2. Clique em **"Get Free API Key"**
3. Cadastre-se com seu e-mail
4. Copie a chave fornecida após o cadastro. 

Essa chave será usada para autenticar as requisições às taxas de câmbio.

> **Importante:** o sistema solicitará essa chave no console sempre que for executado.

## Licença

Este projeto está licenciado sob a licença MIT.


