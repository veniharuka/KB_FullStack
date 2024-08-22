package org.example.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name="todo")
    private String todo;
    @Column(name="done")
    private boolean done;


    public Todo() {
    }

    public Todo(Long id, String todo, boolean done) {
        this.id = id;
        this.todo = todo;
        this.done = done;
    }
}
