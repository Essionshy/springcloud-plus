package spring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @Author essionshy
 * @Create 2020/3/31 13:05
 * @Version springcloud-plus
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Accessors(chain = true)
public class Storage {
    private Long id;

    private Long productId;

    private Integer total;

    private Integer used;

    private Integer residue;


}
