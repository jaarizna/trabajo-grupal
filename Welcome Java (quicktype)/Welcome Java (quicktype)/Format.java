package io.quicktype;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Format {
    INT32;

    @JsonValue
    public String toValue() {
        switch (this) {
            case INT32: return "int32";
        }
        return null;
    }

    @JsonCreator
    public static Format forValue(String value) throws IOException {
        if (value.equals("int32")) return INT32;
        throw new IOException("Cannot deserialize Format");
    }
}
