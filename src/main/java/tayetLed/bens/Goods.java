package tayetLed.bens;

public class Goods {
  private Long id;
  private String title;
  private String description;
  private String category;
  private String avatar;
  private String tutorial;
  private String supplier;
  private String factory;
  private Long price;
  private Long supplier_price;
  private String video_link;
  private Long number_in_stock;
  private Long service_time;
  private Long guarantee_period;
  private Long visible;

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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public String getTutorial() {
    return tutorial;
  }

  public void setTutorial(String tutorial) {
    this.tutorial = tutorial;
  }

  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  public String getFactory() {
    return factory;
  }

  public void setFactory(String  factory) {
    this.factory = factory;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public Long getSupplier_price() {
    return supplier_price;
  }

  public void setSupplier_price(Long supplier_price) {
    this.supplier_price = supplier_price;
  }

  public String getVideo_link() {
    return video_link;
  }

  public void setVideo_link(String video_link) {
    this.video_link = video_link;
  }

  public Long getNumber_in_stock() {
    return number_in_stock;
  }

  public void setNumber_in_stock(Long number_in_stock) {
    this.number_in_stock = number_in_stock;
  }

  public Long getService_time() {
    return service_time;
  }

  @Override
  public String toString() {
    return "Goods{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", description='" + description + '\'' +
            ", category='" + category + '\'' +
            ", avatar='" + avatar + '\'' +
            ", tutorial='" + tutorial + '\'' +
            ", supplier='" + supplier + '\'' +
            ", factory='" + factory + '\'' +
            ", price=" + price +
            ", supplier_price=" + supplier_price +
            ", video_link='" + video_link + '\'' +
            ", number_in_stock=" + number_in_stock +
            ", service_time=" + service_time +
            ", guarantee_period=" + guarantee_period +
            ", visible=" + visible +
            '}';
  }

  public void setService_time(Long service_time) {
    this.service_time = service_time;
  }

  public Long getGuarantee_period() {
    return guarantee_period;
  }

  public void setGuarantee_period(Long guarantee_period) {
    this.guarantee_period = guarantee_period;
  }

  public Long getVisible() {
    return visible;
  }

  public void setVisible(Long visible) {
    this.visible = visible;
  }
}
