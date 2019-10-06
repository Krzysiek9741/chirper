package pl.kf.chirper.model;

import pl.kf.chirper.model.user.User;

import java.util.Date;

public class Follow {

    private User follower;
    private User followedAccount;
    private Date date;

    public Follow() {
    }

    public User getFollower() {
        return follower;
    }

    public void setFollower(User follower) {
        this.follower = follower;
    }

    public User getFollowedAccount() {
        return followedAccount;
    }

    public void setFollowedAccount(User followedAccount) {
        this.followedAccount = followedAccount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
