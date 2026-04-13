package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class Email {
    private EmailPost post;

    @JsonProperty("post")
    public EmailPost getPost() { return post; }
    @JsonProperty("post")
    public void setPost(EmailPost value) { this.post = value; }
}
