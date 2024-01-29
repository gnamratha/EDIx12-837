package com.edi.Segments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Loop2300_Segment {
    @JsonProperty
    private CLM_ClaimInformation CLM_ClaimInformation;
    @JsonProperty
    private AllDTP DTP;
    @JsonProperty
    private AllCL1 CL1;
    @JsonProperty
    private AllCN1 CN1;
    @JsonProperty
    private AllREF REF;
    @JsonProperty
    private AllHI HI;
    @JsonProperty
    private Loop2310A Loop2310A;
    @JsonProperty
    private Loop2310B Loop2310B;
    @JsonProperty
    private Loop2310B Loop2310C;
    @JsonProperty
    private Loop2310B Loop2310E;
    @JsonProperty
    private Loop2310B Loop2310F;
    @JsonProperty
    private Loop2320 Loop2320;
    @JsonProperty
    private Loop2330B Loop2330B;
    class CLM_ClaimInformation {

        @JsonProperty
        private String CLM01;
        @JsonProperty
        private String CLM02;
        @JsonProperty
        private String CLM03;
        @JsonProperty
        private String CLM04;
        @JsonProperty
        private String CLM05_1;
        @JsonProperty
        private String CLM05_2;
        @JsonProperty
        private String CLM05_03;
        @JsonProperty
        private String CLM09;
        @JsonProperty
        private String CLM10;
        private String CLM11;
        @JsonProperty
        private String CLM12;

        // Getter and Setter methods

    }
    class AllDTP {

        @JsonProperty("DTP_DischargeHour")
        private DTPDischargeHour dtpDischargeHour;

        @JsonProperty("DTP_StatementDates")
        private DTPStatementDates dtpStatementDates;

        // Getter and Setter methods


        class DTPDischargeHour {

            @JsonProperty("DTP01")
            private String dtp01;

            @JsonProperty("DTP02")
            private String dtp02;

            @JsonProperty("DTP03")
            private String dtp03;

            // Getter and Setter methods
        }

        class DTPStatementDates {

            @JsonProperty("DTP01")
            private String dtp01;

            @JsonProperty("DTP02")
            private String dtp02;

            @JsonProperty("DTP03")
            private String dtp03;

            // Getter and Setter methods
        }
    }

    class AllCL1 {

        @JsonProperty("CL1_InstituionalClaimCode")
        private CL1InstituionalClaimCode cl1InstituionalClaimCode;

        // Getter and Setter methods


        class CL1InstituionalClaimCode {

            @JsonProperty("CL101")
            private String cl101;

            @JsonProperty("CL102")
            private String cl102;

            // Getter and Setter methods
        }
    }

    class AllCN1 {

        @JsonProperty("CN1_ContractInformation")
        private CN1ContractInformation cn1ContractInformation;

        // Getter and Setter methods


        class CN1ContractInformation {

            @JsonProperty("CN101")
            private String cn101;

            @JsonProperty("CN102")
            private String cn102;

            // Getter and Setter methods
        }
    }

    class AllREF {

        @JsonProperty("REF_PayerClaimCOntrolNumber")
        private REFPayerClaimControlNumber refPayerClaimControlNumber;

        @JsonProperty("REF_ClaimIdentifierForTransmissionIntermediaries")
        private REFClaimIdentifierForTransmissionIntermediaries refClaimIdentifierForTransmissionIntermediaries;

        // Getter and Setter methods

        class REFPayerClaimControlNumber {

            @JsonProperty("REF01")
            private String ref01;

            @JsonProperty("REF02")
            private String ref02;

            // Getter and Setter methods
        }

        class REFClaimIdentifierForTransmissionIntermediaries {

            @JsonProperty("REF01")
            private String ref01;

            @JsonProperty("REF02")
            private String ref02;

            // Getter and Setter methods
        }
    }
    class AllHI {

        @JsonProperty("HI_PrincipalDiagnosisCode")
        private HIPrincipalDiagnosisCode hiPrincipalDiagnosisCode;

        @JsonProperty("HI_AdmittingDiagnosis")
        private HIAdmittingDiagnosis hiAdmittingDiagnosis;

        @JsonProperty("HI_PrincipalProcedureInformation")
        private HIPrincipalProcedureInformation hiPrincipalProcedureInformation;

        // Getter and Setter methods

        class HIPrincipalDiagnosisCode {

            @JsonProperty("HI01-1")
            private String hi011;

            @JsonProperty("HI01-2")
            private String hi012;

            // Getter and Setter methods
        }

        class HIAdmittingDiagnosis {

            @JsonProperty("HI02-1")
            private String hi021;

            @JsonProperty("HI02-2")
            private String hi022;

            // Getter and Setter methods
        }

        class HIPrincipalProcedureInformation {

            @JsonProperty("HI02-1")
            private String hi021;

            @JsonProperty("HI02-2")
            private String hi022;

            @JsonProperty("HI01-3")
            private String hi013;

            @JsonProperty("HI01-4")
            private String hi014;

            // Getter and Setter methods
        }
    }
    public class Loop2310A {

        @JsonProperty("NM1_AttendingProviderName/OrderingProvider")
        private NM1AttendingProviderNameOrderingProvider nm1AttendingProviderNameOrderingProvider;

        @JsonProperty("N3_AttendingProviderAddress")
        private N3AttendingProviderAddress n3AttendingProviderAddress;

        @JsonProperty("N4_AttendingProviderCity_State_ZIPCode")
        private N4AttendingProviderCityStateZIPCode n4AttendingProviderCityStateZIPCode;

        @JsonProperty("PRV_AttendingProviderSpecialtyInformation")
        private PRVAttendingProviderSpecialtyInformation prvAttendingProviderSpecialtyInformation;

        @JsonProperty("REF_AttendingProviderSecondaryIdentification")
        private REFAttendingProviderSecondaryIdentification refAttendingProviderSecondaryIdentification;

        // Getter and Setter methods


        class NM1AttendingProviderNameOrderingProvider {

            @JsonProperty("NM101")
            private String nm101;

            @JsonProperty("NM108")
            private String nm108;

            @JsonProperty("NM109")
            private String nm109;

            // Getter and Setter methods
        }

        class N3AttendingProviderAddress {

            @JsonProperty("N301")
            private String n301;

            // Getter and Setter methods
        }

        class N4AttendingProviderCityStateZIPCode {

            @JsonProperty("N401")
            private String n401;

            @JsonProperty("N402")
            private String n402;

            @JsonProperty("N403")
            private String n403;

            // Getter and Setter methods
        }

        class PRVAttendingProviderSpecialtyInformation {

            @JsonProperty("PRV01")
            private String prv01;

            @JsonProperty("PRV02")
            private String prv02;

            @JsonProperty("PRV03")
            private String prv03;

            // Getter and Setter methods
        }

        class REFAttendingProviderSecondaryIdentification {

            @JsonProperty("REF01")
            private String ref01;

            @JsonProperty("REF02")
            private String ref02;

            // Getter and Setter methods
        }
    }

    class Loop2310B {

        @JsonProperty("NM1_OperatingPhysicianName")
        private NM1OperatingPhysicianName nm1OperatingPhysicianName;

        // Getter and Setter methods


        class NM1OperatingPhysicianName {

            @JsonProperty("NM101")
            private String nm101;

            @JsonProperty("NM108")
            private String nm108;

            @JsonProperty("NM109")
            private String nm109;

            // Getter and Setter methods
        }
    }

    class Loop2310C {

        @JsonProperty("NM1_OtherOperatingPhysicianName")
        private NM1OtherOperatingPhysicianName nm1OtherOperatingPhysicianName;

        // Getter and Setter methods


        class NM1OtherOperatingPhysicianName {

            @JsonProperty("NM101")
            private String nm101;

            @JsonProperty("NM108")
            private String nm108;

            @JsonProperty("NM109")
            private String nm109;

            // Getter and Setter methods
        }
    }

    class Loop2310E {

        @JsonProperty("NM1_ServiceFacilityProviderInformation")
        private NM1ServiceFacilityProviderInformation nm1ServiceFacilityProviderInformation;

        // Getter and Setter methods


        class NM1ServiceFacilityProviderInformation {

            @JsonProperty("NM101")
            private String nm101;

            @JsonProperty("NM108")
            private String nm108;

            @JsonProperty("NM109")
            private String nm109;

            @JsonProperty("N3_Service Facility Location")
            private N3ServiceFacilityLocation n3ServiceFacilityLocation;

            @JsonProperty("N4_Service Facility Location_City_State_ZIP Code")
            private N4ServiceFacilityLocationCityStateZIPCode n4ServiceFacilityLocationCityStateZIPCode;

            @JsonProperty("REF_OtherOperatingPhysicianSecondaryIdentification")
            private REFOtherOperatingPhysicianSecondaryIdentification refOtherOperatingPhysicianSecondaryIdentification;

            // Getter and Setter methods
        }

        class N3ServiceFacilityLocation {

            @JsonProperty("N301")
            private String n301;

            // Getter and Setter methods
        }

        class N4ServiceFacilityLocationCityStateZIPCode {

            @JsonProperty("N401")
            private String n401;

            @JsonProperty("N402")
            private String n402;

            @JsonProperty("N403")
            private String n403;

            // Getter and Setter methods
        }

        class REFOtherOperatingPhysicianSecondaryIdentification {

            @JsonProperty("REF01")
            private String ref01;

            @JsonProperty("REF02")
            private String ref02;

            // Getter and Setter methods
        }
    }

    class Loop2310F {

        @JsonProperty("NM1_ReferringProviderName")
        private NM1ReferringProviderName nm1ReferringProviderName;

        @JsonProperty("N3_ReferringProviderAddress")
        private N3ReferringProviderAddress n3ReferringProviderAddress;

        @JsonProperty("N4_ReferringProviderCity_State_ZIPCode")
        private N4ReferringProviderCityStateZIPCode n4ReferringProviderCityStateZIPCode;

        @JsonProperty("REF_ReferringProviderSecondaryIdentification")
        private REFReferringProviderSecondaryIdentification refReferringProviderSecondaryIdentification;

        // Getter and Setter methods


        class NM1ReferringProviderName {

            @JsonProperty("NM101")
            private String nm101;

            @JsonProperty("NM108")
            private String nm108;

            @JsonProperty("NM109")
            private String nm109;

            // Getter and Setter methods
        }

        class N3ReferringProviderAddress {

            @JsonProperty("N301")
            private String n301;

            // Getter and Setter methods
        }

        class N4ReferringProviderCityStateZIPCode {

            @JsonProperty("N401")
            private String n401;

            @JsonProperty("N402")
            private String n402;

            @JsonProperty("N403")
            private String n403;

            // Getter and Setter methods
        }

        class REFReferringProviderSecondaryIdentification {

            @JsonProperty("REF01")
            private String ref01;

            @JsonProperty("REF02")
            private String ref02;

            // Getter and Setter methods
        }
    }
    class Loop2320 {

        @JsonProperty("SBR_OtherSubscriberInformation")
        private SBROtherSubscriberInformation sbrOtherSubscriberInformation;

        @JsonProperty("CAS_ClaimLevelAdjustments")
        private CASClaimLevelAdjustments casClaimLevelAdjustments;

        @JsonProperty("AMT_COB PayerPaidAMount")
        private AMTCOBPayerPaidAMount amtCOBPayerPaidAMount;

        // Getter and Setter methods


        class SBROtherSubscriberInformation {

            @JsonProperty("SBR01")
            private String sbr01;

            @JsonProperty("SBR02")
            private String sbr02;

            @JsonProperty("SBR09")
            private String sbr09;

            // Getter and Setter methods
        }

        class CASClaimLevelAdjustments {

            @JsonProperty("CAS02")
            private String cas02;

            // Getter and Setter methods
        }

        class AMTCOBPayerPaidAMount {

            @JsonProperty("AMT01")
            private String amt01;

            @JsonProperty("AMT02")
            private String amt02;

            // Getter and Setter methods
        }
    }

        class Loop2330A {

            @JsonProperty("NM1_OtherSubscriberName")
            private NM1OtherSubscriberName nm1OtherSubscriberName;

            // Getter and Setter methods


            class NM1OtherSubscriberName {

                @JsonProperty("NM101")
                private String nm101;

                @JsonProperty("NM109")
                private String nm109;

                // Getter and Setter methods
            }
        }

        class Loop2330B {

            @JsonProperty("NM1_OtherPayerName")
            private NM1OtherPayerName nm1OtherPayerName;

            @JsonProperty("AllDTP")
            private AllDTP allDTP;

            @JsonProperty("REF_OtherPayerClaimControlNumber")
            private REFOtherPayerClaimControlNumber refOtherPayerClaimControlNumber;

            // Getter and Setter methods


            class NM1OtherPayerName {

                @JsonProperty("NM101")
                private String nm101;

                @JsonProperty("NM109")
                private String nm109;

                // Getter and Setter methods
            }

            class AllDTP {

                @JsonProperty("DTP_RemittanceDate")
                private DTPRemittanceDate dtpRemittanceDate;

                // Getter and Setter methods
            }

            class DTPRemittanceDate {

                @JsonProperty("DTP01")
                private String dtp01;

                @JsonProperty("DTP02")
                private String dtp02;

                @JsonProperty("DTP03")
                private String dtp03;

                // Getter and Setter methods
            }

            class REFOtherPayerClaimControlNumber {

                @JsonProperty("REF01")
                private String ref01;

                @JsonProperty("REF02")
                private String ref02;

                // Getter and Setter methods
            }

        }
    }
