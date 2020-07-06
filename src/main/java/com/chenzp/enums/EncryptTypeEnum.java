package com.chenzp.enums;

public enum EncryptTypeEnum {
    /*** RSA 加密 */
    RSA("RSA"),

    /*** AES加密，将AES对称串做RSA加密 */
    AES_RSA("AES_RSA");

    private final String value;

    private EncryptTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
