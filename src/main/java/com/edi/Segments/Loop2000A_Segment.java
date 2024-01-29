package com.edi.Segments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Loop2000A_Segment {
    @JsonProperty("HL_BillingProviderHierarchicalLevel")
    private HLBillingProviderHierarchicalLevel hlBillingProviderHierarchicalLevel;

    @JsonProperty("PRV_BillingProviderSpecialtyInformation")
    private PRVBillingProviderSpecialtyInformation prvBillingProviderSpecialtyInformation;

    @JsonProperty("Loop2010AA")
    private List<Loop2010AA> loop2010AAList;

    public HLBillingProviderHierarchicalLevel getHlBillingProviderHierarchicalLevel() {
        return hlBillingProviderHierarchicalLevel;
    }

    public void setHlBillingProviderHierarchicalLevel(HLBillingProviderHierarchicalLevel hlBillingProviderHierarchicalLevel) {
        this.hlBillingProviderHierarchicalLevel = hlBillingProviderHierarchicalLevel;
    }

    public PRVBillingProviderSpecialtyInformation getPrvBillingProviderSpecialtyInformation() {
        return prvBillingProviderSpecialtyInformation;
    }

    public void setPrvBillingProviderSpecialtyInformation(PRVBillingProviderSpecialtyInformation prvBillingProviderSpecialtyInformation) {
        this.prvBillingProviderSpecialtyInformation = prvBillingProviderSpecialtyInformation;
    }

    public List<Loop2010AA> getLoop2010AAList() {
        return loop2010AAList;
    }

    public void setLoop2010AAList(List<Loop2010AA> loop2010AAList) {
        this.loop2010AAList = loop2010AAList;
    }


@JsonInclude(JsonInclude.Include.NON_NULL)
class HLBillingProviderHierarchicalLevel {
    @JsonProperty("HL01")
    private String hl01;

    @JsonProperty("HL02")
    private String hl02;

    @JsonProperty("HL03")
    private String hl03;
}

@JsonInclude(JsonInclude.Include.NON_NULL)
class PRVBillingProviderSpecialtyInformation {
    @JsonProperty("PRV01")
    private String prv01;

    @JsonProperty("PRV02")
    private String prv02;

    @JsonProperty("PRV03")
    private String prv03;

}

@JsonInclude(JsonInclude.Include.NON_NULL)
class Loop2010AA {
    @JsonProperty("NM1_BillingProviderName")
    private NM1BillingProviderName nm1BillingProviderName;

    @JsonProperty("N3_BillingProviderAddress")
    private N3BillingProviderAddress n3BillingProviderAddress;

    @JsonProperty("N4_BillingProviderCity_State_ZIPCode")
    private N4BillingProviderCityStateZIPCode n4BillingProviderCityStateZIPCode;

    @JsonProperty("REF_BillingProviderTaxIdentification")
    private REFBillingProviderTaxIdentification refBillingProviderTaxIdentification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    class NM1BillingProviderName {
        @JsonProperty
        private String nm101;
        @JsonProperty
        private String nm102;
        @JsonProperty
        private String nm103;
        @JsonProperty
        private String nm104;
        @JsonProperty
        private String nm105;
        @JsonProperty
        private String nm106;
        @JsonProperty
        private String nm107;
        @JsonProperty
        private String nm108;
        @JsonProperty
        private String nm109;

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    class N3BillingProviderAddress {
        @JsonProperty("N301")
        private String n301;

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    class N4BillingProviderCityStateZIPCode {
        @JsonProperty("N401")
        private String n401;

        @JsonProperty("N402")
        private String n402;

        @JsonProperty("N403")
        private String n403;

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    class REFBillingProviderTaxIdentification {
        @JsonProperty("REF01")
        private String ref01;

        @JsonProperty("REF02")
        private String ref02;
    }
}
}

