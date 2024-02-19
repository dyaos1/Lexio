package dev.be.modulecommon.enums;

public enum Suit {
    CLUB(1), HEART(2), DIAMOND(3), SPADE(4);

    private final int value;

    Suit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
