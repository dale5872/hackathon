package com.contestantbots.util;

import com.contestantbots.util.GameStateLogger;
import com.scottlogic.hackathon.client.Client;
import com.scottlogic.hackathon.game.Bot;
import com.scottlogic.hackathon.game.GameState;
import com.scottlogic.hackathon.game.Move;

public abstract class move implements Move {
    private UUID playerID;
    private Direction direction;
    private Map currentMap;

    public move (UUID playerID, Direction direction, Map currentMap) {
        this.playerID = playerID;
        this.direction = direction;
        this.currentMap = currentMap;
    }

    @Override
    public UUID getThisPlayer() {
        return this.playerID;
    }

    @Override
    public Direction getCurrDirection() {
        return this.direction;
    }

    public Map getCurrentMap() {
        return this.currentMap;
    }

    


}
