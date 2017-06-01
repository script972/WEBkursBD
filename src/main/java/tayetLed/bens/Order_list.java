package tayetLed.bens;


public class Order_list {
  private Long id;
  private Long order;
  private String fabric_number;
  private Long promo;
  private Long price;
  private Long good;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getOrder() {
    return order;
  }

  public void setOrder(Long order) {
    this.order = order;
  }

  public String getFabric_number() {
    return fabric_number;
  }

  public void setFabric_number(String fabric_number) {
    this.fabric_number = fabric_number;
  }

  public Long getPromo() {
    return promo;
  }

  public void setPromo(Long promo) {
    this.promo = promo;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public Long getGood() {
    return good;
  }

  public void setGood(Long good) {
    this.good = good;
  }
}
