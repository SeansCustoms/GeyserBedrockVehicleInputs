package org.geysermc.geyser.entity.vehicle;

import java.util.UUID;

public interface BedrockInputForwarder {
    void forwardInput(UUID uuid, float forward, float strafe, boolean jumping);
}
