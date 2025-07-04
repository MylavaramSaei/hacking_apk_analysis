package sTkWmhpZ5b1ArQIw4K;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final ConstraintLayout f6653lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f6654s3fjYDxWOUexjjVgyA = -1;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f6651HJFh0TGMpafqLE9haL = -1;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public SparseArray f6655zZKhbgvUfsK4AEX3r0 = new SparseArray();

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public SparseArray f6652husNiw3snxdgZPAGJm = new SparseArray();

    /* renamed from: sTkWmhpZ5b1ArQIw4K.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public static class C0104lEeR5KfoEr4xU5yHH7 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f6656HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f6657lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public ArrayList f6658s3fjYDxWOUexjjVgyA = new ArrayList();

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public androidx.constraintlayout.widget.zZKhbgvUfsK4AEX3r0 f6659zZKhbgvUfsK4AEX3r0;

        public C0104lEeR5KfoEr4xU5yHH7(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f6656HJFh0TGMpafqLE9haL = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), zZKhbgvUfsK4AEX3r0.Z53NTKd0bUMUvBOAGJ);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == zZKhbgvUfsK4AEX3r0.i7MfZGy5YWm3JQf52R) {
                    this.f6657lEeR5KfoEr4xU5yHH7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6657lEeR5KfoEr4xU5yHH7);
                } else if (index == zZKhbgvUfsK4AEX3r0.nr70FmrSxjFDkeoZzb) {
                    this.f6656HJFh0TGMpafqLE9haL = typedArrayObtainStyledAttributes.getResourceId(index, this.f6656HJFh0TGMpafqLE9haL);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f6656HJFh0TGMpafqLE9haL);
                    context.getResources().getResourceName(this.f6656HJFh0TGMpafqLE9haL);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new androidx.constraintlayout.widget.zZKhbgvUfsK4AEX3r0();
                        this.f6659zZKhbgvUfsK4AEX3r0 = zzkhbgvufsk4aex3r0;
                        zzkhbgvufsk4aex3r0.husNiw3snxdgZPAGJm(context, this.f6656HJFh0TGMpafqLE9haL);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void lEeR5KfoEr4xU5yHH7(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            this.f6658s3fjYDxWOUexjjVgyA.add(s3fjydxwouexjjvgya);
        }
    }

    public static class s3fjYDxWOUexjjVgyA {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public float f6660HJFh0TGMpafqLE9haL;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public androidx.constraintlayout.widget.zZKhbgvUfsK4AEX3r0 f6661KYHag8HRDlnO3X9zmZ;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public int f6662husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public float f6663lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public float f6664s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public float f6665zZKhbgvUfsK4AEX3r0;

        public s3fjYDxWOUexjjVgyA(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f6663lEeR5KfoEr4xU5yHH7 = Float.NaN;
            this.f6664s3fjYDxWOUexjjVgyA = Float.NaN;
            this.f6660HJFh0TGMpafqLE9haL = Float.NaN;
            this.f6665zZKhbgvUfsK4AEX3r0 = Float.NaN;
            this.f6662husNiw3snxdgZPAGJm = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), zZKhbgvUfsK4AEX3r0.HNBrvay7JQYkT4BEFY);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == zZKhbgvUfsK4AEX3r0.QlPaVODg40wvJIIyxC) {
                    this.f6662husNiw3snxdgZPAGJm = typedArrayObtainStyledAttributes.getResourceId(index, this.f6662husNiw3snxdgZPAGJm);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f6662husNiw3snxdgZPAGJm);
                    context.getResources().getResourceName(this.f6662husNiw3snxdgZPAGJm);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new androidx.constraintlayout.widget.zZKhbgvUfsK4AEX3r0();
                        this.f6661KYHag8HRDlnO3X9zmZ = zzkhbgvufsk4aex3r0;
                        zzkhbgvufsk4aex3r0.husNiw3snxdgZPAGJm(context, this.f6662husNiw3snxdgZPAGJm);
                    }
                } else if (index == zZKhbgvUfsK4AEX3r0.mgZVCELMRhLneJ8gV8) {
                    this.f6665zZKhbgvUfsK4AEX3r0 = typedArrayObtainStyledAttributes.getDimension(index, this.f6665zZKhbgvUfsK4AEX3r0);
                } else if (index == zZKhbgvUfsK4AEX3r0.Oqa6PrTDFJ3vEqRYhS) {
                    this.f6664s3fjYDxWOUexjjVgyA = typedArrayObtainStyledAttributes.getDimension(index, this.f6664s3fjYDxWOUexjjVgyA);
                } else if (index == zZKhbgvUfsK4AEX3r0.iaeBu8ov1gWkyzqRLj) {
                    this.f6660HJFh0TGMpafqLE9haL = typedArrayObtainStyledAttributes.getDimension(index, this.f6660HJFh0TGMpafqLE9haL);
                } else if (index == zZKhbgvUfsK4AEX3r0.C6FGzHhgwMDqaHF8UM) {
                    this.f6663lEeR5KfoEr4xU5yHH7 = typedArrayObtainStyledAttributes.getDimension(index, this.f6663lEeR5KfoEr4xU5yHH7);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public lEeR5KfoEr4xU5yHH7(Context context, ConstraintLayout constraintLayout, int i) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        this.f6653lEeR5KfoEr4xU5yHH7 = constraintLayout;
        lEeR5KfoEr4xU5yHH7(context, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lEeR5KfoEr4xU5yHH7(android.content.Context r8, int r9) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r7 = this;
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r1 = 0
        Ld:
            r2 = 1
            if (r0 == r2) goto Lab
            if (r0 == 0) goto L9b
            r3 = 2
            if (r0 == r3) goto L17
            goto L9e
        L17:
            java.lang.String r0 = r9.getName()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            int r4 = r0.hashCode()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L53;
                case 80204913: goto L49;
                case 1382829617: goto L3f;
                case 1657696882: goto L35;
                case 1901439077: goto L25;
                default: goto L24;
            }     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
        L24:
            goto L5d
        L25:
            java.lang.String r4 = "Variant"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = r6
            goto L5e
        L2f:
            r8 = move-exception
            goto La4
        L32:
            r8 = move-exception
            goto La8
        L35:
            java.lang.String r4 = "layoutDescription"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = 0
            goto L5e
        L3f:
            java.lang.String r4 = "StateSet"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = r2
            goto L5e
        L49:
            java.lang.String r4 = "State"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = r3
            goto L5e
        L53:
            java.lang.String r4 = "ConstraintSet"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = r5
            goto L5e
        L5d:
            r4 = -1
        L5e:
            if (r4 == 0) goto L9e
            if (r4 == r2) goto L9e
            if (r4 == r3) goto L8e
            if (r4 == r6) goto L83
            if (r4 == r5) goto L7f
            java.lang.String r2 = "ConstraintLayoutStates"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r3.<init>()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            java.lang.String r4 = "unknown tag "
            r3.append(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r3.append(r0)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            java.lang.String r0 = r3.toString()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            android.util.Log.v(r2, r0)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto L9e
        L7f:
            r7.s3fjYDxWOUexjjVgyA(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto L9e
        L83:
            sTkWmhpZ5b1ArQIw4K.lEeR5KfoEr4xU5yHH7$s3fjYDxWOUexjjVgyA r0 = new sTkWmhpZ5b1ArQIw4K.lEeR5KfoEr4xU5yHH7$s3fjYDxWOUexjjVgyA     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r0.<init>(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r1 == 0) goto L9e
            r1.lEeR5KfoEr4xU5yHH7(r0)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto L9e
        L8e:
            sTkWmhpZ5b1ArQIw4K.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7 r1 = new sTkWmhpZ5b1ArQIw4K.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r1.<init>(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            android.util.SparseArray r0 = r7.f6655zZKhbgvUfsK4AEX3r0     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            int r2 = r1.f6657lEeR5KfoEr4xU5yHH7     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r0.put(r2, r1)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto L9e
        L9b:
            r9.getName()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
        L9e:
            int r0 = r9.next()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto Ld
        La4:
            r8.printStackTrace()
            goto Lab
        La8:
            r8.printStackTrace()
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sTkWmhpZ5b1ArQIw4K.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(android.content.Context, int):void");
    }

    public final void s3fjYDxWOUexjjVgyA(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, NumberFormatException, IOException {
        androidx.constraintlayout.widget.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new androidx.constraintlayout.widget.zZKhbgvUfsK4AEX3r0();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlPullParser.getAttributeName(i))) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                zzkhbgvufsk4aex3r0.e54J8UWNHWALQNixXM(context, xmlPullParser);
                this.f6652husNiw3snxdgZPAGJm.put(identifier, zzkhbgvufsk4aex3r0);
                return;
            }
        }
    }

    public void HJFh0TGMpafqLE9haL(sTkWmhpZ5b1ArQIw4K.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
    }
}
