package com.hiwangzi.chapter1;

import com.hiwangzi.chapter1.knight.Knight;
import com.hiwangzi.chapter1.knight.impl.BraveKnight;
import com.hiwangzi.chapter1.knight.impl.LifecycleKnight;
import com.hiwangzi.chapter1.quest.Quest;
import com.hiwangzi.chapter1.quest.impl.RescueDamselQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifecycleKnightConfig {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Knight knight() {
        return new LifecycleKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new RescueDamselQuest();
    }
}
