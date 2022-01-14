package com.jdbc_practice.model;

import java.math.BigInteger;

public class Department {

  private BigInteger id;

  private String dapartmentName;

  public BigInteger getId() {
    return id;
  }

  public void setId(BigInteger id) {
    this.id = id;
  }

  public String getDapartmentName() {
    return dapartmentName;
  }

  public void setDapartmentName(String dapartmentName) {
    this.dapartmentName = dapartmentName;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((dapartmentName == null) ? 0 : dapartmentName.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Department other = (Department) obj;
    if (dapartmentName == null) {
      if (other.dapartmentName != null)
        return false;
    } else if (!dapartmentName.equals(other.dapartmentName))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Department [id=" + id + ", dapartmentName=" + dapartmentName + "]";
  }
}
