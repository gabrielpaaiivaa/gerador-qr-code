package com.geradorqrcode.qrcode_gerador.controller;


import com.geradorqrcode.qrcode_gerador.dto.QRCodeRequestDTO;
import com.geradorqrcode.qrcode_gerador.service.QRCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QRCodeController {

    @Autowired
    private QRCodeService qrCodeService;

    @PostMapping
    public String gerarQRCode(@RequestBody QRCodeRequestDTO dto){
        return qrCodeService.gerarQRCode(dto);
    }
}
