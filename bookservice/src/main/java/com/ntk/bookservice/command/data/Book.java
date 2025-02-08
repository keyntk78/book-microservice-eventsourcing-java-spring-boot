package com.ntk.bookservice.command.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
public class Book {
    @Id
    private String id;
    private String name;
    private String author;
    private Boolean isReady;
}
