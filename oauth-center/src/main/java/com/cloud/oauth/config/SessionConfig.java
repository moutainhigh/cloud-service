package com.cloud.oauth.config;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 开启session共享
 * 
 * @author nl
 *
 */
@EnableRedisHttpSession
public class SessionConfig {

}