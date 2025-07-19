package com.organsync.graph.service;

import com.organsync.graph.dto.GraphDto;
import com.organsync.graph.entity.GraphNode;
import com.organsync.graph.entity.CompatibilityEdge;
import com.organsync.graph.repository.GraphNodeRepository;
import com.organsync.graph.repository.CompatibilityEdgeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GraphService {

    private final GraphNodeRepository nodeRepo;
    private final CompatibilityEdgeRepository edgeRepo;

    public GraphService(GraphNodeRepository nodeRepo, CompatibilityEdgeRepository edgeRepo) {
        this.nodeRepo = nodeRepo;
        this.edgeRepo = edgeRepo;
    }

    public GraphDto getCurrentGraphStats() {
        long nodeCount = nodeRepo.count();
        long edgeCount = edgeRepo.count();

        List<UUID> nodeIds = nodeRepo.findAll().stream().map(GraphNode::getId).toList();
        List<UUID> edgeIds = edgeRepo.findAll().stream().map(CompatibilityEdge::getId).toList();

        GraphDto dto = new GraphDto();
        dto.setNodeCount(nodeCount);
        dto.setEdgeCount(edgeCount);
        dto.setNodeIds(nodeIds);
        dto.setEdgeIds(edgeIds);

        return dto;
    }

    // Additional data and analytics methods can be added here
}
