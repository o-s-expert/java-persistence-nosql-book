package expert.os.books.persistence.nosql.chapter14;

import jakarta.nosql.Column;
import jakarta.nosql.Entity;
import jakarta.nosql.Id;

@Entity
public record Book(@Id String isbn, @Column String title, @Column String publisher, int edition) {
}
