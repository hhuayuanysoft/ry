package com.ruoyi.yuangong.controller;


import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 代码生成 操作处理
 *
 * @author ruoyi
 */
@Api("员工")
@RestController
@RequestMapping("/yuan-gong")
public class yuangongController extends BaseController {

    /**
     * 查询代码生成列表
     */
//    @PreAuthorize("@ss.hasPermi('tool:gen:list')")
    @GetMapping("/list")
    @ApiOperation("list")
    public TableDataInfo genList() {
        startPage();
        List list = new ArrayList<>();
        return getDataTable(list);
    }


}