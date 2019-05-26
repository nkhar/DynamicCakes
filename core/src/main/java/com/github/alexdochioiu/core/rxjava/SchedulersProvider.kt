package com.github.alexdochioiu.core.rxjava

import io.reactivex.Scheduler

interface SchedulersProvider {

    fun getIoScheduler(): Scheduler

    //todo add other schedulers when needed
}