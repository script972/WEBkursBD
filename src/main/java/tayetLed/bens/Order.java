package tayetLed.bens;


public class Order {
  private Long id;
  private java.sql.Timestamp date_order;
  private Long customer;
  private Long workers;
  private Long town;
  private Long method;
  private String number_declaration;
  private String phone;
  private String coment;
  private java.sql.Timestamp oriental_date_arrive;
  private java.sql.Timestamp date_arrive;
  private java.sql.Timestamp date_payment;
  private String number_payment;
  private Long status;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public java.sql.Timestamp getDate_order() {
    return date_order;
  }

  public void setDate_order(java.sql.Timestamp date_order) {
    this.date_order = date_order;
  }

  public Long getCustomer() {
    return customer;
  }

  public void setCustomer(Long customer) {
    this.customer = customer;
  }

  public Long getWorkers() {
    return workers;
  }

  public void setWorkers(Long workers) {
    this.workers = workers;
  }

  public Long getTown() {
    return town;
  }

  public void setTown(Long town) {
    this.town = town;
  }

  public Long getMethod() {
    return method;
  }

  public void setMethod(Long method) {
    this.method = method;
  }

  public String getNumber_declaration() {
    return number_declaration;
  }

  public void setNumber_declaration(String number_declaration) {
    this.number_declaration = number_declaration;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getComent() {
    return coment;
  }

  public void setComent(String coment) {
    this.coment = coment;
  }

  public java.sql.Timestamp getOriental_date_arrive() {
    return oriental_date_arrive;
  }

  public void setOriental_date_arrive(java.sql.Timestamp oriental_date_arrive) {
    this.oriental_date_arrive = oriental_date_arrive;
  }

  public java.sql.Timestamp getDate_arrive() {
    return date_arrive;
  }

  public void setDate_arrive(java.sql.Timestamp date_arrive) {
    this.date_arrive = date_arrive;
  }

  public java.sql.Timestamp getDate_payment() {
    return date_payment;
  }

  public void setDate_payment(java.sql.Timestamp date_payment) {
    this.date_payment = date_payment;
  }

  public String getNumber_payment() {
    return number_payment;
  }

  public void setNumber_payment(String number_payment) {
    this.number_payment = number_payment;
  }

  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }
}
