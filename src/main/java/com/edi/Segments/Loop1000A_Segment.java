package com.edi.Segments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Loop1000A_Segment {
    @JsonProperty
    private NM1SubmitterName nm1SubmitterName;
    @JsonProperty
    private PER perList;

    public NM1SubmitterName getNm1SubmitterName() {
        return nm1SubmitterName;
    }

    public void setNm1SubmitterName(NM1SubmitterName nm1SubmitterName) {
        this.nm1SubmitterName = nm1SubmitterName;
    }

    public PER getPerList() {
        return perList;
    }

    public void setPerList(PER perList) {
        this.perList = perList;
    }

    public class NM1SubmitterName {
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
        @JsonProperty
        private String nm110;
    }
    public class PER {
        @JsonProperty
        private String per01;
        @JsonProperty
        private String per02;
        @JsonProperty
        private String per03;
        @JsonProperty
        private String per04;
    }
}

