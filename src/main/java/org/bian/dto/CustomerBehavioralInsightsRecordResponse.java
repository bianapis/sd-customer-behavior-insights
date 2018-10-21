package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerBehavioralInsightsRecordResponse
 */
public class CustomerBehavioralInsightsRecordResponse   {
  private String customerBehaviorInsightsServiceReference = null;

  private String customerInsightAlgorithmReference = null;

  private String recordingRecordReference = null;

  private String recordingRecordStatus = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerBehaviorInsightsServiceReference
  **/

  public String getCustomerBehaviorInsightsServiceReference() {
    return customerBehaviorInsightsServiceReference;
  }

  public void setCustomerBehaviorInsightsServiceReference(String customerBehaviorInsightsServiceReference) {
    this.customerBehaviorInsightsServiceReference = customerBehaviorInsightsServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: Optionally, a reference to the specific type of insight analysis 
   * @return customerInsightAlgorithmReference
  **/

  public String getCustomerInsightAlgorithmReference() {
    return customerInsightAlgorithmReference;
  }

  public void setCustomerInsightAlgorithmReference(String customerInsightAlgorithmReference) {
    this.customerInsightAlgorithmReference = customerInsightAlgorithmReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return recordingRecordReference
  **/

  public String getRecordingRecordReference() {
    return recordingRecordReference;
  }

  public void setRecordingRecordReference(String recordingRecordReference) {
    this.recordingRecordReference = recordingRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return recordingRecordStatus
  **/

  public String getRecordingRecordStatus() {
    return recordingRecordStatus;
  }

  public void setRecordingRecordStatus(String recordingRecordStatus) {
    this.recordingRecordStatus = recordingRecordStatus;
  }


}

