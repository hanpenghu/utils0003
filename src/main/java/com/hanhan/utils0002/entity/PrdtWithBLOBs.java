package com.hanhan.utils0002.entity;

public class PrdtWithBLOBs extends Prdt {
    private String spc;

    private String rem;

    private byte[] pic;

    private byte[] smallpic;

    private byte[] upDd;

    private String remWeb;

    private String tplRem;

    private String spcPy;

    private byte[] remWebM;

    public String getSpc() {
        return spc;
    }

    public void setSpc(String spc) {
        this.spc = spc == null ? null : spc.trim();
    }

    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem == null ? null : rem.trim();
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public byte[] getSmallpic() {
        return smallpic;
    }

    public void setSmallpic(byte[] smallpic) {
        this.smallpic = smallpic;
    }

    public byte[] getUpDd() {
        return upDd;
    }

    public void setUpDd(byte[] upDd) {
        this.upDd = upDd;
    }

    public String getRemWeb() {
        return remWeb;
    }

    public void setRemWeb(String remWeb) {
        this.remWeb = remWeb == null ? null : remWeb.trim();
    }

    public String getTplRem() {
        return tplRem;
    }

    public void setTplRem(String tplRem) {
        this.tplRem = tplRem == null ? null : tplRem.trim();
    }

    public String getSpcPy() {
        return spcPy;
    }

    public void setSpcPy(String spcPy) {
        this.spcPy = spcPy == null ? null : spcPy.trim();
    }

    public byte[] getRemWebM() {
        return remWebM;
    }

    public void setRemWebM(byte[] remWebM) {
        this.remWebM = remWebM;
    }
}