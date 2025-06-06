# Timepedia

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![Google Gemini](https://img.shields.io/badge/google%20gemini-8E75B2?style=for-the-badge&logo=google%20gemini&logoColor=white)

# Sobre o projeto

Esse repositório é uma api feita em Java + Spring com integração do sdk do Google Gemini para a geração dos resumos da história de um determinado time de futebol.
A api possui apenas um endpoint que tem um query parametro obrigatório "team", que recebe o time que o usuário quer ler um breve resumo de sua história.

# Como rodar o projeto

1 - Clone o repositório e navegue até o diretório gerado
```bash
    git clone http://github.com/gabrielferrreira02/timepedia.git
    cd timepedia
```

2 - Gere o arquivo jar
```bash
    mvn clean install
```

3 - Faça o build do Dockerfile
```bash
    docker build -t timepedia .
```

>[!NOTE]
> Para obter sua api key acesse: https://aistudio.google.com/app/apikey

4 - Inicie o container
```bash
    docker run -e GOOGLE_API_KEY=sua_api_key -p 8080:8080 timepedia
```

5 - Agora faça uma requisição para o seguinte endpoint
```
    http://localhost:8080/api/summary?team=vasco%20da%20gama
```

Se o time for reconhecido pela api do gemini a resposta será como o exemplo a seguir:
```json
{"response":"O Club de Regatas Vasco da Gama, fundado em 1898..."}
```

Caso contrário essa será a resposta:
```json
{"response":"Desculpe, não conheço o time\n"}
```