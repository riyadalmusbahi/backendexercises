package at.nacs.todos;


import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class ToDo {

    private String id;
    private String title;
    private boolean done;
}
