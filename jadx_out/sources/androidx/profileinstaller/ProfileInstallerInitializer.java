package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements osrHU7fvDp2EgxZPfM.s3fjYDxWOUexjjVgyA {

    public static class HJFh0TGMpafqLE9haL {
    }

    public static class lEeR5KfoEr4xU5yHH7 {
        public static void HJFh0TGMpafqLE9haL(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: hUNBy66ZO1wVLJGW3l.Acstmh57AKoSEkEFNJ
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public static Handler lEeR5KfoEr4xU5yHH7(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static void e54J8UWNHWALQNixXM(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: hUNBy66ZO1wVLJGW3l.pbVGzGjWvY2LDXC8vo
            @Override // java.lang.Runnable
            public final void run() throws PackageManager.NameNotFoundException {
                androidx.profileinstaller.HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(context);
            }
        });
    }

    /* renamed from: IPyIQcaNa8aB7drBED, reason: merged with bridge method [inline-methods] */
    public void pbVGzGjWvY2LDXC8vo(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: hUNBy66ZO1wVLJGW3l.IPyIQcaNa8aB7drBED
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.e54J8UWNHWALQNixXM(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }

    @Override // osrHU7fvDp2EgxZPfM.s3fjYDxWOUexjjVgyA
    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: merged with bridge method [inline-methods] */
    public HJFh0TGMpafqLE9haL s3fjYDxWOUexjjVgyA(Context context) {
        TCyPEKSzIyweCN5yp1(context.getApplicationContext());
        return new HJFh0TGMpafqLE9haL();
    }

    public void TCyPEKSzIyweCN5yp1(final Context context) {
        lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(new Runnable() { // from class: hUNBy66ZO1wVLJGW3l.TCyPEKSzIyweCN5yp1
            @Override // java.lang.Runnable
            public final void run() {
                this.f5979lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(context);
            }
        });
    }

    @Override // osrHU7fvDp2EgxZPfM.s3fjYDxWOUexjjVgyA
    public List lEeR5KfoEr4xU5yHH7() {
        return Collections.emptyList();
    }
}
