package com.fraud_service.fraud_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/card")
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping("/check")
    public ResponseEntity<String> checkCard(@RequestParam String cardNumber) {
        boolean isBlacklisted = cardService.isCardBlacklisted(cardNumber);
        if (isBlacklisted) {
            return ResponseEntity.ok("La tarjeta está en la lista negra.");
        } else {
            return ResponseEntity.ok("La tarjeta no está en la lista negra.");
        }
    }
}
