package com.brotherjing.aademo.beans;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Brotherjing on 2015/10/3.
 */
public class WordResponse {

    @SerializedName("data")
    Word word;

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

}
