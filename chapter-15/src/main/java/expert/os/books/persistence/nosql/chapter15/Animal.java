package expert.os.books.persistence.nosql.chapter15;

import jakarta.nosql.Column;
import jakarta.nosql.Entity;
import jakarta.nosql.Id;


@Entity
public record Animal(@Id Long id, @Column String name) {


    public static Animal of(String name){
        return new Animal(null, name);
    }
}
