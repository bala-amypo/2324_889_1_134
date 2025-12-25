@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClinicalAlertRecord {

    @Id
    @GeneratedValue
    private Long id;

    private Long patientId;
    private Long logId;
    private String alertType;
    private String severity;
    private String message;

    @Builder.Default
    private Boolean resolved = false;   
}
