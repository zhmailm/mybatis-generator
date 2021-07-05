package com.zhm.mapper;

import com.zhm.model.student;
import com.zhm.model.studentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface studentMapper {
    long countByExample(studentCriteria example);

    int deleteByExample(studentCriteria example);

    int deleteByPrimaryKey(Integer sid);

    int insert(student record);

    int insertSelective(student record);

    List<student> selectByExample(studentCriteria example);

    student selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") student record, @Param("example") studentCriteria example);

    int updateByExample(@Param("record") student record, @Param("example") studentCriteria example);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);
}