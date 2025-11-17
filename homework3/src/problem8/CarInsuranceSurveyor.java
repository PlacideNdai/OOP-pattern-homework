package problem8;

public class CarInsuranceSurveyor implements InsuranceClaim{
    
    @Override
    public boolean isValidClaim() {
        System.out.println("Car Insurance Surveyor: Validating car insurance claim...");

        return true;
    }
}
