package com.euthpic.product.utils;

import com.euthpic.product.vo.ResultVo;

public class ResultVoUtil {
    public static ResultVo success(Object object){
        ResultVo resultVo=new ResultVo();
        resultVo.setData(object);
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        return resultVo;
    }
}
