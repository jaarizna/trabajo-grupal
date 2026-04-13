package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class EmailResponseProperties {
    private Done done;
    private ErrorMessage errorMessage;

    @JsonProperty("done")
    public Done getDone() { return done; }
    @JsonProperty("done")
    public void setDone(Done value) { this.done = value; }

    @JsonProperty("errorMessage")
    public ErrorMessage getErrorMessage() { return errorMessage; }
    @JsonProperty("errorMessage")
    public void setErrorMessage(ErrorMessage value) { this.errorMessage = value; }
}
