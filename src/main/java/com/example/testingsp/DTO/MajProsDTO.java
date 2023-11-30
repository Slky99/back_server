package com.example.testingsp.DTO;

public class MajProsDTO {

    private String majcv ;

    private Long count ;

    public MajProsDTO(String majcv, Long count) {
        this.majcv = majcv;
        this.count = count;
    }

    public String getMajcv() {
        return majcv;
    }

    public void setMajcv(String majcv) {
        this.majcv = majcv;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
