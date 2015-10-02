package com.brotherjing.aademo;

import com.brotherjing.aademo.beans.Word;
import com.brotherjing.aademo.beans.WordResponse;

import org.androidannotations.annotations.rest.Accept;
import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Rest;
import org.androidannotations.api.rest.MediaType;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

/**
 * Created by Brotherjing on 2015/10/3.
 */

@Rest(rootUrl = "https://api.shanbay.com",converters={GsonHttpMessageConverter.class})
public interface RESTClient {

    @Get("/bdc/search?word={word}")
    @Accept(MediaType.APPLICATION_JSON)
    WordResponse getWord(String word);
}

