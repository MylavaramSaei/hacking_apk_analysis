package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class VItLRw50eXTZeEfGl0 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Map f3817lEeR5KfoEr4xU5yHH7 = new HashMap();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Set f3818s3fjYDxWOUexjjVgyA = new LinkedHashSet();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public volatile boolean f3816HJFh0TGMpafqLE9haL = false;

    public static void s3fjYDxWOUexjjVgyA(Object obj) throws IOException {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Object HJFh0TGMpafqLE9haL(String str) {
        Object obj;
        Map map = this.f3817lEeR5KfoEr4xU5yHH7;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f3817lEeR5KfoEr4xU5yHH7.get(str);
        }
        return obj;
    }

    public final void lEeR5KfoEr4xU5yHH7() {
        this.f3816HJFh0TGMpafqLE9haL = true;
        Map map = this.f3817lEeR5KfoEr4xU5yHH7;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator it = this.f3817lEeR5KfoEr4xU5yHH7.values().iterator();
                    while (it.hasNext()) {
                        s3fjYDxWOUexjjVgyA(it.next());
                    }
                } finally {
                }
            }
        }
        Set set = this.f3818s3fjYDxWOUexjjVgyA;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator it2 = this.f3818s3fjYDxWOUexjjVgyA.iterator();
                    while (it2.hasNext()) {
                        s3fjYDxWOUexjjVgyA((Closeable) it2.next());
                    }
                } finally {
                }
            }
        }
        zZKhbgvUfsK4AEX3r0();
    }

    public void zZKhbgvUfsK4AEX3r0() {
    }
}
