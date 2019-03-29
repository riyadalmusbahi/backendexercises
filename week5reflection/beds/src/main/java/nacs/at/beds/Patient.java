package nacs.at.beds;

import lombok.Data;

@Data
public class Patient {

    private String id;
    private String name;
    private String symptoms;
    private String diagnoses;
    private String treatment;

}
