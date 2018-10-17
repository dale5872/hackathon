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

    private boolean canMove(final GameState gameState, final List<Position> nextPositions, final Player player, final Direction direction) {
        Set<Position> outOfBounds = gameState.getOutOfBoundsPositions();
        Position newPosition = gameState.getMap().getNeighbour(player.getPosition(), direction);
        if (!nextPositions.contains(newPosition)
                && !outOfBounds.contains(newPosition)) {
            nextPositions.add(newPosition);
            return true;
        } else {
            return false;
        }
    }
}
