package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class Schemas {
    private EmailResponse emailResponse;
    private ProblemDetails problemDetails;
    private ResultsResponse resultsResponse;
    private Solicitud solicitud;
    private SolicitudResponse solicitudResponse;

    @JsonProperty("EmailResponse")
    public EmailResponse getEmailResponse() { return emailResponse; }
    @JsonProperty("EmailResponse")
    public void setEmailResponse(EmailResponse value) { this.emailResponse = value; }

    @JsonProperty("ProblemDetails")
    public ProblemDetails getProblemDetails() { return problemDetails; }
    @JsonProperty("ProblemDetails")
    public void setProblemDetails(ProblemDetails value) { this.problemDetails = value; }

    @JsonProperty("ResultsResponse")
    public ResultsResponse getResultsResponse() { return resultsResponse; }
    @JsonProperty("ResultsResponse")
    public void setResultsResponse(ResultsResponse value) { this.resultsResponse = value; }

    @JsonProperty("Solicitud")
    public Solicitud getSolicitud() { return solicitud; }
    @JsonProperty("Solicitud")
    public void setSolicitud(Solicitud value) { this.solicitud = value; }

    @JsonProperty("SolicitudResponse")
    public SolicitudResponse getSolicitudResponse() { return solicitudResponse; }
    @JsonProperty("SolicitudResponse")
    public void setSolicitudResponse(SolicitudResponse value) { this.solicitudResponse = value; }
}
