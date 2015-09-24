package com.app.newput.mapper.group;

import com.app.newput.controller.group.Testing;
import com.app.newput.controller.group.TestingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testing
     *
     * @mbggenerated Thu Sep 24 09:18:32 IST 2015
     */
    int countByExample(TestingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testing
     *
     * @mbggenerated Thu Sep 24 09:18:32 IST 2015
     */
    int deleteByExample(TestingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testing
     *
     * @mbggenerated Thu Sep 24 09:18:32 IST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testing
     *
     * @mbggenerated Thu Sep 24 09:18:32 IST 2015
     */
    int insert(Testing record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testing
     *
     * @mbggenerated Thu Sep 24 09:18:32 IST 2015
     */
    int insertSelective(Testing record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testing
     *
     * @mbggenerated Thu Sep 24 09:18:32 IST 2015
     */
    List<Testing> selectByExample(TestingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testing
     *
     * @mbggenerated Thu Sep 24 09:18:32 IST 2015
     */
    Testing selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testing
     *
     * @mbggenerated Thu Sep 24 09:18:32 IST 2015
     */
    int updateByExampleSelective(@Param("record") Testing record, @Param("example") TestingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testing
     *
     * @mbggenerated Thu Sep 24 09:18:32 IST 2015
     */
    int updateByExample(@Param("record") Testing record, @Param("example") TestingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testing
     *
     * @mbggenerated Thu Sep 24 09:18:32 IST 2015
     */
    int updateByPrimaryKeySelective(Testing record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testing
     *
     * @mbggenerated Thu Sep 24 09:18:32 IST 2015
     */
    int updateByPrimaryKey(Testing record);
}