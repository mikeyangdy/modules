package com.ydy.jwt.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.ydy.jwt.entity.UserInfo;

import java.util.UUID;

public class JwtUtil {

    /**
     * token私钥
     */
    private static final String TOKEN_SECRET = "lNpfq6zpbyTzyKjpDgPj4ijFZnyf9JlI";


    public static String sign(UserInfo user) {
//        String token="";
//        token= JWT.create().withAudience(user.getId())
//                .sign(Algorithm.HMAC256(user.getPassword()));
//        return token;

        Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);

        return JWT.create()
                .withClaim("username",user.getUsername())
                .withClaim("password",user.getPassword())
                .sign(algorithm);
    }

    public static boolean verity(String token){
        try {
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);

            String username = jwt.getClaim("username").asString();
            String password = jwt.getClaim("password").asString();
            System.out.println(username+"\t"+password);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        //userInfo.setId(UUID.randomUUID().toString().replaceAll("-",""));
        userInfo.setUsername("admin");
        userInfo.setPassword("123456");

        String token = sign(userInfo);
        System.out.println(token);

        System.out.println(verity(token));
        //System.out.println(verity("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJwYXNzd29yZCI6IjEyMzQ1NiIsInVzZXJuYW1lIjoiYWRtaW4ifQ.qzM8SVJE7npwVuHwP9c_4d6_D4bLp-pDJSE2oXH3Olg"));
    }
}
