package com.hiwangzi.chapter1.knight.impl;

import com.hiwangzi.chapter1.knight.Knight;
import com.hiwangzi.chapter1.quest.Quest;

public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
