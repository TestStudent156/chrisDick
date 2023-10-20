package com.myapp.tarotcollector.models;

import java.util.List;

public class Set {
    private int id;
    private String name;
    private List<Card> cards;

    public Set(int id, String name, List<Card> cards) {
        this.id = id;
        this.name = name;
        this.cards = cards;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public boolean isComplete() {
        for (Card card : cards) {
            if (!card.isCollected()) {
                return false;
            }
        }
        return true;
    }
}