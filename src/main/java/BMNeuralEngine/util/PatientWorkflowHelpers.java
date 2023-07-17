package BMNeuralEngine.util;

import BMNeuralEngine.Users.UserModel.PatientModel;

public class PatientWorkflowHelpers {
    public static String validateUserInsurance(PatientModel patient) {
        if (patient.getInsuranceId() == -1) {
            return "Patient does not have coverage.";
        }

        return "Pulling patient's insurance information.";
    }
}
