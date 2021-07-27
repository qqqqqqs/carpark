package com.carpark.utils;

public class ResultUtil {
    public static void main(String[] args) {

    }

//    public ResultUtil selLogList(Integer page, Integer limit,UserSearch search) {
//        PageHelper.startPage(page, limit);
//        TbLogExample example=new TbLogExample();
//        //设置按创建时间降序排序
//        example.setOrderByClause("id DESC");
//        IndexviewExample.Criteria criteria = example.createCriteria();
//
//        if(search.getOperation()!=null&&!"".equals(search.getOperation())){
//            criteria.andOperationLike("%"+search.getOperation()+"%");
//        }
//
//        if(search.getCreateTimeStart()!=null&&!"".equals(search.getCreateTimeStart())){
//            criteria.andCreateTimeGreaterThanOrEqualTo(MyUtil.getDateByString(search.getCreateTimeStart()));
//        }
//        if(search.getCreateTimeEnd()!=null&&!"".equals(search.getCreateTimeEnd())){
//            criteria.andCreateTimeLessThanOrEqualTo(MyUtil.getDateByString(search.getCreateTimeEnd()));
//        }
//
//        List<TbLog> logs = tbLogMapper.selectByExample(example);
//        PageInfo<TbLog> pageInfo = new PageInfo<TbLog>(logs);
//        ResultUtil resultUtil = new ResultUtil();
//        resultUtil.setCode(0);
//        resultUtil.setCount(pageInfo.getTotal());
//        resultUtil.setData(pageInfo.getList());
//        return resultUtil;
//    }
}
