package morning.exam05;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Builder 빌더 패턴의 코드를 자동으로 만들어 줌
public class Member {
    private String id;
    private String name;
    private int age;
}
