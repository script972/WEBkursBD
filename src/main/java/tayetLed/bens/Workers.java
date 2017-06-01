package tayetLed.bens;


public class Workers {
  private Long id;
  private String last_name;
  private String name;
  private String second_name;
  private String phone;
  private Long position;
  private Long salary;
  private java.sql.Date start_work;

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

  public Long getPosition() {
    return position;
  }

  public void setPosition(Long position) {
    this.position = position;
  }

  public Long getSalary() {
    return salary;
  }

  public void setSalary(Long salary) {
    this.salary = salary;
  }

  public java.sql.Date getStart_work() {
    return start_work;
  }

  public void setStart_work(java.sql.Date start_work) {
    this.start_work = start_work;
  }
}
