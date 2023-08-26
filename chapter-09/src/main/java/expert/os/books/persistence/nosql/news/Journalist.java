package expert.os.books.persistence.nosql.news;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;

@ApplicationScoped
public class Journalist {

    @Inject
    private Event<News> event;

    @Inject
    @Specific
    private Event<News> specificEvent;

    public void receiveNews(News news) {
        this.event.fire(news);
    }

    public void specificNews(News news) {
        this.specificEvent.fire(news);
    }
}
