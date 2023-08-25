package org.a4j.workshop.helidon.cdi;

import org.a4j.workshop.helidon.cdi.producer.NumberLogger;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import java.math.BigDecimal;

public class App3 {

    public static void main(String[] args) {

        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            BigDecimal value = container.select(BigDecimal.class).get();
            NumberLogger logger = container.select(NumberLogger.class).get();
            logger.log(value);
        }
    }
}
