package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class RequestBody {
    private RequestBodyContent content;

    @JsonProperty("content")
    public RequestBodyContent getContent() { return content; }
    @JsonProperty("content")
    public void setContent(RequestBodyContent value) { this.content = value; }
}
