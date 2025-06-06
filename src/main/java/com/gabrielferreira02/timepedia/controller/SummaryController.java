package com.gabrielferreira02.timepedia.controller;

import com.gabrielferreira02.timepedia.dto.SummaryResponse;
import com.gabrielferreira02.timepedia.service.SummaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/summary")
public class SummaryController {

    private final SummaryService summaryService;

    public SummaryController(SummaryService summaryService) {
        this.summaryService = summaryService;
    }

    @GetMapping
    public SummaryResponse getSummary(@RequestParam String team) {
        return summaryService.getSummary(team);
    }
}
