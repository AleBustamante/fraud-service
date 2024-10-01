package com.fraud_service.fraud_service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Service
public class CardService {

    private Set<String> blacklistedCards = new HashSet<>(Arrays.asList(
            "1234567812345678", // Ejemplo de tarjetas en la lista negra
            "9876543210987654",
            "1111222233334444"
    ));

    public boolean isCardBlacklisted(String cardNumber) {
        return blacklistedCards.contains(cardNumber);
    }
}
