package com.organsync.graph.repository;

import com.organsync.graph.entity.GraphNode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GraphNodeRepository extends JpaRepository<GraphNode, UUID> {
    // additional query methods if needed
}
