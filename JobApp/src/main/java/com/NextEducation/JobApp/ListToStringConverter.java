package com.NextEducation.JobApp;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Converter(autoApply = true) // Auto-apply this converter to List<String> fields
public class ListToStringConverter implements AttributeConverter<List<String>, String> {

    @Override
    public String convertToDatabaseColumn(List<String> list) {
        // Convert list to comma-separated string (e.g., "Java,Spring,MySQL")
        return list != null ? String.join(",", list) : "";
    }

    @Override
    public List<String> convertToEntityAttribute(String joinedString) {
        // Convert comma-separated string back to list
        return joinedString != null ? Arrays.asList(joinedString.split(",")) : Collections.emptyList();
    }
}
