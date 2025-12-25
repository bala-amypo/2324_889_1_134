public interface DailySymptomLogRepository
        extends JpaRepository<DailySymptomLog, Long> {

    Optional<DailySymptomLog> findByPatientIdAndLogDate(Long patientId, LocalDate logDate);
    List<DailySymptomLog> findByPatientId(Long patientId);
}

