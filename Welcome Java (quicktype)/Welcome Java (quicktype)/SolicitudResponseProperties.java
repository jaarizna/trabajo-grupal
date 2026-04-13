package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class SolicitudResponseProperties {
    private Done done;
    private TokenSolicitud tokenSolicitud;
    private ErrorMessage errorMessage;
    private Done data;

    @JsonProperty("done")
    public Done getDone() { return done; }
    @JsonProperty("done")
    public void setDone(Done value) { this.done = value; }

    @JsonProperty("tokenSolicitud")
    public TokenSolicitud getTokenSolicitud() { return tokenSolicitud; }
    @JsonProperty("tokenSolicitud")
    public void setTokenSolicitud(TokenSolicitud value) { this.tokenSolicitud = value; }

    @JsonProperty("errorMessage")
    public ErrorMessage getErrorMessage() { return errorMessage; }
    @JsonProperty("errorMessage")
    public void setErrorMessage(ErrorMessage value) { this.errorMessage = value; }

    @JsonProperty("data")
    public Done getData() { return data; }
    @JsonProperty("data")
    public void setData(Done value) { this.data = value; }
}
