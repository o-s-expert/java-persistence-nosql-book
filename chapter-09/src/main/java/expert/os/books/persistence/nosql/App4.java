package expert.os.books.persistence.nosql;

import expert.os.books.persistence.nosql.news.Journalist;
import expert.os.books.persistence.nosql.news.News;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class App4 {

    public static void main(String[] args) {

        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            Journalist journalist = container.select(Journalist.class).get();
            journalist.receiveNews(News.of("Java 17 has arrived!!"));
            journalist.specificNews(News.of("That is a exclusive interview of the spec leader of Java 17"));
        }
    }
}
