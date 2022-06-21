package com.maloure.nowcoder.community.controller;

import com.maloure.nowcoder.community.entity.DiscussPost;
import com.maloure.nowcoder.community.entity.Page;
import com.maloure.nowcoder.community.entity.User;
import com.maloure.nowcoder.community.mapper.DiscussPostMapper;
import com.maloure.nowcoder.community.mapper.UserMapper;
import com.maloure.nowcoder.community.service.IDiscussPostService;
import com.maloure.nowcoder.community.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class HomeController {

    @Autowired
    private IDiscussPostService discussPostService;

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String getIndexPage(Model model, Page page){

        /*
        方法调用之前，springmvc会直接实例化model和page,并将pageZ注入到model
         */
        page.setRows(discussPostService.selectDiscussPostRows(0));
        page.setPath("/index");
        List<DiscussPost> discussPosts = discussPostService.selectDiscussPosts(0, page.getOffset(), page.getLimit());

        List<Map<String,Object>> list = new ArrayList<>();
        for (DiscussPost discussPost : discussPosts) {
            Map<String,Object> map = new HashMap<>();
            map.put("post",discussPost);
            User user = userService.selectById(discussPost.getUserId());

            map.put("user",user);

            list.add(map);

        }

        model.addAttribute("discussPosts",list);
        return "index";
    }

}
