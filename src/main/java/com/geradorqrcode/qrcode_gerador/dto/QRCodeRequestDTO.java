package com.geradorqrcode.qrcode_gerador.dto;
import jakarta.validation.constraints.NotBlank;
public class QRCodeRequestDTO {

    @NotBlank(message = "O conteúdo do QR Code não pode estar em branco.")
    private String conteudo;

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}

