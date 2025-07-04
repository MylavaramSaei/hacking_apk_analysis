package aRQ2M7vtRaPDEyvpdv;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract /* synthetic */ class cT5Hs3CQpLK8NvlZAw {
    public static /* synthetic */ boolean lEeR5KfoEr4xU5yHH7(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
