package com.hiwangzi.knight.impl;

import com.hiwangzi.knight.Knight;
import com.hiwangzi.quest.impl.RescueDamselQuest;

public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
