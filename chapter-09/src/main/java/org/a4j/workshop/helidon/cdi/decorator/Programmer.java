package org.a4j.workshop.helidon.cdi.decorator;

import javax.enterprise.context.ApplicationScoped;
import java.util.logging.Logger;

@ApplicationScoped
public class Programmer implements Worker {

    private static final Logger LOGGER = Logger.getLogger(Programmer.class.getName());

    @Override
    public String work(String job) {
        return "A programmer has received a job, it will convert coffee in code: " + job;
    }
}
