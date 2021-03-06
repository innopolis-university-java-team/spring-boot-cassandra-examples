package io.github.innopolis.university.java.team.book.api.model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

/**
 * project book-api
 * created 19.02.2022 09:40
 *
 * @author Alexander A. Kropotin
 */
@NoArgsConstructor
@Data
@FieldDefaults(
        level = AccessLevel.PRIVATE
)
@Table("book")
public final class Book {

    @PrimaryKey
    UUID id;

    String title;

    String description;

    boolean published;

    //Set<String> authors;
}
