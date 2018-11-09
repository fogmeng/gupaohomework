package com.gupao.edu.vip.netty01;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author liujt
 * @Date 2018/11/9 17:11
 */
@Slf4j
public class ClientHandler extends ChannelInboundHandlerAdapter {

    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        log.info("channelRead send message:{}",msg);
        ctx.writeAndFlush(msg);
    }

    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        log.info("Exception:",cause.getMessage());
    }


}
