package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * InsightsReportBase
 */
public class InsightsReportBase   {
  private Object customerInsightsRecord = null;

  private String customerInsightType = null;

  private String customerInsightAlgorithmReference = null;

  private Object customerInsight = null;

  private String customerInsightCalculationDate = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: collection of customer insights maintained for a customer 
   * @return customerInsightsRecord
  **/

  public Object getCustomerInsightsRecord() {
    return customerInsightsRecord;
  }

  public void setCustomerInsightsRecord(Object customerInsightsRecord) {
    this.customerInsightsRecord = customerInsightsRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: refers to a maintained customer insight 
   * @return customerInsightType
  **/

  public String getCustomerInsightType() {
    return customerInsightType;
  }

  public void setCustomerInsightType(String customerInsightType) {
    this.customerInsightType = customerInsightType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"the algorithm used to derive the customer insight\" 
   * @return customerInsightAlgorithmReference
  **/

  public String getCustomerInsightAlgorithmReference() {
    return customerInsightAlgorithmReference;
  }

  public void setCustomerInsightAlgorithmReference(String customerInsightAlgorithmReference) {
    this.customerInsightAlgorithmReference = customerInsightAlgorithmReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: the derived value of the specific insight for the customer 
   * @return customerInsight
  **/

  public Object getCustomerInsight() {
    return customerInsight;
  }

  public void setCustomerInsight(Object customerInsight) {
    this.customerInsight = customerInsight;
  }


  /**
   * Get customerInsightCalculationDate
   * @return customerInsightCalculationDate
  **/

  public String getCustomerInsightCalculationDate() {
    return customerInsightCalculationDate;
  }

  public void setCustomerInsightCalculationDate(String customerInsightCalculationDate) {
    this.customerInsightCalculationDate = customerInsightCalculationDate;
  }


}

