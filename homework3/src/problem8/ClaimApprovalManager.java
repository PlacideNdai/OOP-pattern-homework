package homework3.src.problem8;

public class ClaimApprovalManager {
    public void processHealthClaim(HealthInsuranceSurveyor surveyor) {
        if (surveyor.isValidHealthClaim()) {
            System.out.println("Claim Approval Manager: Valid claim, Currently processing claim for approval...");
        }
    }
}
