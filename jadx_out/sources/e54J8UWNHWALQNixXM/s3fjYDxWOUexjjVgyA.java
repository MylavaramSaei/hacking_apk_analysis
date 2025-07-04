package e54J8UWNHWALQNixXM;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract /* synthetic */ class s3fjYDxWOUexjjVgyA {
    public static /* synthetic */ boolean lEeR5KfoEr4xU5yHH7(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
