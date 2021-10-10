package com.example.kj.service;


import com.example.kj.model.CardGroup;
import com.example.kj.repository.CardGroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class CardGroupService {
    private final CardGroupRepository cardGroupRepository;

    public List<CardGroup> getCardGroups() {
        return cardGroupRepository.findAll();
    }

    public CardGroup getCardGroup(Long cardGroupId) {
        return cardGroupRepository.findById(cardGroupId).orElse(null);
    }

    public void createCardGroup(CardGroup cardGroup) {
        cardGroupRepository.save(cardGroup);
    }

    public void updateCardGroup(Long cardGroupId, CardGroup cardGroup) {
        cardGroup.setId(cardGroupId);
        cardGroupRepository.save(cardGroup);
    }

    public void deleteCardGroup(Long cardGroupId) {
        cardGroupRepository.deleteById(cardGroupId);
    }





}
