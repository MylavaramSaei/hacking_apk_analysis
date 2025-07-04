package jsjSYEu4NPZjZxcfmI;

import Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class HJFh0TGMpafqLE9haL {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final TCyPEKSzIyweCN5yp1 f6193lEeR5KfoEr4xU5yHH7 = new TCyPEKSzIyweCN5yp1();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final TCyPEKSzIyweCN5yp1 f6194s3fjYDxWOUexjjVgyA = new TCyPEKSzIyweCN5yp1();

    public static HJFh0TGMpafqLE9haL HJFh0TGMpafqLE9haL(Context context, int i) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return zZKhbgvUfsK4AEX3r0(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return zZKhbgvUfsK4AEX3r0(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    public static void lEeR5KfoEr4xU5yHH7(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(objectAnimator.getPropertyName(), zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    public static HJFh0TGMpafqLE9haL s3fjYDxWOUexjjVgyA(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return HJFh0TGMpafqLE9haL(context, resourceId);
    }

    public static HJFh0TGMpafqLE9haL zZKhbgvUfsK4AEX3r0(List list) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = new HJFh0TGMpafqLE9haL();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            lEeR5KfoEr4xU5yHH7(hJFh0TGMpafqLE9haL, (Animator) list.get(i));
        }
        return hJFh0TGMpafqLE9haL;
    }

    public void KYHag8HRDlnO3X9zmZ(String str, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        this.f6193lEeR5KfoEr4xU5yHH7.put(str, zzkhbgvufsk4aex3r0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HJFh0TGMpafqLE9haL) {
            return this.f6193lEeR5KfoEr4xU5yHH7.equals(((HJFh0TGMpafqLE9haL) obj).f6193lEeR5KfoEr4xU5yHH7);
        }
        return false;
    }

    public int hashCode() {
        return this.f6193lEeR5KfoEr4xU5yHH7.hashCode();
    }

    public void husNiw3snxdgZPAGJm(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f6194s3fjYDxWOUexjjVgyA.put(str, propertyValuesHolderArr);
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f6193lEeR5KfoEr4xU5yHH7 + "}\n";
    }
}
