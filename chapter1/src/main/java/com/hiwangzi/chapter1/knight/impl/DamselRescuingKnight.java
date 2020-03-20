package com.hiwangzi.chapter1.knight.impl;

import com.hiwangzi.chapter1.knight.Knight;
import com.hiwangzi.chapter1.quest.impl.RescueDamselQuest;

public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
