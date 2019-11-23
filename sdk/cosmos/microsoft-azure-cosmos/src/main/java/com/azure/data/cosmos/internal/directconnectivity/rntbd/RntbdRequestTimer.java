// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.data.cosmos.internal.directconnectivity.rntbd;

import io.netty.util.HashedWheelTimer;
import io.netty.util.Timeout;
import io.netty.util.Timer;
import io.netty.util.TimerTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class RntbdRequestTimer implements AutoCloseable {

    private static final long FIVE_MILLISECONDS = 5000000L;

    private static final Logger logger = LoggerFactory.getLogger(RntbdRequestTimer.class);
    private final long requestTimeout;
    private final Timer timer;

    public RntbdRequestTimer(final long requestTimeout) {

        // Inspection of the HashWheelTimer code indicates that our choice of a 5 millisecond timer resolution ensures
        // a request will expire within 10 milliseconds of the specified requestTimeout interval. This is because
        // cancellation of a timeout takes two timer resolution units to complete.

        this.timer = new HashedWheelTimer(FIVE_MILLISECONDS, TimeUnit.NANOSECONDS);
        this.requestTimeout = requestTimeout;
    }

    public long getRequestTimeout(final TimeUnit unit) {
        return unit.convert(requestTimeout, TimeUnit.NANOSECONDS);
    }

    @Override
    public void close() {
        final Set<Timeout> timeouts = this.timer.stop();
        if (logger.isDebugEnabled()) {
            final int count = timeouts.size();
            if (count > 0) {
                logger.debug("request expiration tasks cancelled: {}", count);
            }
        }
    }

    public Timeout newTimeout(final TimerTask task) {
        return this.timer.newTimeout(task, this.requestTimeout, TimeUnit.NANOSECONDS);
    }
}
