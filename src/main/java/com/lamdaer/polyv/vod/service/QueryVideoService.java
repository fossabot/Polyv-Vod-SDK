package com.lamdaer.polyv.vod.service;

import com.lamdaer.polyv.vod.bean.request.queryVideos.QueryByAuthorizationStateRequest;
import com.lamdaer.polyv.vod.bean.result.PLVodCommonResult;

/**
 * 查找视频 Service
 *
 * @author lamdaer
 * createTime 2020/5/4
 */
public interface QueryVideoService {

    /**
     * 根据授权播放开关状态查询视频
     *
     * @param request 查询请求
     * @return
     */
    PLVodCommonResult queryByAuthorizationState(QueryByAuthorizationStateRequest request);
}
