package videos.entity;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Videos {
    private Integer videoId;

    private String videoName;

    private Integer videoPlaynum;

    private Integer videoUserid;

    private Integer videoCollectnum;

    private BigDecimal videoRewardmoney;

    private Integer videoLikenum;
    
    private String videoType;
    
    private Integer videoFlag;

}