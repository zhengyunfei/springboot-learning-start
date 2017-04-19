package com.neo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by summer on 2016/12/1.
 */
/**
 * @description springboot 实现定时任务方式一
 * @author 贤名
 * @qq 799078779
 *
 */
@Component
public class Scheduler2Task {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * 注解@Scheduled 可以作为一个触发源添加到一个方法中，例如，以下的方法将以一个固定延迟时间6秒钟调用一次执行，这个周期是以上一个调用任务的完成时间为基准，在上一个任务完成之后，6s后再次执行：
     */
    @Scheduled(fixedRate = 6000)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }

}
