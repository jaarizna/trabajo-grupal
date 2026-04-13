package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class PostResponse {
    private Description description;
    private PurpleContent content;

    @JsonProperty("description")
    public Description getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(Description value) { this.description = value; }

    @JsonProperty("content")
    public PurpleContent getContent() { return content; }
    @JsonProperty("content")
    public void setContent(PurpleContent value) { this.content = value; }
}
