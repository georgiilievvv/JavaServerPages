package myTybe.domain.models.server;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class TubeServiceModel {

    private String id;
    private String Name;
    private String Description;
    private String YouTubeLink;
    private String Uploader;

    public TubeServiceModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NotNull
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @NotNull
    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Pattern(regexp = "https:\\/\\/www\\.youtube\\.com\\/watch.+")
    public String getYouTubeLink() {
        return YouTubeLink;
    }

    public void setYouTubeLink(String youTubeLink) {

        YouTubeLink = youTubeLink;
    }

    @NotNull
    @Size(min = 2)
    public String getUploader() {
        return Uploader;
    }

    public void setUploader(String uploader) {
        Uploader = uploader;
    }
}
