package com.example.kj.service;


import java.util.List;

import com.example.kj.model.Card;
import com.example.kj.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardService {
    private final CardRepository cardRepository;

    public List<Card> getCards() {
        return cardRepository.findAll();
    }

    public Card getCard(Long cardId) {
        return cardRepository.findById(cardId).orElse(null);
    }

    public void createCard(Card card) {
        cardRepository.save(card);
    }

    public void updateCard(Long cardId, Card card) {
        card.setId(cardId);
        cardRepository.save(card);
    }

    public void deleteCard(Long cardId) {
        cardRepository.deleteById(cardId);
    }


}
