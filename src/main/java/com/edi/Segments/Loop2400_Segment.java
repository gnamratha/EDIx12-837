package com.edi.Segments;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
public class Loop2400_Segment {
    private List<ServiceLine> ServiceLine;

    // Getter and Setter

    public class ServiceLine {
        private LX_ServiceLineNumber LX;
        private SV2_InstitutionalService SV2;
        private Loop2430 Loop2430;

        // Getter and Setter


        public class LX_ServiceLineNumber {
            private String LX01;
        }
        // Getter and Setter

        public class SV2_InstitutionalService {
            private CompositeMedicalProcedureIdentifier_01 CompositeMedicalProcedureIdentifier_01;
            private String SV203;
            private String SV204;
            private String SV205;

            // Getter and Setter


            public class CompositeMedicalProcedureIdentifier_01 {

                private String SV202_1;
                private String SV202_2;


                // Getter and Setter
            }
        }

        public class Loop2430 {
            private SVD_ServiceLinePaidAmount SVD_ServiceLinePaidAmount;
            private RemittanceDate RemittanceDate;

            // Getter and Setter


            public class SVD_ServiceLinePaidAmount {
                private String SVD01;
                private String SVD02;

                private CompositeMedicalProcedureIdentifier_03 CompositeMedicalProcedureIdentifier_03;

                public class CompositeMedicalProcedureIdentifier_03 {

                    private String SVD03_1;
                    private String SVD02_2;


                    // Getter and Setter
                }
                // Getter and Setter
            }


            public class RemittanceDate {
                private DTP_Date_ServiceDate DTP_Date_ServiceDate;

                // Getter and Setter

                public class DTP_Date_ServiceDate {
                    private String DTP01;
                    private String DTP02;
                    private String DTP03;
                }
            }
        }
    }
}

