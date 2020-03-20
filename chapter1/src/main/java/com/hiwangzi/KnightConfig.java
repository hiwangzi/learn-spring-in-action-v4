package com.hiwangzi;

import com.hiwangzi.knight.Knight;
import com.hiwangzi.knight.impl.BraveKnight;
import com.hiwangzi.quest.Quest;
import com.hiwangzi.quest.impl.RescueDamselQuest;
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
