package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class PurpleContent {
    private ApplicationJSONClass textPlain;
    private ApplicationJSONClass applicationJSON;
    private ApplicationJSONClass textJSON;

    @JsonProperty("text/plain")
    public ApplicationJSONClass getTextPlain() { return textPlain; }
    @JsonProperty("text/plain")
    public void setTextPlain(ApplicationJSONClass value) { this.textPlain = value; }

    @JsonProperty("application/json")
    public ApplicationJSONClass getApplicationJSON() { return applicationJSON; }
    @JsonProperty("application/json")
    public void setApplicationJSON(ApplicationJSONClass value) { this.applicationJSON = value; }

    @JsonProperty("text/json")
    public ApplicationJSONClass getTextJSON() { return textJSON; }
    @JsonProperty("text/json")
    public void setTextJSON(ApplicationJSONClass value) { this.textJSON = value; }
}
