package problem8;

import java.util.ArrayList;

public class ClaimApprovalManager {
    // public void processHealthClaim(HealthInsuranceSurveyor surveyor) {
    //     if (surveyor.isValidHealthClaim()) {
    //         System.out.println("Claim Approval Manager: Valid claim, Currently processing claim for approval...");
    //     }
    // }
    private ArrayList<InsuranceClaim> insuranceClaims = new ArrayList<>();


    public void processInsuranceClaim(){
        for( InsuranceClaim insuranceClaim : insuranceClaims){
            if(insuranceClaim.isValidClaim()){
                System.out.println("Claim Approval Manager: Valid claim, Currently processing claim for approval...");
            } else {
                System.out.println("Claim Approval Manager: Invalid claim, Currently processing claim for rejection...");
            }
        }
    }

    public void addInsuranceClaim(InsuranceClaim claim){
        insuranceClaims.add(claim);
    }
}
