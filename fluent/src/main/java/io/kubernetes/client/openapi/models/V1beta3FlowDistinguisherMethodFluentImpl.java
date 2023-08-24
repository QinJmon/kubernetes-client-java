package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1beta3FlowDistinguisherMethodFluentImpl<A extends V1beta3FlowDistinguisherMethodFluent<A>> extends BaseFluent<A> implements V1beta3FlowDistinguisherMethodFluent<A>{
  public V1beta3FlowDistinguisherMethodFluentImpl() {
  }
  public V1beta3FlowDistinguisherMethodFluentImpl(V1beta3FlowDistinguisherMethod instance) {
    if (instance != null) {
      this.withType(instance.getType());
    }
  }
  private String type;
  public String getType() {
    return this.type;
  }
  public A withType(String type) {
    this.type=type; return (A) this;
  }
  public Boolean hasType() {
    return this.type != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta3FlowDistinguisherMethodFluentImpl that = (V1beta3FlowDistinguisherMethodFluentImpl) o;
    if (!java.util.Objects.equals(type, that.type)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(type,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  
}