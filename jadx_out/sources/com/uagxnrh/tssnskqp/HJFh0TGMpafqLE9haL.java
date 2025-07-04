package com.uagxnrh.tssnskqp;

import android.content.Context;
import android.content.IntentSender;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static Method f5551lEeR5KfoEr4xU5yHH7;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:145:0x01bd
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x00bf. Please report as an issue. */
    public static java.io.File HJFh0TGMpafqLE9haL(android.content.Context r11, java.io.File r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uagxnrh.tssnskqp.HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(android.content.Context, java.io.File, java.lang.String):java.io.File");
    }

    public static InputStream KYHag8HRDlnO3X9zmZ(AssetManager assetManager, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        try {
            String str2 = str.split(File.separator)[r0.length - 1];
            Cipher cipher = Cipher.getInstance(lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL());
            cipher.init(2, new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED()).digest(str2.getBytes(StandardCharsets.UTF_8)), 16), lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7()), new IvParameterSpec(new byte[cipher.getBlockSize()]));
            return new CipherInputStream(assetManager.open(str), cipher);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            return null;
        }
    }

    public static /* synthetic */ void husNiw3snxdgZPAGJm(Context context, IntentSender intentSender, boolean z, File file) {
        String absolutePath = null;
        try {
            Method method = f5551lEeR5KfoEr4xU5yHH7;
            String str = "ۖ۫ۚ۬۟ۡۨ۟ۚۥۦ۠ۙۗ۬۫ۖۡۢۘۜۘۙۘ۠ۤ۬۟ۚۛۛۧۤ۫ۤۙۧۙ۫ۗۧۘۘۦۘۜۘۗۤ";
            while (true) {
                switch (str.hashCode() ^ 116765034) {
                    case -872281084:
                        str = "ۘۨۘۘۦ۬ۘۘۚۢۜ۫ۧۡ۟ۨ۫۫ۗۙۚۛۜۘ۬ۚۢۤۦۖۘۢۨۜ۠ۨۖۢۧۨۘۢۖۧۘۗۙۢۙ۠۠ۗۡۖۗۥۜۙ۫";
                        break;
                    case -167663316:
                        String str2 = "ۛۨۥۘۜ۠ۖۦۗۜ۬ۡ۠ۚ۠۟ۖۚۤۙۚۚ۟ۘۦۧ۬ۨ۟ۗ۬ۤۖ۫ۖۦۘ۬ۡۨۘ۠ۧ۠ۚۛۛۛۡۘ";
                        while (true) {
                            switch (str2.hashCode() ^ 79873485) {
                                case -1550753216:
                                    str2 = "۟۠ۥ۟ۖۘۥۧۘۖۧۦۙۡۨۛ۫ۨ۫ۜۤۖۡۨۥۘۥۘۚ۠ۡۘۘۡ۫ۡۢۡۛۥ۫ۥۢۥۛۥۧۘۦۤۤۚۨۖۘۛ۠۬";
                                    break;
                                case 11502924:
                                    str = "ۖۜۢۛۜۛ۫ۧ۫ۚۦۧ۠ۤۖۘۖۢۧۙ۬۫ۥۖ۬ۛۘۤۗۜۙ۫ۨ۠ۚ۬ۗۥۗ۠ۦ۫ۨ";
                                    continue;
                                case 879831103:
                                    str = "۟۠۫ۙ۫ۦۘۙۚ۠ۖۥۥۘۖۤۨۧ۬ۙۗۜۧۘۡ۫ۡۘۡ۟ۡۘۦۤۧ۫ۗۜۙۖۡۘ۟ۢۤۜۨۚۗ۫ۡۘۚۤۤ";
                                    continue;
                                case 1617224434:
                                    if (!z) {
                                        str2 = "ۗ۠ۜۡۢۗۜۘۖۘۘۜۗۤ۬ۡۤۦۜۘ۬ۖۘ۟ۥ۫ۙۤ۫ۡۨۥۘۘۜۜۚ۬ۗۡۗۖۘۚۢ۠ۖۜۢۥۨ۫";
                                        break;
                                    } else {
                                        str2 = "ۢۤۨۧۡۜ۫۫ۤۡۘۘۢ۬ۨ۠ۖۖۗ۬۠ۥۡۜۘۘۥ۫ۚۧۢۧۤۧ۫ۦ۠ۘۡۖ۫ۜۢ۫ۧۖ۬ۛۖۘ";
                                        break;
                                    }
                            }
                        }
                        break;
                    case 799044290:
                        absolutePath = file.getAbsolutePath();
                        break;
                    case 1080474424:
                        break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static /* synthetic */ void lEeR5KfoEr4xU5yHH7(Context context, IntentSender intentSender, boolean z, File file) {
        String str = "ۜۛۖۘۜ۫۬ۖۥۡۘۚۘۘۘۧ۠ۙۚ۟ۛ۬۟۠ۥۡۗۦۥۨۘۚ۟";
        while (true) {
            switch ((((str.hashCode() ^ 694) ^ 221) ^ 294) ^ (-460704067)) {
                case -1588645767:
                    return;
                case -1179352043:
                    str = "ۜۡۤ۟ۢۥۘۡ۬ۨ۫۬ۧۤۦ۟ۚۘ۫ۘۜۧۘۨۨ۫ۜۥۘۘۛۨ";
                    break;
                case -1048542327:
                    str = "ۖ۠ۚۗ۫ۖۘۜ۬ۙۢۛۘۘ۫ۖۦۘۧۤ۟ۤۘۢۜۥۙۖ۬ۛ۟ۤۜۜۥۡ۠ۘۘ";
                    break;
                case -273840786:
                    str = "ۥۙۥۘۗۧ۬ۖۧ۫ۘۙۨۘۧۡۜۘۖۧۜۙۨۦۘۜۚۦۘۖۡۥ۠۟۟ۨ۬ۜۘ۠ۙۖۖ۠ۚ۬ۨۦۘ";
                    break;
                case 1397000232:
                    str = "ۘۧ۠ۛۧۘۗ۫ۦۤ۬ۡۡۦۨۘۨۖۙ۟ۖۜۘۛ۠ۜ۫ۘۦۘۜۛۨۘۙۢۤۖۦۖۘۙۢ۠ۢ۟ۡۖ۬ۛۡ۬ۗۛۛۢۗۧۨ";
                    break;
                case 1685145543:
                    husNiw3snxdgZPAGJm(context, intentSender, z, file);
                    str = "۫ۦۨۛۤۘۚۜۧۘ۬ۡ۬ۖۖۘۦۤۘۤ۠۬۠ۡۥۜ۟ۥۘۧ۫ۖۖۨ۠ۡۧۙ";
                    break;
            }
        }
    }

    public static File s3fjYDxWOUexjjVgyA(Context context, String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        String str3 = "ۡ۫ۙ۬۠ۡۘۘۘۘۢۢۧۜ۫۟۬ۘۧۛۥۘۚ۫ۘۘۦۡۙۨ۟ۡۘۛۚۙۘۤۨ۫ۨۘ۫ۢۜ";
        int i = 0;
        byte[] bArr = null;
        FileOutputStream fileOutputStream = null;
        File file = null;
        InputStream inputStreamKYHag8HRDlnO3X9zmZ = null;
        while (true) {
            switch ((((str3.hashCode() ^ 545) ^ 303) ^ 331) ^ 464614204) {
                case -2042867369:
                    fileOutputStream.write(bArr, 0, i);
                    str3 = "ۖۦۥۘۚ۠ۨۘۢۖۧۘۘۧۘۢۦۜ۫ۤۗۚۢۡ۠ۤ۬۟۟ۘۘۨۥۧۚۘۘۘۘۦۡۡۘ۫ۙۜ۠ۛۦۧ۬ۜۖ۫ۡۘۘۦ۠";
                    break;
                case -1597797496:
                    str3 = "ۧۛۜۘ۫ۢۘۨۦۧ۠ۛ۟ۧ۫۬ۨ۬۠۠ۛۥۤۥۦۙۜۖۡۧۘۙۤۤۖۗۡۘ۫ۗۦۘۚۡۥۘۗۜ۫ۜ۟ۘ";
                    break;
                case -1098232505:
                    fileOutputStream.close();
                    str3 = "۬ۧۨۘۙ۠ۨۧۤۜۘۚۙۜۚۖۢۖ۠۠ۥۡۨۗ۬ۤۖ۟ۛۘۦۘۘۚ۠ۡۚ۬ۦۨۥۨۛۡۖۗۖۥۗ۟ۧ";
                    break;
                case -963136721:
                    i = inputStreamKYHag8HRDlnO3X9zmZ.read(bArr);
                    str3 = "۠ۖۧۘ۫ۦۖۥۡۖۘۖۦ۫ۙ۠ۨۘ۬ۛۜۢۤۗۧۘۘۨۗۙۙۖۚۤۥۤۚۚۧۥ۠ۧۡۘۘۙۧۘۙ۬ۘ";
                    break;
                case -796448049:
                    file.setWritable(false);
                    str3 = "۠ۤۜۧۖۜۡۘ۬ۘ۟ۚۤۛ۫ۙۘۘ۠ۘۦۘۨۡۦۘۨۗ۫۬ۛۧۛۜۖۡۖۗ";
                    break;
                case -756817964:
                    str3 = "ۛۖۘۘۘۘۘۘ۠ۡۤۥۧۧۧۨۡۘۨ۬ۧۨۥ۫ۥۙۛۥۘۛ۫ۤ۫ۨۢۧۢۥ";
                    break;
                case -392158538:
                    str3 = "ۖ۫ۚۙۚۖ۠۫۬ۙۙۙۚ۫ۦۗۡۘۘۢۦۘۥۨۘ۫ۛ۬۬ۗۙۙۚۥۘ۬ۥۜ";
                    fileOutputStream = new FileOutputStream(file);
                    break;
                case 37977543:
                    str3 = "ۘۧۚۡۜۡۨۢۡۘۨۨ۟ۧۦۡۘۨۛۧۢۧۘ۠۫ۚۡۥ۠ۨۘ";
                    inputStreamKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(context.getAssets(), str);
                    break;
                case 254361605:
                    file.setWritable(true);
                    str3 = "۬۫ۡۘۜۗۜ۟ۥۚ۟۟ۨۘۚ۫ۧ۠۬ۦۦۜۧۤۡۨۨ۫۬ۗۢۨۘ۫ۖ۫ۡۢۦۘۨۜۦ۫ۧۧۦۜۛ۠ۛۢ۠۫ۥۘۨۥۥۘ";
                    break;
                case 316640262:
                    str3 = "ۢۘۜۘ۟ۨۘۥ۬ۙۤۗ۟ۡۨۦۦۖۘۘۥۘ۠ۚۡۘۥۗ۠ۤۨۦۧۛۥۛۖۢۜۜ۟ۘۢۤۥ۫۠ۡۗ۠";
                    break;
                case 677308508:
                    bArr = new byte[4096];
                    str3 = "ۗۨۛۥۛۦۗۥۗۘۦۦۤۙۨ۬ۦۥ۫ۗۜۗ۟ۡۘۧ۟ۗۡۥۥۘۦ۬ۘۘۗۨۗۚۗۧۨۥۥۚ۬۫۟ۖۜ";
                    break;
                case 1023030015:
                    String str4 = "ۗۥۘۘۘۖۛۦ۠۫ۦۢۚۡۡۢۚۗ۠ۘۦۛۢۙۥۡۦۛۡۚۘۘ";
                    while (true) {
                        switch (str4.hashCode() ^ 1099481924) {
                            case -1637935671:
                                str3 = "۠ۥۙۤ۠ۡۡۜۧۖۛۖۘۙۤ۬۟ۨۧۘۛۡۨۘ۬ۙۚۢ۟ۚۤۨۧۢ۠ۧۜۛۢ۠ۛۗۗۢۗ";
                                continue;
                            case -1451440803:
                                str4 = "ۘۥۜۧۨ۬۟ۚۜۘ۬ۘۥۘۤۧۦۘ۠ۡۛۖۙۡۙۤۛۛۥۜۡۛۢ۫۠۫۫ۦۢ۟ۙۗۜۜۖۘۡۛ۬ۘۡۢۦۦۢۗۦۤ";
                                break;
                            case 856341062:
                                str3 = "ۧ۠ۡۘۥ۟ۜۘ۫ۦۘۖۘۘ۠۟ۨۖۜۨۘۛۘۦ۠ۗۥ۟ۛۘۚۛۖ۠۬ۥۘۡ۟ۨۙۙ۟ۨ۠ۦ";
                                continue;
                            case 1763573013:
                                String str5 = "ۚۦۦۙۖۨۚۥۛۖۖۜۘۘۗۖۨۖۧۥ۬۠ۚ۬ۖۗۤۤۚۛۨۧ۬ۡۘۚۧ۬";
                                while (true) {
                                    switch (str5.hashCode() ^ 669077853) {
                                        case -148266674:
                                            str5 = "ۚ۟ۧ۟ۤۦۙۦ۫ۦۧۨۛ۟ۦۘۜ۬ۦۘۘۖۚ۟۠ۢ۬۫ۚۡۜۖۘ۠۟ۦۘۥۡۧۘ۠ۙۧۛۖ۟ۖۜۦۘۛۨۘ";
                                        case 572047849:
                                            str4 = "ۗۙۤ۠ۙۡۘۖۢۡۘ۠۫ۨۗ۬ۘۡۜ۬ۛۜۚۧۧۨۖ۬ۥۚۚ۬";
                                            break;
                                        case 1600546161:
                                            str4 = "ۧۥۦۖۨۦۘ۬ۧۖ۟۫ۨۨۘ۠ۖۛۡۦۦۘ۫ۡۙۨۤ۠ۗۤ۟ۦۜۥۛ۫ۖۘۜۦۥ۫ۥۥۘ";
                                            break;
                                        case 1800048342:
                                            str5 = i != -1 ? "۟ۢۢۨ۬ۥۘۢۢۚۧۗۜۚۦۘۘۢۢۡۨۥۘۘ۠۟ۛۚ۬ۖۘۦ۫ۧۡۡۙۙۨۗۢۧۧ۬ۨ" : "ۚۚۘ۬ۥۘ۫ۚۧۖۗۗۘ۫ۙۥۦۜۘۡۖۖۘۙۜ۫ۦ۟۠ۢۦۜۘ";
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1361218711:
                    str3 = "ۗۨۛۥۛۦۗۥۗۘۦۦۤۙۨ۬ۦۥ۫ۗۜۗ۟ۡۘۧ۟ۗۡۥۥۘۦ۬ۘۘۗۨۗۚۗۧۨۥۥۚ۬۫۟ۖۜ";
                    break;
                case 2095276837:
                    inputStreamKYHag8HRDlnO3X9zmZ.close();
                    str3 = "ۨۜۧۦۙۡۘۗۥۦۘ۟ۢۦۘۙۘۢۗۚ۟ۨۦۢۦۤۥۘۚۛۡۘۧۨ۬ۜۖۤۡۧۡۘ";
                    break;
                case 2106960143:
                    return file;
                case 2109203228:
                    str3 = "ۚ۟ۦۘۚ۫ۧ۟ۤۧ۬ۥۤ۫۫ۨۨ۬ۘۘۖۦۦۢۨۧۛۤۖۘۨۚۨ";
                    file = new File(context.getFilesDir(), str2);
                    break;
            }
        }
    }

    public static void zZKhbgvUfsK4AEX3r0(final Context context, final IntentSender intentSender) {
        final File fileHJFh0TGMpafqLE9haL;
        final boolean z = false;
        synchronized (HJFh0TGMpafqLE9haL.class) {
            try {
                File fileS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(context, "CZoLxeexdhISu", "CZ");
                File fileHJFh0TGMpafqLE9haL2 = HJFh0TGMpafqLE9haL(context, fileS3fjYDxWOUexjjVgyA, "dGwcume");
                String str = "ۤۚۙ۠ۡ۟ۢۤۗ۠ۜۖۘۤۛۨۘۧۙ۠۬ۡۡۘۖۥۥۢ۫ۦ۬ۛۛ";
                while (true) {
                    switch (str.hashCode() ^ 1826760871) {
                        case -1206078131:
                            String str2 = "ۘۚۢۚۙۦۘ۠ۜۚۢۖۗۘ۫ۡ۟ۧ۬ۗۜۧۤ۠ۨۘۦۥ۠ۚۥۘ";
                            while (true) {
                                switch (str2.hashCode() ^ (-1931829082)) {
                                    case -1720409464:
                                        if (f5551lEeR5KfoEr4xU5yHH7 != null) {
                                            str2 = "ۚۦۡۘۤ۟ۨ۠ۘۧۨۡۘ۬ۘۡۘۢۙۛۖۥۨۘۡ۠ۥۡ۫ۦۡ۬ۡۘ";
                                            break;
                                        } else {
                                            str2 = "ۛۚ۫ۤۢۡۘۙۛۜۖۨۜۘۗۧۡۛ۟ۘۘۡۛۦۡۡۥۡۙ۠ۤ۫۠ۚۜۦۛ۬ۢ";
                                            break;
                                        }
                                    case -1636451058:
                                        str = "ۢۧۡۡۛ۫ۤۙۙۘۦۚۜۤۘۘۛۗۘۘۜۚۥۚ۟۬ۤ۠ۜۘۛ۠ۜۘ۠۫ۨۗۖۨۘ۬ۧۘۘۛۢۡ۫۟ۙۢ۠ۦۘ";
                                        continue;
                                        continue;
                                    case -912461757:
                                        str2 = "۬ۛۗۖۚۢۦۥۜ۫ۘ۠ۧۥۜۥۡۥۘۗ۟ۢ۠ۦۘۖ۬ۖۘۦۥۘ";
                                        break;
                                    case 1653564056:
                                        str = "ۛ۫ۦۤ۬ۗۘۜۧۘۧ۠ۢۥۖۡۙۗۜۛۖۦۗۚۧۖۢۡۘۤۨۦ";
                                        continue;
                                }
                            }
                            break;
                        case -1138030609:
                            str = "ۨۡۡۡ۠ۡۘۙۛۡ۬ۦۨۢۡۨۘۤۢ۠۬ۥۧۘۚۤۜۘۡ۫ۦ۬۬ۖۛۨۧۘۨ۟ۖۙ۬ۘۘ۫ۧۛ۫ۙۜۦۖۡ";
                            continue;
                        case 1824430234:
                            break;
                        case 1826194905:
                            Class<?> cls = Class.forName(lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1());
                            f5551lEeR5KfoEr4xU5yHH7 = ((Class) cls.getMethod(lEeR5KfoEr4xU5yHH7.T9PhQIpGRhE4yZDm1C(), Class.forName(lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ())).invoke(cls.getConstructor(Class.forName(lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ()), Class.forName(lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0())).newInstance(fileHJFh0TGMpafqLE9haL2.getAbsolutePath(), HJFh0TGMpafqLE9haL.class.getClassLoader()), lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo())).getMethod(lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(), Class.forName(lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm()), Class.forName(lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ()), Class.forName(lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ()), Class.forName(lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA()), Class.forName(lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ()));
                            z = true;
                            break;
                        default:
                            continue;
                    }
                }
                String str3 = "ۛۖۨۥۘۧۘ۠ۤۘۦۥۘۨۥۜۨۙۦۘۚ۫ۜۢۨۧۘۢ۟ۡۡ۟ۗۧۜۖۘۤۚۙۥ۠ۚۜۖۥۘۗۥ۟ۥۚۜ";
                while (true) {
                    switch (str3.hashCode() ^ (-1743868161)) {
                        case -779037786:
                            str3 = "ۡۖۘۧۤۜۘ۫ۨۗۘۡ۟۫ۤۦۘ۫ۗ۠ۚۗ۠ۗ۬ۙ۟ۥۡۢۗ";
                            break;
                        case 317500126:
                            String str4 = "ۧۗۜ۬۬ۛۛ۟ۡۘ۫ۢۢۢۚۖۡۤۤۡۜۥ۟ۥۘۜۧۧۖۜ۫";
                            while (true) {
                                switch (str4.hashCode() ^ (-1501177389)) {
                                    case -1605220808:
                                        str3 = "ۦۜۚۘۢۘۙۧ۠۫ۤ۠ۘ۟ۜۘۙۨۦۘۙۖۜۥۖۘ۬ۖ۫ۗ۫ۦۘ";
                                        continue;
                                    case -825539079:
                                        str3 = "ۨۨۢ۫ۖۥۘۤۨۚۥ۠۟ۨ۫ۙۦۧۜۛۦۨۘۜ۠ۡ۫۫ۚۜۛۧۥ۫ۨۘۗۢ۟۟۟ۛۖۚۗ";
                                        continue;
                                    case 705752710:
                                        if (!z) {
                                            str4 = "۫ۜ۠ۚۙۗ۠ۧ۠ۨۨۘۘۧۧۡۘۛۛۥۖ۠۠۫ۦۜ۟ۗ۫ۘۛۜۨ۬ۜۜۙۨۘ۠ۧۖۗ۫ۙۘۥ۬ۦۧۡۘ";
                                            break;
                                        } else {
                                            str4 = "ۨۨ۟ۘۧۜۖۤۥۡۛۦۦۧۜۘۘۡۖۘۗ۫ۦۘۤۙۘۘۦۡ۫ۛ۬ۧۤۤۧۡۡۦۥۚۜۘۜۘ۬ۤۦۨۜ۟";
                                            break;
                                        }
                                    case 1487591142:
                                        str4 = "ۚۡۙۧۢۚۡۘ۫ۜۜۡۘۙۥۧۨ۟۟ۛ۬ۖۘ۫ۤۨۘۤ۫ۧۜ۫ۦۦۥۘۗۡۨۘ۠ۨۥۛۡۘ";
                                        break;
                                }
                            }
                            break;
                        case 1248871779:
                            fileHJFh0TGMpafqLE9haL = null;
                            break;
                        case 1850730241:
                            fileHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(context, fileS3fjYDxWOUexjjVgyA, Build.SUPPORTED_ABIS[0]);
                            String str5 = "ۡ۫ۜۥ۟ۖۥۦۧ۫ۦۥۤ۟۠ۖۧۘۤۗۜۘۨۘۚ۟ۗۡۚۜۘۢ۠ۘ۟ۛۥۘۖۘۘۙۙ۫";
                            while (true) {
                                switch (str5.hashCode() ^ (-1214357544)) {
                                    case -2043189350:
                                        break;
                                    case -834921041:
                                        str5 = "۫ۜۡۘۘۗۧۙ۫۫ۜۚۨۘۤۢۧۨۧۗۜۨۘۦۛۡۘ۠ۖۖۘۡۖۢۨۙۖۤۘۚۨۘۗۜۥۦ۠۫۫ۖۧ";
                                        break;
                                    case 558290206:
                                        String str6 = "ۨۖۦۘۛ۬ۡۡۢۘۘۗۗۜ۟ۨۡۗ۠ۜۡۡۜۛۚۘۥۢۡۘ۟ۢۘ۟۫ۜۘۦۘۥۢ۠ۥۨۢ۠ۢۧۥۤۚۚۥۥ۬ۢۙۛ";
                                        while (true) {
                                            switch (str6.hashCode() ^ 1273527766) {
                                                case -1221404330:
                                                    str5 = "۠۟ۨۙۥۨۘۖۦ۟ۛۦۦۘ۫ۙۖۘۗۡۦۘۤۛۡۧۨ۟ۤۦۜۘۘۢۖۡۙۜۘۗ۟۟۟ۤۦۘۗۜۡۘۤۤ۬ۚۜۡ";
                                                    continue;
                                                case 290980767:
                                                    str5 = "ۙۙ۟ۨۤۦۘۨۨۜۡۖۘۥۜۛۢ۬ۥۘ۫ۜۢۘۢۙۢ۬ۚۗ۫ۛۢۢۦ۠ۛۖ";
                                                    continue;
                                                case 1017629758:
                                                    if (fileHJFh0TGMpafqLE9haL != null) {
                                                        str6 = "ۥۥۡۘۧۨۥۘۖۖۙ۠ۥۨ۫۠ۨۘ۫۬۫۫ۗۡۘۚ۬ۨۥۙۦۚۚۗۛۦۢ۠ۥۘۗۧۧ۟۬ۘۘ";
                                                        break;
                                                    } else {
                                                        str6 = "ۛۨۖۘۢۧ۟ۛۜ۬ۧۥۜۖۜۜۘ۬۬۫ۖۜۡۘۙۖۡۘۡۚ۫ۗۗۤۚۤ۫ۙ۠ۚ۫۬۫ۧۡۡ";
                                                        break;
                                                    }
                                                case 1091880331:
                                                    str6 = "ۨ۫ۜۘۡۖۗۜ۟ۥۘۖ۬۠ۥ۟ۢۖۚۥۘۘۖۖۘۖۦۚۦۚۥۥۦۨۖۘۖۘۛۜۦۘ";
                                                    break;
                                            }
                                        }
                                        break;
                                    case 696333087:
                                        ((InstallingActivity) context).lEeR5KfoEr4xU5yHH7(7);
                                        f5551lEeR5KfoEr4xU5yHH7 = null;
                                        return;
                                }
                            }
                            break;
                    }
                }
                new Thread(new Runnable(context, intentSender, z, fileHJFh0TGMpafqLE9haL) { // from class: com.uagxnrh.tssnskqp.s3fjYDxWOUexjjVgyA

                    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
                    public final boolean f5576HJFh0TGMpafqLE9haL;

                    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
                    public final Context f5577lEeR5KfoEr4xU5yHH7;

                    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
                    public final IntentSender f5578s3fjYDxWOUexjjVgyA;

                    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
                    public final File f5579zZKhbgvUfsK4AEX3r0;

                    {
                        this.f5577lEeR5KfoEr4xU5yHH7 = context;
                        this.f5578s3fjYDxWOUexjjVgyA = intentSender;
                        this.f5576HJFh0TGMpafqLE9haL = z;
                        this.f5579zZKhbgvUfsK4AEX3r0 = fileHJFh0TGMpafqLE9haL;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str7 = "۫ۧۚۜۙ۫ۙۙۖۘۘۙ۠ۢۥ۫ۙۜ۠ۗۦۘۧۥ۬۫ۖۘۨ۟۠۬ۚۤۗۢۢۗۜۨۘ۠ۘۗۘۢۨۘۢۧۜۘ";
                        while (true) {
                            switch ((((str7.hashCode() ^ 838) ^ 406) ^ 699) ^ (-1655023829)) {
                                case -1660696973:
                                    HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(this.f5577lEeR5KfoEr4xU5yHH7, this.f5578s3fjYDxWOUexjjVgyA, this.f5576HJFh0TGMpafqLE9haL, this.f5579zZKhbgvUfsK4AEX3r0);
                                    str7 = "ۚ۠ۦۘۗۙۘۘۖۙۥۘۖۡۢۦۢۙۤۛۨ۠ۧۜۗۤۦۨۦ۬ۢۤۡۘۧ۠ۦۢ۬ۡۘۘۛۖ۠ۗۥۘ";
                                    break;
                                case -1353754367:
                                    str7 = "ۚ۬ۡ۠۟ۡۖۛۙۦ۠ۦۥۧۧ۫۫ۚۖۚۢ۠ۤۚۡۘ۫ۡۚۧۙۥۘ۠ۥۖۘۢۗ۬۟ۙ۠ۧ۟ۤۨۤۜۘ۬ۡۡۦۢۧ";
                                    break;
                                case -603768649:
                                    return;
                            }
                        }
                    }
                }).start();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
