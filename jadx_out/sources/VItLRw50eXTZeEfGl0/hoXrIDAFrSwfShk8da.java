package VItLRw50eXTZeEfGl0;

import A49QRPHynYLCBN0SqP.zZKhbgvUfsK4AEX3r0;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import jCtUeU2YI1poCxWcjm.TCyPEKSzIyweCN5yp1;
import java.io.IOException;

/* loaded from: classes.dex */
public class hoXrIDAFrSwfShk8da extends aPyGSIylzVNKPT1Bls {
    public static int pbVGzGjWvY2LDXC8vo(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final Font IPyIQcaNa8aB7drBED(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iPbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iPbVGzGjWvY2LDXC8vo2 = pbVGzGjWvY2LDXC8vo(fontStyle, font2.getStyle());
            if (iPbVGzGjWvY2LDXC8vo2 < iPbVGzGjWvY2LDXC8vo) {
                font = font2;
                iPbVGzGjWvY2LDXC8vo = iPbVGzGjWvY2LDXC8vo2;
            }
        }
        return font;
    }

    @Override // VItLRw50eXTZeEfGl0.aPyGSIylzVNKPT1Bls
    public TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA TCyPEKSzIyweCN5yp1(TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // VItLRw50eXTZeEfGl0.aPyGSIylzVNKPT1Bls
    public Typeface lEeR5KfoEr4xU5yHH7(Context context, zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, Resources resources, int i) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (zZKhbgvUfsK4AEX3r0.C0000zZKhbgvUfsK4AEX3r0 c0000zZKhbgvUfsK4AEX3r0 : hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7()) {
                try {
                    Font fontBuild = new Font.Builder(resources, c0000zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA()).setWeight(c0000zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm()).setSlant(c0000zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ() ? 1 : 0).setTtcIndex(c0000zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL()).setFontVariationSettings(c0000zZKhbgvUfsK4AEX3r0.zZKhbgvUfsK4AEX3r0()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(IPyIQcaNa8aB7drBED(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // VItLRw50eXTZeEfGl0.aPyGSIylzVNKPT1Bls
    public Typeface s3fjYDxWOUexjjVgyA(Context context, CancellationSignal cancellationSignal, TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr, int i) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya : s3fjydxwouexjjvgyaArr) {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(s3fjydxwouexjjvgya.zZKhbgvUfsK4AEX3r0(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(s3fjydxwouexjjvgya.husNiw3snxdgZPAGJm()).setSlant(s3fjydxwouexjjvgya.KYHag8HRDlnO3X9zmZ() ? 1 : 0).setTtcIndex(s3fjydxwouexjjvgya.HJFh0TGMpafqLE9haL()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(IPyIQcaNa8aB7drBED(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // VItLRw50eXTZeEfGl0.aPyGSIylzVNKPT1Bls
    public Typeface zZKhbgvUfsK4AEX3r0(Context context, Resources resources, int i, String str, int i2) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
