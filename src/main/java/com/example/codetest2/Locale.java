package com.example.codetest2;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Locale {

    @Getter
    protected String name;

    @NonNull
    @Getter
    private int length;

    @NonNull
    @Getter
    private int width;

    protected void setName(String name) {
        this.name = name;
    }

    abstract void checkPosition(int x, int y) throws Exception;
}
