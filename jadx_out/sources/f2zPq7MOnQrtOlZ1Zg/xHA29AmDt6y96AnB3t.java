package f2zPq7MOnQrtOlZ1Zg;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class xHA29AmDt6y96AnB3t extends R9SAhYMerGybF9OAjL {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final WeakReference f5823HJFh0TGMpafqLE9haL = new WeakReference(null);

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public WeakReference f5824s3fjYDxWOUexjjVgyA;

    public xHA29AmDt6y96AnB3t(byte[] bArr) {
        super(bArr);
        this.f5824s3fjYDxWOUexjjVgyA = f5823HJFh0TGMpafqLE9haL;
    }

    @Override // f2zPq7MOnQrtOlZ1Zg.R9SAhYMerGybF9OAjL
    public final byte[] HJFh0TGMpafqLE9haL() {
        byte[] bArrE54J8UWNHWALQNixXM;
        synchronized (this) {
            try {
                bArrE54J8UWNHWALQNixXM = (byte[]) this.f5824s3fjYDxWOUexjjVgyA.get();
                if (bArrE54J8UWNHWALQNixXM == null) {
                    bArrE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM();
                    this.f5824s3fjYDxWOUexjjVgyA = new WeakReference(bArrE54J8UWNHWALQNixXM);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrE54J8UWNHWALQNixXM;
    }

    public abstract byte[] e54J8UWNHWALQNixXM();
}
