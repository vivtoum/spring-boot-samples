package com.funtl.oauth2.resource.controller;

import com.funtl.oauth2.resource.domain.TbContent;
import com.funtl.oauth2.resource.dto.ResponseResult;
import com.funtl.oauth2.resource.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TbContentController {

    @Autowired
    private TbContentService tbContentService;

    /**
     * 获取全部资源
     *
     * @return
     */
    @GetMapping("/")
    public ResponseResult<List<TbContent>> selectAll() {
        return new ResponseResult<>(Integer.valueOf(HttpStatus.OK.value()), HttpStatus.OK.toString(), tbContentService.selectAll());
    }

    /**
     * 获取资源详情
     *
     * @param id
     * @return
     */
    @GetMapping("/view/{id}")
    public ResponseResult<TbContent> getById(@PathVariable Long id) {
        return new ResponseResult<>(Integer.valueOf(HttpStatus.OK.value()), HttpStatus.OK.toString(), tbContentService.getById(id));
    }

    /**
     * 新增资源
     *
     * @param tbContent
     * @return
     */
    @PostMapping("/insert")
    public ResponseResult insert(@RequestBody TbContent tbContent) {
        TbContent content = tbContentService.insert(tbContent);
        if (content.getId() != 0 || content.getId() != null) {
            return new ResponseResult<TbContent>(Integer.valueOf(HttpStatus.OK.value()), HttpStatus.OK.toString(), content);
        } else {
            return new ResponseResult<>(Integer.valueOf(HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST.toString());
        }
    }

    /**
     * 更新资源
     *
     * @param tbContent
     * @return
     */
    @PutMapping("/update")
    public ResponseResult update(@RequestBody TbContent tbContent) {
        TbContent content = tbContentService.update(tbContent);

        if (content.getId() != 0 || content.getId() != null) {
            return new ResponseResult<TbContent>(Integer.valueOf(HttpStatus.OK.value()), HttpStatus.OK.toString(), content);
        } else {
            return new ResponseResult<>(Integer.valueOf(HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST.toString());
        }
    }

    /**
     * 删除资源
     *
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public ResponseResult delete(@PathVariable Long id) {
        tbContentService.delete(id);
        return new ResponseResult<>(Integer.valueOf(HttpStatus.OK.value()), HttpStatus.OK.toString(), "ok");
    }
}
