#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.test.dal;

import ${package}.dal.dao.user.UserMapper;
import ${package}.test.BaseTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by James
 * on 16/8/16.
 * Description:
 */
public class UserDaoTest extends BaseTest {
    private final static Logger log = LoggerFactory.getLogger(UserDaoTest.class);
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        log.info("{}", userMapper.selectByPrimaryKey(1).getUserName());
    }
}
