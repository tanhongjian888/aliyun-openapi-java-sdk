/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ivision.model.v20190308;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteStreamPredictRequest extends RpcAcsRequest<DeleteStreamPredictResponse> {
	
	public DeleteStreamPredictRequest() {
		super("ivision", "2019-03-08", "DeleteStreamPredict", "ivision");
	}

	private String predictId;

	private Long ownerId;

	public String getPredictId() {
		return this.predictId;
	}

	public void setPredictId(String predictId) {
		this.predictId = predictId;
		if(predictId != null){
			putQueryParameter("PredictId", predictId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<DeleteStreamPredictResponse> getResponseClass() {
		return DeleteStreamPredictResponse.class;
	}

}
