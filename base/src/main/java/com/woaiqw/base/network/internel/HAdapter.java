package com.woaiqw.base.network.internel;

import com.woaiqw.base.network.core.RequestCtx;


/**
 * Created by haoran on 2019/6/4.
 */
public interface HAdapter {
    void request(RequestCtx ctx, Parser parser, Callback callback);
}
