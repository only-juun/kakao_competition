package welcome.travel.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig {

    @Value("${server.ip}")
    private String SERVER_IP;

    private static final String LOCAL_APP_PORT_3000 = "http://localhost:3000";
    private static final String LOCAL_APP_PORT_8080 = "http://localhost:8080";

    private final JwtTokenProvider jwtTokenProvider;

    private String getServerUrl(String port) {
        return "http://" + SERVER_IP + ":" + port;
    }

    private CorsConfiguration getCorsConfiguration() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(List.of(
                LOCAL_APP_PORT_3000,
                LOCAL_APP_PORT_8080,
                getServerUrl("3000"),
                getServerUrl("8080")
        ));
        configuration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH"));
        configuration.setAllowedHeaders(List.of("*"));
        return configuration;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .cors(cors -> cors.configurationSource(request -> getCorsConfiguration()))
                .csrf(AbstractHttpConfigurer::disable)
                .addFilterBefore(new JwtAuthenticationFilter(jwtTokenProvider), UsernamePasswordAuthenticationFilter.class)
                .authorizeRequests()
                .requestMatchers("/login/oauth2/callback/kakao", "/swagger-ui/**", "/v3/api-docs/**").permitAll()
                .anyRequest().authenticated();

        return http.build();
    }
}