package org.a4j.workshop.helidon.cdi;

import org.a4j.workshop.helidon.cdi.music.Orchestra;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class App2 {

    public static void main(String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            Orchestra orchestra = container.select(Orchestra.class).get();
            orchestra.percussion();
            orchestra.keyboard();
            orchestra.string();
            orchestra.solo();
            orchestra.allSound();

        }
    }
}
