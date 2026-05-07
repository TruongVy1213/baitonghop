package model;
import java.sql.Timestamp;

public class Post {
    private int id;
    private String title;
    private String body;
    private int userId;
    private String status;
    private Timestamp createdAt;
    private int likeCount;
    private String authorName;
    
    public Post(int id, String title, String body, int userId, String status, Timestamp createdAt) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.userId = userId;
        this.status = status;
        this.createdAt = createdAt;
    }

    // Constructor mới cho News Feed
    public Post(int id, String title, String body, int userId, String status, Timestamp createdAt, int likeCount, String authorName) {
        this(id, title, body, userId, status, createdAt);
        this.likeCount = likeCount;
        this.authorName = authorName;
    }
    
    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getBody() { return body; }
    public int getUserId() { return userId; }
    public String getStatus() { return status; }
    public Timestamp getCreatedAt() { return createdAt; }
    public int getLikeCount() { return likeCount; }
    public String getAuthorName() { return authorName; }
}