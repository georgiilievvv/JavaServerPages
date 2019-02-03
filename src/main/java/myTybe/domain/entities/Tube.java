package myTybe.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "tubes")
public class Tube extends BaseEntity{

    private String Name;
    private String Description;
    private String YouTubeLink;
    private String Uploader;

    public Tube() {
    }

    @Column(name = "name")
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Column(name = "description")
    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Column(name = "youtube_link")
    public String getYouTubeLink() {
        return YouTubeLink;
    }

    public void setYouTubeLink(String youTubeLink) {
        YouTubeLink = youTubeLink;
    }

    @Column(name = "uploader")
    public String getUploader() {
        return Uploader;
    }

    public void setUploader(String uploader) {
        Uploader = uploader;
    }
}
