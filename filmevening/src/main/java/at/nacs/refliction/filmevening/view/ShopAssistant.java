package at.nacs.refliction.filmevening.view;


import at.nacs.refliction.filmevening.controller.Judge;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class ShopAssistant {

    private Judge judge;

    Random random = new Random();
    public Integer generatePrice(){
        Integer randomNumber = random.nextInt(999);
    return randomNumber;
    }

    public void act(List<String> performedHandshakes, Integer price){
        if (judge.judge(performedHandshakes, price) == true){
            System.out.println("Those are the right handshakes you may enter the secret door");
            System.out.println("************************************************************");
        }else System.out.println("Those are the wrong handshakes, you are so dead !! ");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
}
