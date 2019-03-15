package at.nacs.marathon.server.persistance;


import lombok.Data;

import java.sql.Time;
import java.time.Duration;



@Data
public class Runner {

    private String name;
    private Duration time;


}
