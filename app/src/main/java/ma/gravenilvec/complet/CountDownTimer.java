package ma.gravenilvec.complet;
import android.os.Handler;
import android.os.SystemClock;

public abstract class CountDownTimer {

    private long mMillisInFuture;
    private long getmCountDownInterval;
    private long mCountDownInterval;
    private long mStopTimeInFuture;
    private boolean mCanceled = false;

    public CountDownTimer(long mc, long ms) {
        mStopTimeInFuture = mc;
        mCountDownInterval = ms;
    }

    public synchronized final void cancel() {
        mCanceled = true;
    }

    public synchronized final CountDownTimer start() {
        mCanceled = false;
        if (mStopTimeInFuture <= 0) {
            onFinish();
            return this;
        }
        mStopTimeInFuture= SystemClock.elapsedRealtime()+mMillisInFuture;
        onTick(mStopTimeInFuture);
        return this;
    }
    public abstract void onTick(long millisUntilFinished);
    public abstract void onFinish();
}

