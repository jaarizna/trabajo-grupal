package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class EmailResponse {
    private String type;
    private EmailResponseProperties properties;
    private boolean additionalProperties;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("properties")
    public EmailResponseProperties getProperties() { return properties; }
    @JsonProperty("properties")
    public void setProperties(EmailResponseProperties value) { this.properties = value; }

    @JsonProperty("additionalProperties")
    public boolean getAdditionalProperties() { return additionalProperties; }
    @JsonProperty("additionalProperties")
    public void setAdditionalProperties(boolean value) { this.additionalProperties = value; }
}
