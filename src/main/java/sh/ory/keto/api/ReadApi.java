/*
 * ORY Keto
 * Ory Keto is a cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.6.0-alpha.6
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.keto.api;

import sh.ory.keto.ApiCallback;
import sh.ory.keto.ApiClient;
import sh.ory.keto.ApiException;
import sh.ory.keto.ApiResponse;
import sh.ory.keto.Configuration;
import sh.ory.keto.Pair;
import sh.ory.keto.ProgressRequestBody;
import sh.ory.keto.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import sh.ory.keto.model.ExpandTree;
import sh.ory.keto.model.GetCheckResponse;
import sh.ory.keto.model.GetRelationTuplesResponse;
import sh.ory.keto.model.InlineResponse400;
import sh.ory.keto.model.InternalRelationTuple;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadApi {
    private ApiClient localVarApiClient;

    public ReadApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReadApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getCheck
     * @param namespace Namespace of the Relation Tuple (required)
     * @param _object Object of the Relation Tuple (required)
     * @param relation Relation of the Relation Tuple (required)
     * @param subject Subject of the Relation Tuple  The subject follows the subject string encoding format. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The standard error format </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCheckCall(String namespace, String _object, String relation, String subject, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/check";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (namespace != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("namespace", namespace));
        }

        if (_object != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("object", _object));
        }

        if (relation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("relation", relation));
        }

        if (subject != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("subject", subject));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCheckValidateBeforeCall(String namespace, String _object, String relation, String subject, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getCheck(Async)");
        }
        
        // verify the required parameter '_object' is set
        if (_object == null) {
            throw new ApiException("Missing the required parameter '_object' when calling getCheck(Async)");
        }
        
        // verify the required parameter 'relation' is set
        if (relation == null) {
            throw new ApiException("Missing the required parameter 'relation' when calling getCheck(Async)");
        }
        

        okhttp3.Call localVarCall = getCheckCall(namespace, _object, relation, subject, _callback);
        return localVarCall;

    }

    /**
     * Check a relation tuple
     * To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
     * @param namespace Namespace of the Relation Tuple (required)
     * @param _object Object of the Relation Tuple (required)
     * @param relation Relation of the Relation Tuple (required)
     * @param subject Subject of the Relation Tuple  The subject follows the subject string encoding format. (optional)
     * @return GetCheckResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The standard error format </td><td>  -  </td></tr>
     </table>
     */
    public GetCheckResponse getCheck(String namespace, String _object, String relation, String subject) throws ApiException {
        ApiResponse<GetCheckResponse> localVarResp = getCheckWithHttpInfo(namespace, _object, relation, subject);
        return localVarResp.getData();
    }

    /**
     * Check a relation tuple
     * To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
     * @param namespace Namespace of the Relation Tuple (required)
     * @param _object Object of the Relation Tuple (required)
     * @param relation Relation of the Relation Tuple (required)
     * @param subject Subject of the Relation Tuple  The subject follows the subject string encoding format. (optional)
     * @return ApiResponse&lt;GetCheckResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The standard error format </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetCheckResponse> getCheckWithHttpInfo(String namespace, String _object, String relation, String subject) throws ApiException {
        okhttp3.Call localVarCall = getCheckValidateBeforeCall(namespace, _object, relation, subject, null);
        Type localVarReturnType = new TypeToken<GetCheckResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Check a relation tuple (asynchronously)
     * To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
     * @param namespace Namespace of the Relation Tuple (required)
     * @param _object Object of the Relation Tuple (required)
     * @param relation Relation of the Relation Tuple (required)
     * @param subject Subject of the Relation Tuple  The subject follows the subject string encoding format. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The standard error format </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCheckAsync(String namespace, String _object, String relation, String subject, final ApiCallback<GetCheckResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCheckValidateBeforeCall(namespace, _object, relation, subject, _callback);
        Type localVarReturnType = new TypeToken<GetCheckResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getExpand
     * @param namespace Namespace of the Relation Tuple (required)
     * @param _object Object of the Relation Tuple (required)
     * @param relation Relation of the Relation Tuple (required)
     * @param maxDepth  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> expandTree </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The standard error format </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getExpandCall(String namespace, String _object, String relation, Long maxDepth, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/expand";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (namespace != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("namespace", namespace));
        }

        if (_object != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("object", _object));
        }

        if (relation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("relation", relation));
        }

        if (maxDepth != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("max-depth", maxDepth));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getExpandValidateBeforeCall(String namespace, String _object, String relation, Long maxDepth, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getExpand(Async)");
        }
        
        // verify the required parameter '_object' is set
        if (_object == null) {
            throw new ApiException("Missing the required parameter '_object' when calling getExpand(Async)");
        }
        
        // verify the required parameter 'relation' is set
        if (relation == null) {
            throw new ApiException("Missing the required parameter 'relation' when calling getExpand(Async)");
        }
        

        okhttp3.Call localVarCall = getExpandCall(namespace, _object, relation, maxDepth, _callback);
        return localVarCall;

    }

    /**
     * Expand a Relation Tuple
     * Use this endpoint to expand a relation tuple.
     * @param namespace Namespace of the Relation Tuple (required)
     * @param _object Object of the Relation Tuple (required)
     * @param relation Relation of the Relation Tuple (required)
     * @param maxDepth  (optional)
     * @return ExpandTree
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> expandTree </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The standard error format </td><td>  -  </td></tr>
     </table>
     */
    public ExpandTree getExpand(String namespace, String _object, String relation, Long maxDepth) throws ApiException {
        ApiResponse<ExpandTree> localVarResp = getExpandWithHttpInfo(namespace, _object, relation, maxDepth);
        return localVarResp.getData();
    }

    /**
     * Expand a Relation Tuple
     * Use this endpoint to expand a relation tuple.
     * @param namespace Namespace of the Relation Tuple (required)
     * @param _object Object of the Relation Tuple (required)
     * @param relation Relation of the Relation Tuple (required)
     * @param maxDepth  (optional)
     * @return ApiResponse&lt;ExpandTree&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> expandTree </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The standard error format </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ExpandTree> getExpandWithHttpInfo(String namespace, String _object, String relation, Long maxDepth) throws ApiException {
        okhttp3.Call localVarCall = getExpandValidateBeforeCall(namespace, _object, relation, maxDepth, null);
        Type localVarReturnType = new TypeToken<ExpandTree>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Expand a Relation Tuple (asynchronously)
     * Use this endpoint to expand a relation tuple.
     * @param namespace Namespace of the Relation Tuple (required)
     * @param _object Object of the Relation Tuple (required)
     * @param relation Relation of the Relation Tuple (required)
     * @param maxDepth  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> expandTree </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The standard error format </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getExpandAsync(String namespace, String _object, String relation, Long maxDepth, final ApiCallback<ExpandTree> _callback) throws ApiException {

        okhttp3.Call localVarCall = getExpandValidateBeforeCall(namespace, _object, relation, maxDepth, _callback);
        Type localVarReturnType = new TypeToken<ExpandTree>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRelationTuples
     * @param namespace  (required)
     * @param _object  (optional)
     * @param relation  (optional)
     * @param subject  (optional)
     * @param pageToken  (optional)
     * @param pageSize  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getRelationTuplesResponse </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The standard error format </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRelationTuplesCall(String namespace, String _object, String relation, String subject, String pageToken, Long pageSize, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/relation-tuples";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (namespace != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("namespace", namespace));
        }

        if (_object != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("object", _object));
        }

        if (relation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("relation", relation));
        }

        if (subject != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("subject", subject));
        }

        if (pageToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_token", pageToken));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getRelationTuplesValidateBeforeCall(String namespace, String _object, String relation, String subject, String pageToken, Long pageSize, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getRelationTuples(Async)");
        }
        

        okhttp3.Call localVarCall = getRelationTuplesCall(namespace, _object, relation, subject, pageToken, pageSize, _callback);
        return localVarCall;

    }

    /**
     * Query relation tuples
     * Get all relation tuples that match the query. Only the namespace field is required.
     * @param namespace  (required)
     * @param _object  (optional)
     * @param relation  (optional)
     * @param subject  (optional)
     * @param pageToken  (optional)
     * @param pageSize  (optional)
     * @return GetRelationTuplesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getRelationTuplesResponse </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The standard error format </td><td>  -  </td></tr>
     </table>
     */
    public GetRelationTuplesResponse getRelationTuples(String namespace, String _object, String relation, String subject, String pageToken, Long pageSize) throws ApiException {
        ApiResponse<GetRelationTuplesResponse> localVarResp = getRelationTuplesWithHttpInfo(namespace, _object, relation, subject, pageToken, pageSize);
        return localVarResp.getData();
    }

    /**
     * Query relation tuples
     * Get all relation tuples that match the query. Only the namespace field is required.
     * @param namespace  (required)
     * @param _object  (optional)
     * @param relation  (optional)
     * @param subject  (optional)
     * @param pageToken  (optional)
     * @param pageSize  (optional)
     * @return ApiResponse&lt;GetRelationTuplesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getRelationTuplesResponse </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The standard error format </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetRelationTuplesResponse> getRelationTuplesWithHttpInfo(String namespace, String _object, String relation, String subject, String pageToken, Long pageSize) throws ApiException {
        okhttp3.Call localVarCall = getRelationTuplesValidateBeforeCall(namespace, _object, relation, subject, pageToken, pageSize, null);
        Type localVarReturnType = new TypeToken<GetRelationTuplesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Query relation tuples (asynchronously)
     * Get all relation tuples that match the query. Only the namespace field is required.
     * @param namespace  (required)
     * @param _object  (optional)
     * @param relation  (optional)
     * @param subject  (optional)
     * @param pageToken  (optional)
     * @param pageSize  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getRelationTuplesResponse </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The standard error format </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRelationTuplesAsync(String namespace, String _object, String relation, String subject, String pageToken, Long pageSize, final ApiCallback<GetRelationTuplesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRelationTuplesValidateBeforeCall(namespace, _object, relation, subject, pageToken, pageSize, _callback);
        Type localVarReturnType = new TypeToken<GetRelationTuplesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for postCheck
     * @param payload  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The standard error format </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postCheckCall(InternalRelationTuple payload, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = payload;

        // create path and map variables
        String localVarPath = "/check";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postCheckValidateBeforeCall(InternalRelationTuple payload, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = postCheckCall(payload, _callback);
        return localVarCall;

    }

    /**
     * Check a relation tuple
     * To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
     * @param payload  (optional)
     * @return GetCheckResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The standard error format </td><td>  -  </td></tr>
     </table>
     */
    public GetCheckResponse postCheck(InternalRelationTuple payload) throws ApiException {
        ApiResponse<GetCheckResponse> localVarResp = postCheckWithHttpInfo(payload);
        return localVarResp.getData();
    }

    /**
     * Check a relation tuple
     * To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
     * @param payload  (optional)
     * @return ApiResponse&lt;GetCheckResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The standard error format </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetCheckResponse> postCheckWithHttpInfo(InternalRelationTuple payload) throws ApiException {
        okhttp3.Call localVarCall = postCheckValidateBeforeCall(payload, null);
        Type localVarReturnType = new TypeToken<GetCheckResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Check a relation tuple (asynchronously)
     * To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
     * @param payload  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The standard error format </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The standard error format </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postCheckAsync(InternalRelationTuple payload, final ApiCallback<GetCheckResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = postCheckValidateBeforeCall(payload, _callback);
        Type localVarReturnType = new TypeToken<GetCheckResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
