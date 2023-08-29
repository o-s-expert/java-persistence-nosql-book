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


import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import jakarta.nosql.column.ColumnTemplate;
import org.eclipse.jnosql.databases.cassandra.mapping.CassandraTemplate;

import java.util.Arrays;
import java.util.Optional;


public class App {


    public static void main(String[] args) {

        try(SeContainer container = SeContainerInitializer.newInstance().initialize()) {

            Person otaviojava = Person.builder().phones(Arrays.asList("123456", "432"))
                    .name("Name").id(1).build();

            ColumnTemplate template =  container.select(CassandraTemplate.class).get();
            Person saved = template.insert(otaviojava);
            System.out.println("Person saved" + saved);

            Optional<Person> person = template.select(Person.class)
                    .where("id").eq(1L).singleResult();
            System.out.println("Entity found: " + person);

        }
    }

    private App() {}
}
