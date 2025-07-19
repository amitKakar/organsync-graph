package com.organsync.graph.service;

import com.organsync.graph.entity.GraphNode;
import org.springframework.stereotype.Service;

@Service
public class CompatibilityCalculatorService {

    /**
     * Simple ABO compatibility scoring.
     * Extend with HLA, age, geography, etc.
     */
    public double calculate(GraphNode donor, GraphNode recipient) {
        // Simple example: assign 1.0 if identical blood group, else 0.5
        return donor.getBloodGroup().equals(recipient.getBloodGroup()) ? 1.0 : 0.5;
    }
}
