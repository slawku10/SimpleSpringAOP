package com.github.slawku10.simpleaopspring.components;

public class BraveKnight implements Knight {
    private Quest quest;


    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
