package ru.ivliev.aliceskillravenmunir.dto;

public class AliceResponse {
    private String text;

    public AliceResponse(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
