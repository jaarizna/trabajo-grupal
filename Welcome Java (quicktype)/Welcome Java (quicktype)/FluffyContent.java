package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class FluffyContent {
    private PurpleApplicationJSON textPlain;
    private PurpleApplicationJSON applicationJSON;
    private PurpleApplicationJSON textJSON;

    @JsonProperty("text/plain")
    public PurpleApplicationJSON getTextPlain() { return textPlain; }
    @JsonProperty("text/plain")
    public void setTextPlain(PurpleApplicationJSON value) { this.textPlain = value; }

    @JsonProperty("application/json")
    public PurpleApplicationJSON getApplicationJSON() { return applicationJSON; }
    @JsonProperty("application/json")
    public void setApplicationJSON(PurpleApplicationJSON value) { this.applicationJSON = value; }

    @JsonProperty("text/json")
    public PurpleApplicationJSON getTextJSON() { return textJSON; }
    @JsonProperty("text/json")
    public void setTextJSON(PurpleApplicationJSON value) { this.textJSON = value; }
}
