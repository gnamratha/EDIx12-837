package com.edi.Segments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Loop2000B_Segment {
    @JsonProperty
    private HL_SubscriberHierarchicalLevel HL_SubscriberHierarchicalLevel;
    @JsonProperty
    private SBR_SubscriberInformation SBR_SubscriberInformation;
    @JsonProperty
    private Loop2010BA Loop2010BA;
    @JsonProperty
    private Loop2010BB Loop2010BB;

    public HL_SubscriberHierarchicalLevel getHL_SubscriberHierarchicalLevel() {
        return HL_SubscriberHierarchicalLevel;
    }

    public void setHL_SubscriberHierarchicalLevel(HL_SubscriberHierarchicalLevel HL_SubscriberHierarchicalLevel) {
        this.HL_SubscriberHierarchicalLevel = HL_SubscriberHierarchicalLevel;
    }

    public SBR_SubscriberInformation getSBR_SubscriberInformation() {
        return SBR_SubscriberInformation;
    }

    public void setSBR_SubscriberInformation(SBR_SubscriberInformation SBR_SubscriberInformation) {
        this.SBR_SubscriberInformation = SBR_SubscriberInformation;
    }

    public Loop2010BA getLoop2010BA() {
        return Loop2010BA;
    }

    public void setLoop2010BA(Loop2010BA Loop2010BA) {
        this.Loop2010BA = Loop2010BA;
    }

    public Loop2010BB getLoop2010BB() {
        return Loop2010BB;
    }

    public void setLoop2010BB(Loop2010BB Loop2010BB) {
        this.Loop2010BB = Loop2010BB;
    }


    public class HL_SubscriberHierarchicalLevel {
        @JsonProperty
        private String HL01;
        @JsonProperty
        private String HL02;
        @JsonProperty
        private String HL03;
        @JsonProperty
        private String HL04;

    }

    public class SBR_SubscriberInformation {
        @JsonProperty
        private String SBR01;
        @JsonProperty
        private String SBR02;
        @JsonProperty
        private String SBR03;
        @JsonProperty
        private String SBR04;
        @JsonProperty
        private String SBR05;
        @JsonProperty
        private String SBR06;
        @JsonProperty
        private String SBR07;
        @JsonProperty
        private String SBR08;
        @JsonProperty
        private String SBR09;
    }

    public class Loop2010BA {
        @JsonProperty
        private NM1_SubscriberName NM1_SubscriberName;
        @JsonProperty
        private DMG_SubscriberDemographicInformation DMG_SubscriberDemographicInformation;

        public Loop2000B_Segment.Loop2010BA.NM1_SubscriberName getNM1_SubscriberName() {
            return NM1_SubscriberName;
        }

        public void setNM1_SubscriberName(Loop2000B_Segment.Loop2010BA.NM1_SubscriberName NM1_SubscriberName) {
            this.NM1_SubscriberName = NM1_SubscriberName;
        }

        public Loop2000B_Segment.Loop2010BA.DMG_SubscriberDemographicInformation getDMG_SubscriberDemographicInformation() {
            return DMG_SubscriberDemographicInformation;
        }

        public void setDMG_SubscriberDemographicInformation(Loop2000B_Segment.Loop2010BA.DMG_SubscriberDemographicInformation DMG_SubscriberDemographicInformation) {
            this.DMG_SubscriberDemographicInformation = DMG_SubscriberDemographicInformation;
        }

        public class NM1_SubscriberName {
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

        public class DMG_SubscriberDemographicInformation {
            @JsonProperty
            private String DMG01;
            @JsonProperty
            private String DMG02;
            @JsonProperty
            private String DMG03;
        }
    }

    public class Loop2010BB {
        @JsonProperty
        private NM1_PayerName NM1_PayerName;
        @JsonProperty
        private N4_PayerName N4_PayerName;
        @JsonProperty
        private REF_BillingProviderSecondaryIdentification REF_BillingProviderSecondaryIdentification;

        public Loop2000B_Segment.Loop2010BB.NM1_PayerName getNM1_PayerName() {
            return NM1_PayerName;
        }

        public void setNM1_PayerName(Loop2000B_Segment.Loop2010BB.NM1_PayerName NM1_PayerName) {
            this.NM1_PayerName = NM1_PayerName;
        }

        public Loop2000B_Segment.Loop2010BB.N4_PayerName getN4_PayerName() {
            return N4_PayerName;
        }

        public void setN4_PayerName(Loop2000B_Segment.Loop2010BB.N4_PayerName n4_PayerName) {
            N4_PayerName = n4_PayerName;
        }

        public Loop2000B_Segment.Loop2010BB.REF_BillingProviderSecondaryIdentification getREF_BillingProviderSecondaryIdentification() {
            return REF_BillingProviderSecondaryIdentification;
        }

        public void setREF_BillingProviderSecondaryIdentification(Loop2000B_Segment.Loop2010BB.REF_BillingProviderSecondaryIdentification REF_BillingProviderSecondaryIdentification) {
            this.REF_BillingProviderSecondaryIdentification = REF_BillingProviderSecondaryIdentification;
        }

        public class NM1_PayerName {
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

        public class N4_PayerName {
            @JsonProperty
            private String N401;
            @JsonProperty
            private String N402;
            @JsonProperty
            private String N403;

        }

        public class REF_BillingProviderSecondaryIdentification {
            @JsonProperty
            private String REF01;
            @JsonProperty
            private String REF02;

        }
    }
}
