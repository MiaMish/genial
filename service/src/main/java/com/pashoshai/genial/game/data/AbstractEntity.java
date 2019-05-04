package com.pashoshai.genial.game.data;

import java.io.Serializable;

public abstract class AbstractEntity<T> implements Serializable {
    private T id;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

}
