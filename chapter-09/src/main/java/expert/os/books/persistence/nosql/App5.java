package expert.os.books.persistence.nosql;

import expert.os.books.persistence.nosql.decorator.Worker;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class App5 {

    public static void main(String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            Worker worker = container.select(Worker.class).get();
            String work = worker.work("Just a single button");
            System.out.println("The work result: " + work);
        }
    }
}
