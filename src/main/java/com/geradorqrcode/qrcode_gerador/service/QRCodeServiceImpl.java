package com.geradorqrcode.qrcode_gerador.service;

import com.geradorqrcode.qrcode_gerador.dto.QRCodeRequestDTO;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import org.springframework.stereotype.Service;
import com.google.zxing.client.j2se.MatrixToImageWriter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;

@Service
public class QRCodeServiceImpl implements QRCodeService{

    @Override
    public String gerarQRCode(QRCodeRequestDTO dto) {
        try {
            String texto = dto.getConteudo();

            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix matrix = qrCodeWriter.encode(texto, BarcodeFormat.QR_CODE, 250, 250);

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(matrix, "PNG", outputStream);

            byte[] qrCodeBytes = outputStream.toByteArray();
            String base64 = Base64.getEncoder().encodeToString(qrCodeBytes);

            return base64;

        } catch (WriterException | IOException e){
            throw new RuntimeException("Erro ao gerar QR Code", e);
        }
    }
}
