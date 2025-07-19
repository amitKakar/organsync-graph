package com.organsync.graph.listener;

import com.organsync.graph.entity.GraphNode;
import com.organsync.graph.repository.GraphNodeRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import java.util.Map;

@Component
public class DonorRegistrationListener {

    private final GraphNodeRepository nodeRepo;

    public DonorRegistrationListener(GraphNodeRepository nodeRepo) {
        this.nodeRepo = nodeRepo;
    }

    @KafkaListener(topics = "donor.registered", groupId = "organsync-graph")
    public void onDonorRegistered(Map<String, Object> event) {
        // Simple parsing, replace with DTO in production
        String name = (String) event.get("name");
        String bloodGroup = (String) event.get("bloodGroup");
        String hospitalId = (String) event.get("hospitalId");

        GraphNode node = new GraphNode();
        node.setName(name);
        node.setBloodGroup(bloodGroup);
        node.setHospitalId(hospitalId);

        nodeRepo.save(node);
    }
}
