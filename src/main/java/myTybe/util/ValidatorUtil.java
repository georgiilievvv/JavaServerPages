package myTybe.util;

import javax.validation.Validator;
import javax.validation.Validation;

public class ValidatorUtil {

    private Validator validator;

    public ValidatorUtil() {
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    public<M> boolean isValid(M model){
        return this.validator.validate(model).size() == 0;
    }
}
