package acadamy.devdojo.springboot2.requests;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AnimePutRequestBody {
    private Long id;
    private String name;
}
