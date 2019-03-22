package at.nacs.doctorhouse;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Data
public class Patient {

    private String id;
    private String name;
    private String symptoms;

}
