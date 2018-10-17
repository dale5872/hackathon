package com.contestantbots.util;

import com.scottlogic.hackathon.game.*;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public class MoveImpl implements Move {
    private UUID playerId;
    private Direction direction;

    public MoveImpl(UUID playerId, Direction direction) {
        this.playerId = playerId;
        this.direction = direction;
    }

    @Override
    public UUID getPlayer() {
        return playerId;
    }
    @Override
    public Direction getDirection() {
        return direction;
    }



}
