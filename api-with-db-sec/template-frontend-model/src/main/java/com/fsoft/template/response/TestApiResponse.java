package com.fsoft.template.response;
public class TestApiResponse {

  private Long id;

  private String name;

  private String age;

  public TestApiResponse() {

  }

  public TestApiResponse(Long id, String name, String age) {
    this.name = name;
    this.id = id;
    this.age = age;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }
}