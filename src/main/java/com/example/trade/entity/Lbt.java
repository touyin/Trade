package com.example.trade.entity;

public class Lbt {
    Message message;
    Meta meta;

    public Lbt(Message message, Meta meta) {
        this.message = message;
        this.meta = meta;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
