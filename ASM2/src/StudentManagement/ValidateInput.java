package StudentManagement;

import java.util.ArrayList;

public class ValidateInput {
    public String validateInput(Object markValidate, Object IDValidate, Object nameValidate, Object arrayValidate) {
        if (markValidate == null || IDValidate == null || nameValidate == null || arrayValidate == null || nameValidate.toString().isEmpty()) {
            return "Pls input all the parameter and variable";
        }
        if (!(markValidate instanceof Float) || !(IDValidate instanceof String) || !(nameValidate instanceof String) || !(arrayValidate instanceof ArrayList<?>)) {
            return "Pls input correct parameter and variable";
        } else if (0f > (float) markValidate || (float) markValidate > 10f) {
            return "Pls input correct Mark from 0f to 10f";
        } else if (((String) IDValidate).length() != 5) {
            return "Student ID must have length = 5";
        } else if (((ArrayList<?>) arrayValidate).size() > 100) {
            return "Array is too big, cannot handle";
        } else {
            return "OK";
        }
    }
}
