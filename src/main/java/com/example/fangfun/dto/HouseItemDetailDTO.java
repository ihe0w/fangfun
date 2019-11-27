package com.example.fangfun.dto;


import com.example.fangfun.model.House;
import com.example.fangfun.model.User;

public class HouseItemDetailDTO extends HouseItemDTO {
    //todo 当时为了查询效率，我按照城市来分表，可是又要找到一个用户有的所有的house，反倒造成了麻烦
    // 按城市分表绝对是愚蠢的做法，性能提升不了太多，反倒会与业务高度相关，而优化的方法千千万万，何必用这个呢？

    private String houseDesc;
    private String img;
    private String video;
    private String phone;
    private String email;

    public String getHouseDesc() {
        return houseDesc;
    }

    public void setHouseDesc(String houseDesc) {
        this.houseDesc = houseDesc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
