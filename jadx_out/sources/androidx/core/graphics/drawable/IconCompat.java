package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public static final PorterDuff.Mode f3250Z9WdNiOsPR0y54zHW4 = PorterDuff.Mode.SRC_IN;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public String f3251Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public byte[] f3252HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public PorterDuff.Mode f3253IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public int f3254KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public ColorStateList f3255TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f3256husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f3257lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public String f3258pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public Object f3259s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public Parcelable f3260zZKhbgvUfsK4AEX3r0;

    public static class HJFh0TGMpafqLE9haL {
        public static int HJFh0TGMpafqLE9haL(Object obj) {
            return ((Icon) obj).getType();
        }

        public static int lEeR5KfoEr4xU5yHH7(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String s3fjYDxWOUexjjVgyA(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static Uri zZKhbgvUfsK4AEX3r0(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 {
        public static int HJFh0TGMpafqLE9haL(Object obj) {
            StringBuilder sb;
            if (Build.VERSION.SDK_INT >= 28) {
                return HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (NoSuchMethodException e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (InvocationTargetException e3) {
                e = e3;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (r0 >= 26) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static android.graphics.drawable.Icon KYHag8HRDlnO3X9zmZ(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                int r0 = r4.f3257lEeR5KfoEr4xU5yHH7
                r1 = 0
                r2 = 26
                switch(r0) {
                    case -1: goto Lb8;
                    case 0: goto L8;
                    case 1: goto La2;
                    case 2: goto L97;
                    case 3: goto L8a;
                    case 4: goto L81;
                    case 5: goto L73;
                    case 6: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Unknown type"
                r4.<init>(r5)
                throw r4
            L10:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L20
                android.net.Uri r5 = r4.IPyIQcaNa8aB7drBED()
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(r5)
                goto La7
            L20:
                if (r5 == 0) goto L58
                java.io.InputStream r5 = r4.pbVGzGjWvY2LDXC8vo(r5)
                if (r5 == 0) goto L3d
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
                if (r0 < r2) goto L34
            L2e:
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(r5)
                goto La7
            L34:
                android.graphics.Bitmap r5 = androidx.core.graphics.drawable.IconCompat.lEeR5KfoEr4xU5yHH7(r5, r1)
            L38:
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
                goto La7
            L3d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot load adaptive icon from uri: "
                r0.append(r1)
                android.net.Uri r4 = r4.IPyIQcaNa8aB7drBED()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L58:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
                r0.append(r1)
                android.net.Uri r4 = r4.IPyIQcaNa8aB7drBED()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L73:
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 < r2) goto L7c
                java.lang.Object r5 = r4.f3259s3fjYDxWOUexjjVgyA
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                goto L2e
            L7c:
                java.lang.Object r5 = r4.f3259s3fjYDxWOUexjjVgyA
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                goto L34
            L81:
                java.lang.Object r5 = r4.f3259s3fjYDxWOUexjjVgyA
                java.lang.String r5 = (java.lang.String) r5
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
                goto La7
            L8a:
                java.lang.Object r5 = r4.f3259s3fjYDxWOUexjjVgyA
                byte[] r5 = (byte[]) r5
                int r0 = r4.f3256husNiw3snxdgZPAGJm
                int r1 = r4.f3254KYHag8HRDlnO3X9zmZ
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
                goto La7
            L97:
                java.lang.String r5 = r4.KYHag8HRDlnO3X9zmZ()
                int r0 = r4.f3256husNiw3snxdgZPAGJm
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
                goto La7
            La2:
                java.lang.Object r5 = r4.f3259s3fjYDxWOUexjjVgyA
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                goto L38
            La7:
                android.content.res.ColorStateList r0 = r4.f3255TCyPEKSzIyweCN5yp1
                if (r0 == 0) goto Lae
                r5.setTintList(r0)
            Lae:
                android.graphics.PorterDuff$Mode r4 = r4.f3253IPyIQcaNa8aB7drBED
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f3250Z9WdNiOsPR0y54zHW4
                if (r4 == r0) goto Lb7
                r5.setTintMode(r4)
            Lb7:
                return r5
            Lb8:
                java.lang.Object r4 = r4.f3259s3fjYDxWOUexjjVgyA
                android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }

        public static Drawable husNiw3snxdgZPAGJm(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        public static int lEeR5KfoEr4xU5yHH7(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            }
        }

        public static String s3fjYDxWOUexjjVgyA(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            }
        }

        public static Uri zZKhbgvUfsK4AEX3r0(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon uri", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            }
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public static Drawable lEeR5KfoEr4xU5yHH7(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon s3fjYDxWOUexjjVgyA(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 {
        public static Icon lEeR5KfoEr4xU5yHH7(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f3257lEeR5KfoEr4xU5yHH7 = -1;
        this.f3252HJFh0TGMpafqLE9haL = null;
        this.f3260zZKhbgvUfsK4AEX3r0 = null;
        this.f3256husNiw3snxdgZPAGJm = 0;
        this.f3254KYHag8HRDlnO3X9zmZ = 0;
        this.f3255TCyPEKSzIyweCN5yp1 = null;
        this.f3253IPyIQcaNa8aB7drBED = f3250Z9WdNiOsPR0y54zHW4;
        this.f3258pbVGzGjWvY2LDXC8vo = null;
    }

    public static IconCompat HJFh0TGMpafqLE9haL(Resources resources, String str, int i) {
        tXWeW0sqVddf7ZBflq.HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(str);
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f3256husNiw3snxdgZPAGJm = i;
        if (resources != null) {
            try {
                iconCompat.f3259s3fjYDxWOUexjjVgyA = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f3259s3fjYDxWOUexjjVgyA = str;
        }
        iconCompat.f3251Acstmh57AKoSEkEFNJ = str;
        return iconCompat;
    }

    public static String hoXrIDAFrSwfShk8da(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public static Bitmap lEeR5KfoEr4xU5yHH7(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat s3fjYDxWOUexjjVgyA(Bitmap bitmap) {
        tXWeW0sqVddf7ZBflq.HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f3259s3fjYDxWOUexjjVgyA = bitmap;
        return iconCompat;
    }

    public void Acstmh57AKoSEkEFNJ() {
        Parcelable parcelable;
        this.f3253IPyIQcaNa8aB7drBED = PorterDuff.Mode.valueOf(this.f3258pbVGzGjWvY2LDXC8vo);
        switch (this.f3257lEeR5KfoEr4xU5yHH7) {
            case -1:
                parcelable = this.f3260zZKhbgvUfsK4AEX3r0;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f3260zZKhbgvUfsK4AEX3r0;
                if (parcelable == null) {
                    byte[] bArr = this.f3252HJFh0TGMpafqLE9haL;
                    this.f3259s3fjYDxWOUexjjVgyA = bArr;
                    this.f3257lEeR5KfoEr4xU5yHH7 = 3;
                    this.f3256husNiw3snxdgZPAGJm = 0;
                    this.f3254KYHag8HRDlnO3X9zmZ = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f3252HJFh0TGMpafqLE9haL, Charset.forName("UTF-16"));
                this.f3259s3fjYDxWOUexjjVgyA = str;
                if (this.f3257lEeR5KfoEr4xU5yHH7 == 2 && this.f3251Acstmh57AKoSEkEFNJ == null) {
                    this.f3251Acstmh57AKoSEkEFNJ = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3259s3fjYDxWOUexjjVgyA = this.f3252HJFh0TGMpafqLE9haL;
                return;
        }
        this.f3259s3fjYDxWOUexjjVgyA = parcelable;
    }

    public Uri IPyIQcaNa8aB7drBED() {
        int i = this.f3257lEeR5KfoEr4xU5yHH7;
        if (i == -1) {
            return lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(this.f3259s3fjYDxWOUexjjVgyA);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f3259s3fjYDxWOUexjjVgyA);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public String KYHag8HRDlnO3X9zmZ() {
        int i = this.f3257lEeR5KfoEr4xU5yHH7;
        if (i == -1) {
            return lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(this.f3259s3fjYDxWOUexjjVgyA);
        }
        if (i == 2) {
            String str = this.f3251Acstmh57AKoSEkEFNJ;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f3259s3fjYDxWOUexjjVgyA).split(":", -1)[0] : this.f3251Acstmh57AKoSEkEFNJ;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public Icon T9PhQIpGRhE4yZDm1C(Context context) {
        return lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(this, context);
    }

    public int TCyPEKSzIyweCN5yp1() {
        int i = this.f3257lEeR5KfoEr4xU5yHH7;
        return i == -1 ? lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(this.f3259s3fjYDxWOUexjjVgyA) : i;
    }

    public void Z9WdNiOsPR0y54zHW4(boolean z) {
        this.f3258pbVGzGjWvY2LDXC8vo = this.f3253IPyIQcaNa8aB7drBED.name();
        switch (this.f3257lEeR5KfoEr4xU5yHH7) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    Bitmap bitmap = (Bitmap) this.f3259s3fjYDxWOUexjjVgyA;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f3252HJFh0TGMpafqLE9haL = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f3252HJFh0TGMpafqLE9haL = ((String) this.f3259s3fjYDxWOUexjjVgyA).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f3252HJFh0TGMpafqLE9haL = (byte[]) this.f3259s3fjYDxWOUexjjVgyA;
                return;
            case 4:
            case 6:
                this.f3252HJFh0TGMpafqLE9haL = this.f3259s3fjYDxWOUexjjVgyA.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f3260zZKhbgvUfsK4AEX3r0 = (Parcelable) this.f3259s3fjYDxWOUexjjVgyA;
    }

    public Icon e54J8UWNHWALQNixXM() {
        return T9PhQIpGRhE4yZDm1C(null);
    }

    public int husNiw3snxdgZPAGJm() {
        int i = this.f3257lEeR5KfoEr4xU5yHH7;
        if (i == -1) {
            return lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this.f3259s3fjYDxWOUexjjVgyA);
        }
        if (i == 2) {
            return this.f3256husNiw3snxdgZPAGJm;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public InputStream pbVGzGjWvY2LDXC8vo(Context context) {
        StringBuilder sb;
        String str;
        Uri uriIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED();
        String scheme = uriIPyIQcaNa8aB7drBED.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriIPyIQcaNa8aB7drBED);
            } catch (Exception e) {
                e = e;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f3259s3fjYDxWOUexjjVgyA));
            } catch (FileNotFoundException e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(uriIPyIQcaNa8aB7drBED);
        Log.w("IconCompat", sb.toString(), e);
        return null;
    }

    public String toString() {
        int height;
        if (this.f3257lEeR5KfoEr4xU5yHH7 == -1) {
            return String.valueOf(this.f3259s3fjYDxWOUexjjVgyA);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(hoXrIDAFrSwfShk8da(this.f3257lEeR5KfoEr4xU5yHH7));
        switch (this.f3257lEeR5KfoEr4xU5yHH7) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3259s3fjYDxWOUexjjVgyA).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f3259s3fjYDxWOUexjjVgyA).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f3251Acstmh57AKoSEkEFNJ);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(husNiw3snxdgZPAGJm())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f3256husNiw3snxdgZPAGJm);
                if (this.f3254KYHag8HRDlnO3X9zmZ != 0) {
                    sb.append(" off=");
                    height = this.f3254KYHag8HRDlnO3X9zmZ;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f3259s3fjYDxWOUexjjVgyA);
                break;
        }
        if (this.f3255TCyPEKSzIyweCN5yp1 != null) {
            sb.append(" tint=");
            sb.append(this.f3255TCyPEKSzIyweCN5yp1);
        }
        if (this.f3253IPyIQcaNa8aB7drBED != f3250Z9WdNiOsPR0y54zHW4) {
            sb.append(" mode=");
            sb.append(this.f3253IPyIQcaNa8aB7drBED);
        }
        sb.append(")");
        return sb.toString();
    }

    public Bitmap zZKhbgvUfsK4AEX3r0() {
        int i = this.f3257lEeR5KfoEr4xU5yHH7;
        if (i == -1) {
            Object obj = this.f3259s3fjYDxWOUexjjVgyA;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i == 1) {
            return (Bitmap) this.f3259s3fjYDxWOUexjjVgyA;
        }
        if (i == 5) {
            return lEeR5KfoEr4xU5yHH7((Bitmap) this.f3259s3fjYDxWOUexjjVgyA, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public IconCompat(int i) {
        this.f3252HJFh0TGMpafqLE9haL = null;
        this.f3260zZKhbgvUfsK4AEX3r0 = null;
        this.f3256husNiw3snxdgZPAGJm = 0;
        this.f3254KYHag8HRDlnO3X9zmZ = 0;
        this.f3255TCyPEKSzIyweCN5yp1 = null;
        this.f3253IPyIQcaNa8aB7drBED = f3250Z9WdNiOsPR0y54zHW4;
        this.f3258pbVGzGjWvY2LDXC8vo = null;
        this.f3257lEeR5KfoEr4xU5yHH7 = i;
    }
}
