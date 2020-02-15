package com.example.admin.broadcastbesttest;

/**
 * Created by admin on 2020/2/9.
 */

public class news {
    private String title;
    private  String content;
    private int imag;
    public String gettile()
    {
        return title;
    }
    public String getcontent(){
        return  content;
    }
    public void setTitle(String titlename)
    {
        title=titlename;
    }
    public void  setContent(String contenname)
    {
        content=contenname;
    }
    public int getImag()
    {
        return imag;
    }
    public void setImag(int imag1)
    {
        imag=imag1;
    }
}
