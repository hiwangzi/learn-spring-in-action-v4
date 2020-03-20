package com.hiwangzi.chapter1;

import com.hiwangzi.chapter1.quest.Quest;
import com.hiwangzi.chapter1.quest.impl.RescueDamselQuest;
import com.hiwangzi.chapter1.knight.Knight;
import com.hiwangzi.chapter1.knight.impl.BraveKnight;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new RescueDamselQuest();
    }
}
