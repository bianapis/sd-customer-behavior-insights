/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerBehavioralInsightsApiService {

	CustomerBehavioralInsightsRecordResponse record(String crReferenceId, CustomerBehavioralInsightsRecordRequest request);
	
	CustomerBehavioralInsightsBaseWithId requestPost(InsightsReportBase request);
	
	CustomerBehavioralInsightsBaseWithId requestPut(String crReferenceId, InsightsReportBase request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	CustomerBehavioralInsightsBaseWithId retrieve(String crReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	AlgorithmBaseWithId retrieveAlgorithms(String crReferenceId, String bqReferenceId);
	
}
