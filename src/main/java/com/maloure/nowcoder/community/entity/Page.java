package com.maloure.nowcoder.community.entity;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/***
 * 封装分页相关的组件
 */
@Data
@Validated
public class Page {

    @Min(1)
    private int current = 1;

    @Max(100)
    @Min(1)
    private int limit = 10;

    @Min(0)
    private int rows;

    private String path;

    public void setCurrent(int current) {
        if(current > 0){
            this.current = current;
        }

    }

    public void setLimit(int limit) {
        if(limit >=1 && limit <= 10){
            this.limit = limit;
        }

    }

    public void setRows(int rows) {
        if(rows>0){
            this.rows = rows;
        }
    }

    public int getOffset(){
        return (current-1)*limit;
    }

    public int getTotal(){
        return rows % limit == 0 ? rows / limit : rows / limit + 1;
    }

    /**
     * 获取起止页码,2 + 3
     * @return
     */
    public int getFrom(){
        return current - 2 > 1 ? current -2 : 1;
    }

    public int getTo(){
        return current + 2 <= this.getTotal() ? current+2 : this.getTotal();
    }


}