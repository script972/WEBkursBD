package tayetLed.bens;

public class Category {
  private Long id;
  private String title;
  private Long category_parent;
  private String avatar;
  private String description;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Long getCategory_parent() {
    return category_parent;
  }

  public void setCategory_parent(Long category_parent) {
    this.category_parent = category_parent;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
