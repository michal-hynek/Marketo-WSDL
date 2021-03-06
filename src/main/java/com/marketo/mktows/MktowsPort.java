
package com.marketo.mktows;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "MktowsPort", targetNamespace = "http://www.marketo.com/mktows/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MktowsPort {


    /**
     * Delete one or more MObject.
     *       
     * 
     * @param authentication
     * @param paramsDeleteMObjects
     * @return
     *     returns com.marketo.mktows.SuccessDeleteMObjects
     */
    @WebMethod(action = "http://www.marketo.com/mktows/deleteMObjects")
    @WebResult(name = "successDeleteMObjects", targetNamespace = "http://www.marketo.com/mktows/", partName = "successDeleteMObjects")
    public SuccessDeleteMObjects deleteMObjects(
        @WebParam(name = "paramsDeleteMObjects", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsDeleteMObjects")
        ParamsDeleteMObjects paramsDeleteMObjects,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Get meta data for a MObject.
     *       
     * 
     * @param authentication
     * @param paramsDescribeMObject
     * @return
     *     returns com.marketo.mktows.SuccessDescribeMObject
     */
    @WebMethod(action = "http://www.marketo.com/mktows/describeMObject")
    @WebResult(name = "successDescribeMObject", targetNamespace = "http://www.marketo.com/mktows/", partName = "successDescribeMObject")
    public SuccessDescribeMObject describeMObject(
        @WebParam(name = "paramsDescribeMObject", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsDescribeMObject")
        ParamsDescribeMObject paramsDescribeMObject,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Get one or more MObject.
     *       
     * 
     * @param authentication
     * @param paramsGetMObjects
     * @return
     *     returns com.marketo.mktows.SuccessGetMObjects
     */
    @WebMethod(action = "http://www.marketo.com/mktows/getMObjects")
    @WebResult(name = "successGetMObjects", targetNamespace = "http://www.marketo.com/mktows/", partName = "successGetMObjects")
    public SuccessGetMObjects getMObjects(
        @WebParam(name = "paramsGetMObjects", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsGetMObjects")
        ParamsGetMObjects paramsGetMObjects,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Create, update, or upsert MObject.
     *       
     * 
     * @param authentication
     * @param paramsSyncMObjects
     * @return
     *     returns com.marketo.mktows.SuccessSyncMObjects
     */
    @WebMethod(action = "http://www.marketo.com/mktows/syncMObjects")
    @WebResult(name = "successSyncMObjects", targetNamespace = "http://www.marketo.com/mktows/", partName = "successSyncMObjects")
    public SuccessSyncMObjects syncMObjects(
        @WebParam(name = "paramsSyncMObjects", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsSyncMObjects")
        ParamsSyncMObjects paramsSyncMObjects,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Get a list campaigns.
     *       
     * 
     * @param paramsGetCampaignsForSource
     * @param authentication
     * @return
     *     returns com.marketo.mktows.SuccessGetCampaignsForSource
     */
    @WebMethod(action = "http://www.marketo.com/mktows/getCampaignsForSource")
    @WebResult(name = "successGetCampaignsForSource", targetNamespace = "http://www.marketo.com/mktows/", partName = "successGetCampaignsForSource")
    public SuccessGetCampaignsForSource getCampaignsForSource(
        @WebParam(name = "paramsGetCampaignsForSource", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsGetCampaignsForSource")
        ParamsGetCampaignsForSource paramsGetCampaignsForSource,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Provides information regarding the status of list import.
     *       
     * 
     * @param authentication
     * @param paramsGetImportToListStatus
     * @return
     *     returns com.marketo.mktows.SuccessGetImportToListStatus
     */
    @WebMethod(action = "http://www.marketo.com/mktows/getImportToListStatus")
    @WebResult(name = "successGetImportToListStatus", targetNamespace = "http://www.marketo.com/mktows/", partName = "successGetImportToListStatus")
    public SuccessGetImportToListStatus getImportToListStatus(
        @WebParam(name = "paramsGetImportToListStatus", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsGetImportToListStatus")
        ParamsGetImportToListStatus paramsGetImportToListStatus,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Get all details about a lead.
     *       
     * 
     * @param paramsGetLead
     * @param authentication
     * @return
     *     returns com.marketo.mktows.SuccessGetLead
     */
    @WebMethod(action = "http://www.marketo.com/mktows/getLead")
    @WebResult(name = "successGetLead", targetNamespace = "http://www.marketo.com/mktows/", partName = "successGetLead")
    public SuccessGetLead getLead(
        @WebParam(name = "paramsGetLead", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsGetLead")
        ParamsGetLead paramsGetLead,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Get all activity log details about a lead.
     *       
     * 
     * @param authentication
     * @param paramsGetLeadActivity
     * @return
     *     returns com.marketo.mktows.SuccessGetLeadActivity
     */
    @WebMethod(action = "http://www.marketo.com/mktows/getLeadActivity")
    @WebResult(name = "successGetLeadActivity", targetNamespace = "http://www.marketo.com/mktows/", partName = "successGetLeadActivity")
    public SuccessGetLeadActivity getLeadActivity(
        @WebParam(name = "paramsGetLeadActivity", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsGetLeadActivity")
        ParamsGetLeadActivity paramsGetLeadActivity,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Get changes for all leads.
     *       
     * 
     * @param paramsGetLeadChanges
     * @param authentication
     * @return
     *     returns com.marketo.mktows.SuccessGetLeadChanges
     */
    @WebMethod(action = "http://www.marketo.com/mktows/getLeadChanges")
    @WebResult(name = "successGetLeadChanges", targetNamespace = "http://www.marketo.com/mktows/", partName = "successGetLeadChanges")
    public SuccessGetLeadChanges getLeadChanges(
        @WebParam(name = "paramsGetLeadChanges", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsGetLeadChanges")
        ParamsGetLeadChanges paramsGetLeadChanges,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Get all details about one or more leads.
     *       
     * 
     * @param authentication
     * @param paramsGetMultipleLeads
     * @return
     *     returns com.marketo.mktows.SuccessGetMultipleLeads
     */
    @WebMethod(action = "http://www.marketo.com/mktows/getMultipleLeads")
    @WebResult(name = "successGetMultipleLeads", targetNamespace = "http://www.marketo.com/mktows/", partName = "successGetMultipleLeads")
    public SuccessGetMultipleLeads getMultipleLeads(
        @WebParam(name = "paramsGetMultipleLeads", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsGetMultipleLeads")
        ParamsGetMultipleLeads paramsGetMultipleLeads,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Imports the list from web file info
     *       
     * 
     * @param authentication
     * @param paramsImportToList
     * @return
     *     returns com.marketo.mktows.SuccessImportToList
     */
    @WebMethod(action = "http://www.marketo.com/mktows/importToList")
    @WebResult(name = "successImportToList", targetNamespace = "http://www.marketo.com/mktows/", partName = "successImportToList")
    public SuccessImportToList importToList(
        @WebParam(name = "paramsImportToList", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsImportToList")
        ParamsImportToList paramsImportToList,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Send a Marketo email.
     *       
     * 
     * @param authentication
     * @param paramsListMObjects
     * @return
     *     returns com.marketo.mktows.SuccessListMObjects
     */
    @WebMethod(action = "http://www.marketo.com/mktows/listMObjects")
    @WebResult(name = "successListMObjects", targetNamespace = "http://www.marketo.com/mktows/", partName = "successListMObjects")
    public SuccessListMObjects listMObjects(
        @WebParam(name = "paramsListMObjects", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsListMObjects")
        ParamsListMObjects paramsListMObjects,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Perform an operation on a Marketo List, like add lead or remove lead.
     *       
     * 
     * @param authentication
     * @param paramsListOperation
     * @return
     *     returns com.marketo.mktows.SuccessListOperation
     */
    @WebMethod(action = "http://www.marketo.com/mktows/listOperation")
    @WebResult(name = "successListOperation", targetNamespace = "http://www.marketo.com/mktows/", partName = "successListOperation")
    public SuccessListOperation listOperation(
        @WebParam(name = "paramsListOperation", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsListOperation")
        ParamsListOperation paramsListOperation,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Request to add a set of leads to a campaign.
     *       
     * 
     * @param authentication
     * @param paramsRequestCampaign
     * @return
     *     returns com.marketo.mktows.SuccessRequestCampaign
     */
    @WebMethod(action = "http://www.marketo.com/mktows/requestCampaign")
    @WebResult(name = "successRequestCampaign", targetNamespace = "http://www.marketo.com/mktows/", partName = "successRequestCampaign")
    public SuccessRequestCampaign requestCampaign(
        @WebParam(name = "paramsRequestCampaign", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsRequestCampaign")
        ParamsRequestCampaign paramsRequestCampaign,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Request to add tokens to a schedule campaign.
     *       
     * 
     * @param paramsScheduleCampaign
     * @param authentication
     * @return
     *     returns com.marketo.mktows.SuccessScheduleCampaign
     */
    @WebMethod(action = "http://www.marketo.com/mktows/scheduleCampaign")
    @WebResult(name = "successScheduleCampaign", targetNamespace = "http://www.marketo.com/mktows/", partName = "successScheduleCampaign")
    public SuccessScheduleCampaign scheduleCampaign(
        @WebParam(name = "paramsScheduleCampaign", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsScheduleCampaign")
        ParamsScheduleCampaign paramsScheduleCampaign,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Create or update a lead.
     *       
     * 
     * @param authentication
     * @param mktowsContext
     * @param paramsSyncLead
     * @return
     *     returns com.marketo.mktows.SuccessSyncLead
     */
    @WebMethod(action = "http://www.marketo.com/mktows/syncLead")
    @WebResult(name = "successSyncLead", targetNamespace = "http://www.marketo.com/mktows/", partName = "successSyncLead")
    public SuccessSyncLead syncLead(
        @WebParam(name = "paramsSyncLead", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsSyncLead")
        ParamsSyncLead paramsSyncLead,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication,
        @WebParam(name = "MktowsContextHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "mktowsContext")
        MktowsContextHeaderInfo mktowsContext);

    /**
     * Create or update one or more leads.
     *       
     * 
     * @param authentication
     * @param paramsSyncMultipleLeads
     * @return
     *     returns com.marketo.mktows.SuccessSyncMultipleLeads
     */
    @WebMethod(action = "http://www.marketo.com/mktows/syncMultipleLeads")
    @WebResult(name = "successSyncMultipleLeads", targetNamespace = "http://www.marketo.com/mktows/", partName = "successSyncMultipleLeads")
    public SuccessSyncMultipleLeads syncMultipleLeads(
        @WebParam(name = "paramsSyncMultipleLeads", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsSyncMultipleLeads")
        ParamsSyncMultipleLeads paramsSyncMultipleLeads,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Update, Insert, or Upsert custom object records
     *       
     * 
     * @param authentication
     * @param paramsSyncCustomObjects
     * @return
     *     returns com.marketo.mktows.SuccessSyncCustomObjects
     */
    @WebMethod(action = "http://www.marketo.com/mktows/syncCustomObjects")
    @WebResult(name = "successSyncCustomObjects", targetNamespace = "http://www.marketo.com/mktows/", partName = "successSyncCustomObjects")
    public SuccessSyncCustomObjects syncCustomObjects(
        @WebParam(name = "paramsSyncCustomObjects", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsSyncCustomObjects")
        ParamsSyncCustomObjects paramsSyncCustomObjects,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Delete custom object records
     *       
     * 
     * @param paramsDeleteCustomObjects
     * @param authentication
     * @return
     *     returns com.marketo.mktows.SuccessDeleteCustomObjects
     */
    @WebMethod(action = "http://www.marketo.com/mktows/deleteCustomObjects")
    @WebResult(name = "successDeleteCustomObjects", targetNamespace = "http://www.marketo.com/mktows/", partName = "successDeleteCustomObjects")
    public SuccessDeleteCustomObjects deleteCustomObjects(
        @WebParam(name = "paramsDeleteCustomObjects", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsDeleteCustomObjects")
        ParamsDeleteCustomObjects paramsDeleteCustomObjects,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Get custom object records
     *       
     * 
     * @param authentication
     * @param paramsGetCustomObjects
     * @return
     *     returns com.marketo.mktows.SuccessGetCustomObjects
     */
    @WebMethod(action = "http://www.marketo.com/mktows/getCustomObjects")
    @WebResult(name = "successGetCustomObjects", targetNamespace = "http://www.marketo.com/mktows/", partName = "successGetCustomObjects")
    public SuccessGetCustomObjects getCustomObjects(
        @WebParam(name = "paramsGetCustomObjects", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsGetCustomObjects")
        ParamsGetCustomObjects paramsGetCustomObjects,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Merge Leads
     *       
     * 
     * @param authentication
     * @param paramsMergeLeads
     * @return
     *     returns com.marketo.mktows.SuccessMergeLeads
     */
    @WebMethod(action = "http://www.marketo.com/mktows/mergeLeads")
    @WebResult(name = "successMergeLeads", targetNamespace = "http://www.marketo.com/mktows/", partName = "successMergeLeads")
    public SuccessMergeLeads mergeLeads(
        @WebParam(name = "paramsMergeLeads", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsMergeLeads")
        ParamsMergeLeads paramsMergeLeads,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Get Tags
     *       
     * 
     * @param authentication
     * @param paramsGetChannels
     * @return
     *     returns com.marketo.mktows.SuccessGetChannels
     */
    @WebMethod(action = "http://www.marketo.com/mktows/getChannels")
    @WebResult(name = "successGetChannels", targetNamespace = "http://www.marketo.com/mktows/", partName = "successGetChannels")
    public SuccessGetChannels getChannels(
        @WebParam(name = "paramsGetChannels", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsGetChannels")
        ParamsGetChannels paramsGetChannels,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

    /**
     * Get Tags
     *       
     * 
     * @param authentication
     * @param paramsGetTags
     * @return
     *     returns com.marketo.mktows.SuccessGetTags
     */
    @WebMethod(action = "http://www.marketo.com/mktows/getTags")
    @WebResult(name = "successGetTags", targetNamespace = "http://www.marketo.com/mktows/", partName = "successGetTags")
    public SuccessGetTags getTags(
        @WebParam(name = "paramsGetTags", targetNamespace = "http://www.marketo.com/mktows/", partName = "paramsGetTags")
        ParamsGetTags paramsGetTags,
        @WebParam(name = "AuthenticationHeader", targetNamespace = "http://www.marketo.com/mktows/", header = true, partName = "authentication")
        AuthenticationHeaderInfo authentication);

}
