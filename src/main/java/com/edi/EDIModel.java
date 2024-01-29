package com.edi;

import com.edi.Segments.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EDIModel {
        @JsonProperty("SegmentDelimiter")
        private String segmentDelimiter;
        @JsonProperty("DataElementDelimiter")
        private String dataElementDelimiter;
        @JsonProperty("ISA")
        private ISA_Segment isa;
        @JsonProperty("GS")
        private GS_Segment gs;
        @JsonProperty("ST")
        private ST_Segment st;
        @JsonProperty("BHT")
        private BHT_Segment bht;
        @JsonProperty("Loop1000A")
        private Loop1000A_Segment loop1000A;
        @JsonProperty("Loop1000B")
        private Loop1000B_Segment loop1000B;
        @JsonProperty("Loop2000A")
        private Loop2000A_Segment loop2000A;
        @JsonProperty("Loop2000B")
        private Loop2000B_Segment loop2000B;
//        @JsonProperty("Loop2000C")
//        private Loop2000C_Segment loop2000C;
        @JsonProperty("Loop2300")
        private Loop2300_Segment loop2300;
        @JsonProperty("Loop2400")
        private Loop2400_Segment loop2400;
        @JsonProperty("SE")
        private SE_Segment se;
        @JsonProperty("GE")
        private GE_Segment ge;
        @JsonProperty("IEA")
        private IEA_Segment iea;

    }

