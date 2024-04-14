package cn.edu.hit.lab3.mapper;

import cn.edu.hit.lab3.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from student order by sid")
    List<Student> findAll();

}
