package at.nacs.marathon.server.controller;


import at.nacs.marathon.server.persistance.Runner;
import at.nacs.marathon.server.persistance.RunnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/runners")
@RequiredArgsConstructor
public class RunnerEndpoint {

    private final RunnerRepository runnerRepository;


    @PostMapping
    Runner postRunner(@RequestBody Runner runner){
        runnerRepository.add(runner);
        return runner;

    }
    @GetMapping
    List<Runner> get() {
        return runnerRepository.getAll();
    }
}
