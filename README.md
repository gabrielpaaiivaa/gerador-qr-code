
# 🔳 Gerador de QR Code

Projeto fullstack para geração de QR Codes usando **Spring Boot** no backend e **HTML + CSS + JavaScript** no frontend. A aplicação permite gerar QR Codes a partir de qualquer conteúdo e fazer o download como imagem PNG.

## 🚀 Tecnologias Utilizadas

### Backend:
- Java 17  
- Spring Boot  
- Spring Web  
- Jakarta Validation  
- ZXing (geração de QR Code)  
- Swagger/OpenAPI

### Frontend:
- HTML5  
- CSS3  
- JavaScript

## 💻 Como Executar o Projeto

### 🧩 Backend (Spring Boot)

1. Clone o repositório:
```
git clone https://github.com/seu-usuario/gerador-qrcode.git
cd gerador-qrcode
```

2. Execute o backend:
- Via IDE (IntelliJ, Eclipse, VS Code)
- Ou pelo terminal:
```
./mvnw spring-boot:run
```

3. O backend estará disponível em:  
`http://localhost:8080/qrcode`

4. Teste a API no Swagger:  
`http://localhost:8080/swagger-ui/index.html`

## ✨ Funcionalidades

- ✅ Geração de QR Codes a partir de qualquer conteúdo  
- ✅ Download da imagem gerada  
- ✅ Interface simples e rápida  
- ✅ Integração com API Java Spring  
- ✅ Documentação via Swagger

## 🧪 Exemplos de Uso

**POST /qrcode**
```json
{
  "conteudo": "https://github.com/seu-usuario"
}
```

**Resposta:**
```json
{
  "imagemBase64": "iVBORw0KGgoAAAANSUhEUgAA..."
}
```

## 📌 Status

🟢 Projeto funcional e finalizado  

## 🤝 Contribuição

Pull Requests são bem-vindos!  
Se quiser sugerir melhorias ou abrir issues, fique à vontade.

## 🧑‍💻 Autor
Gabriel Paiva
Desenvolvido por **Gabriel**  
🚀 GitHub: [gabrielpaaiivaa](https://github.com/gabrielpaaiivaa)
