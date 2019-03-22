package at.nacs.cupshuffler.cup;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coin")
@RequiredArgsConstructor
public class CupEndpoint {

    private final Cup cup;


    @GetMapping
    Boolean get(){
        return cup.getHasCoin();
    }

    @PutMapping
    void put(){
        cup.setHasCoin(true);
    }

    @DeleteMapping
    void delete(){
        cup.setHasCoin(false);
    }
}
