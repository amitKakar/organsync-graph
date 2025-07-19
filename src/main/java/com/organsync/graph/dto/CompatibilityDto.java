package com.organsync.graph.dto;

import java.util.UUID;

public class CompatibilityDto {
    private UUID sourceNodeId;
    private UUID targetNodeId;
    private double compatibilityScore;

    public UUID getSourceNodeId() { return sourceNodeId; }
    public void setSourceNodeId(UUID id) { this.sourceNodeId = id; }
    public UUID getTargetNodeId() { return targetNodeId; }
    public void setTargetNodeId(UUID id) { this.targetNodeId = id; }
    public double getCompatibilityScore() { return compatibilityScore; }
    public void setCompatibilityScore(double score) { this.compatibilityScore = score; }
}
