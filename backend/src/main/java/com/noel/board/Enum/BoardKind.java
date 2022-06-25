package com.noel.board.Enum;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
public enum BoardKind {
    KOREA("KOREA"),
    ASIA("ASIA"),
    EUROPE("EUROPE"),
    NA("NA"),
    SA("SA"),
    AUSTRALIA("AUSTRALIA"),
    AFRICA("AFRICA");

    String name;

    BoardKind(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
