/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Analyze;

@BianRestController
public class CustomerBehavioralInsightsApiController {

	@Autowired
	CustomerBehavioralInsightsApiService service;
	
	@Analyze.Record
	public BianResponse<CustomerBehavioralInsightsRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerBehavioralInsightsRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Analyze.RequestPost
	public BianResponse<CustomerBehavioralInsightsBaseWithId> requestPost(@RequestBody BianRequest<InsightsReportBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Analyze.RequestPut
	public BianResponse<CustomerBehavioralInsightsBaseWithId> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<InsightsReportBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Analyze.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Analyze.Retrieve
	public BianResponse<CustomerBehavioralInsightsBaseWithId> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Analyze.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Analyze.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("algorithms")
	@Analyze.Retrieve
	public BianResponse<AlgorithmBaseWithId> retrieveAlgorithms(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAlgorithms(crReferenceId, bqReferenceId));
	}
	
}
