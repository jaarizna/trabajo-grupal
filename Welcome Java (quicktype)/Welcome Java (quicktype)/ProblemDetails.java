package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class ProblemDetails {
    private String type;
    private ProblemDetailsProperties properties;
    private AdditionalProperties additionalProperties;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("properties")
    public ProblemDetailsProperties getProperties() { return properties; }
    @JsonProperty("properties")
    public void setProperties(ProblemDetailsProperties value) { this.properties = value; }

    @JsonProperty("additionalProperties")
    public AdditionalProperties getAdditionalProperties() { return additionalProperties; }
    @JsonProperty("additionalProperties")
    public void setAdditionalProperties(AdditionalProperties value) { this.additionalProperties = value; }
}
