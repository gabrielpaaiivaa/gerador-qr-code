package com.geradorqrcode.qrcode_gerador.service;

import com.geradorqrcode.qrcode_gerador.dto.QRCodeRequestDTO;

public interface QRCodeService {
    String gerarQRCode(QRCodeRequestDTO dto);
}
