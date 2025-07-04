package androidx.emoji2.text;

import android.os.Build;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class IPyIQcaNa8aB7drBED {

    public static class lEeR5KfoEr4xU5yHH7 {
        public static Set<int[]> lEeR5KfoEr4xU5yHH7() {
            return s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7();
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public static Set lEeR5KfoEr4xU5yHH7() {
            try {
                Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
                if (objInvoke == null) {
                    return Collections.emptySet();
                }
                Set set = (Set) objInvoke;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }

    public static Set lEeR5KfoEr4xU5yHH7() {
        return Build.VERSION.SDK_INT >= 34 ? lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7() : s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7();
    }
}
