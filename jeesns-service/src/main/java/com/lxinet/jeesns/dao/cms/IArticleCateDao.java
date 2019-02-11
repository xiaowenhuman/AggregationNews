package com.lxinet.jeesns.dao.cms;

import com.lxinet.jeesns.core.dao.BaseMapper;
import com.lxinet.jeesns.model.cms.ArticleCate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 文章栏目DAO接口
 * Created by Lina.
 */
public interface IArticleCateDao extends BaseMapper<ArticleCate> {

    /**
     * 获取栏目
     * @return
     */
    List<ArticleCate> list();

    /**
     * 通过父类ID获取子类列表
     * @param fid
     * @return
     */
    List<ArticleCate> findListByFid(@Param("fid") int fid);

}