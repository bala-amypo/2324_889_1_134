
public class RecoveryCurveProfile{
    @Id
    private Long id;
    private String surgeryType;
    private int dayNumber;
    private int expectedPainLevel;
    private int expectedMobilityLevel;
    private int expectedFatigueLevel;

public Long getid(){
    return id;
}
public String getsurgeryType(){
    return surgeryType;
}


}