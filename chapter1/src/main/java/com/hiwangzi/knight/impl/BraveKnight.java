package com.hiwangzi.knight.impl;

import com.hiwangzi.knight.Knight;
import com.hiwangzi.quest.Quest;

public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
