package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes.dex */
public class Z9WdNiOsPR0y54zHW4 implements LayoutInflater.Factory2 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final zaq8hOURtfwbcX17cG f3596lEeR5KfoEr4xU5yHH7;

    public Z9WdNiOsPR0y54zHW4(zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg) {
        this.f3596lEeR5KfoEr4xU5yHH7 = zaq8hourtfwbcx17cg;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f3596lEeR5KfoEr4xU5yHH7);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LU0fFDMACqnfIfA1AZ.HJFh0TGMpafqLE9haL.f927lEeR5KfoEr4xU5yHH7);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(LU0fFDMACqnfIfA1AZ.HJFh0TGMpafqLE9haL.f928s3fjYDxWOUexjjVgyA);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(LU0fFDMACqnfIfA1AZ.HJFh0TGMpafqLE9haL.f923HJFh0TGMpafqLE9haL, -1);
        String string = typedArrayObtainStyledAttributes.getString(LU0fFDMACqnfIfA1AZ.HJFh0TGMpafqLE9haL.f929zZKhbgvUfsK4AEX3r0);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentCT5Hs3CQpLK8NvlZAw = resourceId != -1 ? this.f3596lEeR5KfoEr4xU5yHH7.cT5Hs3CQpLK8NvlZAw(resourceId) : null;
        if (fragmentCT5Hs3CQpLK8NvlZAw == null && string != null) {
            fragmentCT5Hs3CQpLK8NvlZAw = this.f3596lEeR5KfoEr4xU5yHH7.hUNBy66ZO1wVLJGW3l(string);
        }
        if (fragmentCT5Hs3CQpLK8NvlZAw == null && id != -1) {
            fragmentCT5Hs3CQpLK8NvlZAw = this.f3596lEeR5KfoEr4xU5yHH7.cT5Hs3CQpLK8NvlZAw(id);
        }
        if (fragmentCT5Hs3CQpLK8NvlZAw == null) {
            Fragment fragmentLEeR5KfoEr4xU5yHH7 = this.f3596lEeR5KfoEr4xU5yHH7.Pum9NZyDBKoCnecvlx().lEeR5KfoEr4xU5yHH7(context.getClassLoader(), attributeValue);
            fragmentLEeR5KfoEr4xU5yHH7.f3436hoXrIDAFrSwfShk8da = true;
            if (resourceId == 0) {
                resourceId = id;
            }
            fragmentLEeR5KfoEr4xU5yHH7.f3447xHA29AmDt6y96AnB3t = resourceId;
            fragmentLEeR5KfoEr4xU5yHH7.f3409LIMtzhnLwQyigzK0KO = id;
            fragmentLEeR5KfoEr4xU5yHH7.f3400A49QRPHynYLCBN0SqP = string;
            fragmentLEeR5KfoEr4xU5yHH7.f3429aPyGSIylzVNKPT1Bls = true;
            zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg = this.f3596lEeR5KfoEr4xU5yHH7;
            fragmentLEeR5KfoEr4xU5yHH7.f3425Y43RdunnpKgpbny0lE = zaq8hourtfwbcx17cg;
            zaq8hourtfwbcx17cg.ctWLFN70QQINH1kyYo();
            this.f3596lEeR5KfoEr4xU5yHH7.ctWLFN70QQINH1kyYo();
            throw null;
        }
        if (!fragmentCT5Hs3CQpLK8NvlZAw.f3429aPyGSIylzVNKPT1Bls) {
            fragmentCT5Hs3CQpLK8NvlZAw.f3429aPyGSIylzVNKPT1Bls = true;
            zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg2 = this.f3596lEeR5KfoEr4xU5yHH7;
            fragmentCT5Hs3CQpLK8NvlZAw.f3425Y43RdunnpKgpbny0lE = zaq8hourtfwbcx17cg2;
            zaq8hourtfwbcx17cg2.ctWLFN70QQINH1kyYo();
            this.f3596lEeR5KfoEr4xU5yHH7.ctWLFN70QQINH1kyYo();
            throw null;
        }
        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
