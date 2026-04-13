package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class RequestBodyContent {
    private ApplicationJSONClass contentApplicationJSON;
    private ApplicationJSONClass textJSON;
    private ApplicationJSONClass applicationJSON;

    @JsonProperty("application/json")
    public ApplicationJSONClass getContentApplicationJSON() { return contentApplicationJSON; }
    @JsonProperty("application/json")
    public void setContentApplicationJSON(ApplicationJSONClass value) { this.contentApplicationJSON = value; }

    @JsonProperty("text/json")
    public ApplicationJSONClass getTextJSON() { return textJSON; }
    @JsonProperty("text/json")
    public void setTextJSON(ApplicationJSONClass value) { this.textJSON = value; }

    @JsonProperty("application/*+json")
    public ApplicationJSONClass getApplicationJSON() { return applicationJSON; }
    @JsonProperty("application/*+json")
    public void setApplicationJSON(ApplicationJSONClass value) { this.applicationJSON = value; }
}
