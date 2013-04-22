
package com.marketo.mktows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.marketo.mktows package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ParamsListOperation_QNAME = new QName("http://www.marketo.com/mktows/", "paramsListOperation");
    private final static QName _ParamsGetTags_QNAME = new QName("http://www.marketo.com/mktows/", "paramsGetTags");
    private final static QName _SuccessScheduleCampaign_QNAME = new QName("http://www.marketo.com/mktows/", "successScheduleCampaign");
    private final static QName _MktowsContextHeader_QNAME = new QName("http://www.marketo.com/mktows/", "MktowsContextHeader");
    private final static QName _ParamsImportToList_QNAME = new QName("http://www.marketo.com/mktows/", "paramsImportToList");
    private final static QName _SuccessMergeLeads_QNAME = new QName("http://www.marketo.com/mktows/", "successMergeLeads");
    private final static QName _ParamsSyncLead_QNAME = new QName("http://www.marketo.com/mktows/", "paramsSyncLead");
    private final static QName _ParamsGetMultipleLeads_QNAME = new QName("http://www.marketo.com/mktows/", "paramsGetMultipleLeads");
    private final static QName _SuccessGetLead_QNAME = new QName("http://www.marketo.com/mktows/", "successGetLead");
    private final static QName _ParamsGetLeadChanges_QNAME = new QName("http://www.marketo.com/mktows/", "paramsGetLeadChanges");
    private final static QName _ParamsScheduleCampaign_QNAME = new QName("http://www.marketo.com/mktows/", "paramsScheduleCampaign");
    private final static QName _SuccessSyncMObjects_QNAME = new QName("http://www.marketo.com/mktows/", "successSyncMObjects");
    private final static QName _ParamsGetChannels_QNAME = new QName("http://www.marketo.com/mktows/", "paramsGetChannels");
    private final static QName _SuccessImportToList_QNAME = new QName("http://www.marketo.com/mktows/", "successImportToList");
    private final static QName _SuccessListMObjects_QNAME = new QName("http://www.marketo.com/mktows/", "successListMObjects");
    private final static QName _SuccessSyncMultipleLeads_QNAME = new QName("http://www.marketo.com/mktows/", "successSyncMultipleLeads");
    private final static QName _ParamsGetLead_QNAME = new QName("http://www.marketo.com/mktows/", "paramsGetLead");
    private final static QName _SuccessDeleteCustomObjects_QNAME = new QName("http://www.marketo.com/mktows/", "successDeleteCustomObjects");
    private final static QName _SuccessGetMObjects_QNAME = new QName("http://www.marketo.com/mktows/", "successGetMObjects");
    private final static QName _SuccessGetLeadActivity_QNAME = new QName("http://www.marketo.com/mktows/", "successGetLeadActivity");
    private final static QName _ParamsRequestCampaign_QNAME = new QName("http://www.marketo.com/mktows/", "paramsRequestCampaign");
    private final static QName _SuccessDeleteMObjects_QNAME = new QName("http://www.marketo.com/mktows/", "successDeleteMObjects");
    private final static QName _SuccessGetCustomObjects_QNAME = new QName("http://www.marketo.com/mktows/", "successGetCustomObjects");
    private final static QName _ParamsMergeLeads_QNAME = new QName("http://www.marketo.com/mktows/", "paramsMergeLeads");
    private final static QName _SuccessGetCampaignsForSource_QNAME = new QName("http://www.marketo.com/mktows/", "successGetCampaignsForSource");
    private final static QName _ParamsDescribeMObject_QNAME = new QName("http://www.marketo.com/mktows/", "paramsDescribeMObject");
    private final static QName _ParamsGetCustomObjects_QNAME = new QName("http://www.marketo.com/mktows/", "paramsGetCustomObjects");
    private final static QName _SuccessRequestCampaign_QNAME = new QName("http://www.marketo.com/mktows/", "successRequestCampaign");
    private final static QName _ParamsGetLeadActivity_QNAME = new QName("http://www.marketo.com/mktows/", "paramsGetLeadActivity");
    private final static QName _ParamsDeleteMObjects_QNAME = new QName("http://www.marketo.com/mktows/", "paramsDeleteMObjects");
    private final static QName _SuccessGetTags_QNAME = new QName("http://www.marketo.com/mktows/", "successGetTags");
    private final static QName _ParamsDeleteCustomObjects_QNAME = new QName("http://www.marketo.com/mktows/", "paramsDeleteCustomObjects");
    private final static QName _SuccessListOperation_QNAME = new QName("http://www.marketo.com/mktows/", "successListOperation");
    private final static QName _ParamsListMObjects_QNAME = new QName("http://www.marketo.com/mktows/", "paramsListMObjects");
    private final static QName _ParamsSyncMObjects_QNAME = new QName("http://www.marketo.com/mktows/", "paramsSyncMObjects");
    private final static QName _SuccessSyncCustomObjects_QNAME = new QName("http://www.marketo.com/mktows/", "successSyncCustomObjects");
    private final static QName _SuccessGetImportToListStatus_QNAME = new QName("http://www.marketo.com/mktows/", "successGetImportToListStatus");
    private final static QName _ParamsSyncCustomObjects_QNAME = new QName("http://www.marketo.com/mktows/", "paramsSyncCustomObjects");
    private final static QName _AuthenticationHeader_QNAME = new QName("http://www.marketo.com/mktows/", "AuthenticationHeader");
    private final static QName _ParamsGetMObjects_QNAME = new QName("http://www.marketo.com/mktows/", "paramsGetMObjects");
    private final static QName _ParamsGetImportToListStatus_QNAME = new QName("http://www.marketo.com/mktows/", "paramsGetImportToListStatus");
    private final static QName _SuccessGetMultipleLeads_QNAME = new QName("http://www.marketo.com/mktows/", "successGetMultipleLeads");
    private final static QName _SuccessSyncLead_QNAME = new QName("http://www.marketo.com/mktows/", "successSyncLead");
    private final static QName _ParamsGetCampaignsForSource_QNAME = new QName("http://www.marketo.com/mktows/", "paramsGetCampaignsForSource");
    private final static QName _SuccessGetLeadChanges_QNAME = new QName("http://www.marketo.com/mktows/", "successGetLeadChanges");
    private final static QName _SuccessDescribeMObject_QNAME = new QName("http://www.marketo.com/mktows/", "successDescribeMObject");
    private final static QName _SuccessGetChannels_QNAME = new QName("http://www.marketo.com/mktows/", "successGetChannels");
    private final static QName _ParamsSyncMultipleLeads_QNAME = new QName("http://www.marketo.com/mktows/", "paramsSyncMultipleLeads");
    private final static QName _ResultGetCustomObjectsCustomObjList_QNAME = new QName("", "customObjList");
    private final static QName _ParamsSyncLeadMarketoCookie_QNAME = new QName("", "marketoCookie");
    private final static QName _ResultGetImportToListStatusEstimatedTime_QNAME = new QName("", "estimatedTime");
    private final static QName _ResultGetImportToListStatusRowsFailed_QNAME = new QName("", "rowsFailed");
    private final static QName _ResultGetImportToListStatusRowsImported_QNAME = new QName("", "rowsImported");
    private final static QName _ResultGetImportToListStatusEndedTime_QNAME = new QName("", "endedTime");
    private final static QName _ResultGetImportToListStatusImportSummary_QNAME = new QName("", "importSummary");
    private final static QName _ResultGetImportToListStatusRowsIgnored_QNAME = new QName("", "rowsIgnored");
    private final static QName _ResultGetImportToListStatusEstimatedRows_QNAME = new QName("", "estimatedRows");
    private final static QName _ResultGetImportToListStatusStartedTime_QNAME = new QName("", "startedTime");
    private final static QName _StreamPositionOldestCreatedAt_QNAME = new QName("", "oldestCreatedAt");
    private final static QName _StreamPositionActivityCreatedAt_QNAME = new QName("", "activityCreatedAt");
    private final static QName _StreamPositionLatestCreatedAt_QNAME = new QName("", "latestCreatedAt");
    private final static QName _StreamPositionOffset_QNAME = new QName("", "offset");
    private final static QName _LeadActivityListActivityRecordList_QNAME = new QName("", "activityRecordList");
    private final static QName _ParamsGetLeadActivityBatchSize_QNAME = new QName("", "batchSize");
    private final static QName _ParamsGetLeadActivityActivityFilter_QNAME = new QName("", "activityFilter");
    private final static QName _ParamsGetLeadActivityStartPosition_QNAME = new QName("", "startPosition");
    private final static QName _ResultGetMultipleLeadsLeadRecordList_QNAME = new QName("", "leadRecordList");
    private final static QName _ParamsGetMultipleLeadsStreamPosition_QNAME = new QName("", "streamPosition");
    private final static QName _ActivityRecordForeignSysId_QNAME = new QName("", "foreignSysId");
    private final static QName _ActivityRecordActivityAttributes_QNAME = new QName("", "activityAttributes");
    private final static QName _ActivityRecordForeignSysOrgId_QNAME = new QName("", "foreignSysOrgId");
    private final static QName _ActivityRecordOrgName_QNAME = new QName("", "orgName");
    private final static QName _ActivityRecordCampaign_QNAME = new QName("", "campaign");
    private final static QName _ActivityRecordPersonName_QNAME = new QName("", "personName");
    private final static QName _MergeStatusError_QNAME = new QName("", "error");
    private final static QName _MergeStatusLosingLeadIdList_QNAME = new QName("", "losingLeadIdList");
    private final static QName _MergeStatusWinningLeadId_QNAME = new QName("", "winningLeadId");
    private final static QName _ResultGetCampaignsForSourceCampaignRecordList_QNAME = new QName("", "campaignRecordList");
    private final static QName _ResultListOperationStatusList_QNAME = new QName("", "statusList");
    private final static QName _LastUpdateAtSelectorLatestUpdatedAt_QNAME = new QName("", "latestUpdatedAt");
    private final static QName _StaticListSelectorStaticListId_QNAME = new QName("", "staticListId");
    private final static QName _StaticListSelectorStaticListName_QNAME = new QName("", "staticListName");
    private final static QName _ParamsGetCampaignsForSourceName_QNAME = new QName("", "name");
    private final static QName _ParamsGetCampaignsForSourceExactName_QNAME = new QName("", "exactName");
    private final static QName _ParamsScheduleCampaignCampaignRunAt_QNAME = new QName("", "campaignRunAt");
    private final static QName _ParamsScheduleCampaignProgramTokenList_QNAME = new QName("", "programTokenList");
    private final static QName _ParamsListOperationSkipActivityLog_QNAME = new QName("", "skipActivityLog");
    private final static QName _ParamsListOperationStrict_QNAME = new QName("", "strict");
    private final static QName _ParamsRequestCampaignCampaignName_QNAME = new QName("", "campaignName");
    private final static QName _ParamsRequestCampaignCampaignId_QNAME = new QName("", "campaignId");
    private final static QName _ParamsRequestCampaignLeadList_QNAME = new QName("", "leadList");
    private final static QName _ParamsRequestCampaignProgramName_QNAME = new QName("", "programName");
    private final static QName _SyncCustomObjStatusCustomObjKeyList_QNAME = new QName("", "customObjKeyList");
    private final static QName _CustomObjCustomObjAttributeList_QNAME = new QName("", "customObjAttributeList");
    private final static QName _AttributeAttrType_QNAME = new QName("", "attrType");
    private final static QName _VersionedItemDescription_QNAME = new QName("", "description");
    private final static QName _VersionedItemType_QNAME = new QName("", "type");
    private final static QName _ParamsSyncCustomObjectsOperation_QNAME = new QName("", "operation");
    private final static QName _ResultSyncLeadLeadRecord_QNAME = new QName("", "leadRecord");
    private final static QName _LeadRecordForeignSysType_QNAME = new QName("", "ForeignSysType");
    private final static QName _LeadRecordLeadAttributeList_QNAME = new QName("", "leadAttributeList");
    private final static QName _LeadRecordForeignSysPersonId_QNAME = new QName("", "ForeignSysPersonId");
    private final static QName _LeadRecordEmail_QNAME = new QName("", "Email");
    private final static QName _LeadRecordId_QNAME = new QName("", "Id");
    private final static QName _LeadChangeRecordMktgAssetName_QNAME = new QName("", "mktgAssetName");
    private final static QName _ResultGetLeadChangesLeadChangeRecordList_QNAME = new QName("", "leadChangeRecordList");
    private final static QName _ParamsSyncMultipleLeadsDedupEnabled_QNAME = new QName("", "dedupEnabled");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.marketo.mktows
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfAttribute }
     * 
     */
    public ArrayOfAttribute createArrayOfAttribute() {
        return new ArrayOfAttribute();
    }

    /**
     * Create an instance of {@link ResultSyncMObjects }
     * 
     */
    public ResultSyncMObjects createResultSyncMObjects() {
        return new ResultSyncMObjects();
    }

    /**
     * Create an instance of {@link ParamsGetChannels }
     * 
     */
    public ParamsGetChannels createParamsGetChannels() {
        return new ParamsGetChannels();
    }

    /**
     * Create an instance of {@link SuccessGetLead }
     * 
     */
    public SuccessGetLead createSuccessGetLead() {
        return new SuccessGetLead();
    }

    /**
     * Create an instance of {@link SuccessDescribeMObject }
     * 
     */
    public SuccessDescribeMObject createSuccessDescribeMObject() {
        return new SuccessDescribeMObject();
    }

    /**
     * Create an instance of {@link LeadStatus }
     * 
     */
    public LeadStatus createLeadStatus() {
        return new LeadStatus();
    }

    /**
     * Create an instance of {@link ArrayOfActivityRecord }
     * 
     */
    public ArrayOfActivityRecord createArrayOfActivityRecord() {
        return new ArrayOfActivityRecord();
    }

    /**
     * Create an instance of {@link ParamsGetImportToListStatus }
     * 
     */
    public ParamsGetImportToListStatus createParamsGetImportToListStatus() {
        return new ParamsGetImportToListStatus();
    }

    /**
     * Create an instance of {@link SuccessSyncMultipleLeads }
     * 
     */
    public SuccessSyncMultipleLeads createSuccessSyncMultipleLeads() {
        return new SuccessSyncMultipleLeads();
    }

    /**
     * Create an instance of {@link ArrayOfActivityType }
     * 
     */
    public ArrayOfActivityType createArrayOfActivityType() {
        return new ArrayOfActivityType();
    }

    /**
     * Create an instance of {@link ArrayOfMObjFieldMetadata }
     * 
     */
    public ArrayOfMObjFieldMetadata createArrayOfMObjFieldMetadata() {
        return new ArrayOfMObjFieldMetadata();
    }

    /**
     * Create an instance of {@link ActivityRecord }
     * 
     */
    public ActivityRecord createActivityRecord() {
        return new ActivityRecord();
    }

    /**
     * Create an instance of {@link SuccessGetChannels }
     * 
     */
    public SuccessGetChannels createSuccessGetChannels() {
        return new SuccessGetChannels();
    }

    /**
     * Create an instance of {@link SuccessSyncLead }
     * 
     */
    public SuccessSyncLead createSuccessSyncLead() {
        return new SuccessSyncLead();
    }

    /**
     * Create an instance of {@link ResultGetCampaignsForSource }
     * 
     */
    public ResultGetCampaignsForSource createResultGetCampaignsForSource() {
        return new ResultGetCampaignsForSource();
    }

    /**
     * Create an instance of {@link SuccessGetLeadChanges }
     * 
     */
    public SuccessGetLeadChanges createSuccessGetLeadChanges() {
        return new SuccessGetLeadChanges();
    }

    /**
     * Create an instance of {@link SuccessGetLeadActivity }
     * 
     */
    public SuccessGetLeadActivity createSuccessGetLeadActivity() {
        return new SuccessGetLeadActivity();
    }

    /**
     * Create an instance of {@link ArrayOfTypeAttrib }
     * 
     */
    public ArrayOfTypeAttrib createArrayOfTypeAttrib() {
        return new ArrayOfTypeAttrib();
    }

    /**
     * Create an instance of {@link ArrayOfMObjCriteria }
     * 
     */
    public ArrayOfMObjCriteria createArrayOfMObjCriteria() {
        return new ArrayOfMObjCriteria();
    }

    /**
     * Create an instance of {@link SuccessGetCustomObjects }
     * 
     */
    public SuccessGetCustomObjects createSuccessGetCustomObjects() {
        return new SuccessGetCustomObjects();
    }

    /**
     * Create an instance of {@link CustomObj }
     * 
     */
    public CustomObj createCustomObj() {
        return new CustomObj();
    }

    /**
     * Create an instance of {@link ResultGetTags }
     * 
     */
    public ResultGetTags createResultGetTags() {
        return new ResultGetTags();
    }

    /**
     * Create an instance of {@link MktowsContextHeaderInfo }
     * 
     */
    public MktowsContextHeaderInfo createMktowsContextHeaderInfo() {
        return new MktowsContextHeaderInfo();
    }

    /**
     * Create an instance of {@link TagStatus }
     * 
     */
    public TagStatus createTagStatus() {
        return new TagStatus();
    }

    /**
     * Create an instance of {@link LeadKeySelector }
     * 
     */
    public LeadKeySelector createLeadKeySelector() {
        return new LeadKeySelector();
    }

    /**
     * Create an instance of {@link ArrayOfVersionedItem }
     * 
     */
    public ArrayOfVersionedItem createArrayOfVersionedItem() {
        return new ArrayOfVersionedItem();
    }

    /**
     * Create an instance of {@link ParamsDeleteCustomObjects }
     * 
     */
    public ParamsDeleteCustomObjects createParamsDeleteCustomObjects() {
        return new ParamsDeleteCustomObjects();
    }

    /**
     * Create an instance of {@link ParamsGetLeadChanges }
     * 
     */
    public ParamsGetLeadChanges createParamsGetLeadChanges() {
        return new ParamsGetLeadChanges();
    }

    /**
     * Create an instance of {@link ResultGetCustomObjects }
     * 
     */
    public ResultGetCustomObjects createResultGetCustomObjects() {
        return new ResultGetCustomObjects();
    }

    /**
     * Create an instance of {@link MObjCriteria }
     * 
     */
    public MObjCriteria createMObjCriteria() {
        return new MObjCriteria();
    }

    /**
     * Create an instance of {@link ArrayOfBase64Binary }
     * 
     */
    public ArrayOfBase64Binary createArrayOfBase64Binary() {
        return new ArrayOfBase64Binary();
    }

    /**
     * Create an instance of {@link ResultGetImportToListStatus }
     * 
     */
    public ResultGetImportToListStatus createResultGetImportToListStatus() {
        return new ResultGetImportToListStatus();
    }

    /**
     * Create an instance of {@link StreamPosition }
     * 
     */
    public StreamPosition createStreamPosition() {
        return new StreamPosition();
    }

    /**
     * Create an instance of {@link SuccessDeleteMObjects }
     * 
     */
    public SuccessDeleteMObjects createSuccessDeleteMObjects() {
        return new SuccessDeleteMObjects();
    }

    /**
     * Create an instance of {@link ResultImportToList }
     * 
     */
    public ResultImportToList createResultImportToList() {
        return new ResultImportToList();
    }

    /**
     * Create an instance of {@link ParamsGetLeadActivity }
     * 
     */
    public ParamsGetLeadActivity createParamsGetLeadActivity() {
        return new ParamsGetLeadActivity();
    }

    /**
     * Create an instance of {@link ParamsSyncMObjects }
     * 
     */
    public ParamsSyncMObjects createParamsSyncMObjects() {
        return new ParamsSyncMObjects();
    }

    /**
     * Create an instance of {@link ArrayOfInteger }
     * 
     */
    public ArrayOfInteger createArrayOfInteger() {
        return new ArrayOfInteger();
    }

    /**
     * Create an instance of {@link ResultGetMultipleLeads }
     * 
     */
    public ResultGetMultipleLeads createResultGetMultipleLeads() {
        return new ResultGetMultipleLeads();
    }

    /**
     * Create an instance of {@link ParamsGetMultipleLeads }
     * 
     */
    public ParamsGetMultipleLeads createParamsGetMultipleLeads() {
        return new ParamsGetMultipleLeads();
    }

    /**
     * Create an instance of {@link ParamsImportToList }
     * 
     */
    public ParamsImportToList createParamsImportToList() {
        return new ParamsImportToList();
    }

    /**
     * Create an instance of {@link SuccessGetTags }
     * 
     */
    public SuccessGetTags createSuccessGetTags() {
        return new SuccessGetTags();
    }

    /**
     * Create an instance of {@link ResultSyncCustomObjects }
     * 
     */
    public ResultSyncCustomObjects createResultSyncCustomObjects() {
        return new ResultSyncCustomObjects();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link MObject }
     * 
     */
    public MObject createMObject() {
        return new MObject();
    }

    /**
     * Create an instance of {@link ArrayOfSyncCustomObjStatus }
     * 
     */
    public ArrayOfSyncCustomObjStatus createArrayOfSyncCustomObjStatus() {
        return new ArrayOfSyncCustomObjStatus();
    }

    /**
     * Create an instance of {@link ResultScheduleCampaign }
     * 
     */
    public ResultScheduleCampaign createResultScheduleCampaign() {
        return new ResultScheduleCampaign();
    }

    /**
     * Create an instance of {@link AuthenticationHeaderInfo }
     * 
     */
    public AuthenticationHeaderInfo createAuthenticationHeaderInfo() {
        return new AuthenticationHeaderInfo();
    }

    /**
     * Create an instance of {@link SuccessGetImportToListStatus }
     * 
     */
    public SuccessGetImportToListStatus createSuccessGetImportToListStatus() {
        return new SuccessGetImportToListStatus();
    }

    /**
     * Create an instance of {@link CampaignRecord }
     * 
     */
    public CampaignRecord createCampaignRecord() {
        return new CampaignRecord();
    }

    /**
     * Create an instance of {@link ParamsListOperation }
     * 
     */
    public ParamsListOperation createParamsListOperation() {
        return new ParamsListOperation();
    }

    /**
     * Create an instance of {@link ParamsDescribeMObject }
     * 
     */
    public ParamsDescribeMObject createParamsDescribeMObject() {
        return new ParamsDescribeMObject();
    }

    /**
     * Create an instance of {@link ArrayOfLeadRecord }
     * 
     */
    public ArrayOfLeadRecord createArrayOfLeadRecord() {
        return new ArrayOfLeadRecord();
    }

    /**
     * Create an instance of {@link ParamsGetMObjects }
     * 
     */
    public ParamsGetMObjects createParamsGetMObjects() {
        return new ParamsGetMObjects();
    }

    /**
     * Create an instance of {@link SuccessDeleteCustomObjects }
     * 
     */
    public SuccessDeleteCustomObjects createSuccessDeleteCustomObjects() {
        return new SuccessDeleteCustomObjects();
    }

    /**
     * Create an instance of {@link ArrayOfMObjAssociation }
     * 
     */
    public ArrayOfMObjAssociation createArrayOfMObjAssociation() {
        return new ArrayOfMObjAssociation();
    }

    /**
     * Create an instance of {@link MObjectMetadata }
     * 
     */
    public MObjectMetadata createMObjectMetadata() {
        return new MObjectMetadata();
    }

    /**
     * Create an instance of {@link VersionedItem }
     * 
     */
    public VersionedItem createVersionedItem() {
        return new VersionedItem();
    }

    /**
     * Create an instance of {@link ArrayOfTag }
     * 
     */
    public ArrayOfTag createArrayOfTag() {
        return new ArrayOfTag();
    }

    /**
     * Create an instance of {@link SuccessMergeLeads }
     * 
     */
    public SuccessMergeLeads createSuccessMergeLeads() {
        return new SuccessMergeLeads();
    }

    /**
     * Create an instance of {@link ParamsListMObjects }
     * 
     */
    public ParamsListMObjects createParamsListMObjects() {
        return new ParamsListMObjects();
    }

    /**
     * Create an instance of {@link LeadRecord }
     * 
     */
    public LeadRecord createLeadRecord() {
        return new LeadRecord();
    }

    /**
     * Create an instance of {@link MObjAssociation }
     * 
     */
    public MObjAssociation createMObjAssociation() {
        return new MObjAssociation();
    }

    /**
     * Create an instance of {@link LeadChangeRecord }
     * 
     */
    public LeadChangeRecord createLeadChangeRecord() {
        return new LeadChangeRecord();
    }

    /**
     * Create an instance of {@link Attrib }
     * 
     */
    public Attrib createAttrib() {
        return new Attrib();
    }

    /**
     * Create an instance of {@link ResultGetLeadChanges }
     * 
     */
    public ResultGetLeadChanges createResultGetLeadChanges() {
        return new ResultGetLeadChanges();
    }

    /**
     * Create an instance of {@link ParamsSyncMultipleLeads }
     * 
     */
    public ParamsSyncMultipleLeads createParamsSyncMultipleLeads() {
        return new ParamsSyncMultipleLeads();
    }

    /**
     * Create an instance of {@link ResultRequestCampaign }
     * 
     */
    public ResultRequestCampaign createResultRequestCampaign() {
        return new ResultRequestCampaign();
    }

    /**
     * Create an instance of {@link LeadActivityList }
     * 
     */
    public LeadActivityList createLeadActivityList() {
        return new LeadActivityList();
    }

    /**
     * Create an instance of {@link Tag }
     * 
     */
    public Tag createTag() {
        return new Tag();
    }

    /**
     * Create an instance of {@link ResultDeleteMObjects }
     * 
     */
    public ResultDeleteMObjects createResultDeleteMObjects() {
        return new ResultDeleteMObjects();
    }

    /**
     * Create an instance of {@link ArrayOfMObjStatus }
     * 
     */
    public ArrayOfMObjStatus createArrayOfMObjStatus() {
        return new ArrayOfMObjStatus();
    }

    /**
     * Create an instance of {@link MObjFieldMetadata }
     * 
     */
    public MObjFieldMetadata createMObjFieldMetadata() {
        return new MObjFieldMetadata();
    }

    /**
     * Create an instance of {@link ParamsMergeLeads }
     * 
     */
    public ParamsMergeLeads createParamsMergeLeads() {
        return new ParamsMergeLeads();
    }

    /**
     * Create an instance of {@link ResultGetMObjects }
     * 
     */
    public ResultGetMObjects createResultGetMObjects() {
        return new ResultGetMObjects();
    }

    /**
     * Create an instance of {@link SuccessListOperation }
     * 
     */
    public SuccessListOperation createSuccessListOperation() {
        return new SuccessListOperation();
    }

    /**
     * Create an instance of {@link LastUpdateAtSelector }
     * 
     */
    public LastUpdateAtSelector createLastUpdateAtSelector() {
        return new LastUpdateAtSelector();
    }

    /**
     * Create an instance of {@link ResultListOperation }
     * 
     */
    public ResultListOperation createResultListOperation() {
        return new ResultListOperation();
    }

    /**
     * Create an instance of {@link ArrayOfProgressionStatus }
     * 
     */
    public ArrayOfProgressionStatus createArrayOfProgressionStatus() {
        return new ArrayOfProgressionStatus();
    }

    /**
     * Create an instance of {@link SuccessScheduleCampaign }
     * 
     */
    public SuccessScheduleCampaign createSuccessScheduleCampaign() {
        return new SuccessScheduleCampaign();
    }

    /**
     * Create an instance of {@link ParamsRequestCampaign }
     * 
     */
    public ParamsRequestCampaign createParamsRequestCampaign() {
        return new ParamsRequestCampaign();
    }

    /**
     * Create an instance of {@link ResultMergeLeads }
     * 
     */
    public ResultMergeLeads createResultMergeLeads() {
        return new ResultMergeLeads();
    }

    /**
     * Create an instance of {@link SyncCustomObjStatus }
     * 
     */
    public SyncCustomObjStatus createSyncCustomObjStatus() {
        return new SyncCustomObjStatus();
    }

    /**
     * Create an instance of {@link ResultListMObjects }
     * 
     */
    public ResultListMObjects createResultListMObjects() {
        return new ResultListMObjects();
    }

    /**
     * Create an instance of {@link ArrayOfMObject }
     * 
     */
    public ArrayOfMObject createArrayOfMObject() {
        return new ArrayOfMObject();
    }

    /**
     * Create an instance of {@link SuccessGetMultipleLeads }
     * 
     */
    public SuccessGetMultipleLeads createSuccessGetMultipleLeads() {
        return new SuccessGetMultipleLeads();
    }

    /**
     * Create an instance of {@link ResultSyncLead }
     * 
     */
    public ResultSyncLead createResultSyncLead() {
        return new ResultSyncLead();
    }

    /**
     * Create an instance of {@link SuccessSyncMObjects }
     * 
     */
    public SuccessSyncMObjects createSuccessSyncMObjects() {
        return new SuccessSyncMObjects();
    }

    /**
     * Create an instance of {@link ParamsGetCustomObjects }
     * 
     */
    public ParamsGetCustomObjects createParamsGetCustomObjects() {
        return new ParamsGetCustomObjects();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignRecord }
     * 
     */
    public ArrayOfCampaignRecord createArrayOfCampaignRecord() {
        return new ArrayOfCampaignRecord();
    }

    /**
     * Create an instance of {@link ResultGetLead }
     * 
     */
    public ResultGetLead createResultGetLead() {
        return new ResultGetLead();
    }

    /**
     * Create an instance of {@link ArrayOfTagStatus }
     * 
     */
    public ArrayOfTagStatus createArrayOfTagStatus() {
        return new ArrayOfTagStatus();
    }

    /**
     * Create an instance of {@link ParamsSyncLead }
     * 
     */
    public ParamsSyncLead createParamsSyncLead() {
        return new ParamsSyncLead();
    }

    /**
     * Create an instance of {@link ArrayOfLeadStatus }
     * 
     */
    public ArrayOfLeadStatus createArrayOfLeadStatus() {
        return new ArrayOfLeadStatus();
    }

    /**
     * Create an instance of {@link ParamsDeleteMObjects }
     * 
     */
    public ParamsDeleteMObjects createParamsDeleteMObjects() {
        return new ParamsDeleteMObjects();
    }

    /**
     * Create an instance of {@link ParamsGetLead }
     * 
     */
    public ParamsGetLead createParamsGetLead() {
        return new ParamsGetLead();
    }

    /**
     * Create an instance of {@link ResultDeleteCustomObjects }
     * 
     */
    public ResultDeleteCustomObjects createResultDeleteCustomObjects() {
        return new ResultDeleteCustomObjects();
    }

    /**
     * Create an instance of {@link ResultSyncMultipleLeads }
     * 
     */
    public ResultSyncMultipleLeads createResultSyncMultipleLeads() {
        return new ResultSyncMultipleLeads();
    }

    /**
     * Create an instance of {@link SuccessGetCampaignsForSource }
     * 
     */
    public SuccessGetCampaignsForSource createSuccessGetCampaignsForSource() {
        return new SuccessGetCampaignsForSource();
    }

    /**
     * Create an instance of {@link TypeAttrib }
     * 
     */
    public TypeAttrib createTypeAttrib() {
        return new TypeAttrib();
    }

    /**
     * Create an instance of {@link SuccessRequestCampaign }
     * 
     */
    public SuccessRequestCampaign createSuccessRequestCampaign() {
        return new SuccessRequestCampaign();
    }

    /**
     * Create an instance of {@link ArrayOfLeadKey }
     * 
     */
    public ArrayOfLeadKey createArrayOfLeadKey() {
        return new ArrayOfLeadKey();
    }

    /**
     * Create an instance of {@link ArrayOfCustomObj }
     * 
     */
    public ArrayOfCustomObj createArrayOfCustomObj() {
        return new ArrayOfCustomObj();
    }

    /**
     * Create an instance of {@link SuccessGetMObjects }
     * 
     */
    public SuccessGetMObjects createSuccessGetMObjects() {
        return new SuccessGetMObjects();
    }

    /**
     * Create an instance of {@link MergeStatus }
     * 
     */
    public MergeStatus createMergeStatus() {
        return new MergeStatus();
    }

    /**
     * Create an instance of {@link StaticListSelector }
     * 
     */
    public StaticListSelector createStaticListSelector() {
        return new StaticListSelector();
    }

    /**
     * Create an instance of {@link SuccessSyncCustomObjects }
     * 
     */
    public SuccessSyncCustomObjects createSuccessSyncCustomObjects() {
        return new SuccessSyncCustomObjects();
    }

    /**
     * Create an instance of {@link ParamsGetCampaignsForSource }
     * 
     */
    public ParamsGetCampaignsForSource createParamsGetCampaignsForSource() {
        return new ParamsGetCampaignsForSource();
    }

    /**
     * Create an instance of {@link ParamsScheduleCampaign }
     * 
     */
    public ParamsScheduleCampaign createParamsScheduleCampaign() {
        return new ParamsScheduleCampaign();
    }

    /**
     * Create an instance of {@link ProgressionStatus }
     * 
     */
    public ProgressionStatus createProgressionStatus() {
        return new ProgressionStatus();
    }

    /**
     * Create an instance of {@link ParamsGetTags }
     * 
     */
    public ParamsGetTags createParamsGetTags() {
        return new ParamsGetTags();
    }

    /**
     * Create an instance of {@link ResultDescribeMObject }
     * 
     */
    public ResultDescribeMObject createResultDescribeMObject() {
        return new ResultDescribeMObject();
    }

    /**
     * Create an instance of {@link ArrayOfLeadChangeRecord }
     * 
     */
    public ArrayOfLeadChangeRecord createArrayOfLeadChangeRecord() {
        return new ArrayOfLeadChangeRecord();
    }

    /**
     * Create an instance of {@link SuccessListMObjects }
     * 
     */
    public SuccessListMObjects createSuccessListMObjects() {
        return new SuccessListMObjects();
    }

    /**
     * Create an instance of {@link Attribute }
     * 
     */
    public Attribute createAttribute() {
        return new Attribute();
    }

    /**
     * Create an instance of {@link ListKey }
     * 
     */
    public ListKey createListKey() {
        return new ListKey();
    }

    /**
     * Create an instance of {@link LeadKey }
     * 
     */
    public LeadKey createLeadKey() {
        return new LeadKey();
    }

    /**
     * Create an instance of {@link ArrayOfKeyList }
     * 
     */
    public ArrayOfKeyList createArrayOfKeyList() {
        return new ArrayOfKeyList();
    }

    /**
     * Create an instance of {@link ArrayOfAttrib }
     * 
     */
    public ArrayOfAttrib createArrayOfAttrib() {
        return new ArrayOfAttrib();
    }

    /**
     * Create an instance of {@link SyncStatus }
     * 
     */
    public SyncStatus createSyncStatus() {
        return new SyncStatus();
    }

    /**
     * Create an instance of {@link ParamsSyncCustomObjects }
     * 
     */
    public ParamsSyncCustomObjects createParamsSyncCustomObjects() {
        return new ParamsSyncCustomObjects();
    }

    /**
     * Create an instance of {@link ResultGetChannels }
     * 
     */
    public ResultGetChannels createResultGetChannels() {
        return new ResultGetChannels();
    }

    /**
     * Create an instance of {@link MObjStatus }
     * 
     */
    public MObjStatus createMObjStatus() {
        return new MObjStatus();
    }

    /**
     * Create an instance of {@link ActivityTypeFilter }
     * 
     */
    public ActivityTypeFilter createActivityTypeFilter() {
        return new ActivityTypeFilter();
    }

    /**
     * Create an instance of {@link ArrayOfSyncStatus }
     * 
     */
    public ArrayOfSyncStatus createArrayOfSyncStatus() {
        return new ArrayOfSyncStatus();
    }

    /**
     * Create an instance of {@link SuccessImportToList }
     * 
     */
    public SuccessImportToList createSuccessImportToList() {
        return new SuccessImportToList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsListOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsListOperation")
    public JAXBElement<ParamsListOperation> createParamsListOperation(ParamsListOperation value) {
        return new JAXBElement<ParamsListOperation>(_ParamsListOperation_QNAME, ParamsListOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsGetTags }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsGetTags")
    public JAXBElement<ParamsGetTags> createParamsGetTags(ParamsGetTags value) {
        return new JAXBElement<ParamsGetTags>(_ParamsGetTags_QNAME, ParamsGetTags.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessScheduleCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successScheduleCampaign")
    public JAXBElement<SuccessScheduleCampaign> createSuccessScheduleCampaign(SuccessScheduleCampaign value) {
        return new JAXBElement<SuccessScheduleCampaign>(_SuccessScheduleCampaign_QNAME, SuccessScheduleCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MktowsContextHeaderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "MktowsContextHeader")
    public JAXBElement<MktowsContextHeaderInfo> createMktowsContextHeader(MktowsContextHeaderInfo value) {
        return new JAXBElement<MktowsContextHeaderInfo>(_MktowsContextHeader_QNAME, MktowsContextHeaderInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsImportToList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsImportToList")
    public JAXBElement<ParamsImportToList> createParamsImportToList(ParamsImportToList value) {
        return new JAXBElement<ParamsImportToList>(_ParamsImportToList_QNAME, ParamsImportToList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessMergeLeads }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successMergeLeads")
    public JAXBElement<SuccessMergeLeads> createSuccessMergeLeads(SuccessMergeLeads value) {
        return new JAXBElement<SuccessMergeLeads>(_SuccessMergeLeads_QNAME, SuccessMergeLeads.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsSyncLead }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsSyncLead")
    public JAXBElement<ParamsSyncLead> createParamsSyncLead(ParamsSyncLead value) {
        return new JAXBElement<ParamsSyncLead>(_ParamsSyncLead_QNAME, ParamsSyncLead.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsGetMultipleLeads }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsGetMultipleLeads")
    public JAXBElement<ParamsGetMultipleLeads> createParamsGetMultipleLeads(ParamsGetMultipleLeads value) {
        return new JAXBElement<ParamsGetMultipleLeads>(_ParamsGetMultipleLeads_QNAME, ParamsGetMultipleLeads.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessGetLead }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successGetLead")
    public JAXBElement<SuccessGetLead> createSuccessGetLead(SuccessGetLead value) {
        return new JAXBElement<SuccessGetLead>(_SuccessGetLead_QNAME, SuccessGetLead.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsGetLeadChanges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsGetLeadChanges")
    public JAXBElement<ParamsGetLeadChanges> createParamsGetLeadChanges(ParamsGetLeadChanges value) {
        return new JAXBElement<ParamsGetLeadChanges>(_ParamsGetLeadChanges_QNAME, ParamsGetLeadChanges.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsScheduleCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsScheduleCampaign")
    public JAXBElement<ParamsScheduleCampaign> createParamsScheduleCampaign(ParamsScheduleCampaign value) {
        return new JAXBElement<ParamsScheduleCampaign>(_ParamsScheduleCampaign_QNAME, ParamsScheduleCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessSyncMObjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successSyncMObjects")
    public JAXBElement<SuccessSyncMObjects> createSuccessSyncMObjects(SuccessSyncMObjects value) {
        return new JAXBElement<SuccessSyncMObjects>(_SuccessSyncMObjects_QNAME, SuccessSyncMObjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsGetChannels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsGetChannels")
    public JAXBElement<ParamsGetChannels> createParamsGetChannels(ParamsGetChannels value) {
        return new JAXBElement<ParamsGetChannels>(_ParamsGetChannels_QNAME, ParamsGetChannels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessImportToList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successImportToList")
    public JAXBElement<SuccessImportToList> createSuccessImportToList(SuccessImportToList value) {
        return new JAXBElement<SuccessImportToList>(_SuccessImportToList_QNAME, SuccessImportToList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessListMObjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successListMObjects")
    public JAXBElement<SuccessListMObjects> createSuccessListMObjects(SuccessListMObjects value) {
        return new JAXBElement<SuccessListMObjects>(_SuccessListMObjects_QNAME, SuccessListMObjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessSyncMultipleLeads }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successSyncMultipleLeads")
    public JAXBElement<SuccessSyncMultipleLeads> createSuccessSyncMultipleLeads(SuccessSyncMultipleLeads value) {
        return new JAXBElement<SuccessSyncMultipleLeads>(_SuccessSyncMultipleLeads_QNAME, SuccessSyncMultipleLeads.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsGetLead }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsGetLead")
    public JAXBElement<ParamsGetLead> createParamsGetLead(ParamsGetLead value) {
        return new JAXBElement<ParamsGetLead>(_ParamsGetLead_QNAME, ParamsGetLead.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessDeleteCustomObjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successDeleteCustomObjects")
    public JAXBElement<SuccessDeleteCustomObjects> createSuccessDeleteCustomObjects(SuccessDeleteCustomObjects value) {
        return new JAXBElement<SuccessDeleteCustomObjects>(_SuccessDeleteCustomObjects_QNAME, SuccessDeleteCustomObjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessGetMObjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successGetMObjects")
    public JAXBElement<SuccessGetMObjects> createSuccessGetMObjects(SuccessGetMObjects value) {
        return new JAXBElement<SuccessGetMObjects>(_SuccessGetMObjects_QNAME, SuccessGetMObjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessGetLeadActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successGetLeadActivity")
    public JAXBElement<SuccessGetLeadActivity> createSuccessGetLeadActivity(SuccessGetLeadActivity value) {
        return new JAXBElement<SuccessGetLeadActivity>(_SuccessGetLeadActivity_QNAME, SuccessGetLeadActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsRequestCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsRequestCampaign")
    public JAXBElement<ParamsRequestCampaign> createParamsRequestCampaign(ParamsRequestCampaign value) {
        return new JAXBElement<ParamsRequestCampaign>(_ParamsRequestCampaign_QNAME, ParamsRequestCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessDeleteMObjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successDeleteMObjects")
    public JAXBElement<SuccessDeleteMObjects> createSuccessDeleteMObjects(SuccessDeleteMObjects value) {
        return new JAXBElement<SuccessDeleteMObjects>(_SuccessDeleteMObjects_QNAME, SuccessDeleteMObjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessGetCustomObjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successGetCustomObjects")
    public JAXBElement<SuccessGetCustomObjects> createSuccessGetCustomObjects(SuccessGetCustomObjects value) {
        return new JAXBElement<SuccessGetCustomObjects>(_SuccessGetCustomObjects_QNAME, SuccessGetCustomObjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsMergeLeads }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsMergeLeads")
    public JAXBElement<ParamsMergeLeads> createParamsMergeLeads(ParamsMergeLeads value) {
        return new JAXBElement<ParamsMergeLeads>(_ParamsMergeLeads_QNAME, ParamsMergeLeads.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessGetCampaignsForSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successGetCampaignsForSource")
    public JAXBElement<SuccessGetCampaignsForSource> createSuccessGetCampaignsForSource(SuccessGetCampaignsForSource value) {
        return new JAXBElement<SuccessGetCampaignsForSource>(_SuccessGetCampaignsForSource_QNAME, SuccessGetCampaignsForSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsDescribeMObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsDescribeMObject")
    public JAXBElement<ParamsDescribeMObject> createParamsDescribeMObject(ParamsDescribeMObject value) {
        return new JAXBElement<ParamsDescribeMObject>(_ParamsDescribeMObject_QNAME, ParamsDescribeMObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsGetCustomObjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsGetCustomObjects")
    public JAXBElement<ParamsGetCustomObjects> createParamsGetCustomObjects(ParamsGetCustomObjects value) {
        return new JAXBElement<ParamsGetCustomObjects>(_ParamsGetCustomObjects_QNAME, ParamsGetCustomObjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessRequestCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successRequestCampaign")
    public JAXBElement<SuccessRequestCampaign> createSuccessRequestCampaign(SuccessRequestCampaign value) {
        return new JAXBElement<SuccessRequestCampaign>(_SuccessRequestCampaign_QNAME, SuccessRequestCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsGetLeadActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsGetLeadActivity")
    public JAXBElement<ParamsGetLeadActivity> createParamsGetLeadActivity(ParamsGetLeadActivity value) {
        return new JAXBElement<ParamsGetLeadActivity>(_ParamsGetLeadActivity_QNAME, ParamsGetLeadActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsDeleteMObjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsDeleteMObjects")
    public JAXBElement<ParamsDeleteMObjects> createParamsDeleteMObjects(ParamsDeleteMObjects value) {
        return new JAXBElement<ParamsDeleteMObjects>(_ParamsDeleteMObjects_QNAME, ParamsDeleteMObjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessGetTags }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successGetTags")
    public JAXBElement<SuccessGetTags> createSuccessGetTags(SuccessGetTags value) {
        return new JAXBElement<SuccessGetTags>(_SuccessGetTags_QNAME, SuccessGetTags.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsDeleteCustomObjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsDeleteCustomObjects")
    public JAXBElement<ParamsDeleteCustomObjects> createParamsDeleteCustomObjects(ParamsDeleteCustomObjects value) {
        return new JAXBElement<ParamsDeleteCustomObjects>(_ParamsDeleteCustomObjects_QNAME, ParamsDeleteCustomObjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessListOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successListOperation")
    public JAXBElement<SuccessListOperation> createSuccessListOperation(SuccessListOperation value) {
        return new JAXBElement<SuccessListOperation>(_SuccessListOperation_QNAME, SuccessListOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsListMObjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsListMObjects")
    public JAXBElement<ParamsListMObjects> createParamsListMObjects(ParamsListMObjects value) {
        return new JAXBElement<ParamsListMObjects>(_ParamsListMObjects_QNAME, ParamsListMObjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsSyncMObjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsSyncMObjects")
    public JAXBElement<ParamsSyncMObjects> createParamsSyncMObjects(ParamsSyncMObjects value) {
        return new JAXBElement<ParamsSyncMObjects>(_ParamsSyncMObjects_QNAME, ParamsSyncMObjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessSyncCustomObjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successSyncCustomObjects")
    public JAXBElement<SuccessSyncCustomObjects> createSuccessSyncCustomObjects(SuccessSyncCustomObjects value) {
        return new JAXBElement<SuccessSyncCustomObjects>(_SuccessSyncCustomObjects_QNAME, SuccessSyncCustomObjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessGetImportToListStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successGetImportToListStatus")
    public JAXBElement<SuccessGetImportToListStatus> createSuccessGetImportToListStatus(SuccessGetImportToListStatus value) {
        return new JAXBElement<SuccessGetImportToListStatus>(_SuccessGetImportToListStatus_QNAME, SuccessGetImportToListStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsSyncCustomObjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsSyncCustomObjects")
    public JAXBElement<ParamsSyncCustomObjects> createParamsSyncCustomObjects(ParamsSyncCustomObjects value) {
        return new JAXBElement<ParamsSyncCustomObjects>(_ParamsSyncCustomObjects_QNAME, ParamsSyncCustomObjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationHeaderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "AuthenticationHeader")
    public JAXBElement<AuthenticationHeaderInfo> createAuthenticationHeader(AuthenticationHeaderInfo value) {
        return new JAXBElement<AuthenticationHeaderInfo>(_AuthenticationHeader_QNAME, AuthenticationHeaderInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsGetMObjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsGetMObjects")
    public JAXBElement<ParamsGetMObjects> createParamsGetMObjects(ParamsGetMObjects value) {
        return new JAXBElement<ParamsGetMObjects>(_ParamsGetMObjects_QNAME, ParamsGetMObjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsGetImportToListStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsGetImportToListStatus")
    public JAXBElement<ParamsGetImportToListStatus> createParamsGetImportToListStatus(ParamsGetImportToListStatus value) {
        return new JAXBElement<ParamsGetImportToListStatus>(_ParamsGetImportToListStatus_QNAME, ParamsGetImportToListStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessGetMultipleLeads }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successGetMultipleLeads")
    public JAXBElement<SuccessGetMultipleLeads> createSuccessGetMultipleLeads(SuccessGetMultipleLeads value) {
        return new JAXBElement<SuccessGetMultipleLeads>(_SuccessGetMultipleLeads_QNAME, SuccessGetMultipleLeads.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessSyncLead }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successSyncLead")
    public JAXBElement<SuccessSyncLead> createSuccessSyncLead(SuccessSyncLead value) {
        return new JAXBElement<SuccessSyncLead>(_SuccessSyncLead_QNAME, SuccessSyncLead.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsGetCampaignsForSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsGetCampaignsForSource")
    public JAXBElement<ParamsGetCampaignsForSource> createParamsGetCampaignsForSource(ParamsGetCampaignsForSource value) {
        return new JAXBElement<ParamsGetCampaignsForSource>(_ParamsGetCampaignsForSource_QNAME, ParamsGetCampaignsForSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessGetLeadChanges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successGetLeadChanges")
    public JAXBElement<SuccessGetLeadChanges> createSuccessGetLeadChanges(SuccessGetLeadChanges value) {
        return new JAXBElement<SuccessGetLeadChanges>(_SuccessGetLeadChanges_QNAME, SuccessGetLeadChanges.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessDescribeMObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successDescribeMObject")
    public JAXBElement<SuccessDescribeMObject> createSuccessDescribeMObject(SuccessDescribeMObject value) {
        return new JAXBElement<SuccessDescribeMObject>(_SuccessDescribeMObject_QNAME, SuccessDescribeMObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessGetChannels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "successGetChannels")
    public JAXBElement<SuccessGetChannels> createSuccessGetChannels(SuccessGetChannels value) {
        return new JAXBElement<SuccessGetChannels>(_SuccessGetChannels_QNAME, SuccessGetChannels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsSyncMultipleLeads }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.marketo.com/mktows/", name = "paramsSyncMultipleLeads")
    public JAXBElement<ParamsSyncMultipleLeads> createParamsSyncMultipleLeads(ParamsSyncMultipleLeads value) {
        return new JAXBElement<ParamsSyncMultipleLeads>(_ParamsSyncMultipleLeads_QNAME, ParamsSyncMultipleLeads.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customObjList", scope = ResultGetCustomObjects.class)
    public JAXBElement<ArrayOfCustomObj> createResultGetCustomObjectsCustomObjList(ArrayOfCustomObj value) {
        return new JAXBElement<ArrayOfCustomObj>(_ResultGetCustomObjectsCustomObjList_QNAME, ArrayOfCustomObj.class, ResultGetCustomObjects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "marketoCookie", scope = ParamsSyncLead.class)
    public JAXBElement<String> createParamsSyncLeadMarketoCookie(String value) {
        return new JAXBElement<String>(_ParamsSyncLeadMarketoCookie_QNAME, String.class, ParamsSyncLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "estimatedTime", scope = ResultGetImportToListStatus.class)
    public JAXBElement<Integer> createResultGetImportToListStatusEstimatedTime(Integer value) {
        return new JAXBElement<Integer>(_ResultGetImportToListStatusEstimatedTime_QNAME, Integer.class, ResultGetImportToListStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rowsFailed", scope = ResultGetImportToListStatus.class)
    public JAXBElement<Integer> createResultGetImportToListStatusRowsFailed(Integer value) {
        return new JAXBElement<Integer>(_ResultGetImportToListStatusRowsFailed_QNAME, Integer.class, ResultGetImportToListStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rowsImported", scope = ResultGetImportToListStatus.class)
    public JAXBElement<Integer> createResultGetImportToListStatusRowsImported(Integer value) {
        return new JAXBElement<Integer>(_ResultGetImportToListStatusRowsImported_QNAME, Integer.class, ResultGetImportToListStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "endedTime", scope = ResultGetImportToListStatus.class)
    public JAXBElement<XMLGregorianCalendar> createResultGetImportToListStatusEndedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResultGetImportToListStatusEndedTime_QNAME, XMLGregorianCalendar.class, ResultGetImportToListStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "importSummary", scope = ResultGetImportToListStatus.class)
    public JAXBElement<String> createResultGetImportToListStatusImportSummary(String value) {
        return new JAXBElement<String>(_ResultGetImportToListStatusImportSummary_QNAME, String.class, ResultGetImportToListStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rowsIgnored", scope = ResultGetImportToListStatus.class)
    public JAXBElement<Integer> createResultGetImportToListStatusRowsIgnored(Integer value) {
        return new JAXBElement<Integer>(_ResultGetImportToListStatusRowsIgnored_QNAME, Integer.class, ResultGetImportToListStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "estimatedRows", scope = ResultGetImportToListStatus.class)
    public JAXBElement<Integer> createResultGetImportToListStatusEstimatedRows(Integer value) {
        return new JAXBElement<Integer>(_ResultGetImportToListStatusEstimatedRows_QNAME, Integer.class, ResultGetImportToListStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startedTime", scope = ResultGetImportToListStatus.class)
    public JAXBElement<XMLGregorianCalendar> createResultGetImportToListStatusStartedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResultGetImportToListStatusStartedTime_QNAME, XMLGregorianCalendar.class, ResultGetImportToListStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "oldestCreatedAt", scope = StreamPosition.class)
    public JAXBElement<XMLGregorianCalendar> createStreamPositionOldestCreatedAt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StreamPositionOldestCreatedAt_QNAME, XMLGregorianCalendar.class, StreamPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "activityCreatedAt", scope = StreamPosition.class)
    public JAXBElement<XMLGregorianCalendar> createStreamPositionActivityCreatedAt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StreamPositionActivityCreatedAt_QNAME, XMLGregorianCalendar.class, StreamPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "latestCreatedAt", scope = StreamPosition.class)
    public JAXBElement<XMLGregorianCalendar> createStreamPositionLatestCreatedAt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StreamPositionLatestCreatedAt_QNAME, XMLGregorianCalendar.class, StreamPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "offset", scope = StreamPosition.class)
    public JAXBElement<String> createStreamPositionOffset(String value) {
        return new JAXBElement<String>(_StreamPositionOffset_QNAME, String.class, StreamPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfActivityRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "activityRecordList", scope = LeadActivityList.class)
    public JAXBElement<ArrayOfActivityRecord> createLeadActivityListActivityRecordList(ArrayOfActivityRecord value) {
        return new JAXBElement<ArrayOfActivityRecord>(_LeadActivityListActivityRecordList_QNAME, ArrayOfActivityRecord.class, LeadActivityList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "batchSize", scope = ParamsGetLeadActivity.class)
    public JAXBElement<Integer> createParamsGetLeadActivityBatchSize(Integer value) {
        return new JAXBElement<Integer>(_ParamsGetLeadActivityBatchSize_QNAME, Integer.class, ParamsGetLeadActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityTypeFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "activityFilter", scope = ParamsGetLeadActivity.class)
    public JAXBElement<ActivityTypeFilter> createParamsGetLeadActivityActivityFilter(ActivityTypeFilter value) {
        return new JAXBElement<ActivityTypeFilter>(_ParamsGetLeadActivityActivityFilter_QNAME, ActivityTypeFilter.class, ParamsGetLeadActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StreamPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startPosition", scope = ParamsGetLeadActivity.class)
    public JAXBElement<StreamPosition> createParamsGetLeadActivityStartPosition(StreamPosition value) {
        return new JAXBElement<StreamPosition>(_ParamsGetLeadActivityStartPosition_QNAME, StreamPosition.class, ParamsGetLeadActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLeadRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "leadRecordList", scope = ResultGetMultipleLeads.class)
    public JAXBElement<ArrayOfLeadRecord> createResultGetMultipleLeadsLeadRecordList(ArrayOfLeadRecord value) {
        return new JAXBElement<ArrayOfLeadRecord>(_ResultGetMultipleLeadsLeadRecordList_QNAME, ArrayOfLeadRecord.class, ResultGetMultipleLeads.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "streamPosition", scope = ParamsGetMultipleLeads.class)
    public JAXBElement<String> createParamsGetMultipleLeadsStreamPosition(String value) {
        return new JAXBElement<String>(_ParamsGetMultipleLeadsStreamPosition_QNAME, String.class, ParamsGetMultipleLeads.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "batchSize", scope = ParamsGetMultipleLeads.class)
    public JAXBElement<Integer> createParamsGetMultipleLeadsBatchSize(Integer value) {
        return new JAXBElement<Integer>(_ParamsGetLeadActivityBatchSize_QNAME, Integer.class, ParamsGetMultipleLeads.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "foreignSysId", scope = ActivityRecord.class)
    public JAXBElement<String> createActivityRecordForeignSysId(String value) {
        return new JAXBElement<String>(_ActivityRecordForeignSysId_QNAME, String.class, ActivityRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "activityAttributes", scope = ActivityRecord.class)
    public JAXBElement<ArrayOfAttribute> createActivityRecordActivityAttributes(ArrayOfAttribute value) {
        return new JAXBElement<ArrayOfAttribute>(_ActivityRecordActivityAttributes_QNAME, ArrayOfAttribute.class, ActivityRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "foreignSysOrgId", scope = ActivityRecord.class)
    public JAXBElement<String> createActivityRecordForeignSysOrgId(String value) {
        return new JAXBElement<String>(_ActivityRecordForeignSysOrgId_QNAME, String.class, ActivityRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "orgName", scope = ActivityRecord.class)
    public JAXBElement<String> createActivityRecordOrgName(String value) {
        return new JAXBElement<String>(_ActivityRecordOrgName_QNAME, String.class, ActivityRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "campaign", scope = ActivityRecord.class)
    public JAXBElement<String> createActivityRecordCampaign(String value) {
        return new JAXBElement<String>(_ActivityRecordCampaign_QNAME, String.class, ActivityRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personName", scope = ActivityRecord.class)
    public JAXBElement<String> createActivityRecordPersonName(String value) {
        return new JAXBElement<String>(_ActivityRecordPersonName_QNAME, String.class, ActivityRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "error", scope = MergeStatus.class)
    public JAXBElement<String> createMergeStatusError(String value) {
        return new JAXBElement<String>(_MergeStatusError_QNAME, String.class, MergeStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "losingLeadIdList", scope = MergeStatus.class)
    public JAXBElement<ArrayOfInteger> createMergeStatusLosingLeadIdList(ArrayOfInteger value) {
        return new JAXBElement<ArrayOfInteger>(_MergeStatusLosingLeadIdList_QNAME, ArrayOfInteger.class, MergeStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "winningLeadId", scope = MergeStatus.class)
    public JAXBElement<Integer> createMergeStatusWinningLeadId(Integer value) {
        return new JAXBElement<Integer>(_MergeStatusWinningLeadId_QNAME, Integer.class, MergeStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "campaignRecordList", scope = ResultGetCampaignsForSource.class)
    public JAXBElement<ArrayOfCampaignRecord> createResultGetCampaignsForSourceCampaignRecordList(ArrayOfCampaignRecord value) {
        return new JAXBElement<ArrayOfCampaignRecord>(_ResultGetCampaignsForSourceCampaignRecordList_QNAME, ArrayOfCampaignRecord.class, ResultGetCampaignsForSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLeadStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "statusList", scope = ResultListOperation.class)
    public JAXBElement<ArrayOfLeadStatus> createResultListOperationStatusList(ArrayOfLeadStatus value) {
        return new JAXBElement<ArrayOfLeadStatus>(_ResultListOperationStatusList_QNAME, ArrayOfLeadStatus.class, ResultListOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "latestUpdatedAt", scope = LastUpdateAtSelector.class)
    public JAXBElement<XMLGregorianCalendar> createLastUpdateAtSelectorLatestUpdatedAt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LastUpdateAtSelectorLatestUpdatedAt_QNAME, XMLGregorianCalendar.class, LastUpdateAtSelector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "staticListId", scope = StaticListSelector.class)
    public JAXBElement<Integer> createStaticListSelectorStaticListId(Integer value) {
        return new JAXBElement<Integer>(_StaticListSelectorStaticListId_QNAME, Integer.class, StaticListSelector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "staticListName", scope = StaticListSelector.class)
    public JAXBElement<String> createStaticListSelectorStaticListName(String value) {
        return new JAXBElement<String>(_StaticListSelectorStaticListName_QNAME, String.class, StaticListSelector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = ParamsGetCampaignsForSource.class)
    public JAXBElement<String> createParamsGetCampaignsForSourceName(String value) {
        return new JAXBElement<String>(_ParamsGetCampaignsForSourceName_QNAME, String.class, ParamsGetCampaignsForSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "exactName", scope = ParamsGetCampaignsForSource.class)
    public JAXBElement<Boolean> createParamsGetCampaignsForSourceExactName(Boolean value) {
        return new JAXBElement<Boolean>(_ParamsGetCampaignsForSourceExactName_QNAME, Boolean.class, ParamsGetCampaignsForSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "campaignRunAt", scope = ParamsScheduleCampaign.class)
    public JAXBElement<XMLGregorianCalendar> createParamsScheduleCampaignCampaignRunAt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ParamsScheduleCampaignCampaignRunAt_QNAME, XMLGregorianCalendar.class, ParamsScheduleCampaign.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttrib }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "programTokenList", scope = ParamsScheduleCampaign.class)
    public JAXBElement<ArrayOfAttrib> createParamsScheduleCampaignProgramTokenList(ArrayOfAttrib value) {
        return new JAXBElement<ArrayOfAttrib>(_ParamsScheduleCampaignProgramTokenList_QNAME, ArrayOfAttrib.class, ParamsScheduleCampaign.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "skipActivityLog", scope = ParamsListOperation.class)
    public JAXBElement<Boolean> createParamsListOperationSkipActivityLog(Boolean value) {
        return new JAXBElement<Boolean>(_ParamsListOperationSkipActivityLog_QNAME, Boolean.class, ParamsListOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "strict", scope = ParamsListOperation.class)
    public JAXBElement<Boolean> createParamsListOperationStrict(Boolean value) {
        return new JAXBElement<Boolean>(_ParamsListOperationStrict_QNAME, Boolean.class, ParamsListOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "campaignName", scope = ParamsRequestCampaign.class)
    public JAXBElement<String> createParamsRequestCampaignCampaignName(String value) {
        return new JAXBElement<String>(_ParamsRequestCampaignCampaignName_QNAME, String.class, ParamsRequestCampaign.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "campaignId", scope = ParamsRequestCampaign.class)
    public JAXBElement<Integer> createParamsRequestCampaignCampaignId(Integer value) {
        return new JAXBElement<Integer>(_ParamsRequestCampaignCampaignId_QNAME, Integer.class, ParamsRequestCampaign.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLeadKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "leadList", scope = ParamsRequestCampaign.class)
    public JAXBElement<ArrayOfLeadKey> createParamsRequestCampaignLeadList(ArrayOfLeadKey value) {
        return new JAXBElement<ArrayOfLeadKey>(_ParamsRequestCampaignLeadList_QNAME, ArrayOfLeadKey.class, ParamsRequestCampaign.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttrib }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "programTokenList", scope = ParamsRequestCampaign.class)
    public JAXBElement<ArrayOfAttrib> createParamsRequestCampaignProgramTokenList(ArrayOfAttrib value) {
        return new JAXBElement<ArrayOfAttrib>(_ParamsScheduleCampaignProgramTokenList_QNAME, ArrayOfAttrib.class, ParamsRequestCampaign.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "programName", scope = ParamsRequestCampaign.class)
    public JAXBElement<String> createParamsRequestCampaignProgramName(String value) {
        return new JAXBElement<String>(_ParamsRequestCampaignProgramName_QNAME, String.class, ParamsRequestCampaign.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "error", scope = SyncCustomObjStatus.class)
    public JAXBElement<String> createSyncCustomObjStatusError(String value) {
        return new JAXBElement<String>(_MergeStatusError_QNAME, String.class, SyncCustomObjStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customObjKeyList", scope = SyncCustomObjStatus.class)
    public JAXBElement<ArrayOfAttribute> createSyncCustomObjStatusCustomObjKeyList(ArrayOfAttribute value) {
        return new JAXBElement<ArrayOfAttribute>(_SyncCustomObjStatusCustomObjKeyList_QNAME, ArrayOfAttribute.class, SyncCustomObjStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customObjAttributeList", scope = CustomObj.class)
    public JAXBElement<ArrayOfAttribute> createCustomObjCustomObjAttributeList(ArrayOfAttribute value) {
        return new JAXBElement<ArrayOfAttribute>(_CustomObjCustomObjAttributeList_QNAME, ArrayOfAttribute.class, CustomObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customObjKeyList", scope = CustomObj.class)
    public JAXBElement<ArrayOfAttribute> createCustomObjCustomObjKeyList(ArrayOfAttribute value) {
        return new JAXBElement<ArrayOfAttribute>(_SyncCustomObjStatusCustomObjKeyList_QNAME, ArrayOfAttribute.class, CustomObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "attrType", scope = Attribute.class)
    public JAXBElement<String> createAttributeAttrType(String value) {
        return new JAXBElement<String>(_AttributeAttrType_QNAME, String.class, Attribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = VersionedItem.class)
    public JAXBElement<String> createVersionedItemDescription(String value) {
        return new JAXBElement<String>(_VersionedItemDescription_QNAME, String.class, VersionedItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type", scope = VersionedItem.class)
    public JAXBElement<String> createVersionedItemType(String value) {
        return new JAXBElement<String>(_VersionedItemType_QNAME, String.class, VersionedItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "error", scope = SyncStatus.class)
    public JAXBElement<String> createSyncStatusError(String value) {
        return new JAXBElement<String>(_MergeStatusError_QNAME, String.class, SyncStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncOperationEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "operation", scope = ParamsSyncCustomObjects.class)
    public JAXBElement<SyncOperationEnum> createParamsSyncCustomObjectsOperation(SyncOperationEnum value) {
        return new JAXBElement<SyncOperationEnum>(_ParamsSyncCustomObjectsOperation_QNAME, SyncOperationEnum.class, ParamsSyncCustomObjects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeadRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "leadRecord", scope = ResultSyncLead.class)
    public JAXBElement<LeadRecord> createResultSyncLeadLeadRecord(LeadRecord value) {
        return new JAXBElement<LeadRecord>(_ResultSyncLeadLeadRecord_QNAME, LeadRecord.class, ResultSyncLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForeignSysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ForeignSysType", scope = LeadRecord.class)
    public JAXBElement<ForeignSysType> createLeadRecordForeignSysType(ForeignSysType value) {
        return new JAXBElement<ForeignSysType>(_LeadRecordForeignSysType_QNAME, ForeignSysType.class, LeadRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "leadAttributeList", scope = LeadRecord.class)
    public JAXBElement<ArrayOfAttribute> createLeadRecordLeadAttributeList(ArrayOfAttribute value) {
        return new JAXBElement<ArrayOfAttribute>(_LeadRecordLeadAttributeList_QNAME, ArrayOfAttribute.class, LeadRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ForeignSysPersonId", scope = LeadRecord.class)
    public JAXBElement<String> createLeadRecordForeignSysPersonId(String value) {
        return new JAXBElement<String>(_LeadRecordForeignSysPersonId_QNAME, String.class, LeadRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Email", scope = LeadRecord.class)
    public JAXBElement<String> createLeadRecordEmail(String value) {
        return new JAXBElement<String>(_LeadRecordEmail_QNAME, String.class, LeadRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Id", scope = LeadRecord.class)
    public JAXBElement<Integer> createLeadRecordId(Integer value) {
        return new JAXBElement<Integer>(_LeadRecordId_QNAME, Integer.class, LeadRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "activityAttributes", scope = LeadChangeRecord.class)
    public JAXBElement<ArrayOfAttribute> createLeadChangeRecordActivityAttributes(ArrayOfAttribute value) {
        return new JAXBElement<ArrayOfAttribute>(_ActivityRecordActivityAttributes_QNAME, ArrayOfAttribute.class, LeadChangeRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mktgAssetName", scope = LeadChangeRecord.class)
    public JAXBElement<String> createLeadChangeRecordMktgAssetName(String value) {
        return new JAXBElement<String>(_LeadChangeRecordMktgAssetName_QNAME, String.class, LeadChangeRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "streamPosition", scope = ParamsGetCustomObjects.class)
    public JAXBElement<String> createParamsGetCustomObjectsStreamPosition(String value) {
        return new JAXBElement<String>(_ParamsGetMultipleLeadsStreamPosition_QNAME, String.class, ParamsGetCustomObjects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "batchSize", scope = ParamsGetCustomObjects.class)
    public JAXBElement<Integer> createParamsGetCustomObjectsBatchSize(Integer value) {
        return new JAXBElement<Integer>(_ParamsGetLeadActivityBatchSize_QNAME, Integer.class, ParamsGetCustomObjects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customObjKeyList", scope = ParamsGetCustomObjects.class)
    public JAXBElement<ArrayOfAttribute> createParamsGetCustomObjectsCustomObjKeyList(ArrayOfAttribute value) {
        return new JAXBElement<ArrayOfAttribute>(_SyncCustomObjStatusCustomObjKeyList_QNAME, ArrayOfAttribute.class, ParamsGetCustomObjects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "batchSize", scope = ParamsGetLeadChanges.class)
    public JAXBElement<Integer> createParamsGetLeadChangesBatchSize(Integer value) {
        return new JAXBElement<Integer>(_ParamsGetLeadActivityBatchSize_QNAME, Integer.class, ParamsGetLeadChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityTypeFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "activityFilter", scope = ParamsGetLeadChanges.class)
    public JAXBElement<ActivityTypeFilter> createParamsGetLeadChangesActivityFilter(ActivityTypeFilter value) {
        return new JAXBElement<ActivityTypeFilter>(_ParamsGetLeadActivityActivityFilter_QNAME, ActivityTypeFilter.class, ParamsGetLeadChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLeadChangeRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "leadChangeRecordList", scope = ResultGetLeadChanges.class)
    public JAXBElement<ArrayOfLeadChangeRecord> createResultGetLeadChangesLeadChangeRecordList(ArrayOfLeadChangeRecord value) {
        return new JAXBElement<ArrayOfLeadChangeRecord>(_ResultGetLeadChangesLeadChangeRecordList_QNAME, ArrayOfLeadChangeRecord.class, ResultGetLeadChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dedupEnabled", scope = ParamsSyncMultipleLeads.class)
    public JAXBElement<Boolean> createParamsSyncMultipleLeadsDedupEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_ParamsSyncMultipleLeadsDedupEnabled_QNAME, Boolean.class, ParamsSyncMultipleLeads.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLeadRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "leadRecordList", scope = ResultGetLead.class)
    public JAXBElement<ArrayOfLeadRecord> createResultGetLeadLeadRecordList(ArrayOfLeadRecord value) {
        return new JAXBElement<ArrayOfLeadRecord>(_ResultGetMultipleLeadsLeadRecordList_QNAME, ArrayOfLeadRecord.class, ResultGetLead.class, value);
    }

}
