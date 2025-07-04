package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class jCtUeU2YI1poCxWcjm extends Writer {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final String f3629HJFh0TGMpafqLE9haL;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public StringBuilder f3630zZKhbgvUfsK4AEX3r0 = new StringBuilder(128);

    public jCtUeU2YI1poCxWcjm(String str) {
        this.f3629HJFh0TGMpafqLE9haL = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zZKhbgvUfsK4AEX3r0();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        zZKhbgvUfsK4AEX3r0();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                zZKhbgvUfsK4AEX3r0();
            } else {
                this.f3630zZKhbgvUfsK4AEX3r0.append(c);
            }
        }
    }

    public final void zZKhbgvUfsK4AEX3r0() {
        if (this.f3630zZKhbgvUfsK4AEX3r0.length() > 0) {
            Log.d(this.f3629HJFh0TGMpafqLE9haL, this.f3630zZKhbgvUfsK4AEX3r0.toString());
            StringBuilder sb = this.f3630zZKhbgvUfsK4AEX3r0;
            sb.delete(0, sb.length());
        }
    }
}
