package com.shangguan.Mybatis.mapper;
import com.shangguan.Mybatis.beans.School;
import java.util.List;
public interface SchoolMapper {
    List<School> queryAll();
    School queryById(int id);
    int addSchool(School school);
    int updateSchool(School school);
    int deleteSchool(School school);
    List<School> queryLikeName(String name);

}
