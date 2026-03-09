package crystal.group.guardCorePaper.data;

import org.bukkit.entity.Player;

import java.util.UUID;

public class PlayerData {
    private final UUID uuid;
    private final String playerName;

    private double lastX, lastY, lastZ;
    private double deltaX, deltaY, deltaZ;
    private boolean onGround;
    private int airTicks;

    private long lastAttackTime;
    private int clicksPerSecond;

    private final java.util.Map<String, Double> violations = new java.util.HashMap<>();
    public PlayerData(Player player) {
        this.uuid = player.getUniqueId();
        this.playerName = player.getName();
    }
    public void addViolation(String checkName, double amount) {
        violations.merge(checkName, amount, Double::sum);
    }
    public double getViolationLevel(String checkName) {
        return violations.getOrDefault(checkName, 0.0);
    }
    public void resetViolations(String checkName) {
        violations.remove(checkName);
    }

    public UUID getUuid() { return uuid; }
    public String getPlayerName() { return playerName; }

    public double getLastX() { return lastX; }
    public double getLastY() { return lastY; }
    public double getLastZ() { return lastZ; }

    public void setLastX(double lastX) { this.lastX = lastX; }
    public void setLastY(double lastY) { this.lastY = lastY; }
    public void setLastZ(double lastZ) { this.lastZ = lastZ; }

    public double getDeltaX() { return deltaX; }
    public double getDeltaY() { return deltaY; }
    public double getDeltaZ() { return deltaZ; }

    public void setDeltaX(double deltaX) { this.deltaX = deltaX; }
    public void setDeltaY(double deltaY) { this.deltaY = deltaY; }
    public void setDeltaZ(double deltaZ) { this.deltaZ = deltaZ; }

    public boolean isOnGround() { return onGround; }
    public void setOnGround(boolean onGround) { this.onGround = onGround; }

    public int getAirTicks() { return airTicks; }
    public void setAirTicks(int airTicks) { this.airTicks = airTicks; }

    public long getLastAttackTime() { return lastAttackTime; }
    public void setLastAttackTime(long lastAttackTime) { this.lastAttackTime = lastAttackTime; }

    public int getClicksPerSecond() { return clicksPerSecond; }
    public void setClicksPerSecond(int clicksPerSecond) { this.clicksPerSecond = clicksPerSecond; }
}
