public interface DeviationRuleRepository
        extends JpaRepository<DeviationRule, Long> {

    Optional<DeviationRule> findByRuleCode(String ruleCode);
    List<DeviationRule> findByActiveTrue();
}


