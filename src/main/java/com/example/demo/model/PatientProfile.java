import com.example.demo.model;

public class PaitentProfile {
    @id
    private Long id;
    @column(name=unique)
    private String patientid;
    private String fullname;
    private int age;
    private String email;
    private String surgeryType;
    private boolean active;
    private LocalDate createdAt;

}