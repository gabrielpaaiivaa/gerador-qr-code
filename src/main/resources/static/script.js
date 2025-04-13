function gerarQRCode() {
    const url = document.getElementById("url").value;

    if (!url) {
        alert("Por favor, digite uma URL!");
        return;
    }

    // Enviar a URL para o backend e gerar o QR Code
    fetch('http://localhost:8080/qrcode', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ conteudo: url })
    })
    .then(response => response.json())
    .then(data => {
        const imagemBase64 = data.imagemBase64;

        // Exibir o QR Code gerado
        const qrCodeImg = document.getElementById("qrCodeImg");
        qrCodeImg.src = "data:image/png;base64," + imagemBase64;
        qrCodeImg.style.display = "block";

        // Criar o link de download
        const downloadLink = document.getElementById("downloadLink");
        downloadLink.href = qrCodeImg.src;
        downloadLink.style.display = "inline-block";
    })
    .catch(error => {
        console.error("Erro ao gerar o QR Code:", error);
    });
}
