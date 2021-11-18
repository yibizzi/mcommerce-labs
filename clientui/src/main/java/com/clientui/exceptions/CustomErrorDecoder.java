package com.clientui.exceptions;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultErrorDecoder = new ErrorDecoder.Default();

    @Override
    public Exception decode(String s, Response response) {

        if(response.status() == 400){
            return new ProductNotFoundException("Aucun produit n'est trouvé!");
        }

        return defaultErrorDecoder.decode(s, response);
    }
}
