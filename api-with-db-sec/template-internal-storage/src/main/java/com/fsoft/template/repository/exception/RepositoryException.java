/***************************************************************************
 * Copyright 2016 by fsoft - All rights reserved.                *    
 **************************************************************************/
package com.fsoft.template.repository.exception;

import com.fsoft.template.exception.CommonException;

/**
 *  Author : Nhu Dinh Thuan
 *          Email:nhudinhthuan@gmail.com
 * Nov 1, 2017
 */
public class RepositoryException extends CommonException {
  
  public static final int DUPLICATED_ERROR = 32;

  public static final String DUPLICATED_ERROR_DESCRIPTION = "Duplicated Data!";
  
  public static final int NOT_EXIST_ERROR = 33;

  public static final String NOT_EXIST_ERROR_DESCRIPTION = "Not Exist Data!";
  
  public static final int LOGIN_FAILURED_ERROR = 34;

  public static final String LOGIN_FAILURED_ERROR_DESCRIPTION = "Not Exist Data!";
  
  
  public static final int ORDBSCPRC_ude_err_prd_cpn_cst_d_info = 35;
  public static final String ORDBSCPRC_ude_err_prd_cpn_cst_d_info_DESCRIPTION = "ord.warning.047";
  public static final String ORDBSCPRC_ude_err_prd_cpn_cst_d_info_ARGUMENTS = "";
  
  public static final int ORDBSCPRC_ude_err_insert_ord_ord_bsc_m = 36;
  public static final String ORDBSCPRC_ude_err_insert_ord_ord_bsc_m_DESCRIPTION = "ord.warning.010";
  public static final String ORDBSCPRC_ude_err_insert_ord_ord_bsc_m_ARGUMENTS = "";
  
  public static final int ORDBSCPRC_ude_err_amt_pn_ap_cnt = 37;
  public static final String ORDBSCPRC_ude_err_amt_pn_ap_cnt_DESCRIPTION = "ord.warning.172";
  public static final String ORDBSCPRC_ude_err_amt_pn_ap_cnt_ARGUMENTS = "";
  
  public static final int ORDBSCPRC_ude_err_prd_pn_ap_cnt = 38;
  public static final String ORDBSCPRC_ude_err_prd_pn_ap_cnt_DESCRIPTION = "ord.warning.173";
  public static final String ORDBSCPRC_ude_err_prd_pn_ap_cnt_ARGUMENTS = "";
  
  public static final int ORDBSCPRC_ude_err_dsn_ap_cnt = 39;
  public static final String ORDBSCPRC_ude_err_dsn_ap_cnt_DESCRIPTION = "ord.warning.174";
  public static final String ORDBSCPRC_ude_err_dsn_ap_cnt_ARGUMENTS = "";

  private static final long serialVersionUID = 8300417997332022872L;

  public RepositoryException(int code) {
    super(code);
  }

  public RepositoryException(int code, String message) {
    super(code, message);
  }

  public RepositoryException(int code, Object data, String message) {
    super(code, data, message);
  }

}
