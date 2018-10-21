/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerBehavioralInsightsApiServiceImpl implements CustomerBehavioralInsightsApiService {

	public CustomerBehavioralInsightsRecordResponse record(String crReferenceId, CustomerBehavioralInsightsRecordRequest request){
		return JsonReader.read("record-CustomerBehavioralInsightsRecordResponse.json",new TypeReference<CustomerBehavioralInsightsRecordResponse>(){});
	}
	
	public CustomerBehavioralInsightsBaseWithId requestPost(InsightsReportBase request){
		return JsonReader.read("requestPost-CustomerBehavioralInsightsBaseWithId.json",new TypeReference<CustomerBehavioralInsightsBaseWithId>(){});
	}
	
	public CustomerBehavioralInsightsBaseWithId requestPut(String crReferenceId, InsightsReportBase request){
		return JsonReader.read("requestPut-CustomerBehavioralInsightsBaseWithId.json",new TypeReference<CustomerBehavioralInsightsBaseWithId>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CustomerBehavioralInsightsBaseWithId retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CustomerBehavioralInsightsBaseWithId.json",new TypeReference<CustomerBehavioralInsightsBaseWithId>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public AlgorithmBaseWithId retrieveAlgorithms(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AlgorithmBaseWithId.json",new TypeReference<AlgorithmBaseWithId>(){});
	}
	
}
