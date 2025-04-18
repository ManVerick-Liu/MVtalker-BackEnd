
package com.mvtalker.utilities.entity.community.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mvtalker.utilities.common.LongToStringSerializer;
import com.mvtalker.utilities.common.StringToLongDeserializer;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
public class ChatChannelDTO
{
    @JsonDeserialize(using = StringToLongDeserializer.class)
    @JsonSerialize(using = LongToStringSerializer.class)
    private Long chatChannelId;
    @JsonDeserialize(using = StringToLongDeserializer.class)
    @JsonSerialize(using = LongToStringSerializer.class)
    private Long communityId;
    private String name;
    private Integer capacity;

    public ChatChannelDTO(Long chatChannelId, Long communityId, String name, Integer capacity)
    {
        this.chatChannelId = chatChannelId;
        this.communityId = communityId;
        this.name = name;
        this.capacity = capacity;
    }
    public ChatChannelDTO()
    {
        // 在Feign远程调用中，如果响应数据没有无参构造函数，则无法正常序列化，会报空指针异常
    }
}