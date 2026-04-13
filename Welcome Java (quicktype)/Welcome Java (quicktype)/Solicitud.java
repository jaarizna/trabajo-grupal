package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class Solicitud {
    private String type;
    private SolicitudProperties properties;
    private boolean additionalProperties;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("properties")
    public SolicitudProperties getProperties() { return properties; }
    @JsonProperty("properties")
    public void setProperties(SolicitudProperties value) { this.properties = value; }

    @JsonProperty("additionalProperties")
    public boolean getAdditionalProperties() { return additionalProperties; }
    @JsonProperty("additionalProperties")
    public void setAdditionalProperties(boolean value) { this.additionalProperties = value; }
}
