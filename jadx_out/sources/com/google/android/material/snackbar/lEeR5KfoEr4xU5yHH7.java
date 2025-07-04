package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.activity.zZKhbgvUfsK4AEX3r0;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static lEeR5KfoEr4xU5yHH7 f5312HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Object f5313lEeR5KfoEr4xU5yHH7 = new Object();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Handler f5314s3fjYDxWOUexjjVgyA = new Handler(Looper.getMainLooper(), new C0082lEeR5KfoEr4xU5yHH7());

    public static class HJFh0TGMpafqLE9haL {
    }

    /* renamed from: com.google.android.material.snackbar.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public class C0082lEeR5KfoEr4xU5yHH7 implements Handler.Callback {
        public C0082lEeR5KfoEr4xU5yHH7() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = lEeR5KfoEr4xU5yHH7.this;
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(message.obj);
            leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL(null);
            return true;
        }
    }

    public interface s3fjYDxWOUexjjVgyA {
    }

    public static lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA() {
        if (f5312HJFh0TGMpafqLE9haL == null) {
            f5312HJFh0TGMpafqLE9haL = new lEeR5KfoEr4xU5yHH7();
        }
        return f5312HJFh0TGMpafqLE9haL;
    }

    public void HJFh0TGMpafqLE9haL(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        synchronized (this.f5313lEeR5KfoEr4xU5yHH7) {
            lEeR5KfoEr4xU5yHH7(hJFh0TGMpafqLE9haL, 2);
        }
    }

    public void KYHag8HRDlnO3X9zmZ(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        synchronized (this.f5313lEeR5KfoEr4xU5yHH7) {
            try {
                if (zZKhbgvUfsK4AEX3r0(s3fjydxwouexjjvgya)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void husNiw3snxdgZPAGJm(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        synchronized (this.f5313lEeR5KfoEr4xU5yHH7) {
            try {
                if (zZKhbgvUfsK4AEX3r0(s3fjydxwouexjjvgya)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean lEeR5KfoEr4xU5yHH7(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, int i) {
        throw null;
    }

    public final boolean zZKhbgvUfsK4AEX3r0(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        return false;
    }
}
