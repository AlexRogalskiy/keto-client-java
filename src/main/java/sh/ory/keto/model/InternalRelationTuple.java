/*
 * ORY Keto
 * Ory Keto is a cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.7.0-alpha.1
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.keto.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import sh.ory.keto.model.SubjectSet;

/**
 * InternalRelationTuple
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-19T17:02:32.962495422Z[Etc/UTC]")
public class InternalRelationTuple {
  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  public static final String SERIALIZED_NAME_RELATION = "relation";
  @SerializedName(SERIALIZED_NAME_RELATION)
  private String relation;

  public static final String SERIALIZED_NAME_SUBJECT_ID = "subject_id";
  @SerializedName(SERIALIZED_NAME_SUBJECT_ID)
  private String subjectId;

  public static final String SERIALIZED_NAME_SUBJECT_SET = "subject_set";
  @SerializedName(SERIALIZED_NAME_SUBJECT_SET)
  private SubjectSet subjectSet;


  public InternalRelationTuple namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace of the Relation Tuple
   * @return namespace
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Namespace of the Relation Tuple")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public InternalRelationTuple _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Object of the Relation Tuple
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Object of the Relation Tuple")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }


  public InternalRelationTuple relation(String relation) {
    
    this.relation = relation;
    return this;
  }

   /**
   * Relation of the Relation Tuple
   * @return relation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Relation of the Relation Tuple")

  public String getRelation() {
    return relation;
  }


  public void setRelation(String relation) {
    this.relation = relation;
  }


  public InternalRelationTuple subjectId(String subjectId) {
    
    this.subjectId = subjectId;
    return this;
  }

   /**
   * SubjectID of the Relation Tuple  Either SubjectSet or SubjectID are required.
   * @return subjectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SubjectID of the Relation Tuple  Either SubjectSet or SubjectID are required.")

  public String getSubjectId() {
    return subjectId;
  }


  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }


  public InternalRelationTuple subjectSet(SubjectSet subjectSet) {
    
    this.subjectSet = subjectSet;
    return this;
  }

   /**
   * Get subjectSet
   * @return subjectSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubjectSet getSubjectSet() {
    return subjectSet;
  }


  public void setSubjectSet(SubjectSet subjectSet) {
    this.subjectSet = subjectSet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalRelationTuple internalRelationTuple = (InternalRelationTuple) o;
    return Objects.equals(this.namespace, internalRelationTuple.namespace) &&
        Objects.equals(this._object, internalRelationTuple._object) &&
        Objects.equals(this.relation, internalRelationTuple.relation) &&
        Objects.equals(this.subjectId, internalRelationTuple.subjectId) &&
        Objects.equals(this.subjectSet, internalRelationTuple.subjectSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, _object, relation, subjectId, subjectSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalRelationTuple {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    subjectSet: ").append(toIndentedString(subjectSet)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

