package tayetLed.bens;


public class Services {
  private Long id;
  private String title;
  private String address;
  private Long town;
  private Long supplier;
  private String geo;
  private String phone;

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

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Long getTown() {
    return town;
  }

  public void setTown(Long town) {
    this.town = town;
  }

  public Long getSupplier() {
    return supplier;
  }

  public void setSupplier(Long supplier) {
    this.supplier = supplier;
  }

  public String getGeo() {
    return geo;
  }

  public void setGeo(String geo) {
    this.geo = geo;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
