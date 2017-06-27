package com.feng.bootcloud.model.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.feng.bootcloud.common.controller.BaseController;
import com.feng.bootcloud.model.dao.NoticeDao;

/**
 * 总览信息
 *
 * @author fengshuonan
 * @Date 2017年3月4日23:05:54
 */
@Controller
@RequestMapping("/blackboard")
public class BlackboardController extends BaseController {

    @Autowired
    NoticeDao noticeDao;

    /**
     * 跳转到黑板
     */
    @RequestMapping("")
    public String blackboard(Model model) {
        List<Map<String, Object>> notices = noticeDao.list(null);
        model.addAttribute("noticeList",notices);
        return "/blackboard.html";
    }
}
