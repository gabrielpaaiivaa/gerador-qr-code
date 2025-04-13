package com.geradorqrcode.qrcode_gerador.controller;


import com.geradorqrcode.qrcode_gerador.dto.QRCodeRequestDTO;
import com.geradorqrcode.qrcode_gerador.dto.QRCodeResponseDTO;
import com.geradorqrcode.qrcode_gerador.service.QRCodeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/qrcode")
@Tag(name = "QR Code", description = "Operações relacionadas ao QR Code")
public class QRCodeController {

    @Autowired
    private QRCodeService qrCodeService;

    @PostMapping
    @Operation(summary = "Gera um novo QR Code", description = "Gera um QR Code com base nos dados enviados no corpo da requisição")
    public QRCodeResponseDTO gerarQRCode(@RequestBody @Valid QRCodeRequestDTO dto){

        String imagemBase64 = qrCodeService.gerarQRCode(dto.getConteudo());
        return new QRCodeResponseDTO(imagemBase64);
    }
}
