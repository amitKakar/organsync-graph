package com.organsync.graph.entity;

import jakarta.persistence.*;
import java.util.UUID;
import lombok.Data;
import lombok.Setter;
@Entity
@Table(name = "graph_nodes")
@Data
public class GraphNode {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String bloodGroup;

    private String hospitalId;
}
