package com.ssp.apps.spring.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "Health";
    }


    @GetMapping("/system-metricks")
    public String systemMetricks() {
        return "System Metricks";
    }

    @GetMapping("/heap-dump")
    public String heapDump() {
        return "Heap Dump";
    }
}
