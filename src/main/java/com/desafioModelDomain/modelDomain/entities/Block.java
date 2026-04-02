package com.desafioModelDomain.modelDomain.entities;

import java.time.Instant;

public class Block {

    private Integer id;
    private Instant start;
    private Instant end;

    public Block() {

    }

    public Block(Integer id, Instant start, Instant end) {
        this.id = id;
        this.start = start;
        this.end = end;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getStart() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public Instant getEnd() {
        return end;
    }

    public void setEnd(Instant end) {
        this.end = end;
    }
}
