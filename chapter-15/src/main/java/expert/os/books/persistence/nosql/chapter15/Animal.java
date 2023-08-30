package expert.os.books.persistence.nosql.chapter15;

import jakarta.nosql.Column;
import jakarta.nosql.Id;

public record Animal(@Id Long id, @Column String name) {
}
