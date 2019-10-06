package pl.kf.chirper.model;

import pl.kf.chirper.model.post.Post;
import pl.kf.chirper.model.user.User;

import java.util.Date;

public class Like {

    private Long id;
    private User user;
    private Post post;
    private Date creationDate;

    public Like() {
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
