package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class GetResponse {
    private Description description;
    private FluffyContent content;

    @JsonProperty("description")
    public Description getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(Description value) { this.description = value; }

    @JsonProperty("content")
    public FluffyContent getContent() { return content; }
    @JsonProperty("content")
    public void setContent(FluffyContent value) { this.content = value; }
}
