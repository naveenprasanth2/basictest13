package org.example.practise1;

public enum Cereals {
    CAPTAIN_CRUNCH(50),
    FRUIT_LOOPS(60),
    RECESS_PUFFS(20),
    COCOA_PUFFS(30);
    final int levelOfDeliciousNess;
    Cereals(int levelOfDeliciousNess) {
        this.levelOfDeliciousNess = levelOfDeliciousNess;
    }
}
