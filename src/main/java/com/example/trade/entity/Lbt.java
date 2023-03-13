package com.example.trade.entity;

import java.util.List;

public class Lbt {
    List<Message> message;
    Meta meta;

    public Lbt(List<Message> message, Meta meta) {
        this.message = message;
        this.meta = meta;
    }

    public List<Message> getMessage() {
        return message;
    }

    public void setMessage(List<Message> message) {
        this.message = message;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
