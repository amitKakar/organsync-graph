package com.organsync.graph.repository;

import com.organsync.graph.entity.CompatibilityEdge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompatibilityEdgeRepository extends JpaRepository<CompatibilityEdge, UUID> {
    // additional query methods if needed
}
