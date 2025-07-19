package com.organsync.graph.entity;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "compatibility_edges")
public class CompatibilityEdge {
    public UUID getId() {
        return id;
    }

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "source_id")
    private GraphNode source;
    @ManyToOne
    @JoinColumn(name = "target_id")
    private GraphNode target;
    private double compatibilityScore;
    // getters and setters
}
