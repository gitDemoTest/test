package com.weixin.platform.web.test;

import com.weixin.platform.dao.CommissionDAO;
import com.weixin.platform.domain.CommissionModel;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * ━━━━━━神兽出没━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃神兽保佑, 永无BUG!
 * 　　　　┃　　　┃Code is far away from bug with the animal protecting
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━感觉萌萌哒━━━━━━
 * <p>
 * Date: 2016-03-06
 * Time: 上午11:26
 *
 * @author siyouqiang@meituan.com
 */
public class CommissionDAOTest extends AbstractJunitTest {

    @Resource
    private CommissionDAO commissionDAO;

    @Test
    public void testInsert() {
        CommissionModel commissionModel = new CommissionModel();
        commissionModel.setPlatform("小马金融");
        commissionModel.setSubPrice(12);
        int res = commissionDAO.insert(commissionModel);
        System.out.println(res);
    }

}
