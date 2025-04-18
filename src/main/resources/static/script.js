function gerarQRCode() {
  const conteudo = document.getElementById("conteudo").value;
  const qrcodeDiv = document.getElementById("qrcode");
  const downloadBtn = document.getElementById("downloadBtn");

  if (!conteudo) {
    alert("Digite algum conteúdo!");
    return;
  }

  qrcodeDiv.innerHTML = "";
  downloadBtn.style.display = "none";

  QRCode.toDataURL(conteudo, { width: 250, margin: 2 }, function (err, url) {
    if (err) {
      console.error(err);
      return;
    }

    const img = document.createElement("img");
    img.src = url;
    qrcodeDiv.appendChild(img);

    downloadBtn.style.display = "inline-block";
    downloadBtn.onclick = function () {
      const a = document.createElement("a");
      a.href = url;
      a.download = "qrcode.png";
      a.click();
    };
  });
}
