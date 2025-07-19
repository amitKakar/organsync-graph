package com.organsync.graph.controller;

import com.organsync.graph.dto.GraphDto;
import com.organsync.graph.service.GraphService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/graph/api/v1/graph")
public class GraphController {

    private final GraphService graphService;

    public GraphController(GraphService graphService) {
        this.graphService = graphService;
    }

    @GetMapping("/stats")
    public ResponseEntity<GraphDto> getGraphStats() {
        return ResponseEntity.ok(graphService.getCurrentGraphStats());
    }
}
