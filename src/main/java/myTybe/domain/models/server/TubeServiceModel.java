package myTybe.domain.models.server;

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

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getYouTubeLink() {
        return YouTubeLink;
    }

    public void setYouTubeLink(String youTubeLink) {
        YouTubeLink = youTubeLink;
    }

    public String getUploader() {
        return Uploader;
    }

    public void setUploader(String uploader) {
        Uploader = uploader;
    }
}
