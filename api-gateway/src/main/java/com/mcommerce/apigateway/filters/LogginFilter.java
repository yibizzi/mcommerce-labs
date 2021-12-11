package com.mcommerce.apigateway.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class LogginFilter implements GlobalFilter {
    final Logger logger =
            LoggerFactory.getLogger(LogginFilter.class);
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        logger.info("Une requête reçue sur: " + exchange.getRequest().getURI());
        return chain.filter(exchange);
    }
}
