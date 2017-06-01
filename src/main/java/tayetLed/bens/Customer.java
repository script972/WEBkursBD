package tayetLed.bens;


public class Customer {
  private Long id;
  private String last_name;
  private String name;
  private String second_name;
  private String phone;
  private String email;
  private String pass;
  private Long active;
  private String ip_register;
  private java.sql.Timestamp date_register;
  private Long ip_last_enter;
  private java.sql.Timestamp date_last_enter;
  private Long discount;

  public Customer(String email, String phone, String name, String second_name, String last_name, long l, String password) {
    this.email=email;
    this.phone=phone;
    this.name=name;
    this.second_name=second_name;
    this.last_name=last_name;
    this.active=l;
    this.pass=password;
  }

  public Customer() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSecond_name() {
    return second_name;
  }

  public void setSecond_name(String second_name) {
    this.second_name = second_name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public Long getActive() {
    return active;
  }

  public void setActive(Long active) {
    this.active = active;
  }

  public String getIp_register() {
    return ip_register;
  }

  public void setIp_register(String ip_register) {
    this.ip_register = ip_register;
  }

  public java.sql.Timestamp getDate_register() {
    return date_register;
  }

  public void setDate_register(java.sql.Timestamp date_register) {
    this.date_register = date_register;
  }

  public Long getIp_last_enter() {
    return ip_last_enter;
  }

  public void setIp_last_enter(Long ip_last_enter) {
    this.ip_last_enter = ip_last_enter;
  }

  public java.sql.Timestamp getDate_last_enter() {
    return date_last_enter;
  }

  public void setDate_last_enter(java.sql.Timestamp date_last_enter) {
    this.date_last_enter = date_last_enter;
  }

  public Long getDiscount() {
    return discount;
  }

  public void setDiscount(Long discount) {
    this.discount = discount;
  }

  @Override
  public String toString() {
    return "Customer{" +
            "id=" + id +
            ", last_name='" + last_name + '\'' +
            ", name='" + name + '\'' +
            ", second_name='" + second_name + '\'' +
            ", phone='" + phone + '\'' +
            ", email='" + email + '\'' +
            ", pass='" + pass + '\'' +
            ", active=" + active +
            ", ip_register='" + ip_register + '\'' +
            ", date_register=" + date_register +
            ", ip_last_enter=" + ip_last_enter +
            ", date_last_enter=" + date_last_enter +
            ", discount=" + discount +
            '}';
  }
}
