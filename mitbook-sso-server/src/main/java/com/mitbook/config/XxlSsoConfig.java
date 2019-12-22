package com.mitbook.config;
import com.mitbook.store.SsoLoginStore;
import com.mitbook.util.JedisUtil;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
/**
 * @author pengzhengfa
 */
@Configuration
public class XxlSsoConfig implements InitializingBean, DisposableBean {

    @Value("${mitbook.sso.redis.address}")
    private String redisAddress;

    @Value("${mitbok.sso.redis.expire.minite}")
    private int redisExpireMinite;

    @Value("${mitbook.sso.redis.password}")
    private  String redisPassword;

    @Override
    public void afterPropertiesSet() throws Exception {
        SsoLoginStore.setRedisExpireMinite(redisExpireMinite);
        JedisUtil.init(redisAddress,redisPassword);
    }

    @Override
    public void destroy() throws Exception {
        JedisUtil.close();
    }

}
