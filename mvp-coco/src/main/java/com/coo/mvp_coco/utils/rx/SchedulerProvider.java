package com.coo.mvp_coco.utils.rx;

import io.reactivex.Scheduler;

public interface SchedulerProvider {

    Scheduler ui();

    Scheduler computation();

    Scheduler io();
}
