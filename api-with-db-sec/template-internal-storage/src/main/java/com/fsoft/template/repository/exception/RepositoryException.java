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
