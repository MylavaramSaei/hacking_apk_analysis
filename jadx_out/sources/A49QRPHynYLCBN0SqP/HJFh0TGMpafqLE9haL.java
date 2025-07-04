package A49QRPHynYLCBN0SqP;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final ThreadLocal f0lEeR5KfoEr4xU5yHH7 = new ThreadLocal();

    public static TypedValue HJFh0TGMpafqLE9haL() {
        ThreadLocal threadLocal = f0lEeR5KfoEr4xU5yHH7;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static int KYHag8HRDlnO3X9zmZ(int i, float f, float f2) {
        boolean z = f2 >= 0.0f && f2 <= 100.0f;
        if (f == 1.0f && !z) {
            return i;
        }
        int iS3fjYDxWOUexjjVgyA = ao3wqKm5CXFuvC0q47.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA((int) ((Color.alpha(i) * f) + 0.5f), 0, 255);
        if (z) {
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL = lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(i);
            i = lEeR5KfoEr4xU5yHH7.T9PhQIpGRhE4yZDm1C(leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(), leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(), f2);
        }
        return (i & 16777215) | (iS3fjYDxWOUexjjVgyA << 24);
    }

    public static TypedArray TCyPEKSzIyweCN5yp1(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static boolean husNiw3snxdgZPAGJm(Resources resources, int i) throws Resources.NotFoundException {
        TypedValue typedValueHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL();
        resources.getValue(i, typedValueHJFh0TGMpafqLE9haL, true);
        int i2 = typedValueHJFh0TGMpafqLE9haL.type;
        return i2 >= 28 && i2 <= 31;
    }

    public static ColorStateList lEeR5KfoEr4xU5yHH7(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return s3fjYDxWOUexjjVgyA(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList s3fjYDxWOUexjjVgyA(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return zZKhbgvUfsK4AEX3r0(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList zZKhbgvUfsK4AEX3r0(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A49QRPHynYLCBN0SqP.HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
