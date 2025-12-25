@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeviationRule {

    @Id
    @GeneratedValue
    private Long id;

    private String ruleCode;
    private String parameter;
    private Integer threshold;
    private String severity;

    @Builder.Default
    private Boolean active = true;   
}
