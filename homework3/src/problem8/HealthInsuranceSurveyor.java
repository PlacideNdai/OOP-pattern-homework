package problem8;

public class HealthInsuranceSurveyor implements InsuranceClaim {
    // public boolean isValidHealthClaim() {
    //     System.out.println("Health Insurance Surveyor: Validating healthy insurance claim...");
    //     // business logic to validate this claim
    //     return true; // to make it simple, we always return true
    // }

    @Override
    public boolean isValidClaim() {
        System.out.println("Health Insurance Surveyor: Validating healthy insurance claim...");
        // business logic to validate this claim
        return true; // to make it simple, we always return true
    }
}
