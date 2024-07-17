import java.util.Arrays;

public class Conv {
    public static void main(String[] args) {
        String input = "DC_FBANK_SWIFT_59\n" +
                "CARD_REMOVEREASON\n" +
                "DC_GARANTPAY\n" +
                "BALANCEDATE\n" +
                "PAYER_ADDR\n" +
                "BENEFICIARY_PLACE\n" +
                "BENEFICIARY_LOCATIONSTATE\n" +
                "BENEFICIARY_BANK_NBCORRACC\n" +
                "BENEFICIARY_BANKPLACE\n" +
                "BENEFICIARY_BANKBRANCH\n" +
                "DOC_NOTES_ADD\n" +
                "DOC_NOTES_CURRCONTROL\n" +
                "PAYER_LOCATIONSTATE\n" +
                "E_SIGN2\n" +
                "PAYER_PLACE\n" +
                "E_SIGNDATE2\n" +
                "PAYER_BANKPLACE\n" +
                "USR_BOSSRANK\n" +
                "DC_CHECK\n" +
                "DC_SWIFTPAYTYPE\n" +
                "LISTFILENAME\n" +
                "BENEFICIARY_CORR_BANKSTATE\n" +
                "BENEFICIARY_CORR_BANKPLACE\n" +
                "DOC_NAME\n" +
                "DC_FBANK_ADDR_50\n" +
                "DC_FBANK_CODE_51\n" +
                "DC_FBANK_NAME_50\n" +
                "DC_FBANK_NAME_51\n" +
                "DC_FBANK_SWIFT_51\n" +
                "DC_OP_51\n" +
                "EXTACTIONID\n" +
                "EXTSYSTEMID\n" +
                "ISELABORPAYOFF\n" +
                "PAYER_SURNAME\n" +
                "PAYER_FIRSTNAME\n" +
                "PAYER_PATRONYMICNAME\n" +
                "PAYER_REGION\n" +
                "PAYER_SETTLEMENTNAME\n" +
                "PAYER_STREETNAME\n" +
                "PAYER_HOUSENUM\n" +
                "PAYER_BUILDING\n" +
                "PAYER_APARTMENTNUM\n" +
                "ADDITIONALFEE\n" +
                "ANALYTICALONLY\n" +
                "AUTOEXECUTE\n" +
                "BANKBICCODE\n" +
                "BANKBUDGETITEM\n" +
                "BENEFICIARY_ACCNUM\n" +
                "BENEFICIARY_BANK_CA\n" +
                "BENEFICIARY_BANK_DCCODE\n" +
                "BENEFICIARY_BANKNAME\n" +
                "BENEFICIARY_BANK_REGREASONCODE\n" +
                "BENEFICIARY_BANKSTATE\n" +
                "BENEFICIARY_BIC\n" +
                "BENEFICIARY_CBS\n" +
                "BENEFICIARY_CORR_BANKNAME\n" +
                "BENEFICIARY_CORR_BIC\n" +
                "BENEFICIARY_NAME\n" +
                "BENEFICIARY_REGREASONCODE\n" +
                "BISS_MSGREF\n" +
                "BISS_NB_CA\n" +
                "BISS_SRCMSGREF\n" +
                "BLK_EMITNAME\n" +
                "BLK_GETPRICE\n" +
                "BLK_NUM\n" +
                "BLK_PRICE\n" +
                "BLK_PROFIT\n" +
                "BLK_PUTPRICE\n" +
                "BLK_SERIES\n" +
                "BENEFICIARY_ADDR\n" +
                "CARD_ACCEPTDATE\n" +
                "CARD_ACCEPTREST\n" +
                "CARD_ACCEPTSUM\n" +
                "CARD_ACCEPTTYPE\n" +
                "CARD_FINE\n" +
                "CARD_INDATE\n" +
                "CARD_NUM\n" +
                "CARD_PARTSUM\n" +
                "CARD_PAYDATE\n" +
                "CARD_REFUSALSUM\n" +
                "CARD_REST\n" +
                "CARD_TIMEINLOCATION\n" +
                "CASHOPER\n" +
                "CASTINTERESTDATE\n" +
                "CENTREBANKSERVICES\n" +
                "CERTIFICATE_AUTHORITY\n" +
                "CERTIFICATE_DATE\n" +
                "CERTIFICATE_NAME\n" +
                "CERTIFICATE_NUM\n" +
                "CERTIFICATE_SER\n" +
                "CERTIFICATE_TYPE\n" +
                "CLIENT_ACCNAME\n" +
                "CLIENT_ACCNUM\n" +
                "CLIENT_NAME\n" +
                "CLIENT_UNN\n" +
                "CNV_CARD\n" +
                "CODESYSTEMCALC\n" +
                "COMMISCHARGEACC\n" +
                "CORR_ACCNAME\n" +
                "CORR_ACCNUM\n" +
                "CORR_BENEFICIARYUNN\n" +
                "CORR_BENEFICIARYUNN_INFO\n" +
                "CORR_MFO\n" +
                "CORR_NAME\n" +
                "CORR_TRAN_ACCNAME\n" +
                "CORR_TRAN_ACCNUM\n" +
                "CORR_UNN\n" +
                "CORR_UNN_INFO\n" +
                "CORR_UNN2\n" +
                "CORR_UNN2_INFO\n" +
                "DC_ACCID_1\n" +
                "DC_ACCID_2\n" +
                "DC_ACC_NAME\n" +
                "DC_ACCNUM_10\n" +
                "DC_ACCNUM_3\n" +
                "DC_ACCNUM_4\n" +
                "DC_ACCNUM_5\n" +
                "DC_ACCNUM_6\n" +
                "DC_ACCNUM_7\n" +
                "DC_ACCNUM_8\n" +
                "DC_ACCNUM_9\n" +
                "DC_ACC_25\n" +
                "DC_AKR_FORM\n" +
                "DC_AKR_PODTV\n" +
                "DC_BRANCHID\n" +
                "DC_CLIENT_ACC\n" +
                "DC_CLIENT_ACCNUM\n" +
                "DC_CLIENT_ADDR\n" +
                "DC_CLIENT_ADDR2\n" +
                "DC_CLIENT_ID\n" +
                "DC_CLIENT_NAME\n" +
                "DC_CLIENT_STATE\n" +
                "DC_CLIENT_UNN\n" +
                "DC_CONTRACTID\n" +
                "DC_CONTR_CURR\n" +
                "DC_CONTR_DATE\n" +
                "DC_CONTR_NUM\n" +
                "DC_CONTR_SUM\n" +
                "DC_CURR_CODE_1\n" +
                "DC_CURR_CODE_2\n" +
                "DC_CURRCODE_5\n" +
                "DC_CURR_KURS\n" +
                "DC_DATE_60\n" +
                "DC_DATE_62\n" +
                "DC_DATE_64\n" +
                "DC_DOWNPAYMENTS\n" +
                "DC_ERROR\n" +
                "DC_FBANK_ACCNUM1_56\n" +
                "DC_FBANK_ACCNUM1_57\n" +
                "DC_FBANK_ACCNUM_56\n" +
                "DC_FBANK_ACCNUM_57\n" +
                "DC_FBANK_ACCNUM_58\n" +
                "DC_FBANK_BIC1_56\n" +
                "DC_FBANK_BIC1_57\n" +
                "DC_FBANK_BIC_56\n" +
                "DC_FBANK_BIC_57\n" +
                "DC_FBANK_BIC_58\n" +
                "DC_FBANK_INN_58\n" +
                "DC_FBANK_LORO_53\n" +
                "DC_FBANK_NAME1_56\n" +
                "DC_FBANK_NAME1_57\n" +
                "DC_FBANK_NAME_53\n" +
                "DC_FBANK_NAME_54\n" +
                "DC_FBANK_NAME_56\n" +
                "DC_FBANK_NAME_57\n" +
                "DC_FBANK_NAME_58\n" +
                "DC_FBANK_RKC1_56\n" +
                "DC_FBANK_RKC1_57\n" +
                "DC_FBANK_RKC_56\n" +
                "DC_FBANK_RKC_57\n" +
                "DC_FBANK_RKC_58\n" +
                "DC_FBANK_SWIFT1_56\n" +
                "DC_FBANK_SWIFT1_57\n" +
                "DC_FBANK_SWIFT_53\n" +
                "DC_FBANK_SWIFT_54\n" +
                "DC_FBANK_SWIFT_56\n" +
                "DC_FBANK_SWIFT_57\n" +
                "DC_FBANK_SWIFT_58\n" +
                "DC_FILIAL\n" +
                "DC_FORMID\n" +
                "DC_ISGOODS\n" +
                "DC_ISNOTUSEDINREST\n" +
                "DC_KOM_71A_TEXT\n" +
                "DC_KOM_71F_TEXT\n" +
                "DC_KURS\n" +
                "DC_LORO\n" +
                "DC_MARK_60\n" +
                "DC_MARK_62\n" +
                "DC_MARK_64\n" +
                "DC_NUMFILE\n" +
                "DC_OFFSHORECODE\n" +
                "DC_OP1_56\n" +
                "DC_OP1_57\n" +
                "DC_OP_50F\n" +
                "DC_OP_52\n" +
                "DC_OP_53\n" +
                "DC_OP_54\n" +
                "DC_OP_56\n" +
                "DC_OP_57\n" +
                "DC_OP_58\n" +
                "DC_OP_60\n" +
                "DC_OP_62\n" +
                "DC_PASSPORT_CURR\n" +
                "DC_PASSPORT_DATE\n" +
                "DC_PASSPORTID\n" +
                "DC_PASSPORT_NUM\n" +
                "DC_PASSPORT_SUM\n" +
                "DC_PERMIT_DATE\n" +
                "DC_PERMIT_NUM\n" +
                "DC_RBBANK_CODE\n" +
                "DC_RBBANK_NAME\n" +
                "DC_RBBANK_SWIFT\n" +
                "DC_RECDEP\n" +
                "DC_RECDEP_NAME\n" +
                "DC_RECEIVER\n" +
                "DC_RECEIVER_NAME\n" +
                "DC_REFERENCE\n" +
                "DC_REGION\n" +
                "DC_RELREFERENCE\n" +
                "DC_RELTYPE\n" +
                "DC_SENDER\n" +
                "DC_SENDER_NAME\n" +
                "DC_SUBJ_ACCNUM\n" +
                "DC_SUBJ_ADDR\n" +
                "DC_SUBJ_ID\n" +
                "DC_SUBJ_INN\n" +
                "DC_SUBJ_NAME\n" +
                "DC_SUBJ_STATE\n" +
                "DC_SUM_1\n" +
                "DC_SUM_10\n" +
                "DC_SUM_2\n" +
                "DC_SUM_3\n" +
                "DC_SUM_5\n" +
                "DC_SUM_6\n" +
                "DC_SUM_60\n" +
                "DC_SUM_62\n" +
                "DC_SUM_64\n" +
                "DC_SUM_7\n" +
                "DC_SUM_8\n" +
                "DC_SUM_9\n" +
                "DC_SWIFTTYPE\n" +
                "DC_TEXT_22A\n" +
                "DC_TEXT_22C\n" +
                "DC_TEXT_23\n" +
                "DC_TEXT_23E\n" +
                "DC_TEXT_26\n" +
                "DC_TEXT_701\n" +
                "DC_TEXT_702\n" +
                "DC_TEXT_703\n" +
                "DC_TEXT_704\n" +
                "DC_TEXT_721\n" +
                "DC_TEXT_722\n" +
                "DC_TEXT_723\n" +
                "DC_TEXT_724\n" +
                "DC_TEXT_725\n" +
                "DC_TEXT_726\n" +
                "DC_TEXT_82\n" +
                "DC_TEXT_87\n" +
                "DC_TNVD\n" +
                "DC_TRANSLIT\n" +
                "DC_TYPE_SD\n" +
                "DC_TYPE_SD2\n" +
                "DC_USERID\n" +
                "DC_28\n" +
                "DC_31D\n" +
                "DC_39A\n" +
                "DC_39B\n" +
                "DC_39C\n" +
                "DC_40\n" +
                "DC_40E\n" +
                "DC_42C1\n" +
                "DC_42C2\n" +
                "DC_42M1\n" +
                "DC_42M2\n" +
                "DC_42P1\n" +
                "DC_42P2\n" +
                "DC_43P\n" +
                "DC_43T\n" +
                "DC_44A\n" +
                "DC_44B\n" +
                "DC_44C\n" +
                "DC_44D\n" +
                "DC_44E\n" +
                "DC_44F\n" +
                "DC_45A\n" +
                "DC_45B\n" +
                "DC_46A\n" +
                "DC_46B\n" +
                "DC_47A\n" +
                "DC_47B\n" +
                "DC_49\n" +
                "DC_61\n" +
                "DC_86\n" +
                "DOC_ACCOMDATE\n" +
                "DOC_BEGDATE\n" +
                "CURROPERCODE\n" +
                "DOC_TAKEGIVE2\n" +
                "PAYER_DISTRICTNAME\n" +
                "EXTOPERCODE\n" +
                "EXECUTOR\n" +
                "DC_ISMANUALCHARGING\n" +
                "CHANGEDATEOPER\n" +
                "DOC_DATE2\n" +
                "ISRESIDENT\n" +
                "ISNACHPAYOFF\n" +
                "REPDOCID\n" +
                "PARTIALREPAYCALCPERC\n" +
                "DOC_CALCSUM\n" +
                "MOUNTEDBYBANK\n" +
                "SURPLUSPERCSSUMM\n" +
                "OWNER_OF_PROPERTY\n" +
                "DC_ISNEEDADDCONTROL\n" +
                "PAYDOCNUM\n" +
                "PAYDOCDATE\n" +
                "DC_PAYDETAIL\n" +
                "CASTAMTZDATE\n" +
                "DC_PAYER_BANKSTATE\n" +
                "CERTIFICATE_PERSONALNUM\n" +
                "DOC_SUPPLEMENTPAGECOUNT\n" +
                "DC_FINRES\n" +
                "DC_RATE_REUTERS\n" +
                "DC_77B\n" +
                "DEPREGIONCODE\n" +
                "ISCMSPAYED\n" +
                "DOC_RESERVLIST\n" +
                "ISPAYTOONEPHISPERSON\n" +
                "PHISPERSON_FIO\n" +
                "PHISPERSON_SUBACC\n" +
                "PHISPERSON_ACC\n" +
                "CONFIRMATION_PAY\n" +
                "WRITEOFFDESCR\n" +
                "READY_PAY_AFTER_DEADLINE\n" +
                "ISBENEFRESIDENT\n" +
                "ISNEEDDETAIL\n" +
                "BPSRECALC\n" +
                "BPSRECALC3014\n" +
                "PAYERSTATE_ISOFFSHORE_50\n" +
                "LOCATIONSTATE_ISOFFSHORE_50\n" +
                "BANKSTATE_ISOFFSHORE_52\n" +
                "BANKSTATE_ISOFFSHORE_57\n" +
                "BENEFICIARYSTATE_ISOFFSHORE_59\n" +
                "SUPPLIERSTATE_ISOFFSHORE_59\n" +
                "SIGDATE\n" +
                "SIGTIME\n" +
                "CAST_DISCOUNTAMTZDATE\n" +
                "BUDGETING_CLIENTID\n" +
                "EXECBANK\n" +
                "EXECPLACE\n" +
                "EXECTERMINAL\n" +
                "DOC_BENEFICIARYSTATE\n" +
                "DOC_CASHCODE\n" +
                "DOC_CLIENTID\n" +
                "DOC_COUNT\n" +
                "DOC_CURRCODE\n" +
                "DOC_CURRCODE10\n" +
                "DOC_CURRCODE2\n" +
                "DOC_CURRCODE3\n" +
                "DOC_CURRCODE4\n" +
                "DOC_CURRCODE5\n" +
                "DOC_CURRCODE6\n" +
                "DOC_CURRCODE7\n" +
                "DOC_CURRCODE8\n" +
                "DOC_CURRCODE9\n" +
                "DOC_CURRNAME\n" +
                "DOC_CURRNAME2\n" +
                "DOC_DATE\n" +
                "DOC_DELIVERYDATE\n" +
                "DOC_ENDDATE\n" +
                "DOC_EQUSUM\n" +
                "DOC_EQUSUM2\n" +
                "DOC_EXECUTIVE\n" +
                "DOC_FORMCODE\n" +
                "DOC_FORMCODECARD\n" +
                "DOC_FORMCODE2\n" +
                "DOC_INSTRCODE\n" +
                "DOC_INSTRCODE_INFO\n" +
                "DOC_ISINCOMING\n" +
                "DOC_ISPARTPAY\n" +
                "DOC_NOTES\n" +
                "DOC_NOTESCODE\n" +
                "DOC_NOTES2\n" +
                "DOC_NOTES3\n" +
                "DOC_NOTES4\n" +
                "DOC_NUM\n" +
                "DOC_OKPOCODE\n" +
                "DOC_ONREASON\n" +
                "DOC_OPTYPECODE\n" +
                "DOC_ORDERFORMCODE\n" +
                "DOC_ORDERGROUP\n" +
                "DOC_ORDERSUBGROUP\n" +
                "DOC_PAYCODE\n" +
                "DOC_PAYDATA\n" +
                "DOC_PAYERSTATE\n" +
                "DOC_PAYNAME\n" +
                "DOC_QUICK\n" +
                "DOC_RESERVID\n" +
                "DOC_STATUS\n" +
                "DOC_SUBNOTES\n" +
                "DOC_SUM\n" +
                "DOC_SUM2\n" +
                "DOC_SUPPLEMENT\n" +
                "DOC_SUPPLIERSTATE\n" +
                "DOC_SWAPDEBIT\n" +
                "DOC_TAKEGIVE\n" +
                "DOC_TMPATTRS\n" +
                "DOC_TYPEK\n" +
                "DOC_USRDOCCODE\n" +
                "DOC_VALUEDATE\n" +
                "DOC_VALUEDATE2\n" +
                "DOC_WITHNONRESIDENTTAX\n" +
                "E_DOC\n" +
                "E_SIGN\n" +
                "E_SIGNDATE\n" +
                "EXE_ERRMSG\n" +
                "EXTERNALADDING\n" +
                "FINANCINGARTICLECODE\n" +
                "FINOPERCODE\n" +
                "FINRES_LEAVEOUTINCALC\n" +
                "FINRES_STARTDATE\n" +
                "FINRES_STOPDATE\n" +
                "FINRESTYPEID\n" +
                "FOOTER\n" +
                "HEAD\n" +
                "INN\n" +
                "INSIDERTYPE\n" +
                "ISEXTRACHARGE\n" +
                "ISMZ\n" +
                "ISMZ2\n" +
                "ISNOTTRANSFER\n" +
                "LBL_ELABORFEAPAYMENT\n" +
                "LBL_USERINCREPFORMS\n" +
                "NDS_RATE\n" +
                "NDS_SUM\n" +
                "NONPAYCRE\n" +
                "NONPAYDEB\n" +
                "NOTICE_NUM\n" +
                "NOTRESIDENT_ACCNUM\n" +
                "NOTRESIDENT_BANKNAME\n" +
                "OPERRATE\n" +
                "OPERRATE2\n" +
                "ORDERNUM\n" +
                "ORGDEPID\n" +
                "PAYER_ACCNUM\n" +
                "PAYER_BANK_CA\n" +
                "PAYER_BANKCORRNAME\n" +
                "PAYER_BANK_DCCODE\n" +
                "PAYER_BANKNAME\n" +
                "PAYER_BANK_REGREASONCODE\n" +
                "PAYER_BANKSTATE\n" +
                "PAYER_BIC\n" +
                "PAYER_CBS\n" +
                "PAYER_CORR_BANKNAME\n" +
                "PAYER_CORR_BIC\n" +
                "PAYER_NAME\n" +
                "PAYER_NR_ACCNUM\n" +
                "PAYER_NR_BANK_CA\n" +
                "PAYER_NR_BANKNAME\n" +
                "PAYER_NR_BIC\n" +
                "PAYER_NR_NAME\n" +
                "PAYER_NR_UNN\n" +
                "PAYER_REGREASONCODE\n" +
                "PAYMENT_CURRCODE\n" +
                "PAYMENTSIGN\n" +
                "PAYMENT_SUM\n" +
                "PAYMENTTYPE\n" +
                "PRGDOCSTYPEID\n" +
                "REMITTANCEEXPENSESCODE\n" +
                "REP_CODE\n" +
                "REP_CONTRACTORID\n" +
                "REP_CRECODE\n" +
                "REP_DEBCODE\n" +
                "REP_F0520CODES\n" +
                "REP_F1021CODE\n" +
                "REP_F1032CODES\n" +
                "REP_F1034CODE\n" +
                "REP_F2209OPERCODE\n" +
                "REV_INEQUREST\n" +
                "REV_INREST\n" +
                "REV_OUTEQUREST\n" +
                "REV_PRICE\n" +
                "ROLLOVER\n" +
                "SERTCOLLECTOR\n" +
                "STORN_NOTES\n" +
                "SUBCRE\n" +
                "SUBDEB\n" +
                "SUM_IN_WORDS\n" +
                "SVD_ORDERID\n" +
                "SYS_ARMCODE\n" +
                "TARIFFOVERDUEPAY\n" +
                "TAX_DIVPARCODE\n" +
                "TAX_DIVPARCODE2\n" +
                "TAX_PAYCODE\n" +
                "TAX_PAYCODE2\n" +
                "TELEX_KEY\n" +
                "TRANSFER_CURRCODE\n" +
                "TRANSFER_SUM\n" +
                "UB_ACCNUM\n" +
                "UB_BLANKNUM\n" +
                "UB_CORRACCNUM\n" +
                "UB_DATEOFF\n" +
                "UB_DATEON\n" +
                "UB_GROUP\n" +
                "UNK_REASON\n" +
                "USECURDATE\n" +
                "USR_ACNAME\n" +
                "USR_BOSSNAME\n" +
                "USR_EXECNAME\n" +
                "WORKPLACEID\n" +
                "DC_OP_50\n" +
                "DC_40E_TEXT\n" +
                "BLK_UNIT\n" +
                "ISTRANSFERREST\n" +
                "DOC_CASHIERID\n" +
                "DOC_ACCEPTCONTRACTID\n" +
                "DOC_EXECUTIVEDATE\n" +
                "DOC_EXECUTIVENAME\n" +
                "DOC_EXECUTIVENUM\n" +
                "DOC_FAILURENOTES\n" +
                "DOC_REPAYMENTDATE\n" +
                "MEMORABLECOIN\n" +
                "DC_FBANK_ACCNUM_54\n" +
                "DC_FBANK_FILIAL_57\n" +
                "DC_40B\n" +
                "DEBTTRANSFER\n" +
                "DC_OP_59\n" +
                "DC_SUM_4\n" +
                "DOC_KINDID\n" +
                "CONTRLAYOUT\n" +
                "DOC_WITHOUTCLEARING\n" +
                "DC_OP_50_COV\n" +
                "DC_OP_52_COV\n" +
                "DC_OP_56_COV\n" +
                "DC_OP_57_COV\n" +
                "DC_OP_59_COV\n" +
                "DC_TEXT_33B_COV\n" +
                "DC_TEXT_501_COV\n" +
                "DC_TEXT_502_COV\n" +
                "DC_TEXT_503_COV\n" +
                "DC_TEXT_504_COV\n" +
                "DC_TEXT_505_COV\n" +
                "DC_TEXT_521_COV\n" +
                "DC_TEXT_522_COV\n" +
                "DC_TEXT_523_COV\n" +
                "DC_TEXT_524_COV\n" +
                "DC_TEXT_525_COV\n" +
                "DC_TEXT_561_COV\n" +
                "DC_TEXT_562_COV\n" +
                "DC_TEXT_563_COV\n" +
                "DC_TEXT_564_COV\n" +
                "DC_TEXT_565_COV\n" +
                "DC_TEXT_571_COV\n" +
                "DC_TEXT_572_COV\n" +
                "DC_TEXT_573_COV\n" +
                "DC_TEXT_574_COV\n" +
                "DC_TEXT_575_COV\n" +
                "DC_TEXT_591_COV\n" +
                "DC_TEXT_592_COV\n" +
                "DC_TEXT_593_COV\n" +
                "DC_TEXT_594_COV\n" +
                "DC_TEXT_595_COV\n" +
                "DC_TEXT_701_COV\n" +
                "DC_TEXT_702_COV\n" +
                "DC_TEXT_703_COV\n" +
                "DC_TEXT_704_COV\n" +
                "DC_TEXT_721_COV\n" +
                "DC_TEXT_722_COV\n" +
                "DC_TEXT_723_COV\n" +
                "DC_TEXT_724_COV\n" +
                "DC_TEXT_725_COV\n" +
                "DC_TEXT_726_COV\n" +
                "DC_AUTOEXECUTE\n" +
                "PARENTAEDDOCID\n" +
                "DOC_OPERTYPE\n" +
                "DEPOSITOR\n" +
                "REALDATE\n" +
                "SUPPLEMENT_AEDDOCID\n" +
                "EFDOCALIAS\n" +
                "NONRESIDENTPAY\n" +
                "CFM\n" +
                "AEDDOCID\n" +
                "AEDPROT\n" +
                "SOURCE_AEDDOCID\n" +
                "SIQTIME\n" +
                "BENEFICIARY_NR_UNN\n" +
                "DOC_CASHOPER\n" +
                "ISNEEDAGREEMENT\n" +
                "COVER_AEDDOCID\n" +
                "RECALC_COMP302_APB\n" +
                "RECALC_COMP302_APB_RATEVALUE\n" +
                "DEALREGINFO\n" +
                "EXCEEDSLOT\n" +
                "RDCDOCNUM\n" +
                "CORRECTEDOPERDATE\n" +
                "CORRECTINGOPERDATE\n" +
                "DOC_PAYCASHTOOLS\n" +
                "ADDRATECASTINTDATE\n" +
                "PAYMENTKINDSREFID\n" +
                "PAYMENTMETHOD\n" +
                "EXCHANGEPAYERSTATEID\n" +
                "BRS_ACTIONNAME\n" +
                "BRS_ACTIONID\n" +
                "BMPCERTIFICATE_DATE\n" +
                "BMPCERTIFICATE_NUM\n" +
                "CLOSEACCOPER\n" +
                "DOC_CASHTRANSID\n" +
                "DOC_NOTCONFIRMED\n" +
                "DOC_SUMFULL\n" +
                "ISEARLYCOMPLETEREPAYMENT\n" +
                "CASHTURNCONTROL\n" +
                "DC_OP_13\n" +
                "DC_DATETIME_INDICATION\n" +
                "ISSHORT\n" +
                "APPLICATION_DOCUMENT\n" +
                "ANALYTIC_ACC\n" +
                "ANALYTIC_ACCCURR\n" +
                "DOC_CREATIONTYPE\n" +
                "APPFILENAME\n" +
                "ISRECALCLASTDATE\n" +
                "BOOKERDOCID\n" +
                "INCCREOPER\n" +
                "INCDEBOPER\n" +
                "XML_DOCUMENT\n" +
                "APPARCHFILEPATH\n" +
                "APPFILEPATH\n" +
                "SMALLWRITEOFF\n" +
                "POP_OLDDOCATTRS\n" +
                "PAYDOCKINDID\n" +
                "CERTIFICATE_PERSONALNAME\n" +
                "DELIVERY\n" +
                "PAYMENTBYDECREESIGN\n" +
                "FOREIGN_GRANT_ASSISTANCE\n" +
                "GRATUITOUS_HELP_CERT_DAT\n" +
                "GRATUITOUS_HELP_CERT_NUM\n" +
                "DOC_PAYK2IGNOREMT104\n" +
                "PACKAGE_ORDER_REF\n" +
                "PACKAGE_ORDER_AND_PP\n" +
                "ISCCSCHECK\n" +
                "ZASB_CORR_UNN\n" +
                "ZASB_CORR_BENEFICIARYUNN\n" +
                "DC_TEXT_59F\n" +
                "DC_TEXT_50F\n" +
                "DC_TEXT_CURRCONTROL\n" +
                "MANUAL_SEND_TO_EFDOCS\n" +
                "PAYMENT_NOTESCODE\n" +
                "DEPNUM\n" +
                "CASH_POOLING\n" +
                "BENEF_EMAIL\n" +
                "BENEF_FAX\n" +
                "BENEF_LANDLINE_PHONE\n" +
                "BENEF_MOBILE_PHONE\n" +
                "PAYER_EMAIL\n" +
                "PAYER_FAX\n" +
                "PAYER_LANDLINE_PHONE\n" +
                "PAYER_MOBILE_PHONE\n" +
                "PAYMENT_INDICATION\n" +
                "PARENTACTREFID\n" +
                "CORR2TYPECODE\n" +
                "ACTION_ID_RETAIL\n" +
                "ADDREGNUM\n" +
                "INSTRUCTIONID\n" +
                "MESSAGEDATE\n" +
                "MESSAGEID\n" +
                "REGULATORREPORT\n" +
                "TAXADDINFO\n" +
                "TAXSUM\n" +
                "ISLOCKOPER2209\n" +
                "LOCKOPER2209INFO\n" +
                "REF_CASH_LIST\n" +
                "REF_PAY_BINDING\n" +
                "ISPRINTSYSDATE\n" +
                "PROGRAMM_ISSUE_CREDIT\n" +
                "ISMAINCURRPAY\n" +
                "NOTCHECKACCREST\n" +
                "LOANACTREFID\n" +
                "BRSOPERTYPE\n" +
                "LOANENTITYID\n" +
                "CONTROLMARK\n" +
                "CORRECTIVEOPER\n" +
                "ADDR_FROM_CLIENT\n" +
                "BENEFICIARY_EWACCNUM\n" +
                "TECHZERO\n" +
                "NORESIDENTPAYMENTMARK\n" +
                "SETTLED\n" +
                "PAYER_EWACCNUM\n" +
                "UNCERTAINSUMSTATUS\n" +
                "PAYER_REPRESENTATIVE_NAME\n" +
                "PAYER_REPRESENTATIVE_UNN\n" +
                "PAYER_CLIENTOFBANK\n" +
                "ISCREDITFUNDS\n" +
                "ADMISSIONPDSUM\n" +
                "OFFER_REF\n" +
                "MT704DOCID\n" +
                "CALCSUM\n" +
                "DELAY\n" +
                "DC_TEXT_22B\n" +
                "DC_OP2_56\n" +
                "DC_FBANK_ACCNUM2_56\n" +
                "DC_FBANK_NAME2_56\n" +
                "DC_FBANK_SWIFT2_56\n" +
                "DC_OP3_56\n" +
                "DC_FBANK_ACCNUM3_56\n" +
                "DC_FBANK_NAME3_56\n" +
                "DC_FBANK_SWIFT3_56\n" +
                "DC_OP2_57\n" +
                "DC_FBANK_ACCNUM2_57\n" +
                "DC_FBANK_NAME2_57\n" +
                "DC_FBANK_SWIFT2_57\n" +
                "DC_OP3_57\n" +
                "DC_FBANK_ACCNUM3_57\n" +
                "DC_FBANK_NAME3_57\n" +
                "DC_FBANK_SWIFT3_57\n" +
                "TRANSFER_NOTESCODE\n" +
                "DOC_REFERENCE\n" +
                "TAX_PAYPERIODCODE\n" +
                "TAX_PAYPERIODSTARTDATE\n" +
                "TAX_PAYPERIODENDDATE\n" +
                "TAX_PAYYEARCODE\n" +
                "DC_CHECKPRIMARYATTRS\n" +
                "DOC_CNTRID\n" +
                "DOC_FROM_ETP\n" +
                "ERR_PACKAGE_LIST\n" +
                "DOC_CURRCODE2_1028\n" +
                "DOC_SUM2_1028\n" +
                "NOREGDEAL\n" +
                "BENEFICIARY_CERTIFICATE_AUTHOR\n" +
                "BENEFICIARY_CERTIFICATE_DATE\n" +
                "BENEFICIARY_CERTIFICATE_NUM\n" +
                "BENEFICIARY_CERTIFICATE_PERSON\n" +
                "BENEFICIARY_CERTIFICATE_SER\n" +
                "TRANSACTIONID_ERIP\n" +
                "DOCDEPID\n" +
                "DEPOSITPROLONGATION\n" +
                "VEDISRECALCLASTDATE\n" +
                "OPERDEBITCODE\n" +
                "REPAYMENTFROMLOCALBUDGET\n" +
                "USE_ESTABLISHED_RATE\n" +
                "DOC_SUM_FOR_OP\n" +
                "DC_49G\n" +
                "DC_49H\n" +
                "DC_ADDITIONALCURRCONTROL\n" +
                "CORPORATE_CARD_REF\n" +
                "ACC_LINK\n" +
                "EXSYSDOCID\n" +
                "LEGISLATIVEACTCODEID\n" +
                "DUS_58\n" +
                "PACKAGE_REESTR\n" +
                "PAYMENTCODE\n" +
                "REWARDCURRID\n" +
                "REWARDSUM\n" +
                "REWARDBANK\n" +
                "PAY_OBLOGATION_HOT_CASH_ORDER\n" +
                "DEALTYPE\n" +
                "ISTRAN_ACCNUM\n" +
                "SIGN_PERSON1\n" +
                "UNLOADING1028\n" +
                "CCS_COMMENT\n" +
                "DOC_ENTITYID\n" +
                "ISIBSALOPER\n" +
                "ACCRETIONPROBABILITY\n" +
                "DOC_PAYERACCOWNERSTATUS\n" +
                "IGNOREACCORDERLIST\n" +
                "PAYMENTBYDECREE\n" +
                "SCCHECKACCEPT\n" +
                "UBDEBTOBAL\n" +
                "UBPERCTOBAL\n" +
                "DOC_SIGNOFTRANSTOAISEMO\n" +
                "DC_TEXT_50\n" +
                "DC_RBBANK_ACCNUM\n" +
                "DC_FBANK_ACCNUM_51\n" +
                "DC_PAYSYS\n" +
                "PAYERTYPECODE\n" +
                "DEBTFORMATIONDATE\n" +
                "MCCCODE\n" +
                "DOC_SUM71F\n" +
                "DOC_SUM32A\n" +
                "DOC_CURRCODE71F\n" +
                "DOC_CURRCODE32A\n" +
                "OVERDUEDEBTCOMPENSATION\n" +
                "SYSTEMOPERCODE\n" +
                "CALCFROMDATE\n" +
                "CALCTODATE\n" +
                "OVEDUEDAYSCOUNT\n" +
                "VTBRECALC\n" +
                "CASH_IDOPER\n" +
                "CASH_REALDATETIME\n" +
                "USR_ACCRANK\n" +
                "ACCEPTPERIODCODE\n" +
                "DOC_CLEARINGREESTR\n" +
                "EXCHANGERATE\n" +
                "ISFORMATIONPACS008IBX\n" +
                "SETTLPAYINVOICEORDER\n" +
                "EXPORTFINANCINGSIGN\n" +
                "EXPORT_FINANCING_DEP_ID\n" +
                "FREE_DOC_REF\n" +
                "DC_SWIFTFORMAT\n" +
                "DEALRATE\n" +
                "DENOMINATEDOPERATION\n" +
                "OPERDEPID\n" +
                "DOC_NOTES5\n" +
                "DOC_SUM_VAL\n" +
                "DC_OP_25\n" +
                "DC_SWIFT_25\n" +
                "CORR_ACCNUMINCOME\n" +
                "UNDISPUTABLEWRITEOFF\n" +
                "EXECCONTRACTDATE\n" +
                "ISESF\n" +
                "SUBOPERNEGATIVERESTDATE\n" +
                "DC_PATTERNID\n" +
                "DC_COVERPATTERNID\n" +
                "ACCEPT_NUM\n" +
                "RECALL_REASON_CODE\n" +
                "EC_BASISDOCDATE\n" +
                "EC_BASISDOCNUM\n" +
                "DD_CLIENT_ACCNUM\n" +
                "DD_DOC_NOTES\n" +
                "AUTHAGENCYTYPEID\n" +
                "AUTHAGENCY_NAME\n" +
                "AUTHAGENCY_UNP\n" +
                "BENEFICIARYTYPEID\n" +
                "EMOSETTLEMENTFORMCODEID\n" +
                "LEGISLATIVEACTDATE\n" +
                "LEGISLATIVEACTNUM\n" +
                "OPERTYPECODEID\n" +
                "PAYTYPEID\n" +
                "RECOVERERCODEID\n" +
                "RECOVERERTYPEID\n" +
                "RECOVERER_BANKNAME\n" +
                "RECOVERER_MFO\n" +
                "RECOVERER_NAME\n" +
                "RECOVERER_UNP\n" +
                "PARTNERTRANCHESFEEPAYOFF\n" +
                "EXE_ANNULMSG\n" +
                "PREVIOUS_STATUS\n" +
                "PAIDOFF\n" +
                "DC_OP_82\n" +
                "DC_FBANK_ACCNUM_82\n" +
                "DC_FBANK_BIC_82\n" +
                "DC_FBANK_NAME_82\n" +
                "DC_FBANK_RKC_82\n" +
                "DC_FBANK_SWIFT_82\n" +
                "DC_FBANK_ADDR_82\n" +
                "DC_FBANK_INN_82\n" +
                "DC_OP_83\n" +
                "DC_FBANK_ACCNUM_83\n" +
                "DC_FBANK_BIC_83\n" +
                "DC_FBANK_NAME_83\n" +
                "DC_FBANK_RKC_83\n" +
                "DC_FBANK_SWIFT_83\n" +
                "DC_FBANK_ADDR_83\n" +
                "DC_FBANK_INN_83\n" +
                "DC_OP_87\n" +
                "DC_FBANK_ACCNUM_87\n" +
                "DC_FBANK_BIC_87\n" +
                "DC_FBANK_NAME_87\n" +
                "DC_FBANK_RKC_87\n" +
                "DC_FBANK_SWIFT_87\n" +
                "DC_FBANK_ADDR_87\n" +
                "DC_FBANK_INN_87\n" +
                "DC_OP1_53\n" +
                "DC_FBANK_LORO1_53\n" +
                "DC_FBANK_BIC1_53\n" +
                "DC_FBANK_NAME1_53\n" +
                "DC_FBANK_RKC1_53\n" +
                "DC_FBANK_SWIFT1_53\n" +
                "DC_FBANK_ADDR1_53\n" +
                "DC_FBANK_INN1_53\n" +
                "DC_FBANK_ADDR_53\n" +
                "DC_FBANK_INN_53\n" +
                "DC_FBANK_RKC_53\n" +
                "DC_FBANK_BIC_53\n" +
                "DC_FBANK_ADDR1_56\n" +
                "DC_FBANK_INN1_56\n" +
                "DC_FBANK_ADDR_56\n" +
                "DC_FBANK_INN_56\n" +
                "DC_FBANK_ADDR1_57\n" +
                "DC_FBANK_INN1_57\n" +
                "DC_FBANK_ADDR_57\n" +
                "DC_FBANK_INN_57\n" +
                "DC_FBANK_ADDR_58\n" +
                "DC_FBANK_ACCNUM_88\n" +
                "DC_FBANK_SWIFT_88\n" +
                "DC_FBANK_NAME_88\n" +
                "DC_TEXT_94A\n" +
                "DC_TEXT_17T\n" +
                "DC_TEXT_17U\n" +
                "DC_TEXT_17O\n" +
                "DC_TEXT_17A\n" +
                "DC_TEXT_14S\n" +
                "DC_TEXT_29\n" +
                "DC_OP_88\n" +
                "DC_TEXT_16A\n" +
                "PACKAGE_DOC_REF\n" +
                "ISFINAIDNBRB\n" +
                "ZVS_DOC_ID\n" +
                "DC_23B\n" +
                "DC_35G\n" +
                "DC_OP_41\n" +
                "DC_FBANK_SWIFT_41\n" +
                "DC_FBANK_NAME_41\n" +
                "DC_48B\n" +
                "DC_48D\n" +
                "DC_24E\n" +
                "DC_24E_TEXT\n" +
                "DC_24G\n" +
                "DC_24G_TEXT\n" +
                "DC_FBANK_SWIFT_50\n" +
                "DOC_REALLOCSUM\n" +
                "RECOVERER_STATE\n" +
                "DC_FBANK_KIO_56\n" +
                "DC_FBANK_KIO_57\n" +
                "DC_FBANK_KIO_58\n" +
                "PARAMS_STR_IN\n" +
                "DC_TRANSITIONALSTATUS\n" +
                "PRIMARYPAPERDOCEXISTS\n" +
                "PAYER_UNN\n" +
                "BENEFICIARY_UNN\n" +
                "INSURANCECOMPANY\n" +
                "INSURANCERULENUM\n" +
                "PSNUMBER\n" +
                "CDTRID\n" +
                "DBTRID\n" +
                "ALGFORMINGPROPSUM\n" +
                "ACC_LINK2\n" +
                "ETP_DOC_STATUS\n" +
                "ETP_OUTDOCSTATUSID\n" +
                "DOC_DATEKURS\n" +
                "DOC_NUM2\n" +
                "DOC_NUM3\n" +
                "DOC_INVOICEKINDREFID\n" +
                "EXCHANGE_PERIODCODE\n" +
                "CBS_NUM\n" +
                "BRANCH_NUM\n" +
                "DC_SWIFT_BLOCK_3_FIELD_113\n" +
                "DC_SWIFT_BLOCK_3_FIELD_108\n" +
                "DC_SWIFT_BLOCK_3_FIELD_119\n" +
                "DC_SWIFT_BLOCK_3_FIELD_111\n" +
                "DC_SWIFT_BLOCK_3_FIELD_121\n" +
                "DC_SWIFT_BLOCK_4\n" +
                "TRANSMISSIONCHANNEL\n" +
                "REISSUEDBYAPERSON\n" +
                "REMOVALFROMTHEREGISTER\n" +
                "ZASB_OPERCODE\n" +
                "APPROVEINPED\n" +
                "TRANSFERFROMBELANNUITET\n" +
                "DC_CODE_23X\n" +
                "DC_FILEREF_23X\n" +
                "DC_RBBANK_PARTYID\n" +
                "DC_22D\n" +
                "DC_23H\n" +
                "DC_45D\n" +
                "DOC_USEEXTATTRS\n" +
                "DC_21A\n" +
                "DC_73R_TEXT\n" +
                "DC_73S_TEXT\n" +
                "DC_CODE_73R\n" +
                "DC_CODE_73S\n" +
                "EXPRESS_LIST\n" +
                "FULLPERCSUM\n" +
                "ERIP_SUPPLIERCODE\n" +
                "SWSPAYEXCLUSION\n" +
                "IGNOREBANKRUPTCYCANCELLATION\n" +
                "AUTHAGENCYTYPECODE\n" +
                "BENEFICIARYTYPECODE\n" +
                "RECOVERERTYPECODE\n" +
                "DOC_CORRECSIGNCURRFORMACRO\n" +
                "ISCORPOCARDPAYMENT\n" +
                "ACC2ACC_ERRMSG\n" +
                "ACC2ACC_PREVOPERID\n" +
                "DC_CONFIRMSTATUSCODE\n" +
                "DC_REJECTREASONCODE\n" +
                "DC_DEFERREDPAYMENTREASONCODE\n" +
                "DC_FBANK_ADDR2_56\n" +
                "DC_FBANK_BIC2_56\n" +
                "DC_FBANK_INN2_56\n" +
                "DC_FBANK_RKC2_56\n" +
                "DC_FBANK_ADDR3_56\n" +
                "DC_FBANK_BIC3_56\n" +
                "DC_FBANK_INN3_56\n" +
                "DC_FBANK_RKC3_56\n" +
                "DC_FBANK_ADDR2_57\n" +
                "DC_FBANK_BIC2_57\n" +
                "DC_FBANK_INN2_57\n" +
                "DC_FBANK_RKC2_57\n" +
                "DC_FBANK_ADDR3_57\n" +
                "DC_FBANK_BIC3_57\n" +
                "DC_FBANK_INN3_57\n" +
                "DC_FBANK_RKC3_57\n" +
                "PARENTENTREFID\n" +
                "BRS_CONTRACTKIND\n" +
                "BRS_CONTRACTTERM\n" +
                "OPFID\n" +
                "OPFNAME\n" +
                "ACCORDERID\n" +
                "BENEF_COUNTRY_NAME\n" +
                "DOC_EXECUTIVEDOCKINDCODE\n" +
                "ACTUALCASHTRUSTACC\n" +
                "TRUSTOPERID\n" +
                "IS_AVANS\n" +
                "RATE_CODEID\n" +
                "RATE_CODE_SUM\n" +
                "RATE_PERIOD\n" +
                "ACTUAL_BENNAME\n" +
                "ACTUAL_BENTYPECODE\n" +
                "ACTUAL_BENUNP\n" +
                "ACTUAL_PAYERNAME\n" +
                "ACTUAL_PAYERTYPECODE\n" +
                "ACTUAL_PAYERUNP\n" +
                "LOOKUP_PUSH\n" +
                "ISCHECKCREDITCONTRACT\n" +
                "DC_CDTRCLRSYSCD\n" +
                "DC_INTRCLRSYSCD\n" +
                "DC_MSGID\n" +
                "DC_RBBANK_ADDR\n" +
                "DC_STTLMMTD\n" +
                "DC_TRANSID\n" +
                "MX_MSGID\n" +
                "DBO_USER_ID\n" +
                "DBO_SESSION_ID\n" +
                "ACTUAL_CERTIFICATE_TYPE\n" +
                "ACTUAL_CERTIFICATE_DATE\n" +
                "ACTUAL_CERTIFICATE_SER\n" +
                "ACTUAL_CERTIFICATE_NUM\n" +
                "ACTUAL_CERTIFICATE_AUTHORITY\n" +
                "ACTUAL_CERTIFICATE_PERSONALNUM\n" +
                "ACTUAL_PAYER_BANKSTATE\n" +
                "ACTUAL_PAYER_ADDIDENTDATA\n" +
                "ACTUAL_BEN_CERTIFICATE_TYPE\n" +
                "ACTUAL_BEN_CERTIFICATE_DATE\n" +
                "ACTUAL_BEN_CERTIFICATE_SER\n" +
                "ACTUAL_BEN_CERTIFICATE_NUM\n" +
                "ACTUAL_BEN_CERTIFICATE_AUTHOR\n" +
                "ACTUAL_BEN_CERTIFICATE_PERSON\n" +
                "ACTUAL_BEN_BANKSTATE\n" +
                "ACTUAL_BEN_ADDIDENTDATA\n" +
                "PAYER_ADDIDENTDATA\n" +
                "ACTUAL_PAYERSTATE\n" +
                "BENEFICIARY_CERTIFICATE_TYPE\n" +
                "BENEFICIARY_ADDIDENTDATA\n" +
                "ACTUAL_BENSTATE\n" +
                "ACTUAL_CERTIFICATE_PERSON\n" +
                "ACTUAL_CERTIFICATE_AUTHOR\n" +
                "MX_CREDTM\n" +
                "MX_END2ENDID\n" +
                "ADJUSTPERCDELTAROUND\n";

        // Разбиваем строку на массив, используя символ переноса строки в качестве разделителя
        String[] elements = input.split("\\n");

        // Пример использования массива:
        StringBuilder output = new StringBuilder("(");
        for (String element : elements) {
            output.append("\"").append(element).append("\", ");
        }
        output.delete(output.length() - 2, output.length()); // Удаляем лишнюю запятую и пробел в конце
        output.append(")");

        // Выводим полученную строку
        System.out.println(output.toString());
    }
}
