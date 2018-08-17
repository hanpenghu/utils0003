package com.hanhan.utils0002.controller;

import hanhan.p;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Created by Administrator on 2018/6/1.
 */
@Controller
@CrossOrigin
public class 测试下载 {


    @RequestMapping(value="/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request,
                                           @RequestParam(name="filename",required=false) String filename,
                                           Model model)throws Exception {
        p.p2(filename);

        //下载文件路径
//        String path = request.getServletContext().getRealPath("/images/");
        File file = new File("E:\\testExcel.xls");
        HttpHeaders headers = new HttpHeaders();
        //下载显示的文件名，解决中文名称乱码问题
//        String downloadFielName = new String(filename.getBytes("UTF-8"),"iso-8859-1");
        //通知浏览器以attachment（下载方式）打开
        String s="打样下载"+p.timeAndRandom0_999NoHead_1()+".xls";
        headers.setContentDispositionFormData("attachment", new String(s.getBytes("UTF-8"),"iso-8859-1"));
        //application/octet-stream ： 二进制流数据（最常见的文件下载）。
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
    }




    @RequestMapping(value="x",method=RequestMethod.GET)
    public @ResponseBody  String f(){
        return String.valueOf(p.orderRandom999());
    }


}
