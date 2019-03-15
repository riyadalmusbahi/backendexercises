package at.nacs.marathon.server.controller;


import at.nacs.marathon.server.persistance.Runner;
import at.nacs.marathon.server.persistance.RunnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/winner")
@RestController
@RequiredArgsConstructor
public class WinnerEndpoint {

    private final RunnerRepository runnerRepository;

    @GetMapping
    Runner winner(){
        return runnerRepository.findWinner().orElse(null);
    }




}
