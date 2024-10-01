package com.fraud_service.fraud_service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

public class CardServiceTest {

    @InjectMocks
    private CardService cardService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCardIsBlacklisted() {
        String blacklistedCard = "1234567812345678";
        assertTrue(cardService.isCardBlacklisted(blacklistedCard), "La tarjeta debería estar en la lista negra.");
    }

    @Test
    public void testCardIsNotBlacklisted() {
        String nonBlacklistedCard = "5555555555554444";
        assertFalse(cardService.isCardBlacklisted(nonBlacklistedCard), "La tarjeta no debería estar en la lista negra.");
    }
}
