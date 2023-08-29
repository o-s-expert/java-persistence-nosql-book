/*
 * Copyright (c) 2022 Contributors to the Eclipse Foundation
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *  The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *  and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 * You may elect to redistribute this code under either of these licenses.
 */

package expert.os.books.persistence.nosql.chapter13;


import jakarta.nosql.Column;
import jakarta.nosql.Entity;
import jakarta.nosql.Id;

import java.util.List;
import java.util.Objects;


@Entity("Person")
public class Person {

    @Id("id")
    private long id;

    @Column
    private String name;

    @Column
    private List<String> phones;


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public List<String> getPhones() {
        return phones;
    }


    public Person() {
    }

    Person(long id, String name, List<String> phones) {
        this.id = id;
        this.name = name;
        this.phones = phones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phones=" + phones +
                '}';
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }
}
