package com.example.codetest2.locale;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Locale {

    @Getter
    private String name;

    @NonNull
    @Getter
    private int length;

    @NonNull
    @Getter
    private int width;

    protected void setName(String name) {
        this.name = name;
    }

    public abstract void checkPosition(int x, int y) throws Exception;
}
