package com.organsync.graph.dto;

import java.util.List;
import java.util.UUID;

public class GraphDto {
    private long nodeCount;
    private long edgeCount;
    // Optionally, provide more graph metadata:
    private List<UUID> nodeIds;
    private List<UUID> edgeIds;

    public GraphDto() {}

    public long getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(long nodeCount) {
        this.nodeCount = nodeCount;
    }

    public long getEdgeCount() {
        return edgeCount;
    }

    public void setEdgeCount(long edgeCount) {
        this.edgeCount = edgeCount;
    }

    public List<UUID> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<UUID> nodeIds) {
        this.nodeIds = nodeIds;
    }

    public List<UUID> getEdgeIds() {
        return edgeIds;
    }

    public void setEdgeIds(List<UUID> edgeIds) {
        this.edgeIds = edgeIds;
    }
}
