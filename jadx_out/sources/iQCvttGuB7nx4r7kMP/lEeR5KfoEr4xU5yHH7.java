package iQCvttGuB7nx4r7kMP;

import android.util.SparseArray;
import ctWLFN70QQINH1kyYo.husNiw3snxdgZPAGJm;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static SparseArray f6047lEeR5KfoEr4xU5yHH7 = new SparseArray();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static HashMap f6048s3fjYDxWOUexjjVgyA;

    static {
        HashMap map = new HashMap();
        f6048s3fjYDxWOUexjjVgyA = map;
        map.put(husNiw3snxdgZPAGJm.DEFAULT, 0);
        f6048s3fjYDxWOUexjjVgyA.put(husNiw3snxdgZPAGJm.VERY_LOW, 1);
        f6048s3fjYDxWOUexjjVgyA.put(husNiw3snxdgZPAGJm.HIGHEST, 2);
        for (husNiw3snxdgZPAGJm husniw3snxdgzpagjm : f6048s3fjYDxWOUexjjVgyA.keySet()) {
            f6047lEeR5KfoEr4xU5yHH7.append(((Integer) f6048s3fjYDxWOUexjjVgyA.get(husniw3snxdgzpagjm)).intValue(), husniw3snxdgzpagjm);
        }
    }

    public static int lEeR5KfoEr4xU5yHH7(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        Integer num = (Integer) f6048s3fjYDxWOUexjjVgyA.get(husniw3snxdgzpagjm);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + husniw3snxdgzpagjm);
    }

    public static husNiw3snxdgZPAGJm s3fjYDxWOUexjjVgyA(int i) {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) f6047lEeR5KfoEr4xU5yHH7.get(i);
        if (husniw3snxdgzpagjm != null) {
            return husniw3snxdgzpagjm;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
