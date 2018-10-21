package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AlgorithmBaseWithId
 */
public class AlgorithmBaseWithId   {
  private String customerInsightAlgorithmReference = null;

  private String customerInsightAlgorithmType = null;

  private Object customerInsightAlgorithmUsage = null;

  private Object customerInsightAlgorithmImpact = null;

  private Object customerInsightAlgorithmFeedbackRecord = null;

  private Object customerInsightAlgorithmSpecification = null;

  private String customerInsightAlgorithmUsageGuidelines = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerInsightAlgorithmReference
  **/

  public String getCustomerInsightAlgorithmReference() {
    return customerInsightAlgorithmReference;
  }

  public void setCustomerInsightAlgorithmReference(String customerInsightAlgorithmReference) {
    this.customerInsightAlgorithmReference = customerInsightAlgorithmReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerInsightAlgorithmType
  **/

  public String getCustomerInsightAlgorithmType() {
    return customerInsightAlgorithmType;
  }

  public void setCustomerInsightAlgorithmType(String customerInsightAlgorithmType) {
    this.customerInsightAlgorithmType = customerInsightAlgorithmType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"records number of production deployments and frequency of execution\" 
   * @return customerInsightAlgorithmUsage
  **/

  public Object getCustomerInsightAlgorithmUsage() {
    return customerInsightAlgorithmUsage;
  }

  public void setCustomerInsightAlgorithmUsage(Object customerInsightAlgorithmUsage) {
    this.customerInsightAlgorithmUsage = customerInsightAlgorithmUsage;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"reported impact/accuracy of model\" 
   * @return customerInsightAlgorithmImpact
  **/

  public Object getCustomerInsightAlgorithmImpact() {
    return customerInsightAlgorithmImpact;
  }

  public void setCustomerInsightAlgorithmImpact(Object customerInsightAlgorithmImpact) {
    this.customerInsightAlgorithmImpact = customerInsightAlgorithmImpact;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"user pro vided feedback/suggestions\" 
   * @return customerInsightAlgorithmFeedbackRecord
  **/

  public Object getCustomerInsightAlgorithmFeedbackRecord() {
    return customerInsightAlgorithmFeedbackRecord;
  }

  public void setCustomerInsightAlgorithmFeedbackRecord(Object customerInsightAlgorithmFeedbackRecord) {
    this.customerInsightAlgorithmFeedbackRecord = customerInsightAlgorithmFeedbackRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"design - inputs, calculations, outputs\" 
   * @return customerInsightAlgorithmSpecification
  **/

  public Object getCustomerInsightAlgorithmSpecification() {
    return customerInsightAlgorithmSpecification;
  }

  public void setCustomerInsightAlgorithmSpecification(Object customerInsightAlgorithmSpecification) {
    this.customerInsightAlgorithmSpecification = customerInsightAlgorithmSpecification;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"guidance on usage and result interpretation\" 
   * @return customerInsightAlgorithmUsageGuidelines
  **/

  public String getCustomerInsightAlgorithmUsageGuidelines() {
    return customerInsightAlgorithmUsageGuidelines;
  }

  public void setCustomerInsightAlgorithmUsageGuidelines(String customerInsightAlgorithmUsageGuidelines) {
    this.customerInsightAlgorithmUsageGuidelines = customerInsightAlgorithmUsageGuidelines;
  }


}

