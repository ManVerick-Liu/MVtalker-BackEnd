package com.mvtalker.utilities.entity.community.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mvtalker.utilities.common.LongToStringSerializer;
import com.mvtalker.utilities.common.StringToLongDeserializer;
import com.mvtalker.utilities.entity.community.enums.CommunityVisibility;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class UpdateCommunityInfoRequest
{
    @NotNull(message = "字段 communityId 不能为空")
    @JsonDeserialize(using = StringToLongDeserializer.class)
    private Long communityId;
    private String name;
    private String description;
    private Integer maxMembers;
    private CommunityVisibility visibility;
    private Boolean joinValidation;
    private String iconUrl;
}
