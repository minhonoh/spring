package com.spring.common.exception;

import com.spring.common.constant.ICodeEnum;

public class BizException extends BaseException{

	private static final long serialVersionUID = -6267254362758500366L;

	public BizException(String message) {
		super(message);
	}
	
	public BizException(String code, String message) {
		super(code, message);
	}
	
	public BizException(ICodeEnum codeEnum) {
		super(codeEnum.getCode(), codeEnum.getDesc());
	}

}
