package com.geradorqrcode.qrcode_gerador.dto;

public class QRCodeResponseDTO {

    private String imagemBase64;

    public QRCodeResponseDTO() {
    }

    public QRCodeResponseDTO(String imagemBase64) {
        this.imagemBase64 = imagemBase64;
    }

    public String getImagemBase64() {
        return imagemBase64;
    }

    public void setImagemBase64(String imagemBase64) {
        this.imagemBase64 = imagemBase64;
    }
}