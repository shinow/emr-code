select
  MES_ID,
  SEND_USER_ID,
  SEND_DATE,
  RECEIVE_USER_ID,
  RECEIVE_DATE,
  PORTAL_CD,
  MENU_CD,
  CONTENT,
  READ_FLAG,
  MES_LEVEL,
  MES_TYPE,
  MEMO,
  SORT_NO,
  SPELL_NO,
  WUBI_NO,
  UPD_CNT,
  CRT_TIME,
  CRT_USER_ID,
  CRT_DEPT_CD,
  LAST_UPD_TIME,
  LAST_UPD_DEPT_CD,
  LAST_UPD_USER_ID,
  DEL_F,
  TASK_ID
from
  XAP_MESSAGE
where
  MES_ID = /* mesId */'a'
and del_f = 0
