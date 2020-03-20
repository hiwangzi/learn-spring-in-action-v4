package com.hiwangzi.chapter1.quest.impl;

import com.hiwangzi.chapter1.quest.Quest;

public class RescueDamselQuest implements Quest {

    @Override
    public void embark() {
        System.out.println("Rescue damsel quest embarked");
    }
}
