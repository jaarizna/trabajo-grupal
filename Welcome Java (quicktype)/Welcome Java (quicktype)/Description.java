package io.quicktype;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Description {
    BAD_REQUEST, CREATED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BAD_REQUEST: return "Bad Request";
            case CREATED: return "Created";
        }
        return null;
    }

    @JsonCreator
    public static Description forValue(String value) throws IOException {
        if (value.equals("Bad Request")) return BAD_REQUEST;
        if (value.equals("Created")) return CREATED;
        throw new IOException("Cannot deserialize Description");
    }
}
