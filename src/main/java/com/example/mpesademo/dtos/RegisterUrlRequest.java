package com.example.mpesademo.dtos;

public record RegisterUrlRequest(int ShortCode,

                                 String ResponseType,

                                 String ConfirmationURL,

                                 String ValidationURL) {
}
