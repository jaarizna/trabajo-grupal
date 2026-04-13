package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class ProblemDetailsProperties {
    private ErrorMessage type;
    private ErrorMessage title;
    private Status status;
    private ErrorMessage detail;
    private ErrorMessage instance;

    @JsonProperty("type")
    public ErrorMessage getType() { return type; }
    @JsonProperty("type")
    public void setType(ErrorMessage value) { this.type = value; }

    @JsonProperty("title")
    public ErrorMessage getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(ErrorMessage value) { this.title = value; }

    @JsonProperty("status")
    public Status getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(Status value) { this.status = value; }

    @JsonProperty("detail")
    public ErrorMessage getDetail() { return detail; }
    @JsonProperty("detail")
    public void setDetail(ErrorMessage value) { this.detail = value; }

    @JsonProperty("instance")
    public ErrorMessage getInstance() { return instance; }
    @JsonProperty("instance")
    public void setInstance(ErrorMessage value) { this.instance = value; }
}
