select 
OR_PK orPk,
PA_ID paId,
EN_CNT enCnt,
--PA_NM paNm,
EN_PK enPk,
OR_PRES_PK orPresPk,
SV_CD svCd,
SV_NM svNm,
OR_STA_CD orStaCd,
OR_STA_NM orStaNm,
LONG_OR_F longOrF,
LONG_OR_NM longOrNm,
OR_TP_CD orTpCd,
OR_TP_NM orTpNm,
FREQ_CD freqCd,
FREQ_NM freqNm,
ROUTE_CD routeCd,
ROUTE_NM routeNm,
SPEC spec,
DOSAGE dosage,
DOSAGE_UNIT_NM dosageUnitNm,
AMOUNT amount,
TAKE_AMOUNT takeAmount,
TAKE_AMOUNT_UNIT_NM	takeAmountUnitNm,
CRT_DOSAGE crtDosage,
BOIL_DOSAGE boilDosage,
BOIL_TP_NM boilTpNm,
--INSRU_GRD_CD insruGrdCd,
--INSRU_GRD_NM insruGrdNm,
SELF_F selfF,
SELF_NM selfNm,
INDICATION_F indicationF,
INDICATION_NM indicationNm,
PREVENT_F preventF,
PREVENT_NM preventNm,
SKIN_TEST_F skinTestF,
SKIN_TEST_NM skinTestNm,
IN_HOSP_F inHospF,
IN_HOSP_NM inHospNm,
OR_NOTE_NM orNoteNm,
PAR_OR_PK parOrPk,
SORT_NO sortNo,
OR_STD_TIME orStdTime,
OR_STP_TIME orStpTime,
OR_CRT_DCT_CD orCrtDctCd,
OR_CRT_DCT_NM orCrtDctNm,
OR_CRT_DEPT_CD orCrtDeptCd,
OR_CRT_DEPT_NM orCrtDeptNm
from VW_OR_ZY o
where 
PA_ID = /*patient_id*/1
and EN_CNT =  /*times*/4
/*%if longOrF != null && longOrF != ""*/
  and LONG_OR_F = /* longOrF */'1'
/*%end */
/*%if orTpNm != null && orTpNm != ""*/
  and OR_TP_NM = /* orTpNm */'01'
/*%end */
/*%if svNm != null && svNm != ""*/
  and SV_NM like /* @contain(svNm) */'%X%' --医嘱名称
/*%end */
and OR_TP_CD <> 'NV' 
order by  CONVERT(varchar(100),  o.OR_STP_TIME, 23)   DESC 
, o.OR_TP_CD, o.OR_TP_NM desc ,o.OR_PRES_PK,o.SORT_NO