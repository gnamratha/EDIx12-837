package com.edi.Segments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Loop1000B_Segment {
    @JsonProperty
    private NM1ReceiverName nm1ReceiverName;

    public NM1ReceiverName getNm1ReceiverName() {
        return nm1ReceiverName;
    }

    public void setNm1ReceiverName(NM1ReceiverName nm1ReceiverName) {
        this.nm1ReceiverName = nm1ReceiverName;
    }

    public class NM1ReceiverName {
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
}
