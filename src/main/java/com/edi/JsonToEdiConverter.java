package com.edi;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


public class JsonToEdiConverter {
    public static void main(String[] args) {
        String jsonString = "{"
                +  "\"SegmentDelimiter\": \"~\","
                +  "\"DataElementDelimiter\": \"*\","
                + "\"ISA\": {"
                + "    \"ISA01\": \"00\","
                + "    \"ISA02\": \"          \","
                + "    \"ISA03\": \"00\","
                + "    \"ISA04\": \"          \","
                + "    \"ISA05\": \"ZZ\","
                + "    \"ISA06\": \"SENDERID4567891\","
                + "    \"ISA07\": \"ZZ\","
                + "    \"ISA08\": \"77034\","
                + "    \"ISA09\": \"210102\","
                + "    \"ISA10\": \"1200\","
                + "    \"ISA11\": \"^\","
                + "    \"ISA12\": \"00501\","
                + "    \"ISA13\": \"000000001\","
                + "    \"ISA14\": \"0\","
                + "    \"ISA15\": \"T\","
                + "    \"ISA16\": \":\""
                + "},"
                 //GS Segment
                + "\"GS\": {"
                + "    \"GS01\": \"HC\","
                + "    \"GS02\": \"SENDERID4567891\","
                + "    \"GS03\": \"77034\","
                + "    \"GS04\": \"20210102\","
                + "    \"GS05\": \"1200\","
                + "    \"GS06\": \"1\","
                + "    \"GS07\": \"X\","
                + "    \"GS08\": \"005010X223A2\""
                + "},"
                // ST Segment
                + "\"ST\": {"
                + "    \"ST01\": \"837\","
                + "    \"ST02\": \"000000001\","
                + "    \"ST03\": \"005010X223A2\""
                + "},"
                // BHT Segment
                + "\"BHT\": {"
                + "    \"BHT01\": \"0019\","
                + "    \"BHT02\": \"00\","
                + "    \"BHT03\": \"2223254003792\","
                + "    \"BHT04\": \"20230118\","
                + "    \"BHT05\": \"1200\","
                + "    \"BHT06\": \"CH\""
                + "},"
                 //Loop 1000A
                + "\"Loop1000A\": {"
                + "    \"NM1\": {"
                + "        \"NM101\": \"41\","
                + "        \"NM102\": \"2\","
                + "        \"NM103\": \"PREMIUM BILLING SERVICES\","
                + "        \"NM104\": \"\","
                + "        \"NM105\": \"\","
                + "        \"NM106\": \"\","
                + "        \"NM107\": \"\","
                + "        \"NM108\": \"\","
                + "        \"NM109\": \"XX\""
                + "    },"
                + "    \"PER\": {"
                + "        \"PER01\": \"IC\","
                + "        \"PER02\": \"TOM CRUISE\","
                + "        \"PER03\": \"TE\","
                + "        \"PER04\": \"3055552222\""
                + "    }"
                + "},"
                // Loop 1000B
                + "\"Loop1000B\": {"
                + "    \"NM1\": {"
                + "        \"NM101\": \"40\","
                + "        \"NM102\": \"2\","
                + "        \"NM103\": \"\","
                + "        \"NM104\": \"GEORGIA FAMILIES\","
                + "        \"NM105\": \"\","
                + "        \"NM106\": \"\","
                + "        \"NM107\": \"\","
                + "        \"NM108\": \"46\","
                + "        \"NM109\": \"77034\""
                + "    }"
                + "},"
                // Loop 2000A
                + "\"Loop2000A\": {"
                + "\"HL\": {"
                + "\"HL01\": \"1\","
                + "\"HL02\": \"20\","
                + "\"HL03\": \"1\""
                + "},"
                + "\"PRV\": {"
                + "\"PRV01\": \"BI\","
                + "\"PRV02\": \"PXC\","
                + "\"PRV03\": \"453088947A\""
                + "}"
                + "},"
                // Loop 2010AA
                + "\"Loop2010AA\": {"
                + "\"NM1\": {"
                + "\"NM101\": \"85\","
                + "\"NM102\": \"2\","
                + "\"NM103\": \"LGREEN20\","
                + "\"NM108\": \"XX\","
                + "\"NM109\": \"9876543210\""
                + "},"
                + "\"N3\": {"
                + "\"N301\": \"234 SEAWAY ST\""
                + "},"
                + "\"N4\": {"
                + "\"N401\": \"MIAMI\","
                + "\"N402\": \"FL\","
                + "\"N403\": \"33111xxxx\""
                + "},"
                + "\"REF\": {"
                + "\"REF01\": \"EI\","
                + "\"REF02\": \"587654321\""
                + "}"
                + "},"
                // Loop 2000B
                + "\"Loop2000B\": {"
                + "\"HL\": {"
                + "\"HL01\": \"2\","
                + "\"HL02\": \"1\","
                + "\"HL03\": \"22\","
                + "\"HL04\": \"1\""
                + "},"
                + "\"SBR\": {"
                + "\"SBR01\": \"P\","
                + "\"SBR02\": \"\","
                + "\"SBR03\": \"2222-SJ\","
                + "\"SBR04\": \"\","
                + "\"SBR05\": \"\","
                + "\"SBR06\": \"\","
                + "\"SBR07\": \"\","
                + "\"SBR08\": \"\","
                + "\"SBR09\": \"MC\""
                + "}"
                + "},"
                // Loop 2010BA
                + "\"Loop2010BA\": {"
                + "\"NM1\": {"
                + "\"NM101\": \"IL\","
                + "\"NM102\": \"1\","
                + "\"NM103\": \"BRYANT\","
                + "\"NM104\": \"AHMED\","
                + "\"NM105\": \"\","
                + "\"NM106\": \"\","
                + "\"NM107\": \"\","
                + "\"NM108\": \"MI\","
                + "\"NM109\": \"222114962578\""
                + "},"
                + "\"DMG\": {"
                + "\"DMG01\": \"D8\","
                + "\"DMG02\": \"19740112\","
                + "\"DMG03\": \"M\""
                + "}"
                + "},"
                // Loop 2010BB
                + "\"Loop2010BB\": {"
                + "\"NM1\": {"
                + "\"NM101\": \"PR\","
                + "\"NM102\": \"2\","
                + "\"NM103\": \"GEORGIA FAMILIES\","
                + "\"NM104\": \"\","
                + "\"NM105\": \"\","
                + "\"NM106\": \"\","
                + "\"NM107\": \"\","
                + "\"NM108\": \"PI\","
                + "\"NM109\": \"77034\""
                + "},"
                + "\"N4\": {"
                + "\"N401\": \"TUCKER\","
                + "\"N402\": \"GA\","
                + "\"N403\": \"300855201\""
                + "},"
                + "\"REF\": {"
                + "\"REF01\": \"G2\","
                + "\"REF02\": \"KA6663\""
                + "}"
                + "},"
                // Loop 2300
                + "\"Loop2300\": {"
                + "\"CLM\": {"
                + "\"CLM01\": \"2223254003792\","
                + "\"CLM02\": \"292.32\","
                + "\"CLM05-1\": \"11\","
                + "\"CLM05-2\": \"A\","
                + "\"CLM05-03\": \"1\","
                + "\"CLM09\": \"Y\","
                + "\"CLM10\": \"A\","
                + "\"CLM11\": \"Y\","
                + "\"CLM12\": \"I\""
                + "},"
                + "\"DTP\": {"
                //Discharge Hour
                + "\"DTP01\": \"96\","
                + "\"DTP02\": \"TM\","
                + "\"DTP03\": \"2060\""
                + "},"
                + "\"DTP\": {"
                //Statement Date
                + "\"DTP01\": \"434\","
                + "\"DTP02\": \"RD8\","
                + "\"DTP03\": \"20230101-20230131\""
                + "},"
                + "\"CL1\": {"
                //Institutional Claim Code
                + "\"CL101\": \"1\","
                + "\"CL102\": \"1\""
                + "},"
                + "\"CN1\": {"
                //Contract Information
                + "\"CN101\": \"3\","
                + "\"CN102\": \"05\""
                + "},"
                + "\"REF\": {"
                //PayerClaim Control Number
                + "\"REF01\": \"F8\","
                + "\"REF02\": \"1456823987456\""
                + "},"
//                + "\"REF\": {"
//                //Claim Identifier for Transmission Intermediaries
//                + "\"REF01\": \"D9\","
//                + "\"REF02\": \"17312345600006351235\""
//                + "},"
                + "\"HI\": {"
                //PrincipalDiagnosisCode
                + "\"HI01-1\": \"ABK\","
                + "\"HI01-2\": \"0340\""
                + "}, "
                + "\"HI\": {"
                //AdmittingDiagnosis
                + "\"HI01-1\": \"ABF\","
                + "\"HI01-2\": \"V7389\""
                + "},"
                + "\"HI\": {"
                //PrincipalProcedureInformation
                + "\"HI01-1\": \"BBR\","
                + "\"HI01-2\": \"7625\","
                + "\"HI01-1\": \"D8\","
                + "\"HI01-2\": \"20230101\""
                + "}"
                + "},"
                // Loop 2310A
                + "\"Loop2310A\": {"
                + "\"NM1\": {"
                + "\"NM101\": \"85\","
                + "\"NM108\": \"XX\","
                + "\"NM109\": \"9876543210\""
                + "},"
                + "\"N3\": {"
                + "\"N301\": \"234 DANTON ST\""
                + "},"
                + "\"N4\": {"
                + "\"N401\": \"ASHBURN\","
                + "\"N402\": \"VA\","
                + "\"N403\": \"20987\""
                + "},"
                + "\"PRV\": {"
                + "\"PRV01\": \"AT\","
                + "\"PRV02\": \"PXC\","
                + "\"PRV02\": \"453088947A\""
                + "},"
                + "\"REF\": {"
                + "\"REF01\": \"G2\","
                + "\"REF02\": \"KA66633452\""
                + "}"
                + "},"
                // Loop 2310B
                + "\"Loop2310B\": {"
                + "\"NM1\": {"
                + "\"NM101\": \"72\","
                + "\"NM108\": \"XX\","
                + "\"NM109\": \"9876543280\""
                + "}"
                + "},"
                // Loop 2310C
                + "\"Loop2310B\": {"
                + "\"NM1\": {"
                + "\"NM101\": \"72\","
                + "\"NM108\": \"XX\","
                + "\"NM109\": \"9876543280\""
                + "}"
                + "},"
                // Loop 2310E
                + "\"Loop2310E\": {"
                + "\"NM1\": {"
                + "\"NM101\": \"72\","
                + "\"NM108\": \"XX\","
                + "\"NM109\": \"9876543280\""
                + "},"
                + "\"NM3\": {"
                + "\"NM301\": \"294 DANTON ST\""
                + "},"
                + "\"NM4\": {"
                + "\"NM401\": \"ASHBURN\","
                + "\"NM402\": \"VA\","
                + "\"NM403\": \"20987\""
                + "},"
                + "\"REF\": {"
                + "\"REF\": \"G2\","
                + "\"REF\": \"KA66633452\""
                + "}"
                + "},"
                // Loop 2310F
                + "\"Loop2310F\": {"
                + "\"NM1\": {"
                + "\"NM101\": \"DN\","
                + "\"NM108\": \"XX\","
                + "\"NM109\": \"7865334256\""
                + "},"
                + "\"NM3\": {"
                + "\"NM301\": \"123 DANTON ST\""
                + "},"
                + "\"NM4\": {"
                + "\"NM401\": \"ASHBURN\","
                + "\"NM402\": \"VA\","
                + "\"NM403\": \"20907\""
                + "},"
                + "\"REF\": {"
                + "\"REF\": \"G2\","
                + "\"REF\": \"KA66633452\""
                + "}"
                + "},"
                // Loop 2320
                + "\"Loop2320\": {"
                + "\"SBR\": {"
                + "\"SBR01\": \"P\","
                + "\"SBR02\": \"18\","
                + "\"SBR03\": \"MC\""
                + "},"
                + "\"CAS\": {"
                + "\"CAS02\": \"\""
                + "}"
                + "\"AMT\": {"
                + "\"AMT01\": \"D\","
                + "\"AMT02\": \"292.32\""
                + "}"
                + "},"
                // Loop 2330A
                + "\"Loop2330A\": {"
                + "\"NM1\": {"
                + "\"NM101\": \"MI\","
                + "\"NM102\": \"\","
                + "\"NM103\": \"\","
                + "\"NM104\": \"\","
                + "\"NM105\": \"\","
                + "\"NM106\": \"\","
                + "\"NM107\": \"\","
                + "\"NM108\": \"\","
                + "\"NM109\": \"7865334256\""
                + "}"
                + "},"
                // Loop 2330B
                + "\"Loop2330B\": {"
                + "\"NM1\": {"
                + "\"NM101\": \"DN\","
                + "\"NM109\": \"7865334256\""
                + "},"
                + "\"DTP\": {"
                + "\"DTP01\": \"573\","
                + "\"DTP02\": \"D8\","
                + "\"DTP03\": \"20230903\""
                + "},"
                + "\"REF\": {"
                + "\"REF01\": \"F8\","
                + "\"REF02\": \"ABC6633452\""
                + "}"
                + "}"
                + "},"
                // LOOP 2400
                + "\"Loop2400\": {"
                + "{"
                + "\"LX\": {"
                + "\"LX01\": \"1\""
                + "},"
                + "\"SV2\": {"
                + "\"SV202-1\": \"HC\","
                + "\"SV202-2\": \"H2017\","
                + "\"SV203\": \"146.16\","
                + "\"SV204\": \"UN\","
                + "\"SV205\": \"6.0\""
                + "}"
                + "},"
                + "{"
                + "\"LX\": {"
                + "\"LX01\": \"2\""
                + "},"
                + "\"SV2\": {"
                + "\"SV202-1\": \"HC\","
                + "\"SV202-2\": \"H0004\","
                + "\"SV203\": \"146.16\","
                + "\"SV204\": \"UN\","
                + "\"SV205\": \"6.0\""
                + "}"
                + "},"
                // Loop 2430
                + "\"Loop2430\": {"
                + "\"SVD\": {"
                + "\"SVD01\": \"7865334256\","
                + "\"SVD02\": \"292.12\","
                + "\"SVD03-1\": \"HC\","
                + "\"SVD03-2\": \"H0004\","
                + "},"
                + "\"DTP\": {"
                + "\"DTP01\": \"573\","
                + "\"DTP02\": \"D8\","
                + "\"DTP03\": \"20230903\""
                + "}"
                + "}"
                + "},"
                + "\"SE\": {"
                + "\"SE01\": \"49\","
                + "\"SE02\": \"000000001\""
                + "},"
                + "\"GE\": {"
                + "\"GE01\": \"1\","
                + "\"GE02\": \"1\""
                + "},"
                + "\"IEA\": {"
                + "\"IEA01\": \"1\","
                + "\"IEA02\": \"000000001\""
                + "}"
                + "}";

        try {
            convertJsonToEdi(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void convertJsonToEdi(String json) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode parentNode = objectMapper.readTree(json);


        // Process ISA Segment
        JsonNode isaNode = parentNode.path("ISA");
        if (!isaNode.isMissingNode()) {
            processEdiSegment("ISA", isaNode);
        }
        // Process GS Segment
        JsonNode gsNode = parentNode.path("GS");
        if (!gsNode.isMissingNode()) {
            processEdiSegment("GS", gsNode);
        }
        // Process ST Segment
        JsonNode stNode = parentNode.path("ST");
        if (!stNode.isMissingNode()) {
            processEdiSegment("ST", stNode);
        }
        // Process BHT Segment
        JsonNode bhtNode = parentNode.path("BHT");
        if (!bhtNode.isMissingNode()) {
            processEdiSegment("BHT", bhtNode);
        }
        // Process LOOP1000A Segment
        JsonNode loop1000ANode = parentNode.path("Loop1000A");
        if (!loop1000ANode.isMissingNode()) { // Ensure the Loop1000A node exists
            JsonNode nm1Node = loop1000ANode.path("NM1");
            if (!nm1Node.isMissingNode()) { // Check if the HL segment exists within LOOP2000B
                processEdiSegment("NM1", nm1Node);
                if (!loop1000ANode.isMissingNode()) { // Ensure the LOOP2000C node exists
                    JsonNode perNode = loop1000ANode.path("PER");
                    if (!perNode.isMissingNode()) { // Check if the HL segment exists within LOOP2000B
                        processEdiSegment("PER", perNode);
                    }
                }
            }
        }
        // Process LOOP1000B Segment
        JsonNode loop1000BNode = parentNode.path("Loop1000B");
        if (!loop1000BNode.isMissingNode()) { // Ensure the Loop1000A node exists
            JsonNode nm1Node = loop1000BNode.path("NM1");
            if (!nm1Node.isMissingNode()) { // Check if the NM1 segment exists within LOOP2000B
                processEdiSegment("NM1", nm1Node);
            }
        }
        // Process Loop2000A Segment
        JsonNode loop2000ANode = parentNode.path("Loop2000A");
        if (!loop2000ANode.isMissingNode()) { // Ensure the Loop2000A node exists
            // Process HL Segment within Loop2000A
            JsonNode hlNode = loop2000ANode.path("HL");
            if (!hlNode.isMissingNode()) { // Check if the HL segment exists within Loop2000A
                processEdiSegment("HL", hlNode);

                // Process PRV Segment within Loop2000A
                JsonNode prvNode = loop2000ANode.path("PRV");
                if (!prvNode.isMissingNode()) { // Check if the PRV segment exists within Loop2000A
                    processEdiSegment("PRV", prvNode);
                }

                // Process Loop2010AA Segment within Loop2000A
                JsonNode loop2010AANode = loop2000ANode.path("Loop2010AA");
                if (!loop2010AANode.isMissingNode()) { // Ensure the Loop2010AA node exists within Loop2000A
                    // Process NM1 Segment within Loop2010AA
                    JsonNode nm1Node = loop2010AANode.path("NM1");
                    if (!nm1Node.isMissingNode()) { // Check if the NM1 segment exists within Loop2010AA
                        processEdiSegment("NM1", nm1Node);
                    }

                    // Process N3 Segment within Loop2010AA
                    JsonNode n3Node = loop2010AANode.path("N3");
                    if (!n3Node.isMissingNode()) { // Check if the N3 segment exists within Loop2010AA
                        processEdiSegment("N3", n3Node);
                    }

                    // Process N4 Segment within Loop2010AA
                    JsonNode n4Node = loop2010AANode.path("N4");
                    if (!n4Node.isMissingNode()) { // Check if the N4 segment exists within Loop2010AA
                        processEdiSegment("N4", n4Node);
                    }

                    // Process REF Segment within Loop2010AA
                    JsonNode refNode = loop2010AANode.path("REF");
                    if (!refNode.isMissingNode()) { // Check if the REF segment exists within Loop2010AA
                        processEdiSegment("REF", refNode);
                    }
                }
            }
        }
        // Process LOOP2000B Segment
        JsonNode loop2000BNode = parentNode.path("Loop2000B");
        if (!loop2000BNode.isMissingNode()) { // Ensure the Loop2000B node exists
            // Process HL Segment within Loop2000B
            JsonNode hlNode = loop2000BNode.path("HL");
            if (!hlNode.isMissingNode()) { // Check if the HL segment exists within Loop2000B
                processEdiSegment("HL", hlNode);
            }

            // Process SBR Segment within Loop2000B
            JsonNode sbrNode = loop2000BNode.path("SBR");
            if (!sbrNode.isMissingNode()) { // Check if the SBR segment exists within Loop2000B
                processEdiSegment("SBR", sbrNode);
            }
        }
        // Process LOOP2010BA Segment
        JsonNode loop2010BANode = parentNode.path("Loop2010BA");
        if (!loop2010BANode.isMissingNode()) { // Ensure the Loop2010BA node exists
            // Process NM1 Segment within Loop2010BA
            JsonNode nm1Node = loop2010BANode.path("NM1");
            if (!nm1Node.isMissingNode()) { // Check if the NM1 segment exists within Loop2010BA
                processEdiSegment("NM1", nm1Node);
            }

            // Process DMG Segment within Loop2010BA
            JsonNode dmgNode = loop2010BANode.path("DMG");
            if (!dmgNode.isMissingNode()) { // Check if the DMG segment exists within Loop2010BA
                processEdiSegment("DMG", dmgNode);
            }
        }

        // Process LOOP2010BB Segment
        JsonNode loop2010BBNode = parentNode.path("Loop2010BB");
        if (!loop2010BBNode.isMissingNode()) { // Ensure the Loop2010BB node exists
            // Process NM1 Segment within Loop2010BB
            JsonNode nm1Node = loop2010BBNode.path("NM1");
            if (!nm1Node.isMissingNode()) { // Check if the NM1 segment exists within Loop2010BB
                processEdiSegment("NM1", nm1Node);
            }
            // Process N4 Segment within Loop2010BB
            JsonNode n4Node = loop2010BBNode.path("N4");
            if (!n4Node.isMissingNode()) { // Check if the N4 segment exists within Loop2010BB
                processEdiSegment("N4", n4Node);
            }
            // Process REF Segment within Loop2010BB
            JsonNode refNode = loop2010BBNode.path("REF");
            if (!refNode.isMissingNode()) { // Check if the REF segment exists within Loop2010BB
                processEdiSegment("REF", refNode);
            }
        }
        // Process Loop2300 Segment
        JsonNode loop2300Node = parentNode.path("Loop2300");
        if (!loop2300Node.isMissingNode()) { // Ensure the Loop2300 node exists

            // Process CLM Segment
            JsonNode clmNode = loop2300Node.path("CLM");
            if (!clmNode.isMissingNode()) { // Check if the CLM segment exists within Loop2300
                processEdiSegment("CLM", clmNode);
            }

            // Process DTP Segments
            JsonNode dtpNode = loop2300Node.path("DTP");
            if (!dtpNode.isMissingNode()) {
                for (JsonNode dtpSegment : dtpNode) {
                    processEdiSegment("DTP", dtpSegment);
                }

//            JsonNode dtpDischargeHourNode = loop2300Node.path("DTP").get(0);
//            if (!dtpDischargeHourNode.isMissingNode()) {
//                processEdiSegment("DTP_DischargeHour", dtpDischargeHourNode);
//            }
//
//            JsonNode dtpStatementDateNode = loop2300Node.path("DTP").get(1);
//            if (dtpStatementDateNode != null && !dtpStatementDateNode.isMissingNode()) {
//                processEdiSegment("DTP_StatementDate", dtpStatementDateNode);
//            }

                // Process CL1 Segment
                JsonNode cl1Node = loop2300Node.path("CL1");
                if (!cl1Node.isMissingNode()) {
                    processEdiSegment("CL1", cl1Node);
                }

                // Process CN1 Segment
                JsonNode cn1Node = loop2300Node.path("CN1");
                if (!cn1Node.isMissingNode()) {
                    processEdiSegment("CN1", cn1Node);
                }

            // Process REF Segment
            JsonNode refPayerClaimNode = loop2300Node.path("REF");
            if (!refPayerClaimNode.isMissingNode()) {
                processEdiSegment("REF_PayerClaimControlNumber", refPayerClaimNode);
            }

            // Process REF Segment
            JsonNode refTransmissionIntermediariesNode = loop2300Node.path("REF");
            if (!refTransmissionIntermediariesNode.isMissingNode()) {
                processEdiSegment("REF_TransmissionIntermediaries", refTransmissionIntermediariesNode);
            }
//
//            // Process HI Segments
//            JsonNode hiPrincipalDiagnosisNode = loop2300Node.path("HI").get(0);
//           JsonNode hiAdmittingDiagnosisNode = loop2300Node.path("HI").get(1);
//           JsonNode hiPrincipalProcedureNode = loop2300Node.path("HI").get(2);
//
//            if (hiPrincipalDiagnosisNode != null && !hiPrincipalDiagnosisNode.isMissingNode()) {
//                processEdiSegment("HI_PrincipalDiagnosis", hiPrincipalDiagnosisNode);
//            }
//
//            if (hiAdmittingDiagnosisNode != null && !hiAdmittingDiagnosisNode.isMissingNode()) {
//                processEdiSegment("HI_AdmittingDiagnosis", hiAdmittingDiagnosisNode);
//            }
//
//            if (hiPrincipalProcedureNode != null && !hiPrincipalProcedureNode.isMissingNode()) {
//                processEdiSegment("HI_PrincipalProcedure", hiPrincipalProcedureNode);
//            }
            }
                // Process Loop2310A Segment
                JsonNode loop2310ANode = loop2300Node.path("Loop2310A");
                if (!loop2310ANode.isMissingNode()) { // Ensure the Loop2310A node exists
                    JsonNode nm1Node = loop2310ANode.path("NM1");
                    if (!nm1Node.isMissingNode()) {
                        processEdiSegment("NM1_Loop2310A", nm1Node);
                    }

                    JsonNode n3Node = loop2310ANode.path("N3");
                    if (!n3Node.isMissingNode()) {
                        processEdiSegment("N3_Loop2310A", n3Node);
                    }

                    JsonNode n4Node = loop2310ANode.path("N4");
                    if (!n4Node.isMissingNode()) {
                        processEdiSegment("N4_Loop2310A", n4Node);
                    }

                    JsonNode prvNode = loop2310ANode.path("PRV");
                    if (!prvNode.isMissingNode()) {
                        processEdiSegment("PRV_Loop2310A", prvNode);
                    }

                    JsonNode refNode = loop2310ANode.path("REF");
                    if (!refNode.isMissingNode()) {
                        processEdiSegment("REF_Loop2310A", refNode);
                    }
                }

        // Process Loop2310B Segment
        JsonNode loop2310BNode = loop2300Node.path("Loop2310B");
        if (!loop2310BNode.isMissingNode()) { // Ensure the Loop2310B node exists
            JsonNode nm1Node = loop2310BNode.path("NM1");
            if (!nm1Node.isMissingNode()) {
                processEdiSegment("NM1_Loop2310B", nm1Node);
            }
        }
        // Process Loop2310C Segment
        JsonNode loop2310CNode = loop2300Node.path("Loop2310C");
        if (!loop2310CNode.isMissingNode()) { // Ensure the Loop2310C node exists
            JsonNode nm1Node = loop2310CNode.path("NM1");
            if (!nm1Node.isMissingNode()) {
                processEdiSegment("NM1_Loop2310C", nm1Node);
            }
        }
        // Process Loop2310E Segment
        JsonNode loop2310ENode = loop2300Node.path("Loop2310E");
        if (!loop2310ENode.isMissingNode()) { // Ensure the Loop2310E node exists
            JsonNode nm1Node = loop2310ENode.path("NM1");
            if (!nm1Node.isMissingNode()) {
                processEdiSegment("NM1_Loop2310E", nm1Node);
            }

            JsonNode n3Node = loop2310ENode.path("N3");
            if (!n3Node.isMissingNode()) {
                processEdiSegment("N3_Loop2310E", n3Node);
            }

            JsonNode n4Node = loop2310ENode.path("N4");
            if (!n4Node.isMissingNode()) {
                processEdiSegment("N4_Loop2310E", n4Node);
            }

            JsonNode refNode = loop2310ENode.path("REF");
            if (!refNode.isMissingNode()) {
                processEdiSegment("REF_Loop2310E", refNode);
            }
        }
            // Process Loop2310F Segment
        JsonNode loop2310FNode = loop2300Node.path("Loop2310F");
        if (!loop2310FNode.isMissingNode()) { // Ensure the Loop2310F node exists
            JsonNode nm1Node = loop2310FNode.path("NM1");
            if (!nm1Node.isMissingNode()) {
                processEdiSegment("NM1_Loop2310F", nm1Node);
            }

            JsonNode n3Node = loop2310FNode.path("N3");
            if (!n3Node.isMissingNode()) {
                processEdiSegment("N3_Loop2310F", n3Node);
            }

            JsonNode n4Node = loop2310FNode.path("N4");
            if (!n4Node.isMissingNode()) {
                processEdiSegment("N4_Loop2310F", n4Node);
            }

            JsonNode refNode = loop2310FNode.path("REF");
            if (!refNode.isMissingNode()) {
                processEdiSegment("PRV_Loop2310F", refNode);
            }
        }
        // Process Loop2320 Segment
        JsonNode loop2320Node = loop2300Node.path("Loop2320");
        if (!loop2320Node.isMissingNode()) { // Ensure the Loop2320 node exists
            JsonNode sbrNode = loop2320Node.path("SBR");
            if (!sbrNode.isMissingNode()) {
                processEdiSegment("SBR_Loop2320", sbrNode);
            }

            JsonNode casNode = loop2320Node.path("CAS");
            if (!casNode.isMissingNode()) {
                processEdiSegment("CAS_Loop2320", casNode);
            }

            JsonNode amtNode = loop2320Node.path("AMT");
            if (!amtNode.isMissingNode()) {
                processEdiSegment("AMT_Loop2320", amtNode);
            }
        }

        // Process Loop2330A Segment
        JsonNode loop2330ANode = loop2300Node.path("Loop2330A");
        if (!loop2330ANode.isMissingNode()) { // Ensure the Loop2330A node exists
            JsonNode nm1Node = loop2330ANode.path("NM1");
            if (!nm1Node.isMissingNode()) {
                processEdiSegment("NM1_Loop2330A", nm1Node);
            }
        }

        // Process Loop2330B Segment
        JsonNode loop2330BNode = loop2300Node.path("Loop2330B");
        if (!loop2330BNode.isMissingNode()) { // Ensure the Loop2330B node exists
            JsonNode nm1Node = loop2330BNode.path("NM1");
            JsonNode dtpLoop2330BNode = loop2330BNode.path("DTP");
            JsonNode refNode = loop2330BNode.path("REF");

            if (!nm1Node.isMissingNode()) {
                processEdiSegment("NM1_Loop2330B", nm1Node);
            }
            if (!dtpLoop2330BNode.isMissingNode() && dtpLoop2330BNode.isArray()) {
                for (JsonNode dtpSegment : dtpLoop2330BNode) {
                    processEdiSegment("DTP_Loop2330B", dtpSegment);
                }
            }
            if (!refNode.isMissingNode()) {
                processEdiSegment("REF_Loop2330B", refNode);
            }
        }
    }
// Process Loop2400 Segment
        JsonNode loop2400Node = parentNode.path("Loop2400");
        if (!loop2400Node.isMissingNode() && loop2400Node.isArray())

    {
        for (JsonNode loop2400Item : loop2400Node) {
            // Process LX Segment
            JsonNode lxNode = loop2400Item.path("LX");
            if (!lxNode.isMissingNode()) {
                processEdiSegment("LX", lxNode);
            }

            // Process SV2 Segment
            JsonNode sv2Node = loop2400Item.path("SV2");
            if (!sv2Node.isMissingNode()) {
                processEdiSegment("SV2", sv2Node);
            }
        }

            // Process Loop2430 Segment
            JsonNode loop2430Node = parentNode.path("Loop2430");
            if (!loop2430Node.isMissingNode()) {
                JsonNode svdNode = loop2430Node.path("SVD");
                if (!svdNode.isMissingNode()) {
                    processEdiSegment("SVD", svdNode);
                }

                JsonNode dtpNode = loop2430Node.path("DTP");
                if (!dtpNode.isMissingNode()) {
                    processEdiSegment("DTP", dtpNode);
                }
            }

    }
        // Process SE Segment
        JsonNode seNode = parentNode.path("SE");
        if (!seNode.isMissingNode()) { // Check if the SE segment exists
            processEdiSegment("SE", seNode);
        }

        // Process GE Segment
        JsonNode geNode = parentNode.path("GE");
        if (!geNode.isMissingNode()) { // Check if the GE segment exists
            processEdiSegment("GE", geNode);
        }

        // Process IEA Segment
        JsonNode ieaNode = parentNode.path("IEA");
        if (!ieaNode.isMissingNode()) { // Check if the IEA segment exists
            processEdiSegment("IEA", ieaNode);
        }

    }

        private static void processEdiSegment(String segmentName, JsonNode segmentNode) {
        StringBuilder segmentBuilder = new StringBuilder(segmentName);
        segmentNode.fields().forEachRemaining(field -> {
            segmentBuilder.append("*").append(field.getValue().asText());
        });
        segmentBuilder.append("~");
        System.out.println(segmentBuilder);
    }

}
