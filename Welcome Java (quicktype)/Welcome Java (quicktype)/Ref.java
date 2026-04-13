package io.quicktype;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Ref {
    COMPONENTS_SCHEMAS_EMAIL_RESPONSE, COMPONENTS_SCHEMAS_PROBLEM_DETAILS, COMPONENTS_SCHEMAS_RESULTS_RESPONSE, COMPONENTS_SCHEMAS_SOLICITUD, COMPONENTS_SCHEMAS_SOLICITUD_RESPONSE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMPONENTS_SCHEMAS_EMAIL_RESPONSE: return "#/components/schemas/EmailResponse";
            case COMPONENTS_SCHEMAS_PROBLEM_DETAILS: return "#/components/schemas/ProblemDetails";
            case COMPONENTS_SCHEMAS_RESULTS_RESPONSE: return "#/components/schemas/ResultsResponse";
            case COMPONENTS_SCHEMAS_SOLICITUD: return "#/components/schemas/Solicitud";
            case COMPONENTS_SCHEMAS_SOLICITUD_RESPONSE: return "#/components/schemas/SolicitudResponse";
        }
        return null;
    }

    @JsonCreator
    public static Ref forValue(String value) throws IOException {
        if (value.equals("#/components/schemas/EmailResponse")) return COMPONENTS_SCHEMAS_EMAIL_RESPONSE;
        if (value.equals("#/components/schemas/ProblemDetails")) return COMPONENTS_SCHEMAS_PROBLEM_DETAILS;
        if (value.equals("#/components/schemas/ResultsResponse")) return COMPONENTS_SCHEMAS_RESULTS_RESPONSE;
        if (value.equals("#/components/schemas/Solicitud")) return COMPONENTS_SCHEMAS_SOLICITUD;
        if (value.equals("#/components/schemas/SolicitudResponse")) return COMPONENTS_SCHEMAS_SOLICITUD_RESPONSE;
        throw new IOException("Cannot deserialize Ref");
    }
}
