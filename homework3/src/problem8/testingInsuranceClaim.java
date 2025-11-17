package problem8;

public class testingInsuranceClaim {
    public static void main(String[] args) {
        ClaimApprovalManager claimApprovalManager = new ClaimApprovalManager();

        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        claimApprovalManager.addInsuranceClaim(healthInsuranceSurveyor);

        CarInsuranceSurveyor carInsuranceSurveyor = new CarInsuranceSurveyor();
        claimApprovalManager.addInsuranceClaim(carInsuranceSurveyor);

        // this should call all the insurance surveyors and print out the valid claims.
        claimApprovalManager.processInsuranceClaim();
    }
}
