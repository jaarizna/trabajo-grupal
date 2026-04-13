package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class SolicitudResponse {
    private String type;
    private SolicitudResponseProperties properties;
    private boolean additionalProperties;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("properties")
    public SolicitudResponseProperties getProperties() { return properties; }
    @JsonProperty("properties")
    public void setProperties(SolicitudResponseProperties value) { this.properties = value; }

    @JsonProperty("additionalProperties")
    public boolean getAdditionalProperties() { return additionalProperties; }
    @JsonProperty("additionalProperties")
    public void setAdditionalProperties(boolean value) { this.additionalProperties = value; }
}
