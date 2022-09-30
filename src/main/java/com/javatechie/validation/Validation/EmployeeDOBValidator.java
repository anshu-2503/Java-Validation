package com.javatechie.validation.Validation;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.springframework.stereotype.Component;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class EmployeeDOBValidator implements ConstraintValidator<ValidationDOB,LocalDate> {



    @Override
    public void initialize(ValidationDOB DOB) {
    }
    @Component
    public class JsonDateDeserializer extends JsonDeserializer<LocalDate>
    {
        // ISO 8601
        private final DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

        @Override
        public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
                throws IOException, JsonProcessingException
        {
            try
            {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String date = jsonParser.getText();

                //convert String to LocalDate
                LocalDate localDate = LocalDate.parse(date, formatter);
                return localDate;
            }
            catch (Exception e)
            {
                throw new JsonParseException("Could not parse date", jsonParser.getCurrentLocation(), e);
            }
        }
    }
    @Override
    public boolean isValid(LocalDate DOB,
                           ConstraintValidatorContext cxt) {
        if(DOB!=null) {
            LocalDate currentDate = LocalDate.now();
            //System.out.println(DOB);
            int age = Period.between(DOB, currentDate).getYears();

            if (age >= 18 && age < 60)
                return true;

        }
            return false;
        }
    }

